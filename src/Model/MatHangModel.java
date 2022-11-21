
package Model;


import java.sql.*;

public class MatHangModel {
    private Connection conn;

    public MatHangModel() throws SQLException {
        this.conn = new DB().getConnection();      
    }
    public ResultSet get() throws SQLException{
        String sql ="SELECT mathang.MaHang,mathang.TenHang,mathang.DVT,mathang.DonGia, loaihang.TenLoai from mathang LEFT JOIN loaihang ON loaihang.MaLoai= mathang.MaLoai";
        PreparedStatement ps = conn.prepareStatement(sql);
        return (ResultSet) ps.executeQuery();
    }
    public boolean insert(MatHang mh) throws SQLException {
        String sql = "insert into mathang values(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, mh.getMaHang());
        ps.setString(2, mh.getTenHang());
        ps.setString(3, mh.getDvt());
        ps.setInt(4, mh.getDongia());
        ps.setString(5, mh.getLoaiHang());
        return ps.execute();
    }

    public boolean update(MatHang mh) throws SQLException {
        String sql = "update mathang set TenHang=? ,DVT=?, DonGia=?,MaLoai=? where MaHang=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, mh.getTenHang());
        ps.setString(2, mh.getDvt());
        ps.setInt(3, mh.getDongia());
        ps.setString(4, mh.getLoaiHang());
        ps.setString(5, mh.getMaHang());
        return ps.execute();
    }

    public boolean delete(String maHang) throws SQLException {
        String sql = "Delete from mathang where MaHang=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, maHang);
        return ps.execute();
    }
}
