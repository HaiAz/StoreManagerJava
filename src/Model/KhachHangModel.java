/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KhachHangModel {

    private Connection conn;

    public KhachHangModel() throws SQLException {
        this.conn = new DB().getConnection();
    }

    public ResultSet get() throws SQLException {
        String sql = "SELECT *from khachhang";
        PreparedStatement ps = conn.prepareStatement(sql);
        return (ResultSet) ps.executeQuery();
    }

    public boolean insert(KhachHang kh) throws SQLException {
        String sql = "insert into khachhang values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, kh.getMaKH());
        ps.setString(2, kh.getTenKh());
        ps.setString(3, kh.getDiaChi());
        ps.setString(4, kh.getSdt());
        return ps.execute();
    }

    public boolean update(KhachHang kh) throws SQLException {
        String sql = "update khachhang set TenKH=? ,DiaChi=?, SDT=?  where MaKH=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, kh.getTenKh());
        ps.setString(2, kh.getDiaChi());
        ps.setString(3, kh.getSdt());
        ps.setString(4, kh.getMaKH());
        return ps.execute();
    }

    public boolean delete(String maKH) throws SQLException {
        String sql = "Delete from khachhang where MaKH=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, maKH);
        return ps.execute();
    }
}
