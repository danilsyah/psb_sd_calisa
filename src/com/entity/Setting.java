
package com.entity;

public class Setting {
    private String kodeTahunAjaran;
    private String tahunAjaran;
    private String semester;
    private String directoryGambar;

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDirectoryGambar() {
        return directoryGambar;
    }

    public void setDirectoryGambar(String directoryGambar) {
        this.directoryGambar = directoryGambar;
    }

    public String getKodeTahunAjaran() {
        return kodeTahunAjaran;
    }

    public void setKodeTahunAjaran(String kodeTahunAjaran) {
        this.kodeTahunAjaran = kodeTahunAjaran;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }
}
