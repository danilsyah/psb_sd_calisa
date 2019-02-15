
package com.entity;

public class Pendaftaran {
    private String noPendaftaran;
    private String bioNamaLengkap;
    private String bioNamaPanggilan;
    private String bioJenisKelamin;
    private String bioTempatLahir;
    private String bioTanggalLahir;
    private String bioAgama;
    private String bioKewarganegaraan;
    private int bioAnakKe;
    private int bioJmlSaudaraKandung;
    private int bioJmlSaudaraTiri;
    private int bioJmlSaudaraAngkat;
    private String bioBahasaSehariHari;
    private int bioBeratBadan;
    private int bioTinggiBadan;
    private String bioGolonganDarah;
    private String bioPenyakitBeratYangPernahDiderita;
    private String bioAlamatTempatTinggal;
    private String bioNoTlp;
    private String bioBertempatTinggal;
    private String waliNamaAyahKandung;
    private String waliNamaIbuKandung;
    private String waliPendidikanTertinggiIbu;
    private String waliPendidikanTertinggiAyah;
    private String waliPekerjaanAyah;
    private String waliPekerjaanIbu;
    private String waliNamaWaliSiswa;
    private String waliPendidikanTertinggiWaliSiswa;
    private String waliHubunganTerhadapAnak;
    private String waliPekerjaanWaliSiswa;
    private String waliPendapatanPerbulanOrangTua;
    private String asalMasukSekolah;
    private String asalAnak;
    private String asalTkNamaTk;
    private String asalTkNomoTahunSuratKeterangan;
    private int asalTkLamaBelajar;
    private String asalPindahNamaSekolahAsal;
    private String asalPindahTanggal=null;
    private int asalPindahDariKelas;
    private String asalDiterimaSekolahTanggal;
    private int asalDiterimaDikelas;
    private int kodeTahunAjaran;
    private String lampiranAkteKelahiran;
    private String lampiranKk;
    private String lampiranKtpOrtu;
    private String lampiranFotoOrtu;
    private String lampiranFotoAnak;
     private String dirlampiranAkteKelahiran;
    private String dirlampiranKk;
    private String dirlampiranKtpOrtu;
    private String dirlampiranFotoOrtu;
    private String dirlampiranFotoAnak;
    private String keySearcing;
    private String sortingview;
    private String tahunAjaran;
    private String semester;
    private String filterTahunAjaran;

    public String getFilterTahunAjaran() {
        return filterTahunAjaran;
    }

