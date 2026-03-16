package com.example.bai4.entity;

public class CauHinhEmail {

    private String ngonNgu;
    private int kichThuocTrang;
    private boolean locSpam;
    private String chuKy;

    public CauHinhEmail() {
    }

    public CauHinhEmail(String ngonNgu, int kichThuocTrang, boolean locSpam, String chuKy) {
        this.ngonNgu = ngonNgu;
        this.kichThuocTrang = kichThuocTrang;
        this.locSpam = locSpam;
        this.chuKy = chuKy;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public int getKichThuocTrang() {
        return kichThuocTrang;
    }

    public void setKichThuocTrang(int kichThuocTrang) {
        this.kichThuocTrang = kichThuocTrang;
    }

    public boolean isLocSpam() {
        return locSpam;
    }

    public void setLocSpam(boolean locSpam) {
        this.locSpam = locSpam;
    }

    public String getChuKy() {
        return chuKy;
    }

    public void setChuKy(String chuKy) {
        this.chuKy = chuKy;
    }
}
