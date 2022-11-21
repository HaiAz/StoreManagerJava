/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package storemanager;

import Model.DB;
import java.awt.Font;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class CT_HoaDon extends javax.swing.JFrame {


    private String maHoaDon;

    public CT_HoaDon() throws SQLException {
        initComponents();
        jtbHoaDon.getTableHeader().setFont(new Font("jetbrains mono", Font.BOLD, 14));
        loadData();
    }

    public CT_HoaDon(String maHoaDon) throws SQLException {
        initComponents();
        this.maHoaDon = maHoaDon;
        jtbHoaDon.getTableHeader().setFont(new Font("jetbrains mono", Font.BOLD, 14));
        loadData(); 
    }

    public void loadData() throws SQLException {
        DB db = new DB();
        int tongTien = 0;
        String sql = "SELECT hoadon.SoHD,hoadon.NgayBan,cthoadon.SoLuong,cthoadon.DonGia,khachhang.TenKH,nhanvien.TenNV,mathang.TenHang,mathang.DVT from hoadon,cthoadon,khachhang,nhanvien,mathang\n"
                + "WHERE hoadon.SoHD =cthoadon.SoHD and khachhang.MaKH=hoadon.MaKH and nhanvien.MaNV= hoadon.MaNV and mathang.MaHang = cthoadon.MaHang and hoadon.SoHD =?";
        PreparedStatement ps = db.getConnection().prepareStatement(sql);
        ps.setString(1, maHoaDon);
        ResultSet rs = ps.executeQuery();

        String[] column = {"Tên hàng", "Đơn vị tính", "Số lượng", "Đơn giá", "Thành tiền"};
        DefaultTableModel tableModel = new DefaultTableModel(column, 0);
        while (rs.next()) {
            txtTenNV.setText(rs.getString(6));
            txtTenKH.setText(rs.getString(5));
            txtNgayBan.setText(rs.getString(2));
            txtSoHD.setText(rs.getString(1));
            tableModel.addRow(new Object[]{rs.getString(7), rs.getString(8), rs.getString(3), rs.getString(4), rs.getInt(3) * rs.getInt(4)});
            tongTien += rs.getInt(3) * rs.getInt(4);
        }
        jtbHoaDon.setModel(tableModel);
        txTongTien.setText(tongTien + "đ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSoHD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbHoaDon = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JLabel();
        txtNgayBan = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        txTongTien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 238, 255));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel1.setText("Số Hoá Đơn: ");

        txtSoHD.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtSoHD.setText("NA");

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel3.setText("Tên Khách Hàng:");

        jtbHoaDon.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jtbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtbHoaDon.setEnabled(false);
        jtbHoaDon.setGridColor(new java.awt.Color(255, 255, 255));
        jtbHoaDon.setRowHeight(30);
        jtbHoaDon.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtbHoaDon);

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel4.setText("Hoá Đơn Bán Hàng");

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel5.setText("Tên Nhân Viên:");

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel6.setText("Ngày Bán: ");

        txtTenKH.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtTenKH.setText("NA");

        txtTenNV.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtTenNV.setText("NA");

        txtNgayBan.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        txtNgayBan.setText("NA");

        lb.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        lb.setText("Tổng Tiền:");

        txTongTien.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        txTongTien.setText("NA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKH))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTenNV))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(txtSoHD)))
                .addGap(159, 159, 159)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgayBan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(282, 282, 282))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb)
                        .addGap(18, 18, 18)
                        .addComponent(txTongTien)
                        .addGap(25, 25, 25))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoHD)
                    .addComponent(jLabel6)
                    .addComponent(txtNgayBan))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenKH))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenNV))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb)
                    .addComponent(txTongTien))
                .addContainerGap(368, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbHoaDon;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel txTongTien;
    private javax.swing.JLabel txtNgayBan;
    private javax.swing.JLabel txtSoHD;
    private javax.swing.JLabel txtTenKH;
    private javax.swing.JLabel txtTenNV;
    // End of variables declaration//GEN-END:variables
}
