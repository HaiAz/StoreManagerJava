package storemanager;

import Model.LoaiHang;
import Model.LoaiHangModel;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductType extends javax.swing.JInternalFrame {

    private LoaiHangModel model;

    public ProductType() throws SQLException {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        model = new LoaiHangModel();
        jtbLoaiHang.getTableHeader().setFont(new Font("jetbrains mono", Font.BOLD, 14));
        loadData();
    }

    public void loadData() throws SQLException {
        String[] column = {"Mã loại hàng", "Tên loại hàng"};
        DefaultTableModel tableModel = new DefaultTableModel(column, 0);
        ResultSet rs = model.get();
        while (rs.next()) {
            tableModel.addRow(new Object[]{rs.getString(1), rs.getString(2)});
        }
        jtbLoaiHang.setModel(tableModel);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbLoaiHang = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        txtMaLoai = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Loại Hàng");

        jtbLoaiHang.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jtbLoaiHang.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbLoaiHang.setGridColor(new java.awt.Color(255, 255, 255));
        jtbLoaiHang.setRowHeight(30);
        jtbLoaiHang.setSelectionBackground(new java.awt.Color(102, 103, 171));
        jtbLoaiHang.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtbLoaiHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbLoaiHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbLoaiHang);

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel5.setText("Tên Loại Hàng");

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel2.setText("Mã Loại");

        txtTenLoai.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N

        txtMaLoai.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtMaLoai.setSelectionColor(new java.awt.Color(35, 166, 97));

        btnClear.setBackground(new java.awt.Color(102, 103, 171));
        btnClear.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Nhập Lại");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(102, 103, 171));
        btnXoa.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(102, 103, 171));
        btnSua.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(102, 103, 171));
        btnThem.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenLoai))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addContainerGap(204, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jtbLoaiHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbLoaiHangMouseClicked
        // TODO add your handling code here:
        int r = jtbLoaiHang.getSelectedRow();
        if (r >= 0) {
            txtMaLoai.setText(jtbLoaiHang.getModel().getValueAt(r, 0).toString());
            txtTenLoai.setText(jtbLoaiHang.getModel().getValueAt(r, 1).toString());
        }
    }//GEN-LAST:event_jtbLoaiHangMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (txtMaLoai.getText().trim().equals("") || txtTenLoai.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin", "Thông báo", 1);
            return;
        }
        LoaiHang lh = new LoaiHang(txtMaLoai.getText(), txtTenLoai.getText());
        try {
            model.insert(lh);
            JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", 1);
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(ProductType.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Thêm thất bại mã loại hàng đã tồn tại", "Thông báo", 1);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (txtMaLoai.getText().trim().equals("") || txtTenLoai.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin", "Thông báo", 1);
            return;
        }
        LoaiHang lh = new LoaiHang(txtMaLoai.getText(), txtTenLoai.getText());
        try {
            model.update(lh);
            JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông báo", 1);
            loadData();
        } catch (SQLException ex) {
            Logger.getLogger(ProductType.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Sửa thất bại", "Thông báo", 1);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try {
            if (txtMaLoai.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã loại cần xoá", "Thông báo", 1);
                return;
            }
            int c = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá không?", "Thông báo", 1);
            if (c == 0) {
                model.delete(txtMaLoai.getText());
                JOptionPane.showMessageDialog(this, "Xoá thành công", "Thông báo", 1);
                loadData();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Xoá thất bại", "Thông báo", 0);
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtMaLoai.setText("");
        txtTenLoai.setText("");
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbLoaiHang;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}
