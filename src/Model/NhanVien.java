
package Model;

public class NhanVien {
    private String tenNV, diaChi,maNV,matKhau;
    private boolean quyen;

    public NhanVien(String tenNV, String diaChi, String maNV, String matKhau, boolean quyen) {
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.quyen = quyen;
    }

    public NhanVien() {
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isQuyen() {
        return quyen;
    }

    public void setQuyen(boolean quyen) {
        this.quyen = quyen;
    }
    
}
