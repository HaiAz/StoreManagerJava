/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package storemanager;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DashBoard extends javax.swing.JFrame {

    public DashBoard() throws SQLException {
        initComponents();
        lbUserName.setText("Wellcome " + Login.userName);
        if (Login.role == true) {
            lbRole.setText("Manager");
            lbRole.setForeground(Color.ORANGE);

        } else {
            lbRole.setText("User");
            lbRole.setForeground(Color.green);
            jlbNhanVien.setForeground(Color.DARK_GRAY);
            jlbDoanhThu.setForeground(Color.DARK_GRAY);
        }
        jPaneMain.add(new Product()).setVisible(true);
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
        btnMatHang = new javax.swing.JPanel();
        jlbMatHang = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLoaiHang = new javax.swing.JPanel();
        jlbLoaiHang = new javax.swing.JLabel();
        btnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new javax.swing.JLabel();
        btnMuaHang = new javax.swing.JPanel();
        jlbMuaHang = new javax.swing.JLabel();
        btnHoaDon = new javax.swing.JPanel();
        jblHoaDon = new javax.swing.JLabel();
        btnKhachHang = new javax.swing.JPanel();
        jlbKhachHang = new javax.swing.JLabel();
        btnDoanhThu = new javax.swing.JPanel();
        jlbDoanhThu = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        jPaneMain = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 103, 171));

        btnMatHang.setBackground(new java.awt.Color(255, 255, 255));
        btnMatHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMatHangMouseClicked(evt);
            }
        });

        jlbMatHang.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jlbMatHang.setText("Quản Lý Mặt Hàng");
        jlbMatHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnMatHangLayout = new javax.swing.GroupLayout(btnMatHang);
        btnMatHang.setLayout(btnMatHangLayout);
        btnMatHangLayout.setHorizontalGroup(
            btnMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMatHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        btnMatHangLayout.setVerticalGroup(
            btnMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMatHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMatHang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_shopping_cart_promotion_100px.png"))); // NOI18N

        btnLoaiHang.setBackground(new java.awt.Color(102, 103, 171));
        btnLoaiHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoaiHangMouseClicked(evt);
            }
        });

        jlbLoaiHang.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jlbLoaiHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbLoaiHang.setText("Quản Lý Loại Hàng");
        jlbLoaiHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnLoaiHangLayout = new javax.swing.GroupLayout(btnLoaiHang);
        btnLoaiHang.setLayout(btnLoaiHangLayout);
        btnLoaiHangLayout.setHorizontalGroup(
            btnLoaiHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoaiHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnLoaiHangLayout.setVerticalGroup(
            btnLoaiHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoaiHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbLoaiHang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnNhanVien.setBackground(new java.awt.Color(102, 103, 171));
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseClicked(evt);
            }
        });

        jlbNhanVien.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jlbNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhanVien.setText("Quản Lý Nhân Viên");
        jlbNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnNhanVienLayout = new javax.swing.GroupLayout(btnNhanVien);
        btnNhanVien.setLayout(btnNhanVienLayout);
        btnNhanVienLayout.setHorizontalGroup(
            btnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnNhanVienLayout.setVerticalGroup(
            btnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnMuaHang.setBackground(new java.awt.Color(102, 103, 171));
        btnMuaHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMuaHangMouseClicked(evt);
            }
        });

        jlbMuaHang.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jlbMuaHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbMuaHang.setText("Mua Hàng");
        jlbMuaHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnMuaHangLayout = new javax.swing.GroupLayout(btnMuaHang);
        btnMuaHang.setLayout(btnMuaHangLayout);
        btnMuaHangLayout.setHorizontalGroup(
            btnMuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMuaHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMuaHangLayout.setVerticalGroup(
            btnMuaHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMuaHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbMuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnHoaDon.setBackground(new java.awt.Color(102, 103, 171));
        btnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHoaDonMouseClicked(evt);
            }
        });

        jblHoaDon.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jblHoaDon.setText("Quản Lý Hoá Đơn");
        jblHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnHoaDonLayout = new javax.swing.GroupLayout(btnHoaDon);
        btnHoaDon.setLayout(btnHoaDonLayout);
        btnHoaDonLayout.setHorizontalGroup(
            btnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnHoaDonLayout.setVerticalGroup(
            btnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnKhachHang.setBackground(new java.awt.Color(102, 103, 171));
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseClicked(evt);
            }
        });

        jlbKhachHang.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jlbKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbKhachHang.setText("Quản Lý Khách Hàng");
        jlbKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnKhachHangLayout = new javax.swing.GroupLayout(btnKhachHang);
        btnKhachHang.setLayout(btnKhachHangLayout);
        btnKhachHangLayout.setHorizontalGroup(
            btnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnKhachHangLayout.setVerticalGroup(
            btnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDoanhThu.setBackground(new java.awt.Color(102, 103, 171));
        btnDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoanhThuMouseClicked(evt);
            }
        });

        jlbDoanhThu.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jlbDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        jlbDoanhThu.setText("Quản Lý Doanh Thu");
        jlbDoanhThu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout btnDoanhThuLayout = new javax.swing.GroupLayout(btnDoanhThu);
        btnDoanhThu.setLayout(btnDoanhThuLayout);
        btnDoanhThuLayout.setHorizontalGroup(
            btnDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnDoanhThuLayout.setVerticalGroup(
            btnDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(102, 103, 171));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Đăng Xuất");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbUserName.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 255, 255));
        lbUserName.setText("username");

        lbRole.setText("role");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMatHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLoaiHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMuaHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUserName)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbRole)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbRole)
                        .addGap(12, 12, 12)
                        .addComponent(lbUserName)
                        .addGap(27, 27, 27)))
                .addComponent(btnMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPaneMain.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPaneMainLayout = new javax.swing.GroupLayout(jPaneMain);
        jPaneMain.setLayout(jPaneMainLayout);
        jPaneMainLayout.setHorizontalGroup(
            jPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        jPaneMainLayout.setVerticalGroup(
            jPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setToolTipText("");
        btnExit.setPreferredSize(new java.awt.Dimension(37, 37));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        btnExit.setForeground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setForeground(Color.black);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnLoaiHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoaiHangMouseClicked
        // TODO add your handling code here:
        jPaneMain.removeAll();
        try {
            jPaneMain.add(new ProductType()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

        btnLoaiHang.setBackground(Color.white);
        jlbLoaiHang.setForeground(Color.black);

        btnMatHang.setBackground(new Color(102, 103, 171));
        jlbMatHang.setForeground(Color.white);

        btnMuaHang.setBackground(new Color(102, 103, 171));
        jlbMuaHang.setForeground(Color.white);
        btnHoaDon.setBackground(new Color(102, 103, 171));
        jblHoaDon.setForeground(Color.white);

        btnKhachHang.setBackground(new Color(102, 103, 171));
        jlbKhachHang.setForeground(Color.white);
        btnDoanhThu.setBackground(new Color(102, 103, 171));
        jlbDoanhThu.setForeground(Color.white);
        if (Login.role == false) {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.DARK_GRAY);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.DARK_GRAY);
        } else {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.white);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.white);
        }
    }//GEN-LAST:event_btnLoaiHangMouseClicked

    private void btnMatHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMatHangMouseClicked
        // TODO add your handling code here: jPaneMain.removeAll();
        jPaneMain.removeAll();

        try {
            jPaneMain.add(new Product()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }

        btnMatHang.setBackground(Color.white);
        jlbMatHang.setForeground(Color.black);

        btnLoaiHang.setBackground(new Color(102, 103, 171));
        jlbLoaiHang.setForeground(Color.white);

        btnMuaHang.setBackground(new Color(102, 103, 171));
        jlbMuaHang.setForeground(Color.white);
        btnHoaDon.setBackground(new Color(102, 103, 171));
        jblHoaDon.setForeground(Color.white);
        btnKhachHang.setBackground(new Color(102, 103, 171));
        jlbKhachHang.setForeground(Color.white);
        btnDoanhThu.setBackground(new Color(102, 103, 171));
        jlbDoanhThu.setForeground(Color.white);
        if (Login.role == false) {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.DARK_GRAY);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.DARK_GRAY);
        } else {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.white);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.white);
        }
    }//GEN-LAST:event_btnMatHangMouseClicked

    private void btnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseClicked
        // TODO add your handling code here:
        if (Login.role == false) {
            return;
        }
        jPaneMain.removeAll();
        try {
            jPaneMain.add(new User()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnNhanVien.setBackground(Color.white);
        jlbNhanVien.setForeground(Color.black);

        btnMatHang.setBackground(new Color(102, 103, 171));
        jlbMatHang.setForeground(Color.white);
        btnLoaiHang.setBackground(new Color(102, 103, 171));
        jlbLoaiHang.setForeground(Color.white);
        btnMuaHang.setBackground(new Color(102, 103, 171));
        jlbMuaHang.setForeground(Color.white);
        btnHoaDon.setBackground(new Color(102, 103, 171));
        jblHoaDon.setForeground(Color.white);
        btnKhachHang.setBackground(new Color(102, 103, 171));
        jlbKhachHang.setForeground(Color.white);
        btnDoanhThu.setBackground(new Color(102, 103, 171));
        jlbDoanhThu.setForeground(Color.white);
    }//GEN-LAST:event_btnNhanVienMouseClicked

    private void btnMuaHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuaHangMouseClicked
        // TODO add your handling code here:
        jPaneMain.removeAll();
        try {
            jPaneMain.add(new StoreTab()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnMuaHang.setBackground(Color.white);
        jlbMuaHang.setForeground(Color.black);

        btnMatHang.setBackground(new Color(102, 103, 171));
        jlbMatHang.setForeground(Color.white);
        btnLoaiHang.setBackground(new Color(102, 103, 171));
        jlbLoaiHang.setForeground(Color.white);

        btnHoaDon.setBackground(new Color(102, 103, 171));
        jblHoaDon.setForeground(Color.white);
        btnKhachHang.setBackground(new Color(102, 103, 171));
        jlbKhachHang.setForeground(Color.white);
        btnDoanhThu.setBackground(new Color(102, 103, 171));
        jlbDoanhThu.setForeground(Color.white);
        if (Login.role == false) {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.DARK_GRAY);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.DARK_GRAY);
        } else {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.white);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.white);
        }
    }//GEN-LAST:event_btnMuaHangMouseClicked

    private void btnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMouseClicked
        jPaneMain.removeAll();
        try {
            jPaneMain.add(new Invoice()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnHoaDon.setBackground(Color.white);
        jblHoaDon.setForeground(Color.black);

        btnMatHang.setBackground(new Color(102, 103, 171));
        jlbMatHang.setForeground(Color.white);
        btnLoaiHang.setBackground(new Color(102, 103, 171));

        jlbNhanVien.setForeground(Color.white);
        btnMuaHang.setBackground(new Color(102, 103, 171));
        jlbMuaHang.setForeground(Color.white);
        btnKhachHang.setBackground(new Color(102, 103, 171));
        jlbKhachHang.setForeground(Color.white);
        btnDoanhThu.setBackground(new Color(102, 103, 171));
        jlbDoanhThu.setForeground(Color.white);
        if (Login.role == false) {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.DARK_GRAY);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.DARK_GRAY);
        } else {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.white);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.white);
        }
    }//GEN-LAST:event_btnHoaDonMouseClicked

    private void btnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseClicked
        // TODO add your handling code here:
        jPaneMain.removeAll();
        try {
            jPaneMain.add(new Custommer()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnKhachHang.setBackground(Color.white);
        jlbKhachHang.setForeground(Color.black);

        btnHoaDon.setBackground(new Color(102, 103, 171));
        jblHoaDon.setForeground(Color.white);
        btnMatHang.setBackground(new Color(102, 103, 171));
        jlbMatHang.setForeground(Color.white);
        btnLoaiHang.setBackground(new Color(102, 103, 171));

        jlbNhanVien.setForeground(Color.white);
        btnMuaHang.setBackground(new Color(102, 103, 171));
        jlbMuaHang.setForeground(Color.white);
        btnDoanhThu.setBackground(new Color(102, 103, 171));
        jlbDoanhThu.setForeground(Color.white);
        if (Login.role == false) {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.DARK_GRAY);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.DARK_GRAY);
        } else {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.white);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.white);
        }
    }//GEN-LAST:event_btnKhachHangMouseClicked

    private void btnDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoanhThuMouseClicked
        // TODO add your handling code here:
        if (Login.role == false) {
            return;
        }
        jPaneMain.removeAll();
        try {
            jPaneMain.add(new Turnover()).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnDoanhThu.setBackground(Color.white);
        jlbDoanhThu.setForeground(Color.black);

        btnKhachHang.setBackground(new Color(102, 103, 171));
        jlbKhachHang.setForeground(Color.white);
        btnHoaDon.setBackground(new Color(102, 103, 171));
        jblHoaDon.setForeground(Color.white);
        btnMatHang.setBackground(new Color(102, 103, 171));
        jlbMatHang.setForeground(Color.white);
        btnLoaiHang.setBackground(new Color(102, 103, 171));
        jlbLoaiHang.setForeground(Color.white);
        btnMuaHang.setBackground(new Color(102, 103, 171));
        jlbMuaHang.setForeground(Color.white);
        if (Login.role == false) {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.DARK_GRAY);
            btnDoanhThu.setBackground(new Color(102, 103, 171));
            jlbDoanhThu.setForeground(Color.DARK_GRAY);
        } else {
            btnNhanVien.setBackground(new Color(102, 103, 171));
            jlbNhanVien.setForeground(Color.white);
        }
    }//GEN-LAST:event_btnDoanhThuMouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        int c = JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Thông báo", 1);
        if (c == 0) {
            dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jPanel12MouseClicked
    public static void main(String[] args) throws SQLException {
        DashBoard d = new DashBoard();
        d.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDoanhThu;
    private javax.swing.JLabel btnExit;
    private javax.swing.JPanel btnHoaDon;
    private javax.swing.JPanel btnKhachHang;
    private javax.swing.JPanel btnLoaiHang;
    private javax.swing.JPanel btnMatHang;
    private javax.swing.JPanel btnMuaHang;
    private javax.swing.JPanel btnNhanVien;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPaneMain;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jblHoaDon;
    private javax.swing.JLabel jlbDoanhThu;
    private javax.swing.JLabel jlbKhachHang;
    private javax.swing.JLabel jlbLoaiHang;
    private javax.swing.JLabel jlbMatHang;
    private javax.swing.JLabel jlbMuaHang;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbUserName;
    // End of variables declaration//GEN-END:variables
}
