/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;
import com.model.M_Pendaftaran;
import com.model.M_Setting;
import com.entity.Pendaftaran;
import com.entity.Setting;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author danil
 */
public class V_Pendaftaran extends javax.swing.JFrame {
    
    final  M_Pendaftaran m = new M_Pendaftaran();
    final M_Setting m_set = new M_Setting();
    final  Pendaftaran p = new Pendaftaran();
    final Setting s = new  Setting();
    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
    /**
     * Creates new form V_Pendaftaran
     * @throws java.sql.SQLException
     */
    public V_Pendaftaran() throws SQLException {
        initComponents();
        m.autoNoPendaftaran(p);
        txtNoPendaftaran.setText(p.getNoPendaftaran());
        m_set.selectDirGambar(s);
        txtDirAkteKelahiranSiswa.setEnabled(false);
        txtDirFotoSiswa.setEnabled(false);
        txtDirFotoWali.setEnabled(false);
        txtDirKK.setEnabled(false);
        txtDirKTPOrtu.setEnabled(false);
    }

   public  V_Pendaftaran(String noPendaftaran, String bioNamaLengkap, String bioNamaPanggilan, String bioJenisKelamin, String bioTempatLahir, String bioTanggalLahir, String bioAgama, String bioKewarganegaraan, int bioAnakKe, int bioJmlSaudaraKandung, int bioJmlSaudaraTiri, int bioJmlSaudaraAngkat, String bioBahasaSehariHari, int bioBeratBadan, int bioTinggiBadan, String bioGolonganDarah, String bioPenyakitBeratYangPernahDiderita, String bioAlamatTempatTinggal, String bioNoTlp, String bioBertempatTinggal, String waliNamaAyahKandung, String waliNamaIbuKandung, String waliPendidikanTertinggiIbu, String waliPendidikanTertinggiAyah, String waliPekerjaanAyah, String waliPekerjaanIbu, String waliNamaWaliSiswa, String waliPendidikanTertinggiWaliSiswa, String waliHubunganTerhadapAnak, String waliPekerjaanWaliSiswa, String waliPendapatanPerbulanOrangTua, String asalMasukSekolah, String asalAnak, String asalTkNamaTk, String asalTkNomoTahunSuratKeterangan, int asalTkLamaBelajar, String asalPindahNamaSekolahAsal, String asalPindahTanggal, int asalPindahDariKelas, String asalDiterimaSekolahTanggal, int asalDiterimaDikelas, int kodeTahunAjaran, String lampiranAkteKelahiran, String lampiranKk, String lampiranKtpOrtu, String lampiranFotoOrtu, String lampiranFotoAnak, String tahunAjaran, String semester) {
         initComponents();
         btnLampirAkte.setEnabled(false);
         btnLampirFotoOrtu.setEnabled(false);
         btnLampirFotoSiswa.setEnabled(false);
         btnLampirKK.setEnabled(false);
         btnLampirKTP.setEnabled(false);
          btnSimpan.setEnabled(false);
          txtNoPendaftaran.setText(noPendaftaran);
          txtNamaLengkap.setText(bioNamaLengkap);
          txtNamaPanggilan.setText(bioNamaPanggilan);
         if(bioJenisKelamin.equals("Laki-Laki")){
             RBlaki.setSelected(true);
         }else{
             RBperempuan.setSelected(true);
         }
         txtTempatLahir.setText(bioTempatLahir);
         DCtanggalLahir.setDate(m.getTanggalFromTable(bioTanggalLahir));
         CBagama.setSelectedItem(bioAgama);
         CBkewarganegaraan.setSelectedItem(bioKewarganegaraan);
         Sanakke.setValue(bioAnakKe);
         SjmlSaudaraKandung.setValue(bioJmlSaudaraKandung);
         SJmlSaudaraTiri.setValue(bioJmlSaudaraTiri);
         SJmlSaudaraAngkat.setValue(bioJmlSaudaraAngkat);
         CBBahasa.setSelectedItem(bioBahasaSehariHari);
         SBeratBadan.setValue(bioBeratBadan);
         STinggiBadan.setValue(bioTinggiBadan);
         CBGolonganDarah.setSelectedItem(bioGolonganDarah);
         txtPenyakit.setText(bioPenyakitBeratYangPernahDiderita);
         txtAlamatTempatTinggal.setText(bioAlamatTempatTinggal);
         txtNoTlp.setText(bioNoTlp);
         CBBertempatTinggal.setSelectedItem(bioBertempatTinggal);
         txtWaliNamaAyahKandung.setText(waliNamaAyahKandung);
         txtWaliNamaIbuKandung.setText(waliNamaIbuKandung);
         CBWaliPendidikanAyah.setSelectedItem(waliPendidikanTertinggiAyah);
         CBWaliPendidikanIbu.setSelectedItem(waliPendidikanTertinggiIbu);
         CBWaliPekerjaanAyah.setSelectedItem(waliPekerjaanAyah);
         CBWaliPekerjaanIbu.setSelectedItem(waliPekerjaanIbu);
         txtWaliNamaWaliSiswa.setText(waliNamaWaliSiswa);
         CBWaliPendidikanWali.setSelectedItem(waliPendidikanTertinggiWaliSiswa);
         CBWaliHubunganWaliAnak.setSelectedItem(waliHubunganTerhadapAnak);
         CBWaliPekerjaanWali.setSelectedItem(waliPekerjaanWaliSiswa);
         CBWaliPendapatanWali.setSelectedItem(waliPendapatanPerbulanOrangTua);
         if(asalMasukSekolah.equals("Siswa Baru")){
             RBAsalSiswaBaru.setSelected(true);
         }else{
             RBAsalPindah.setSelected(true);
         }
         if(asalAnak.equals("Rumah Tangga")){
             RBAsalRumahTangga.setSelected(true);
         }else{
             RBAsalTK.setSelected(true);
         }
         txtAsalNamaTK.setText(asalTkNamaTk);
         txtAsalNoTahunSuratKeterangan.setText(asalTkNomoTahunSuratKeterangan);
         SAsalLamaBelajar.setValue(asalTkLamaBelajar);
         txtAsalPindNamaSekolahAsal.setText(asalPindahNamaSekolahAsal);
         DCPindTanggal.setDate(m.getTanggalFromTable(asalPindahTanggal));
         SAsalPindDariKelas.setValue(asalPindahDariKelas);
         DCDiterimaDisekolahIniTanggal.setDate(m.getTanggalFromTable(asalDiterimaSekolahTanggal));
         SDIterimaDiKelas.setValue(asalDiterimaDikelas);
         txtTahunAjaran.setText(tahunAjaran+"||"+semester);
         System.out.println("Kode tahun ajaran = "+kodeTahunAjaran);
         p.setKodeTahunAjaran(kodeTahunAjaran);
         txtDirAkteKelahiranSiswa.setText(lampiranAkteKelahiran);
         txtDirFotoSiswa.setText(lampiranFotoAnak);
         txtDirFotoWali.setText(lampiranFotoOrtu);
         txtDirKK.setText(lampiranKk);
         txtDirKTPOrtu.setText(lampiranKtpOrtu);
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if(txtNamaLengkap.getText().isEmpty()||txtAlamatTempatTinggal.getText().isEmpty()||txtNamaPanggilan.getText().isEmpty()||txtNoTlp.getText().isEmpty()||txtPenyakit.getText().isEmpty()||txtTempatLahir.getText().isEmpty()||
            txtWaliNamaAyahKandung.getText().isEmpty()||txtWaliNamaIbuKandung.getText().isEmpty()||txtWaliNamaWaliSiswa.getText().isEmpty()||txtDirAkteKelahiranSiswa.getText().isEmpty()||txtDirFotoWali.getText().isEmpty()||
                txtDirFotoSiswa.getText().isEmpty()||txtDirKK.getText().isEmpty()||txtLampirKTPOrtu.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong..!!!"); 
        }else if(CBBahasa.getSelectedItem().equals("-PILIH-")||CBBertempatTinggal.getSelectedItem().equals("-PILIH-")||CBGolonganDarah.getSelectedItem().equals("-PILIH-")||
              CBWaliHubunganWaliAnak.getSelectedItem().equals("-PILIH-")||CBWaliPekerjaanAyah.getSelectedItem().equals("-PILIH-")||CBWaliPekerjaanIbu.getSelectedItem().equals("-PILIH-")||
                CBWaliPekerjaanWali.getSelectedItem().equals("-PILIH-")||CBWaliPendidikanAyah.getSelectedItem().equals("-PILIH-")||CBWaliPendidikanIbu.getSelectedItem().equals("-PILIH-")||
                CBWaliPendidikanWali.getSelectedItem().equals("-PILIH-")||CBagama.getSelectedItem().equals("-PILIH-")||CBkewarganegaraan.getSelectedItem().equals("-PILIH-")){
        
                JOptionPane.showMessageDialog(null, "Lengkapi Data Pilihan..!!!");
        }
        else{
            valid = true;
        }
        
        return valid;
    }
    
