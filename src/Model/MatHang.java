
package Model;


public class MatHang {
    private String maHang,tenHang,loaiHang,dvt;
    private int Dongia;

    public MatHang(String maHang, String tenHang, String loaiHang, String dvt, int Dongia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.loaiHang = loaiHang;
        this.dvt = dvt;
        this.Dongia = Dongia;
    }

    public MatHang() {
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int Dongia) {
        this.Dongia = Dongia;
    }
    
}
