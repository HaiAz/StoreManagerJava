/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class KhachHang {

    private String maKH, tenKh, diaChi, sdt;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKh, String diaChi, String sdt) {
        this.maKH = maKH;
        this.tenKh = tenKh;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public KhachHang(String maKH, String tenKh) {
        this.maKH = maKH;
        this.tenKh = tenKh;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return tenKh;
    }

}