    private void InputData(){
        p.setNoPendaftaran(txtNoPendaftaran.getText());
        p.setBioNamaLengkap(txtNamaLengkap.getText());
        p.setBioNamaPanggilan(txtNamaPanggilan.getText());
        String jenkel = null;
        if(RBlaki.isSelected()){
            jenkel = "Laki-Laki";
        }else if(RBperempuan.isSelected()){
            jenkel = "Perempuan";
        }
        p.setBioJenisKelamin(jenkel);
        p.setBioTempatLahir(txtTempatLahir.getText());
        String tglLahir = dateFormat.format(DCtanggalLahir.getDate());
        p.setBioTanggalLahir(tglLahir);
        p.setBioAgama(CBagama.getSelectedItem().toString());
        p.setBioKewarganegaraan(CBkewarganegaraan.getSelectedItem().toString());
        p.setBioAnakKe((int) Sanakke.getValue());
        p.setBioJmlSaudaraKandung((int) SjmlSaudaraKandung.getValue());
        p.setBioJmlSaudaraTiri((int) SJmlSaudaraTiri.getValue());
        p.setBioJmlSaudaraAngkat((int) SJmlSaudaraAngkat.getValue());
        p.setBioBahasaSehariHari(CBBahasa.getSelectedItem().toString());
        p.setBioBeratBadan((int) SBeratBadan.getValue());
        p.setBioTinggiBadan((int) STinggiBadan.getValue());
        p.setBioGolonganDarah(CBGolonganDarah.getSelectedItem().toString());
        p.setBioPenyakitBeratYangPernahDiderita(txtPenyakit.getText());
        p.setBioAlamatTempatTinggal(txtAlamatTempatTinggal.getText());
        p.setBioNoTlp(txtNoTlp.getText());
        p.setBioBertempatTinggal(CBBertempatTinggal.getSelectedItem().toString());
        p.setWaliNamaAyahKandung(txtWaliNamaAyahKandung.getText());
        p.setWaliNamaIbuKandung(txtWaliNamaIbuKandung.getText());
        p.setWaliPendidikanTertinggiAyah(CBWaliPendidikanAyah.getSelectedItem().toString());
        p.setWaliPendidikanTertinggiIbu(CBWaliPendidikanIbu.getSelectedItem().toString());
        p.setWaliPekerjaanAyah(CBWaliPekerjaanAyah.getSelectedItem().toString());
        p.setWaliPekerjaanIbu(CBWaliPekerjaanIbu.getSelectedItem().toString());
        p.setWaliNamaWaliSiswa(txtWaliNamaWaliSiswa.getText());
        p.setWaliPendidikanTertinggiWaliSiswa(CBWaliPendidikanWali.getSelectedItem().toString());
        p.setWaliHubunganTerhadapAnak(CBWaliHubunganWaliAnak.getSelectedItem().toString());
        p.setWaliPekerjaanWaliSiswa(CBWaliPekerjaanWali.getSelectedItem().toString());
        p.setWaliPendapatanPerbulanOrangTua(CBWaliPendapatanWali.getSelectedItem().toString());
        String asal = null;
        if(RBAsalSiswaBaru.isSelected()){
            asal = "Siswa Baru";
        }else if(RBAsalPindah.isSelected()){
            asal = "Pindahan";
        }
        p.setAsalMasukSekolah(asal);
        String asalAnak = null;
        if(RBAsalRumahTangga.isSelected()){
            asalAnak = "Rumah Tangga";
        }else if(RBAsalTK.isSelected()){
             asalAnak = "TK";
        }
        p.setAsalAnak(asalAnak);
        if(txtAsalNamaTK.getText().isEmpty()){
           txtAsalNamaTK.setText("-");
        }
         p.setAsalTkNamaTk(txtAsalNamaTK.getText());
        if(txtAsalNoTahunSuratKeterangan.getText().isEmpty()){
             txtAsalNoTahunSuratKeterangan.setText("-");
        }
        p.setAsalTkNomoTahunSuratKeterangan(txtAsalNoTahunSuratKeterangan.getText());      
        p.setAsalTkLamaBelajar((int) SAsalLamaBelajar.getValue());
        String tglPindahan;
       if(txtAsalPindNamaSekolahAsal.getText().isEmpty()){
           txtAsalPindNamaSekolahAsal.setText("-");
           tglPindahan=null;
       }else{
            tglPindahan = dateFormat.format(DCPindTanggal.getDate());
       }
         p.setAsalPindahNamaSekolahAsal(txtAsalPindNamaSekolahAsal.getText());
         p.setAsalPindahTanggal(tglPindahan);
         p.setAsalPindahDariKelas((int) SAsalPindDariKelas.getValue());
        String tglDiterima = dateFormat.format(DCDiterimaDisekolahIniTanggal.getDate()); 
        p.setAsalDiterimaSekolahTanggal(tglDiterima);
        p.setAsalDiterimaDikelas((int) SDIterimaDiKelas.getValue());
        
    }
    
