package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import storemanager.User;

public class NhanVienModel {

    private Connection conn;

    public NhanVienModel() throws SQLException {
        this.conn = new DB().getConnection();
    }

    public ResultSet get() throws SQLException {
        String sql = "SELECT *from nhanvien";
        PreparedStatement ps = conn.prepareStatement(sql);
        return (ResultSet) ps.executeQuery();
    }

    public boolean insert(NhanVien nv) throws SQLException {
        String sql = "insert into nhanvien values(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nv.getMaNV());
        ps.setString(2, nv.getTenNV());
        ps.setString(3, nv.getDiaChi());
        ps.setString(4, nv.getMatKhau());
        ps.setBoolean(5, nv.isQuyen());
        return ps.execute();
    }

    public boolean update(NhanVien nv) {
        try {
            String sql = "update nhanvien set TenNV=? ,DiaChi=?, MatKhau=? ,Quyen=? where MaNV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getTenNV());
            ps.setString(2, nv.getDiaChi());
            ps.setString(3, nv.getMatKhau());
            ps.setBoolean(4, nv.isQuyen());
            ps.setString(5, nv.getMaNV());
            return ps.execute();
        } catch (SQLException ex) {
            try {
                JOptionPane.showMessageDialog(new User(), "Sửa thất bại", "Thông báo", 0);
            } catch (SQLException ex1) {
                Logger.getLogger(NhanVienModel.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return true;
    }

    public boolean delete(String maNV) throws SQLException {
        String sql = "Delete from nhanvien where MaNV=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, maNV);
        return ps.execute();
    }
}
