/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;
import com.controller.C_pendaftaran;
import com.entity.Pendaftaran;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.config.DBKoneksi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import com.model.M_Setting;
import com.view.V_Pendaftaran;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import com.view.V_List_Pendaftaran;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.util.HashMap;
import java.util.Locale;
import java.io.File;
/**
 *
 * @author danil
 */
public class M_Pendaftaran  implements C_pendaftaran{

    final Connection con = DBKoneksi.getKoneksi();
    private String SQL;
    private PreparedStatement pstmt;
    private Statement stmt;
    private ResultSet res;
    private Date datenow = new Date();
    private SimpleDateFormat simpledateformat = new SimpleDateFormat("MMyy",Locale.getDefault());
    private String tanggal = simpledateformat.format(datenow);
    private String thn,semester, pilih;
    private DefaultTableModel tblModelPendaftaran;
      private JasperDesign jasperDesign;
        private JasperReport jasperReport;
        private JasperPrint jasperPrint;
        private JasperViewer jasperviewer;
        HashMap parameter = new HashMap();
        
     
    public void aturKolomTabel(JTable tbl, int lebar[]){
        try {
            tbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            int banyak = tbl.getColumnCount();
            for(int i=0;i<banyak;i++){
                TableColumn kolom = tbl.getColumnModel().getColumn(i);
                kolom.setPreferredWidth(lebar[i]);
                tbl.setRowHeight(20);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Salah"+e);
        }
    }    
  
    @Override
    public void autoNoPendaftaran(Pendaftaran p) {
        try {
            stmt = con.createStatement();
            SQL = "select max(right(no_pendaftaran,5)) from pendaftaran ";
            res = stmt.executeQuery(SQL);
            while(res.next()){
                if(res.first()==false){
                    p.setNoPendaftaran(tanggal+"00001");
                }else{
                    res.last();
                    int autoid = res.getInt(1)+1;
                    String nomor = String.valueOf(autoid);
                    int noLong = nomor.length();
                    for(int a = 0; a<5-noLong; a++){
                        nomor = "0"+nomor;
                    }
                    p.setNoPendaftaran(tanggal+nomor);
                }
            }
            res.close();
            stmt.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void insertPendaftaran(Pendaftaran p) throws SQLException {
        try {
            copy(p.getLampiranAkteKelahiran(), p.getDirlampiranAkteKelahiran());
            copy(p.getLampiranFotoAnak(), p.getDirlampiranFotoAnak());
            copy(p.getLampiranFotoOrtu(), p.getDirlampiranFotoOrtu());
            copy(p.getLampiranKk(), p.getDirlampiranKk());
            copy(p.getLampiranKtpOrtu(), p.getDirlampiranKtpOrtu());
        } catch (IOException ex) {
            Logger.getLogger(M_Pendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
           
            SQL = "insert into pendaftaran values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(SQL);
            pstmt.setString(1, p.getNoPendaftaran());
            pstmt.setString(2, p.getBioNamaLengkap());
            pstmt.setString(3,p.getBioNamaPanggilan());
            pstmt.setString(4, p.getBioJenisKelamin());
            pstmt.setString(5, p.getBioTempatLahir());
            pstmt.setString(6, p.getBioTanggalLahir());
            pstmt.setString(7, p.getBioAgama());
            pstmt.setString(8, p.getBioKewarganegaraan());
            pstmt.setInt(9, p.getBioAnakKe());
            pstmt.setInt(10, p.getBioJmlSaudaraKandung());
            pstmt.setInt(11, p.getBioJmlSaudaraTiri());
            pstmt.setInt(12, p.getBioJmlSaudaraAngkat());
            pstmt.setString(13, p.getBioBahasaSehariHari());
            pstmt.setInt(14,p.getBioBeratBadan());
            pstmt.setInt(15, p.getBioTinggiBadan());
            pstmt.setString(16, p.getBioGolonganDarah());
            pstmt.setString(17, p.getBioPenyakitBeratYangPernahDiderita());
            pstmt.setString(18, p.getBioAlamatTempatTinggal());
            pstmt.setString(19, p.getBioNoTlp());
            pstmt.setString(20, p.getBioBertempatTinggal());
            pstmt.setString(21, p.getWaliNamaAyahKandung());
            pstmt.setString(22, p.getWaliNamaIbuKandung());
            pstmt.setString(23, p.getWaliPendidikanTertinggiIbu());
            pstmt.setString(24, p.getWaliPendidikanTertinggiAyah());
            pstmt.setString(25, p.getWaliPekerjaanAyah());
            pstmt.setString(26, p.getWaliPekerjaanIbu());
            pstmt.setString(27, p.getWaliNamaWaliSiswa());
            pstmt.setString(28, p.getWaliPendidikanTertinggiWaliSiswa());
            pstmt.setString(29, p.getWaliHubunganTerhadapAnak());
            pstmt.setString(30, p.getWaliPekerjaanWaliSiswa());
            pstmt.setString(31, p.getWaliPendapatanPerbulanOrangTua());
            pstmt.setString(32, p.getAsalMasukSekolah());
            pstmt.setString(33, p.getAsalAnak());
            pstmt.setString(34, p.getAsalTkNamaTk());
            pstmt.setString(35, p.getAsalTkNomoTahunSuratKeterangan());
            pstmt.setInt(36, p.getAsalTkLamaBelajar());
            pstmt.setString(37, p.getAsalPindahNamaSekolahAsal());
            pstmt.setString(38, p.getAsalPindahTanggal());
            pstmt.setInt(39, p.getAsalPindahDariKelas());
            pstmt.setString(40, p.getAsalDiterimaSekolahTanggal());
            pstmt.setInt(41, p.getAsalDiterimaDikelas());
            pstmt.setInt(42, p.getKodeTahunAjaran());
            pstmt.setString(43, p.getDirlampiranAkteKelahiran());
            pstmt.setString(44, p.getDirlampiranKk());
            pstmt.setString(45, p.getDirlampiranKtpOrtu());
            pstmt.setString(46, p.getDirlampiranFotoOrtu());
            pstmt.setString(47, p.getDirlampiranFotoAnak());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pendaftaran Berhasil Di Simpan","Notif",JOptionPane.INFORMATION_MESSAGE);
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e,"Error Insert Data",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void viewTahunAjaran(JTable tabel) throws SQLException {
        try {
            String []Header = {"Kode","Tahun Ajaran","Semester"};
            DefaultTableModel  tblModel = new DefaultTableModel(null,Header);
            stmt = con.createStatement();
            SQL = "select * from tahun_ajaran";
            res= stmt.executeQuery(SQL);
            while(res.next()){
                Object[] ob = new Object[3];
                ob[0] = res.getInt(1);
                ob[1] = res.getString(2);
                ob[2] = res.getString(3);
                tblModel.addRow(ob);
            }
            tabel.setModel(tblModel);
            res.close();
            stmt.close();
        } catch (SQLException e) {
        }
    }

    @Override
    public void upload_Lamp_Akte_Kelahiran(Pendaftaran p) {
        try {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter( "JPG, GIF, and PNG Images", "jpg", "gif", "png");
                chooser.setFileFilter(filter);
                chooser.showOpenDialog(null);
                File file = chooser.getSelectedFile();
                p.setLampiranAkteKelahiran(file.getPath());
        } catch (HeadlessException e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void upload_Lamp_kk(Pendaftaran p) {
         try {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter( "JPG, GIF, and PNG Images", "jpg", "gif", "png");
                chooser.setFileFilter(filter);
                chooser.showOpenDialog(null);
                File file = chooser.getSelectedFile();
                p.setLampiranKk(file.getPath());
        } catch (HeadlessException e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void upload_Lamp_ktp_ortu(Pendaftaran p) {
       try {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter( "JPG, GIF, and PNG Images", "jpg", "gif", "png");
                chooser.setFileFilter(filter);
                chooser.showOpenDialog(null);
                File file = chooser.getSelectedFile();
                p.setLampiranKtpOrtu(file.getPath());
        } catch (HeadlessException e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void upload_Lamp_foto_ortu(Pendaftaran p) {
       try {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter( "JPG, GIF, and PNG Images", "jpg", "gif", "png");
                chooser.setFileFilter(filter);
                chooser.showOpenDialog(null);
                File file = chooser.getSelectedFile();
                p.setLampiranFotoOrtu(file.getPath());
        } catch (HeadlessException e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public void upload_Lamp_foto_siswa(Pendaftaran p) {
        try {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter( "JPG, GIF, and PNG Images", "jpg", "gif", "png");
                chooser.setFileFilter(filter);
                chooser.showOpenDialog(null);
                File file = chooser.getSelectedFile();
                p.setLampiranFotoAnak(file.getPath());
        } catch (HeadlessException e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public static void copy(String fromFileName, String toFileName)throws IOException {
        File fromFile = new File(fromFileName);
        File toFile = new File(toFileName);

        if (!fromFile.exists())
          throw new IOException("FileCopy: " + "no such source file: "
              + fromFileName);
        if (!fromFile.isFile())
          throw new IOException("FileCopy: " + "can't copy directory: "
              + fromFileName);
        if (!fromFile.canRead())
          throw new IOException("FileCopy: " + "source file is unreadable: "
              + fromFileName);

        if (toFile.isDirectory())
          toFile = new File(toFile, fromFile.getName());

        if (toFile.exists()) {
          if (!toFile.canWrite())
            throw new IOException("FileCopy: "
                + "destination file is unwriteable: " + toFileName);
          System.out.print("Overwrite existing file " + toFile.getName()
              + "? (Y/N): ");
          System.out.flush();
          BufferedReader in = new BufferedReader(new InputStreamReader(
              System.in));
          String response = in.readLine();
          if (!response.equals("Y") && !response.equals("y"))
            throw new IOException("FileCopy: "
                + "existing file was not overwritten.");
        } else {
          String parent = toFile.getParent();
          if (parent == null)
            parent = System.getProperty("user.dir");
          File dir = new File(parent);
          if (!dir.exists())
            throw new IOException("FileCopy: "
                + "destination directory doesn't exist: " + parent);
          if (dir.isFile())
            throw new IOException("FileCopy: "
                + "destination is not a directory: " + parent);
          if (!dir.canWrite())
            throw new IOException("FileCopy: "
                + "destination directory is unwriteable: " + parent);
        }

        FileInputStream from = null;
        FileOutputStream to = null;
        try {
          from = new FileInputStream(fromFile);
          to = new FileOutputStream(toFile);
          byte[] buffer = new byte[4096];
          int bytesRead;

          while ((bytesRead = from.read(buffer)) != -1)
            to.write(buffer, 0, bytesRead); // write
        } finally {
          if (from != null)
            try {
              from.close();
            } catch (IOException e) {

            }
          if (to != null)
            try {
              to.close();
            } catch (IOException e) {

            }
        }
  }

    @Override
    public void viewPendaftaran(Pendaftaran p,JTable tbl) throws SQLException {
       String header[] = {"No","No Pendaftaran","Nama Lengkap","Nama","JenKel",
           "Tempat Lahir","Tanggal Lahir","Agama","Kewarganegaraan","Anak-Ke",
           "Jml Saudara Kandung","Jml Saudara Tiri","Jml Saudara Angkat","Bahasa",
           "Berat","Tinggi","Gol Darah","Penyakit","Alamat","No Tlp","Bertempat Tinggal",
           "Nm Ayah","Nm Ibu","Pendidikan Ibu","Pendidikan Ayah","Pekerjaan Ayah",
           "Pekerjaan Ibu","Wali Siswa","Pendidikan Wali","Hub trhadap Anak",
           "Pekerjaan Wali","Pendapatan Perbulan","Asal Masuk","Asal Anak","Nm TK",
           "TK nomor","TK Lama","Pind Nama Sekolah","Tanggal","Dari Kelas","Diterima Tgl",
           "Diterima Kls","Kode Tahun Ajaran","Lamp Akte","Lamp KK","Lamp KTP Wali",
           "Lampir Foto Wali","Lampir Foto Siswa","Tahun Ajaran","Semester"};
       
        tblModelPendaftaran = new DefaultTableModel(null,header){
            @Override
               public boolean isCellEditable(int rowIndex,int columnIndex){
                   return false;
               }
        };
        aturKolomTabel(tbl, new int[]{20,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300,300});
        tbl.setModel(tblModelPendaftaran);
        try {
            if(p.getFilterTahunAjaran()  != "-PILIH-"){
                if (p.getSortingview() == "-PILIH-") {
                    if (p.getKeySearcing() == null) {
                        SQL = "select * from v_pendaftaran where tahun_ajaran = '"+p.getFilterTahunAjaran()+ "' order by no_pendaftaran";
                    } else {
                        SQL = "select * from v_pendaftaran  where tahun_ajaran = '"+p.getFilterTahunAjaran()+ "' and ( no_pendaftaran LIKE '%" + p.getKeySearcing() + "%' or bio_nama_lengkap LIKE '%" + p.getKeySearcing() + "%' ) order by no_pendaftaran ";
                    }
                } else if (p.getSortingview() == "NO PENDAFTARAN") {
                    if (p.getKeySearcing() == null) {
                        SQL = "select * from v_pendaftaran where tahun_ajaran = '"+p.getFilterTahunAjaran()+ "' order by no_pendaftaran";
                    } else {
                        SQL = "select * from v_pendaftaran  where tahun_ajaran = '"+p.getFilterTahunAjaran()+ "' and  (no_pendaftaran LIKE '%" + p.getKeySearcing() + "%' or bio_nama_lengkap LIKE '%" + p.getKeySearcing() + "%' ) order by no_pendaftaran ";
                    }
                } else if (p.getSortingview() == "USIA") {
                    if (p.getKeySearcing() == null) {
                        SQL = "select * from v_pendaftaran where tahun_ajaran = '"+p.getFilterTahunAjaran()+ "' order by bio_tanggal_lahir";
                    } else {
                        SQL = "select * from v_pendaftaran  where tahun_ajaran = '"+p.getFilterTahunAjaran()+ "' and (no_pendaftaran LIKE '%" + p.getKeySearcing() + "%' or bio_nama_lengkap LIKE '%" + p.getKeySearcing() + "%') order by bio_tanggal_lahir";
                    }
                }
            }
            System.out.println(SQL);
            stmt = con.createStatement();
            res = stmt.executeQuery(SQL);
            int no = 0;
            while(res.next()){
                Object[]ob = new Object[50];
                no++;
                ob[0] = String.valueOf(no).toString();
                ob[1] = res.getString(1);
                ob[2] = res.getString(2);
                ob[3] = res.getString(3);
                ob[4] = res.getString(4);
                ob[5] = res.getString(5);
                ob[6] = res.getString(6);
                ob[7] = res.getString(7);
                ob[8] = res.getString(8);
                ob[9] = res.getString(9);
                ob[10] = res.getString(10);
                ob[11] = res.getString(11);
                ob[12] = res.getString(12);
                ob[13] = res.getString(13);
                ob[14] = res.getString(14);
                ob[15] = res.getString(15);
                ob[16] = res.getString(16);
                ob[17] = res.getString(17);
                ob[18] = res.getString(18);
                ob[19] = res.getString(19);
                ob[20] = res.getString(20);
                 ob[21] = res.getString(21);
                ob[22] = res.getString(22);
                ob[23] = res.getString(23);
                ob[24] = res.getString(24);
                ob[25] = res.getString(25);
                ob[26] = res.getString(26);
                ob[27] = res.getString(27);
                ob[28] = res.getString(28);
                ob[29] = res.getString(29);
                ob[30] = res.getString(30);
                ob[31] = res.getString(31);
                ob[32] = res.getString(32);
                ob[33] = res.getString(33);
                ob[34] = res.getString(34);
                ob[35] = res.getString(35);
                ob[36] = res.getString(36);
                ob[37] = res.getString(37);
                if(res.getString(38)==null){
                    ob[38] ="-";
                }else{
                     ob[38] = res.getString(38);
                }
               
                ob[39] = res.getString(39);
                ob[40] = res.getString(40);  
                ob[41] = res.getString(41);
                ob[42] = res.getString(42);
                ob[43] = res.getString(43);
                ob[44] = res.getString(44);
                ob[45] = res.getString(45);
                ob[46] = res.getString(46);
                ob[47] = res.getString(47);
                ob[48] = res.getString(48);
                ob[49] = res.getString(49);
                tblModelPendaftaran.addRow(ob);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void klikTabelPendaftaran(Pendaftaran p, JTable tbl) {
        try {
            int pilih = tbl.getSelectedRow();
            if(pilih == -1){
                return;
            }
            p.setNoPendaftaran(tblModelPendaftaran.getValueAt(pilih, 1).toString());
            p.setBioNamaLengkap(tblModelPendaftaran.getValueAt(pilih, 2).toString());
            p.setBioNamaPanggilan(tblModelPendaftaran.getValueAt(pilih, 3).toString());
            p.setBioJenisKelamin(tblModelPendaftaran.getValueAt(pilih, 4).toString());
            p.setBioTempatLahir(tblModelPendaftaran.getValueAt(pilih, 5).toString());
            p.setBioTanggalLahir(tblModelPendaftaran.getValueAt(pilih, 6).toString());
            p.setBioAgama(tblModelPendaftaran.getValueAt(pilih, 7).toString());
            p.setBioKewarganegaraan(tblModelPendaftaran.getValueAt(pilih, 8).toString());
            p.setBioAnakKe(Integer.parseInt((String) tblModelPendaftaran.getValueAt(pilih, 9)) );
            p.setBioJmlSaudaraKandung(Integer.parseInt((String) tblModelPendaftaran.getValueAt(pilih, 10)) );
            p.setBioJmlSaudaraTiri(Integer.parseInt((String)tblModelPendaftaran.getValueAt(pilih, 11)));
            p.setBioJmlSaudaraAngkat(Integer.parseInt((String)tblModelPendaftaran.getValueAt(pilih,12)) );
            p.setBioBahasaSehariHari(tblModelPendaftaran.getValueAt(pilih, 13).toString());
            p.setBioBeratBadan(Integer.parseInt((String)tblModelPendaftaran.getValueAt(pilih,14)));
            p.setBioTinggiBadan(Integer.parseInt((String)tblModelPendaftaran.getValueAt(pilih,15)));
            p.setBioGolonganDarah(tblModelPendaftaran.getValueAt(pilih, 16).toString());
            p.setBioPenyakitBeratYangPernahDiderita(tblModelPendaftaran.getValueAt(pilih,17).toString());
            p.setBioAlamatTempatTinggal(tblModelPendaftaran.getValueAt(pilih, 18).toString());
            p.setBioNoTlp(tblModelPendaftaran.getValueAt(pilih, 19).toString());
            p.setBioBertempatTinggal(tblModelPendaftaran.getValueAt(pilih, 20).toString());
            p.setWaliNamaAyahKandung(tblModelPendaftaran.getValueAt(pilih, 21).toString());
            p.setWaliNamaIbuKandung(tblModelPendaftaran.getValueAt(pilih, 22).toString());
            p.setWaliPendidikanTertinggiIbu(tblModelPendaftaran.getValueAt(pilih, 23).toString());
            p.setWaliPendidikanTertinggiAyah(tblModelPendaftaran.getValueAt(pilih, 24).toString());
            p.setWaliPekerjaanAyah(tblModelPendaftaran.getValueAt(pilih, 25).toString());
            p.setWaliPekerjaanIbu(tblModelPendaftaran.getValueAt(pilih, 26).toString());
            p.setWaliNamaWaliSiswa(tblModelPendaftaran.getValueAt(pilih, 27).toString());
            p.setWaliPendidikanTertinggiWaliSiswa(tblModelPendaftaran.getValueAt(pilih, 28).toString());
            p.setWaliHubunganTerhadapAnak(tblModelPendaftaran.getValueAt(pilih, 29).toString());
            p.setWaliPekerjaanWaliSiswa(tblModelPendaftaran.getValueAt(pilih, 30).toString());
            p.setWaliPendapatanPerbulanOrangTua(tblModelPendaftaran.getValueAt(pilih, 31).toString());
            p.setAsalMasukSekolah(tblModelPendaftaran.getValueAt(pilih, 32).toString());
            p.setAsalAnak(tblModelPendaftaran.getValueAt(pilih, 33).toString());
            p.setAsalTkNamaTk(tblModelPendaftaran.getValueAt(pilih, 34).toString());
            p.setAsalTkNomoTahunSuratKeterangan(tblModelPendaftaran.getValueAt(pilih, 35).toString());
            p.setAsalTkLamaBelajar(Integer.parseInt((String)tblModelPendaftaran.getValueAt(pilih, 36)));
            p.setAsalPindahNamaSekolahAsal(tblModelPendaftaran.getValueAt(pilih, 37).toString());
            p.setAsalPindahTanggal(tblModelPendaftaran.getValueAt(pilih, 38).toString());
            p.setAsalPindahDariKelas(Integer.parseInt(tblModelPendaftaran.getValueAt(pilih, 39).toString()));
            p.setAsalDiterimaSekolahTanggal(tblModelPendaftaran.getValueAt(pilih, 40).toString());
            p.setAsalDiterimaDikelas(Integer.parseInt(tblModelPendaftaran.getValueAt(pilih,41 ).toString()));
            p.setKodeTahunAjaran(Integer.parseInt(tblModelPendaftaran.getValueAt(pilih, 42).toString()));
            p.setLampiranAkteKelahiran(tblModelPendaftaran.getValueAt(pilih, 43).toString());
            p.setLampiranKk(tblModelPendaftaran.getValueAt(pilih, 44).toString());
            p.setLampiranKtpOrtu(tblModelPendaftaran.getValueAt(pilih, 45).toString());
            p.setLampiranFotoOrtu(tblModelPendaftaran.getValueAt(pilih, 46).toString());
            p.setLampiranFotoAnak(tblModelPendaftaran.getValueAt(pilih, 47).toString());
            p.setTahunAjaran(tblModelPendaftaran.getValueAt(pilih, 48).toString());
            p.setSemester(tblModelPendaftaran.getValueAt(pilih, 49).toString());
            
        } catch (NumberFormatException e) {
            System.out.println("com.model.M_Pendaftaran.klikTabelPendaftaran() "+e);
        }
    }

    @Override
    public void deletePendaftaran(Pendaftaran p, JTable tbl) throws SQLException {
        int ok = JOptionPane.showConfirmDialog(null, "Data Akan Di Hapus..???","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok == 0){
            try {
                SQL = "delete from pendaftaran where no_pendaftaran = ?";
                pstmt = con.prepareStatement(SQL);
                pstmt.setString(1, p.getNoPendaftaran());
                pstmt.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
               pstmt.close();
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal di hapus "+e);
            }
            finally{
                viewPendaftaran(p, tbl);
            }
        }
    }

    @Override
    public void updatePendaftaran(Pendaftaran p, JTable tbl) {
       int ok = JOptionPane.showConfirmDialog(null, "Data Akan Di Ubah..???","Konfirmasi",JOptionPane.YES_NO_OPTION);
       if(ok ==0 ){
            try {
                SQL = "update pendaftaran set bio_nama_lengkap=? ,bio_nama_panggilan=?,bio_jenis_kelamin=?,bio_tempat_lahir=?,bio_tanggal_lahir=?,bio_agama=?,bio_kewarganegaraan=?,bio_anak_ke=?,bio_jml_saudara_kandung=?,bio_jml_saudara_tiri=?,bio_jml_saudara_angkat=?,bio_bahasa_sehari_hari=?,bio_berat_badan=?,bio_tinggi_badan=?,bio_golongan_darah=?,bio_penyakit_berat_yang_pernah_diderita=?,bio_alamat_tempat_tinggal=?,bio_no_telepon=?,bio_bertempat_tinggal=? ,wali_nama_ayah_kandung=?,wali_nama_ibu_kandung=?,wali_pendidikan_tertinggi_ibu=?,wali_pendidikan_tertinggi_ayah=?,wali_pekerjaan_ayah=?,wali_pekerjaan_ibu=?,wali_nama_wali_siswa=?,wali_pendidikan_tertinggi_wali_siswa=?,wali_hubungan_terhadap_anak=?, wali_pekerjaan_wali_siswa=?,wali_pendapatan_perbulan_orang_tua=?,asal_masuk_sekolah=?,asal_anak=?,asal_tk_nama_tk=?,asal_tk_nomor_tahun_surat_keterangan=?,asal_tk_lama_belajar=?,asal_pindah_nama_sekolah_asal=?,asal_pindah_tanggal=?,asal_pindah_dari_kelas=?,asal_diterima_sekolah_tanggal=?,asal_diterima_dikelas=?,kode_tahun_ajaran=? where no_pendaftaran = ?";
//                SQL = "update pendaftaran set bio_nama_lengkap=?,bio_nama_panggilan=?,bio_jenis_kelamin=?,bio_tempat_lahir=?,bio_tanggal_lahir=?,bio_agama=?,bio_kewarganegaraan=?,bio_anak_ke=?,bio_jml_saudara_kandung=?,bio_jml_saudara_tiri=?,bio_jml_saudara_angkat=?,bio_bahasa_sehari_hari=?,bio_berat_badan=?,bio_tinggi_badan=?,bio_golongan_darah=?,bio_penyakit_berat_yang_pernah_diderita=?,bio_alamat_tempat_tinggal=?,bio_no_telepon=?,bio_bertempat_tinggal=?,wali_nama_ayah_kandung=?,wali_nama_ibu_kandung=?,wali_pendidikan_tertinggi_ibu=?,wali_pendidikan_tertinggi_ayah=?,wali_pekerjaan_ayah=?,wali_pekerjaan_ibu=?,wali_nama_wali_siswa=?,wali_pendidikan_tertinggi_wali_siswa=?,wali_hubungan_terhadap_anak=?, wali_pekerjaan_wali_siswa=?,wali_pendapatan_perbulan_orang_tua=?,asal_masuk_sekolah=?,asal_anak=?,asal_tk_nama_tk=?,asal_tk_nomor_tahun_surat_keterangan=?,asal_tk_lama_belajar=?,asal_pindah_nama_sekolah_asal=?,asal_pindah_tanggal=?,asal_pindah_dari_kelas=?,asal_diterima_sekolah_tanggal=?,asal_diterima_dikelas=?,kode_tahun_ajaran=?,lampiran_akter_kelahiran=?,lampiran_kk=?,lampiran_ktp_ortu=?,lampiran_foto_ortu=?,lampiran_foto_anak=? where no_pendaftaran=? ";
                pstmt = con.prepareStatement(SQL);
                pstmt.setString(1, p.getBioNamaLengkap());
                pstmt.setString(2, p.getBioNamaPanggilan());
                pstmt.setString(3, p.getBioJenisKelamin());
                pstmt.setString(4, p.getBioTempatLahir());
                pstmt.setString(5, p.getBioTanggalLahir());
                pstmt.setString(6, p.getBioAgama());
                pstmt.setString(7, p.getBioKewarganegaraan());
                pstmt.setInt(8, p.getBioAnakKe());
                pstmt.setInt(9, p.getBioJmlSaudaraKandung());
                pstmt.setInt(10, p.getBioJmlSaudaraTiri());
                pstmt.setInt(11, p.getBioJmlSaudaraAngkat());
                pstmt.setString(12, p.getBioBahasaSehariHari());
                pstmt.setInt(13, p.getBioBeratBadan());
                pstmt.setInt(14, p.getBioTinggiBadan());
                pstmt.setString(15, p.getBioGolonganDarah());
                pstmt.setString(16, p.getBioPenyakitBeratYangPernahDiderita());
                pstmt.setString(17, p.getBioAlamatTempatTinggal());
                pstmt.setString(18, p.getBioNoTlp());
                pstmt.setString(19, p.getBioBertempatTinggal());
                pstmt.setString(20, p.getWaliNamaAyahKandung());
                pstmt.setString(21, p.getWaliNamaIbuKandung());
                pstmt.setString(22, p.getWaliPendidikanTertinggiIbu());
                pstmt.setString(23, p.getWaliPendidikanTertinggiAyah());
                pstmt.setString(24, p.getWaliPekerjaanAyah());
                pstmt.setString(25, p.getWaliPekerjaanIbu());
                pstmt.setString(26, p.getWaliNamaWaliSiswa());
                pstmt.setString(27, p.getWaliPendidikanTertinggiWaliSiswa());
                pstmt.setString(28, p.getWaliHubunganTerhadapAnak());
                pstmt.setString(29, p.getWaliPekerjaanWaliSiswa());
                pstmt.setString(30, p.getWaliPendapatanPerbulanOrangTua());
                pstmt.setString(31, p.getAsalMasukSekolah());
                pstmt.setString(32, p.getAsalAnak());
                pstmt.setString(33, p.getAsalTkNamaTk());
                pstmt.setString(34, p.getAsalTkNomoTahunSuratKeterangan());
                pstmt.setInt(35, p.getAsalTkLamaBelajar());
                pstmt.setString(36, p.getAsalPindahNamaSekolahAsal());
                pstmt.setString(37, p.getAsalPindahTanggal());
                pstmt.setInt(38, p.getAsalPindahDariKelas());
                pstmt.setString(39, p.getAsalDiterimaSekolahTanggal());
                pstmt.setInt(40, p.getAsalDiterimaDikelas());
                pstmt.setInt(41, p.getKodeTahunAjaran());
//                pstmt.setString(42, p.getDirlampiranAkteKelahiran());
//                pstmt.setString(43, p.getDirlampiranKk());
//                pstmt.setString(44, p.getDirlampiranKtpOrtu());
//                pstmt.setString(45, p.getDirlampiranFotoOrtu());
//                pstmt.setString(46, p.getDirlampiranFotoAnak());
                pstmt.setString(42, p.getNoPendaftaran());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Update Berhasil");
                pstmt.close();
            } catch (HeadlessException | SQLException e) {
                 JOptionPane.showMessageDialog(null,"Update gagal");
           }
       }
    }
    
    public Date getTanggalFromTable(String tgl){
       // String str_tgl = String.valueOf(tbl.getValueAt(tbl.getSelectedRow(), kolom));
        Date date = null;
        try {
            if(tgl !="-"){
               date = new SimpleDateFormat("yyyy-MM-dd").parse(tgl);
            }else{
                
            }
        } catch (ParseException e) {
        }
           return date;
    } 
   
    public void setFilterTahunAjaran(V_List_Pendaftaran pe){
        try {
            SQL = "select tahun_ajaran from tahun_ajaran";
            stmt = con.createStatement();
            res = stmt.executeQuery(SQL);
            while(res.next()){
                pe.CBTahunAjaranFilter.addItem(res.getString("tahun_ajaran"));
            }
            stmt.close();
            res.close();
        } catch (SQLException e) {
        }
    }
    
    public void setLaporanPendaftaran(String tahun_ajaran , String fileReport){
        try {
                parameter.put("p_tahun_ajaran", tahun_ajaran);
                File report_file = new File(fileReport);
                jasperDesign = JRXmlLoader.load(report_file);
                jasperReport = JasperCompileManager.compileReport(jasperDesign);
                  jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, con);
                 JasperViewer.viewReport(jasperPrint, false);
            } catch (JRException e) {
                System.out.println(e.getMessage());
            }
    }
    
    public void setCetakPerSiswa(String keyworld, String fileReport){
    
        try {
            parameter.put("p_cari",keyworld);
            File report_file = new File(fileReport);
            jasperDesign = JRXmlLoader.load(report_file);
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, con);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException e) {
             System.out.println(e.getMessage());
        }
    }
}
