
package com.controller;
import com.entity.Pendaftaran;
import java.sql.SQLException;
import com.view.V_Pendaftaran;
import javax.swing.JTable;

public interface C_pendaftaran {
    public void autoNoPendaftaran(Pendaftaran p) throws SQLException;
    public void insertPendaftaran(Pendaftaran p) throws SQLException;
    public void deletePendaftaran(Pendaftaran p, JTable tbl)throws SQLException;
    public void updatePendaftaran(Pendaftaran p,JTable tbl);
    public void viewTahunAjaran(JTable tabel)throws SQLException;
    public void upload_Lamp_Akte_Kelahiran(Pendaftaran p);
    public void upload_Lamp_kk(Pendaftaran p);
    public void upload_Lamp_ktp_ortu(Pendaftaran p);
    public void upload_Lamp_foto_ortu(Pendaftaran p);
    public void upload_Lamp_foto_siswa(Pendaftaran p);
    public void viewPendaftaran(Pendaftaran p,JTable tbl)throws SQLException;
    public void klikTabelPendaftaran(Pendaftaran p,JTable tbl);
    
}
