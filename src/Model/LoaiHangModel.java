
package Model;

import java.sql.*;

public class LoaiHangModel {

    private Connection conn;

    public LoaiHangModel() throws SQLException {
        this.conn = new DB().getConnection();
    }

    public ResultSet get() throws SQLException {
        String sql = "Select * from loaihang";
        PreparedStatement ps = conn.prepareStatement(sql);
        return (ResultSet) ps.executeQuery();
    }

    public boolean insert(LoaiHang lh) throws SQLException {
        String sql = "insert into loaihang values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, lh.getMaLoai());
        ps.setString(2, lh.getTenLoai());
        return ps.execute();
    }
     public boolean update(LoaiHang lh) throws SQLException {
        String sql = "update loaihang set TenLoai=? where MaLoai=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, lh.getTenLoai());
        ps.setString(2, lh.getMaLoai());
        return ps.execute();
    }

    public boolean delete(String maLoai) throws SQLException {
        String sql = "Delete from loaihang where MaLoai=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, maLoai);
        return ps.execute();
    }
}