    private void aktifCbAsalAnak(boolean x){
        RBAsalRumahTangga.setEnabled(x);
        RBAsalTK.setEnabled(x);
    }
    private void KolomPindahan(boolean x){
             txtAsalPindNamaSekolahAsal.setEnabled(x);
            DCPindTanggal.setEnabled(x);
            SAsalPindDariKelas.setEnabled(x);
    }
    
    private void KolomSiswaBaru(boolean x){
        txtAsalNamaTK.setEnabled(x);
        txtAsalNoTahunSuratKeterangan.setEnabled(x);
        SAsalLamaBelajar.setEnabled(x);
    }
    
    private void reloadForm(){
        dispose();
        try {
            new V_Pendaftaran().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(V_Pendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_tahunAjaran = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTempatLahir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CBagama = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CBkewarganegaraan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Sanakke = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        SjmlSaudaraKandung = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SJmlSaudaraTiri = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        SJmlSaudaraAngkat = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        CBBahasa = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        SBeratBadan = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        STinggiBadan = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        CBGolonganDarah = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtPenyakit = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtAlamatTempatTinggal = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNoTlp = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNoPendaftaran = new javax.swing.JTextField();
        CBBertempatTinggal = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtNamaLengkap = new javax.swing.JTextField();
        txtNamaPanggilan = new javax.swing.JTextField();
        DCtanggalLahir = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        RBlaki = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        RBperempuan = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtWaliNamaAyahKandung = new javax.swing.JTextField();
        txtWaliNamaIbuKandung = new javax.swing.JTextField();
        CBWaliPendidikanAyah = new javax.swing.JComboBox<>();
        CBWaliPendidikanIbu = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        CBWaliPekerjaanAyah = new javax.swing.JComboBox<>();
        CBWaliPekerjaanIbu = new javax.swing.JComboBox<>();
        txtWaliNamaWaliSiswa = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        CBWaliPendidikanWali = new javax.swing.JComboBox<>();
        CBWaliHubunganWaliAnak = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        CBWaliPekerjaanWali = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        CBWaliPendapatanWali = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        RBAsalSiswaBaru = new javax.swing.JRadioButton();
        RBAsalPindah = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        RBAsalRumahTangga = new javax.swing.JRadioButton();
        RBAsalTK = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        txtAsalNamaTK = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtAsalNoTahunSuratKeterangan = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        SAsalLamaBelajar = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        txtAsalPindNamaSekolahAsal = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        DCPindTanggal = new com.toedter.calendar.JDateChooser();
        jLabel40 = new javax.swing.JLabel();
        SAsalPindDariKelas = new javax.swing.JSpinner();
        jPanel10 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        DCDiterimaDisekolahIniTanggal = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        SDIterimaDiKelas = new javax.swing.JSpinner();
        jLabel43 = new javax.swing.JLabel();
        txtTahunAjaran = new javax.swing.JTextField();
        btnCariTahunAjaran = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnLampirAkte = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        txtLampirAkteSiswa = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtLampirKK = new javax.swing.JTextField();
        btnLampirKK = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        txtLampirKTPOrtu = new javax.swing.JTextField();
        btnLampirKTP = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        txtLampirFotoOrtu = new javax.swing.JTextField();
        btnLampirFotoOrtu = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        txtLampirFotoSiswa = new javax.swing.JTextField();
        btnLampirFotoSiswa = new javax.swing.JButton();
        txtDirAkteKelahiranSiswa = new javax.swing.JTextField();
        txtDirKK = new javax.swing.JTextField();
        txtDirKTPOrtu = new javax.swing.JTextField();
        txtDirFotoWali = new javax.swing.JTextField();
        txtDirFotoSiswa = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jDialog1.setMinimumSize(new java.awt.Dimension(350, 400));

        jTable_tahunAjaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_tahunAjaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_tahunAjaranMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_tahunAjaran);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pendaftaran");

        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Biodata Siswa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nama Panggilan");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tempat Lahir");

        CBagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "Islam", "Protestan", "Katolik", "Hindu", "Budda", "DLL" }));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Jenis Kelamin");

        CBkewarganegaraan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "WNI", "WNA" }));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Agama");

        Sanakke.setToolTipText("");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Kewarganegaraan");

        SjmlSaudaraKandung.setModel(new javax.swing.SpinnerNumberModel());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Anak-Ke");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Jumlah Saudara Kandung");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Jumlah Saudara Tiri");

        SJmlSaudaraTiri.setModel(new javax.swing.SpinnerNumberModel());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Jumlah Saudara Angkat");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Bahasa Sehari-hari");

        CBBahasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "INDONESIA", "INGGRIS", "MELAYU", "LAINNYA" }));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Berat Badan (Kg)");

        SBeratBadan.setModel(new javax.swing.SpinnerNumberModel());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Tinggi Badan (Cm)");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Golongan Darah");

        CBGolonganDarah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "A", "B", "AB", "O", "A+", "B+", "AB+", "O+" }));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Penyakit Yang Pernah Di Derita");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Alamat Tempat Tinggal");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("No Telepon");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Bertempat Tinggal");

        CBBertempatTinggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "ORANG TUA", "MENUMPANG", "ASRAMA" }));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Tanggal Lahir");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("No Pendaftaran");

        buttonGroup1.add(RBlaki);
        RBlaki.setText("Laki-laki");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nama Lengkap");

        buttonGroup1.add(RBperempuan);
        RBperempuan.setText("Perempuan");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBBahasa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNoPendaftaran)
                    .addComponent(txtNamaLengkap)
                    .addComponent(txtNamaPanggilan)
                    .addComponent(txtTempatLahir)
                    .addComponent(CBagama, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBkewarganegaraan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPenyakit)
                    .addComponent(txtAlamatTempatTinggal)
                    .addComponent(txtNoTlp)
                    .addComponent(CBBertempatTinggal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SBeratBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STinggiBadan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(RBlaki)
                                .addGap(10, 10, 10)
                                .addComponent(RBperempuan))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SjmlSaudaraKandung)
                                .addComponent(SJmlSaudaraTiri)
                                .addComponent(SJmlSaudaraAngkat, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(Sanakke))
                            .addComponent(CBGolonganDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DCtanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNoPendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNamaPanggilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RBlaki)
                    .addComponent(RBperempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(DCtanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBkewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(Sanakke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SjmlSaudaraKandung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SJmlSaudaraTiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SJmlSaudaraAngkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBBahasa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SBeratBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(STinggiBadan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(CBGolonganDarah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPenyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtAlamatTempatTinggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(CBBertempatTinggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orang Tua Wali", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Nama Ayah Kandung");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Nama Ibu Kandung");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Pendidikan Tertinggi Ayah");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Pendidikan Tertinggi Ibu");

        CBWaliPendidikanAyah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "SD - Sederajat", "SMP - Sederajat", "SMA - Sederajat", "Diploma (D1)", "Diploma (D3)", "Strata (S1)", "Strata (S2)", "Strata (S3)", "Lainnya" }));

        CBWaliPendidikanIbu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "SD - Sederajat", "SMP - Sederajat", "SMA - Sederajat", "Diploma (D1)", "Diploma (D3)", "Strata (S1)", "Strata (S2)", "Strata (S3)", "Lainnya" }));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Pekerjaan Ayah");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Pekerjaan Ibu");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Nama Wali Siswa");

        CBWaliPekerjaanAyah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "WIRASWASTA", "PEGAWAI NEGERI SIPIL", "KARYAWAN SWASTA", "LAINNYA" }));

        CBWaliPekerjaanIbu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "WIRASWASTA", "PEGAWAI NEGERI SIPIL", "KARYAWAN SWASTA", "LAINNYA" }));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Pendidikan Tertinggi Wali");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Hubungan Wali Dengan Anak");

        CBWaliPendidikanWali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "SD - Sederajat", "SMP - Sederajat", "SMA - Sederajat", "Diploma (D1)", "Diploma (D3)", "Strata (S1)", "Strata (S2)", "Strata (S3)", "Lainnya" }));

        CBWaliHubunganWaliAnak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "ORANG TUA KANDUNG", "ORANG TUA ANGKAT", "PAMAN/TANTE", "CUCU", "SAUDARA", "LAINNYA" }));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Pekerjaan Wali");

        CBWaliPekerjaanWali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "WIRASWASTA", "PEGAWAI NEGERI SIPIL", "KARYAWAN SWASTA", "LAINNYA" }));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Pendapatan Perbulan Wali");

        CBWaliPendapatanWali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-PILIH-", "2.000.000 - 3.000.000", "3.000.000 - 5.000.000", "5.000.000 - 10.000.000", "10.000.000 >" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtWaliNamaAyahKandung))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtWaliNamaIbuKandung))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBWaliPendidikanIbu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBWaliPendidikanAyah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBWaliPekerjaanAyah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBWaliPekerjaanIbu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtWaliNamaWaliSiswa))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBWaliHubunganWaliAnak, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBWaliPendidikanWali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBWaliPekerjaanWali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CBWaliPendapatanWali, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtWaliNamaAyahKandung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtWaliNamaIbuKandung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(CBWaliPendidikanAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBWaliPendidikanIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBWaliPekerjaanAyah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(CBWaliPekerjaanIbu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWaliNamaWaliSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBWaliPendidikanWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(CBWaliHubunganWaliAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBWaliPekerjaanWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBWaliPendapatanWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asal Siswa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Masuk Sekolah Ini Sebagai");

        buttonGroup2.add(RBAsalSiswaBaru);
        RBAsalSiswaBaru.setText("SISWA BARU");
        RBAsalSiswaBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAsalSiswaBaruActionPerformed(evt);
            }
        });

        buttonGroup2.add(RBAsalPindah);
        RBAsalPindah.setText("PINDAHAN");
        RBAsalPindah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAsalPindahActionPerformed(evt);
            }
        });

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Asal Anak");

        buttonGroup3.add(RBAsalRumahTangga);
        RBAsalRumahTangga.setText("RUMAH TANGGA");
        RBAsalRumahTangga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAsalRumahTanggaActionPerformed(evt);
            }
        });

        buttonGroup3.add(RBAsalTK);
        RBAsalTK.setText("TK");
        RBAsalTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAsalTKActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Asal TK"));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Nama TK");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("No/Tahun Surat Keterangan");

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Lama Belajar (Bulan)");

        SAsalLamaBelajar.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAsalNamaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAsalNoTahunSuratKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SAsalLamaBelajar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtAsalNamaTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(txtAsalNoTahunSuratKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(SAsalLamaBelajar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Pindahan"));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Nama Sekolah Asal");

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Tanggal");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Dari Kelas");

        SAsalPindDariKelas.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SAsalPindDariKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAsalPindNamaSekolahAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DCPindTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtAsalPindNamaSekolahAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(DCPindTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(SAsalPindDariKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Di Terima Di Sekolah Ini"));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Tanggal");

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Di Kelas");

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Tahun Ajaran / Semester");

        btnCariTahunAjaran.setText("Cari");
        btnCariTahunAjaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariTahunAjaranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DCDiterimaDisekolahIniTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SDIterimaDiKelas))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTahunAjaran)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCariTahunAjaran)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DCDiterimaDisekolahIniTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(SDIterimaDiKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTahunAjaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(btnCariTahunAjaran))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RBAsalSiswaBaru))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RBAsalRumahTangga)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBAsalTK)
                            .addComponent(RBAsalPindah)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(RBAsalSiswaBaru)
                    .addComponent(RBAsalPindah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBAsalRumahTangga)
                    .addComponent(RBAsalTK)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lampiran", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        btnLampirAkte.setText("Browse");
        btnLampirAkte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLampirAkteActionPerformed(evt);
            }
        });

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Akte Kelahiran Siswa");

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Kartu Keluarga");

        btnLampirKK.setText("Browse");
        btnLampirKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLampirKKActionPerformed(evt);
            }
        });

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("KTP Orang Tua/Wali");

        btnLampirKTP.setText("Browse");
        btnLampirKTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLampirKTPActionPerformed(evt);
            }
        });

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Foto Orang Tua/Wali");

        btnLampirFotoOrtu.setText("Browse");
        btnLampirFotoOrtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLampirFotoOrtuActionPerformed(evt);
            }
        });

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Foto Siswa");

        btnLampirFotoSiswa.setText("Browse");
        btnLampirFotoSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLampirFotoSiswaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDirFotoSiswa)
                    .addComponent(txtDirFotoWali)
                    .addComponent(txtDirKTPOrtu)
                    .addComponent(txtDirKK)
                    .addComponent(txtDirAkteKelahiranSiswa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLampirFotoSiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(txtLampirFotoOrtu)
                    .addComponent(txtLampirKTPOrtu)
                    .addComponent(txtLampirKK)
                    .addComponent(txtLampirAkteSiswa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLampirKK)
                                .addComponent(btnLampirKTP, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnLampirFotoOrtu, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(btnLampirFotoSiswa, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnLampirAkte, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtLampirAkteSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLampirAkte)
                    .addComponent(txtDirAkteKelahiranSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLampirKK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLampirKK)
                        .addComponent(txtDirKK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLampirKTPOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLampirKTP)
                        .addComponent(txtDirKTPOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLampirFotoOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLampirFotoOrtu)
                    .addComponent(jLabel47)
                    .addComponent(txtDirFotoWali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLampirFotoSiswa)
                        .addComponent(txtLampirFotoSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48))
                    .addComponent(txtDirFotoSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        jTabbedPane2.addTab("Biodata", jScrollPane2);
        jTabbedPane2.addTab("", jTabbedPane1);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("UBAH");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_tahunAjaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_tahunAjaranMouseClicked
        if(jTable_tahunAjaran.getSelectedRow()!=-1){
             jTable_tahunAjaran.setRowSelectionAllowed(true);
            int row = jTable_tahunAjaran.getSelectedRow();
            String kode = jTable_tahunAjaran.getValueAt(row, 0).toString();
            String tahunAjaran = jTable_tahunAjaran.getValueAt(row,1).toString();
            String semester = jTable_tahunAjaran.getValueAt(row,2).toString();
            txtTahunAjaran.setText(tahunAjaran+" || "+semester);
            p.setTahunAjaran(tahunAjaran);
            p.setSemester(semester);
            p.setKodeTahunAjaran(Integer.parseInt(kode));
             System.out.println(p.getKodeTahunAjaran());
             jDialog1.dispose();
        }
    }//GEN-LAST:event_jTable_tahunAjaranMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
      if(validasiInput()==true){
          try {
              InputData();
              m.insertPendaftaran(p);
              reloadForm();
          } catch (SQLException ex) {
              Logger.getLogger(V_Pendaftaran.class.getName()).log(Level.SEVERE, null, ex);
          }
       }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCariTahunAjaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariTahunAjaranActionPerformed
        jDialog1.setLocationRelativeTo(this);
        try {
            m.viewTahunAjaran(jTable_tahunAjaran);
        } catch (SQLException ex) {
            Logger.getLogger(V_Pendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDialog1.setVisible(true);
    }//GEN-LAST:event_btnCariTahunAjaranActionPerformed

    private void RBAsalTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAsalTKActionPerformed
        // TODO add your handling code here:
        KolomSiswaBaru(true);
    }//GEN-LAST:event_RBAsalTKActionPerformed

    private void RBAsalRumahTanggaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAsalRumahTanggaActionPerformed
        // TODO add your handling code here:
        KolomSiswaBaru(false);
    }//GEN-LAST:event_RBAsalRumahTanggaActionPerformed

    private void RBAsalPindahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAsalPindahActionPerformed
        // TODO add your handling code here:
        aktifCbAsalAnak(false);
        KolomSiswaBaru(false);
        KolomPindahan(true);
    }//GEN-LAST:event_RBAsalPindahActionPerformed

    private void RBAsalSiswaBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAsalSiswaBaruActionPerformed
        KolomPindahan(false);
        aktifCbAsalAnak(true);
    }//GEN-LAST:event_RBAsalSiswaBaruActionPerformed

    private void btnLampirAkteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLampirAkteActionPerformed
        m.upload_Lamp_Akte_Kelahiran(p);
        txtLampirAkteSiswa.setText(p.getLampiranAkteKelahiran());
          txtDirAkteKelahiranSiswa.setText(s.getDirectoryGambar() + p.getNoPendaftaran() + "_akte" + ".jpg");
          p.setDirlampiranAkteKelahiran(txtDirAkteKelahiranSiswa.getText());
    }//GEN-LAST:event_btnLampirAkteActionPerformed

    private void btnLampirKKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLampirKKActionPerformed
        // TODO add your handling code here:
        m.upload_Lamp_kk(p);
        txtLampirKK.setText(p.getLampiranKk());
        txtDirKK.setText(s.getDirectoryGambar() + p.getNoPendaftaran() + "_kk" + ".jpg");
        p.setDirlampiranKk(txtDirKK.getText());
    }//GEN-LAST:event_btnLampirKKActionPerformed

    private void btnLampirKTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLampirKTPActionPerformed
        // TODO add your handling code here:
        m.upload_Lamp_ktp_ortu(p);
        txtLampirKTPOrtu.setText(p.getLampiranKtpOrtu());
        txtDirKTPOrtu.setText(s.getDirectoryGambar() + p.getNoPendaftaran() + "_ktp_wali" + ".jpg");
        p.setDirlampiranKtpOrtu(txtDirKTPOrtu.getText());
    }//GEN-LAST:event_btnLampirKTPActionPerformed

    private void btnLampirFotoOrtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLampirFotoOrtuActionPerformed
        // TODO add your handling code here:
        m.upload_Lamp_foto_ortu(p);
        txtLampirFotoOrtu.setText(p.getLampiranFotoOrtu());
          txtDirFotoWali.setText(s.getDirectoryGambar() + p.getNoPendaftaran() + "_wali" + ".jpg");
           p.setDirlampiranFotoOrtu(txtDirFotoWali.getText());
    }//GEN-LAST:event_btnLampirFotoOrtuActionPerformed

    private void btnLampirFotoSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLampirFotoSiswaActionPerformed
        // TODO add your handling code here:
        m.upload_Lamp_foto_siswa(p);
        txtLampirFotoSiswa.setText(p.getLampiranFotoAnak());
        txtDirFotoSiswa.setText(s.getDirectoryGambar() + p.getNoPendaftaran() + "_pas_foto" + ".jpg");
        p.setDirlampiranFotoAnak(txtDirFotoSiswa.getText());
    }//GEN-LAST:event_btnLampirFotoSiswaActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
            InputData();
            m.updatePendaftaran(p, jTable_tahunAjaran);
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(V_Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(V_Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(V_Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(V_Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new V_Pendaftaran().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(V_Pendaftaran.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBBahasa;
    private javax.swing.JComboBox<String> CBBertempatTinggal;
    private javax.swing.JComboBox<String> CBGolonganDarah;
    private javax.swing.JComboBox<String> CBWaliHubunganWaliAnak;
    private javax.swing.JComboBox<String> CBWaliPekerjaanAyah;
    private javax.swing.JComboBox<String> CBWaliPekerjaanIbu;
    private javax.swing.JComboBox<String> CBWaliPekerjaanWali;
    private javax.swing.JComboBox<String> CBWaliPendapatanWali;
    private javax.swing.JComboBox<String> CBWaliPendidikanAyah;
    private javax.swing.JComboBox<String> CBWaliPendidikanIbu;
    private javax.swing.JComboBox<String> CBWaliPendidikanWali;
    private javax.swing.JComboBox<String> CBagama;
    private javax.swing.JComboBox<String> CBkewarganegaraan;
    private com.toedter.calendar.JDateChooser DCDiterimaDisekolahIniTanggal;
    private com.toedter.calendar.JDateChooser DCPindTanggal;
    private com.toedter.calendar.JDateChooser DCtanggalLahir;
    private javax.swing.JRadioButton RBAsalPindah;
    private javax.swing.JRadioButton RBAsalRumahTangga;
    private javax.swing.JRadioButton RBAsalSiswaBaru;
    private javax.swing.JRadioButton RBAsalTK;
    private javax.swing.JRadioButton RBlaki;
    private javax.swing.JRadioButton RBperempuan;
    private javax.swing.JSpinner SAsalLamaBelajar;
    private javax.swing.JSpinner SAsalPindDariKelas;
    private javax.swing.JSpinner SBeratBadan;
    private javax.swing.JSpinner SDIterimaDiKelas;
    private javax.swing.JSpinner SJmlSaudaraAngkat;
    private javax.swing.JSpinner SJmlSaudaraTiri;
    private javax.swing.JSpinner STinggiBadan;
    private javax.swing.JSpinner Sanakke;
    private javax.swing.JSpinner SjmlSaudaraKandung;
    private javax.swing.JButton btnCariTahunAjaran;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLampirAkte;
    private javax.swing.JButton btnLampirFotoOrtu;
    private javax.swing.JButton btnLampirFotoSiswa;
    private javax.swing.JButton btnLampirKK;
    private javax.swing.JButton btnLampirKTP;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable_tahunAjaran;
    private javax.swing.JTextField txtAlamatTempatTinggal;
    private javax.swing.JTextField txtAsalNamaTK;
    private javax.swing.JTextField txtAsalNoTahunSuratKeterangan;
    private javax.swing.JTextField txtAsalPindNamaSekolahAsal;
    private javax.swing.JTextField txtDirAkteKelahiranSiswa;
    private javax.swing.JTextField txtDirFotoSiswa;
    private javax.swing.JTextField txtDirFotoWali;
    private javax.swing.JTextField txtDirKK;
    private javax.swing.JTextField txtDirKTPOrtu;
    private javax.swing.JTextField txtLampirAkteSiswa;
    private javax.swing.JTextField txtLampirFotoOrtu;
    private javax.swing.JTextField txtLampirFotoSiswa;
    private javax.swing.JTextField txtLampirKK;
    private javax.swing.JTextField txtLampirKTPOrtu;
    private javax.swing.JTextField txtNamaLengkap;
    private javax.swing.JTextField txtNamaPanggilan;
    private javax.swing.JTextField txtNoPendaftaran;
    private javax.swing.JTextField txtNoTlp;
    private javax.swing.JTextField txtPenyakit;
    private javax.swing.JTextField txtTahunAjaran;
    private javax.swing.JTextField txtTempatLahir;
    private javax.swing.JTextField txtWaliNamaAyahKandung;
    private javax.swing.JTextField txtWaliNamaIbuKandung;
    private javax.swing.JTextField txtWaliNamaWaliSiswa;
    // End of variables declaration//GEN-END:variables
}
