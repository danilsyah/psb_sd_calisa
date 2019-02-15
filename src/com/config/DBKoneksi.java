
package com.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBKoneksi {
    
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if(koneksi==null){
            try {
                String url = "jdbc:mysql://localhost/db_ppsb_sd_calisa";
                String username = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,username,pass);
                System.out.println("Koneksi Ke Database Success");
            } catch (SQLException e) {
                System.out.println("Gagal Koneksi Ke Database");
            }
        }
        return koneksi;
    }
    
}
