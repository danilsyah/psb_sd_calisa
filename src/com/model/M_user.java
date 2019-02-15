
package com.model;
import  com.controller.C_user;
import java.sql.Connection;
import java.sql.SQLException;
import com.config.DBKoneksi;
import com.entity.User;
import com.view.V_MenuUtama;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class M_user  implements C_user {
    final Connection con = DBKoneksi.getKoneksi();
    private String SQL;
    private PreparedStatement pstmt;
    private ResultSet res;

    @Override
    public boolean cekLogin(User u) throws SQLException {
       try {
            SQL = "SELECT * FROM users WHERE username =? AND PASS=? ";
            pstmt = con.prepareStatement(SQL);
            pstmt.setString(1, u.getUser());
            pstmt.setString(2,u.getPass());
            res = pstmt.executeQuery();
            if(res.next()){
                u.setId(res.getInt("id_user"));
                u.setNama(res.getString("nama"));
                return true;
            }else{
               return  false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
}
