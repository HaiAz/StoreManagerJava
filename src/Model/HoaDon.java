package Model;

public class HoaDon {
    String soHD,ngayLap,maNV,maKh;

    public HoaDon(String soHD, String ngayLap, String maNV, String maKh) {
        this.soHD = soHD;
        this.ngayLap = ngayLap;
        this.maNV = maNV;
        this.maKh = maKh;
    }

    public String getSoHD() {
        return soHD;
    }

    public void setSoHD(String soHD) {
        this.soHD = soHD;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }
    
}