    public void setFilterTahunAjaran(String filterTahunAjaran) {
        this.filterTahunAjaran = filterTahunAjaran;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public String getSortingview() {
        return sortingview;
    }

    public void setSortingview(String sortingview) {
        this.sortingview = sortingview;
    }

    public String getKeySearcing() {
        return keySearcing;
    }

    public void setKeySearcing(String keySearcing) {
        this.keySearcing = keySearcing;
    }

    public String getDirlampiranAkteKelahiran() {
        return dirlampiranAkteKelahiran;
    }

    public void setDirlampiranAkteKelahiran(String dirlampiranAkteKelahiran) {
        this.dirlampiranAkteKelahiran = dirlampiranAkteKelahiran;
    }

    public String getDirlampiranKk() {
        return dirlampiranKk;
    }

    public void setDirlampiranKk(String dirlampiranKk) {
        this.dirlampiranKk = dirlampiranKk;
    }

    public String getDirlampiranKtpOrtu() {
        return dirlampiranKtpOrtu;
    }

    public void setDirlampiranKtpOrtu(String dirlampiranKtpOrtu) {
        this.dirlampiranKtpOrtu = dirlampiranKtpOrtu;
    }

    public String getDirlampiranFotoOrtu() {
        return dirlampiranFotoOrtu;
    }

    public void setDirlampiranFotoOrtu(String dirlampiranFotoOrtu) {
        this.dirlampiranFotoOrtu = dirlampiranFotoOrtu;
    }

    public String getDirlampiranFotoAnak() {
        return dirlampiranFotoAnak;
    }

    public void setDirlampiranFotoAnak(String dirlampiranFotoAnak) {
        this.dirlampiranFotoAnak = dirlampiranFotoAnak;
    }

    public String getLampiranAkteKelahiran() {
        return lampiranAkteKelahiran;
    }

    public void setLampiranAkteKelahiran(String lampiranAkteKelahiran) {
        this.lampiranAkteKelahiran = lampiranAkteKelahiran;
    }

    public String getLampiranKk() {
        return lampiranKk;
    }

    public void setLampiranKk(String lampiranKk) {
        this.lampiranKk = lampiranKk;
    }

    public String getLampiranKtpOrtu() {
        return lampiranKtpOrtu;
    }

    public void setLampiranKtpOrtu(String lampiranKtpOrtu) {
        this.lampiranKtpOrtu = lampiranKtpOrtu;
    }

    public String getLampiranFotoOrtu() {
        return lampiranFotoOrtu;
    }

    public void setLampiranFotoOrtu(String lampiranFotoOrtu) {
        this.lampiranFotoOrtu = lampiranFotoOrtu;
    }

    public String getLampiranFotoAnak() {
        return lampiranFotoAnak;
    }

    public void setLampiranFotoAnak(String lampiranFotoAnak) {
        this.lampiranFotoAnak = lampiranFotoAnak;
    }

    public String getNoPendaftaran() {
        return noPendaftaran;
    }

    public void setNoPendaftaran(String noPendaftaran) {
        this.noPendaftaran = noPendaftaran;
    }

    public String getBioNamaLengkap() {
        return bioNamaLengkap;
    }

    public void setBioNamaLengkap(String bioNamaLengkap) {
        this.bioNamaLengkap = bioNamaLengkap;
    }

    public String getBioNamaPanggilan() {
        return bioNamaPanggilan;
    }

    public void setBioNamaPanggilan(String bioNamaPanggilan) {
        this.bioNamaPanggilan = bioNamaPanggilan;
    }

    public String getBioJenisKelamin() {
        return bioJenisKelamin;
    }

    public void setBioJenisKelamin(String bioJenisKelamin) {
        this.bioJenisKelamin = bioJenisKelamin;
    }

    public String getBioTempatLahir() {
        return bioTempatLahir;
    }

    public void setBioTempatLahir(String bioTempatLahir) {
        this.bioTempatLahir = bioTempatLahir;
    }

    public String getBioTanggalLahir() {
        return bioTanggalLahir;
    }

    public void setBioTanggalLahir(String bioTanggalLahir) {
        this.bioTanggalLahir = bioTanggalLahir;
    }

    public String getBioAgama() {
        return bioAgama;
    }

    public void setBioAgama(String bioAgama) {
        this.bioAgama = bioAgama;
    }

    public String getBioKewarganegaraan() {
        return bioKewarganegaraan;
    }

    public void setBioKewarganegaraan(String bioKewarganegaraan) {
        this.bioKewarganegaraan = bioKewarganegaraan;
    }

    public int getBioAnakKe() {
        return bioAnakKe;
    }

    public void setBioAnakKe(int bioAnakKe) {
        this.bioAnakKe = bioAnakKe;
    }

    public int getBioJmlSaudaraKandung() {
        return bioJmlSaudaraKandung;
    }

    public void setBioJmlSaudaraKandung(int bioJmlSaudaraKandung) {
        this.bioJmlSaudaraKandung = bioJmlSaudaraKandung;
    }

    public int getBioJmlSaudaraTiri() {
        return bioJmlSaudaraTiri;
    }

    public void setBioJmlSaudaraTiri(int bioJmlSaudaraTiri) {
        this.bioJmlSaudaraTiri = bioJmlSaudaraTiri;
    }

    public int getBioJmlSaudaraAngkat() {
        return bioJmlSaudaraAngkat;
    }

    public void setBioJmlSaudaraAngkat(int bioJmlSaudaraAngkat) {
        this.bioJmlSaudaraAngkat = bioJmlSaudaraAngkat;
    }

    public String getBioBahasaSehariHari() {
        return bioBahasaSehariHari;
    }

    public void setBioBahasaSehariHari(String bioBahasaSehariHari) {
        this.bioBahasaSehariHari = bioBahasaSehariHari;
    }

    public int getBioBeratBadan() {
        return bioBeratBadan;
    }

    public void setBioBeratBadan(int bioBeratBadan) {
        this.bioBeratBadan = bioBeratBadan;
    }

    public int getBioTinggiBadan() {
        return bioTinggiBadan;
    }

    public void setBioTinggiBadan(int bioTinggiBadan) {
        this.bioTinggiBadan = bioTinggiBadan;
    }

    public String getBioGolonganDarah() {
        return bioGolonganDarah;
    }

    public void setBioGolonganDarah(String bioGolonganDarah) {
        this.bioGolonganDarah = bioGolonganDarah;
    }

    public String getBioPenyakitBeratYangPernahDiderita() {
        return bioPenyakitBeratYangPernahDiderita;
    }

    public void setBioPenyakitBeratYangPernahDiderita(String bioPenyakitBeratYangPernahDiderita) {
        this.bioPenyakitBeratYangPernahDiderita = bioPenyakitBeratYangPernahDiderita;
    }

    public String getBioAlamatTempatTinggal() {
        return bioAlamatTempatTinggal;
    }

    public void setBioAlamatTempatTinggal(String bioAlamatTempatTinggal) {
        this.bioAlamatTempatTinggal = bioAlamatTempatTinggal;
    }

    public String getBioNoTlp() {
        return bioNoTlp;
    }

    public void setBioNoTlp(String bioNoTlp) {
        this.bioNoTlp = bioNoTlp;
    }

    public String getBioBertempatTinggal() {
        return bioBertempatTinggal;
    }

    public void setBioBertempatTinggal(String bioBertempatTinggal) {
        this.bioBertempatTinggal = bioBertempatTinggal;
    }

    public String getWaliNamaAyahKandung() {
        return waliNamaAyahKandung;
    }

    public void setWaliNamaAyahKandung(String waliNamaAyahKandung) {
        this.waliNamaAyahKandung = waliNamaAyahKandung;
    }

    public String getWaliNamaIbuKandung() {
        return waliNamaIbuKandung;
    }

    public void setWaliNamaIbuKandung(String waliNamaIbuKandung) {
        this.waliNamaIbuKandung = waliNamaIbuKandung;
    }

    public String getWaliPendidikanTertinggiIbu() {
        return waliPendidikanTertinggiIbu;
    }

    public void setWaliPendidikanTertinggiIbu(String waliPendidikanTertinggiIbu) {
        this.waliPendidikanTertinggiIbu = waliPendidikanTertinggiIbu;
    }

    public String getWaliPendidikanTertinggiAyah() {
        return waliPendidikanTertinggiAyah;
    }

    public void setWaliPendidikanTertinggiAyah(String waliPendidikanTertinggiAyah) {
        this.waliPendidikanTertinggiAyah = waliPendidikanTertinggiAyah;
    }

    public String getWaliPekerjaanAyah() {
        return waliPekerjaanAyah;
    }

    public void setWaliPekerjaanAyah(String waliPekerjaanAyah) {
        this.waliPekerjaanAyah = waliPekerjaanAyah;
    }

    public String getWaliPekerjaanIbu() {
        return waliPekerjaanIbu;
    }

    public void setWaliPekerjaanIbu(String waliPekerjaanIbu) {
        this.waliPekerjaanIbu = waliPekerjaanIbu;
    }

    public String getWaliNamaWaliSiswa() {
        return waliNamaWaliSiswa;
    }

    public void setWaliNamaWaliSiswa(String waliNamaWaliSiswa) {
        this.waliNamaWaliSiswa = waliNamaWaliSiswa;
    }

    public String getWaliPendidikanTertinggiWaliSiswa() {
        return waliPendidikanTertinggiWaliSiswa;
    }

    public void setWaliPendidikanTertinggiWaliSiswa(String waliPendidikanTertinggiWaliSiswa) {
        this.waliPendidikanTertinggiWaliSiswa = waliPendidikanTertinggiWaliSiswa;
    }

    public String getWaliHubunganTerhadapAnak() {
        return waliHubunganTerhadapAnak;
    }

    public void setWaliHubunganTerhadapAnak(String waliHubunganTerhadapAnak) {
        this.waliHubunganTerhadapAnak = waliHubunganTerhadapAnak;
    }

    public String getWaliPekerjaanWaliSiswa() {
        return waliPekerjaanWaliSiswa;
    }

    public void setWaliPekerjaanWaliSiswa(String waliPekerjaanWaliSiswa) {
        this.waliPekerjaanWaliSiswa = waliPekerjaanWaliSiswa;
    }

    public String getWaliPendapatanPerbulanOrangTua() {
        return waliPendapatanPerbulanOrangTua;
    }

    public void setWaliPendapatanPerbulanOrangTua(String waliPendapatanPerbulanOrangTua) {
        this.waliPendapatanPerbulanOrangTua = waliPendapatanPerbulanOrangTua;
    }

    public String getAsalMasukSekolah() {
        return asalMasukSekolah;
    }

    public void setAsalMasukSekolah(String asalMasukSekolah) {
        this.asalMasukSekolah = asalMasukSekolah;
    }

    public String getAsalAnak() {
        return asalAnak;
    }

    public void setAsalAnak(String asalAnak) {
        this.asalAnak = asalAnak;
    }

    public String getAsalTkNamaTk() {
        return asalTkNamaTk;
    }

    public void setAsalTkNamaTk(String asalTkNamaTk) {
        this.asalTkNamaTk = asalTkNamaTk;
    }

    public String getAsalTkNomoTahunSuratKeterangan() {
        return asalTkNomoTahunSuratKeterangan;
    }

    public void setAsalTkNomoTahunSuratKeterangan(String asalTkNomoTahunSuratKeterangan) {
        this.asalTkNomoTahunSuratKeterangan = asalTkNomoTahunSuratKeterangan;
    }

    public int getAsalTkLamaBelajar() {
        return asalTkLamaBelajar;
    }

    public void setAsalTkLamaBelajar(int asalTkLamaBelajar) {
        this.asalTkLamaBelajar = asalTkLamaBelajar;
    }

    public String getAsalPindahNamaSekolahAsal() {
        return asalPindahNamaSekolahAsal;
    }

    public void setAsalPindahNamaSekolahAsal(String asalPindahNamaSekolahAsal) {
        this.asalPindahNamaSekolahAsal = asalPindahNamaSekolahAsal;
    }

    public String getAsalPindahTanggal() {
        return asalPindahTanggal;
    }

    public void setAsalPindahTanggal(String asalPindahTanggal) {
        this.asalPindahTanggal = asalPindahTanggal;
    }

    public int getAsalPindahDariKelas() {
        return asalPindahDariKelas;
    }

    public void setAsalPindahDariKelas(int asalPindahDariKelas) {
        this.asalPindahDariKelas = asalPindahDariKelas;
    }

    public String getAsalDiterimaSekolahTanggal() {
        return asalDiterimaSekolahTanggal;
    }

    public void setAsalDiterimaSekolahTanggal(String asalDiterimaSekolahTanggal) {
        this.asalDiterimaSekolahTanggal = asalDiterimaSekolahTanggal;
    }

    public int getAsalDiterimaDikelas() {
        return asalDiterimaDikelas;
    }

    public void setAsalDiterimaDikelas(int asalDiterimaDikelas) {
        this.asalDiterimaDikelas = asalDiterimaDikelas;
    }

    public int getKodeTahunAjaran() {
        return kodeTahunAjaran;
    }

    public void setKodeTahunAjaran(int kodeTahunAjaran) {
        this.kodeTahunAjaran = kodeTahunAjaran;
    }

    
}
