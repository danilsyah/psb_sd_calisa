/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;
import com.controller.C_Setting;
import com.entity.Setting;
import java.sql.SQLException;
import com.config.DBKoneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class M_Setting implements C_Setting {

    final Connection con = DBKoneksi.getKoneksi();
    private String SQL;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet res;
     String kode,tahun_ajaran,semester;
    
    @Override
    public void insertTahunAjaran(Setting s) throws SQLException {
        try {
            SQL = "INSERT INTO tahun_ajaran (tahun_ajaran,semester) VALUES(?,?)";
            pstmt = con.prepareStatement(SQL);
            pstmt.setString(1, s.getTahunAjaran());
            pstmt.setString(2, s.getSemester());
            pstmt.executeUpdate();
           pstmt.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void updateDirGambar(Setting s) throws SQLException {
        try {
            SQL = "UPDATE setting_directory SET alamat_folder=? WHERE id= 1";
            pstmt = con.prepareStatement(SQL);
            pstmt.setString(1, s.getDirectoryGambar());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil di Ubah");
            pstmt.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Data Gagal di Ubah");
        }
    }

    @Override
    public void selectDirGambar(Setting s) throws SQLException {
        try {
            SQL = "SELECT * FROM setting_directory";
            stmt = con.createStatement();
            res = stmt.executeQuery(SQL);
            while(res.next()){
                s.setDirectoryGambar(res.getString("alamat_folder"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
