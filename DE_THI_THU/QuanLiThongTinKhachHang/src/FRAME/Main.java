/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRAME;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiSinhVien
     */
    DefaultTableModel model;
    List<KhachHang> list = new ArrayList<>();
    KhachHang kh = new KhachHang();
    String hinhAnh = "";

    public Main(int a) {
        initComponents();
        Login login = new Login();
        /*
        login.setVisible(true);
        this.dispose();
         */
        cloneData();
    }

    public Main() {

        Login login = new Login();

        login.setVisible(true);
        JOptionPane.showMessageDialog(this, "Vui long dan nhap truoc khi su dung");
        this.dispose();
    }

    public void choseImage() {
        JFileChooser chooser = new JFileChooser(); //System.out.println(nameImage);
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        try {
            this.hinhAnh = file.getAbsolutePath();
            Image img = ImageIO.read(file);
            lblHinhAnh.setText("");
            lblHinhAnh.setIcon(new ImageIcon(img.getScaledInstance(140, 140, 0)));
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "Ôi không!\nBạn vừa hủy thao tác mất rồi!");
            return;
        }
        //clone ảnh

    }

    public void cloneData() {
        list.clear();
        String temp = txtFind.getText().toLowerCase();
        for (KhachHang index : kh.getAll()) {
            String find = index.getTenKH().toLowerCase();
            if (find.contains(temp)) {
                list.add(index);
            }
        }
        loadDataTable();
    }

    public void loadDataTable() {
        model = new DefaultTableModel();
        //Tạo các cột
        model.addColumn("MA KH");
        model.addColumn("HO TEN");
        model.addColumn("TUOI");
        model.addColumn("SO DIEN THOAI");
        model.addColumn("EMAIL");
        //model.addColumn("HINH ANH");
        //model.addColumn("HINH ANH");
        //model.addColumn("TRANG THAI");
        fillToTable();
    }

    public void fillToTable() {
        //cloneData();
        //System.out.println(listLaptop.get(0).getMaLoai());
        model.setRowCount(0);
        for (KhachHang index : list) {
            model.addRow(new Object[]{index.getMaKH(), index.getTenKH(), index.getTuoi(), index.getDt(), index.getEmail()});
        }
        tblList.setModel(model);
    }

    /*
    public void setTrangThaiHoatDong() {
        if (tblList.getSelectedRow() > -1) {
            int ketQua = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thay đổi trạng thái hoạt động của người dùng này?", "Cập nhật trạng thái", JOptionPane.YES_OPTION);
            if (ketQua == JOptionPane.YES_OPTION) {
                //switchButton();
                if (switchButton1.isSelected()) {
                    txtAccountTrangThai.setText("Đang hoạt động");
                    txtAccountTrangThai.setForeground(new Color(0, 153, 0));
                } else {
                    txtAccountTrangThai.setText("Ngưng hoạt động");
                    txtAccountTrangThai.setForeground(Color.red);
                }
                //updateAccount();
            } else {
                if (switchButton1.isSelected()) {
                    switchButton1.setSelected(false);
                } else {
                    switchButton1.setSelected(true);
                }
            }
        }
    }

    public void switchButton() {
        //boolean trangthai = trangThai;
        switchButton1.addEventSelected(new Event() {
            @Override
            public void onSelected(boolean selected) {
                //setTrangThaiHoatDong();
                if (selected) {
                    txtAccountTrangThai.setText("ĐANG HOẠT ĐỘNG");
                    txtAccountTrangThai.setForeground(new Color(0, 153, 51));
                } else {
                    txtAccountTrangThai.setText("NGƯNG HOẠT ĐỘNG");
                    txtAccountTrangThai.setForeground(Color.red);
                }
            }
        });
    }
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMakh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        lblHinhAnh = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnSort3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Quản Lí Khách Hàng");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 270, -1));
        jPanel1.add(txtMakh, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 102, 200, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã KH");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 109, -1, -1));
        jPanel1.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 162, 200, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ho ten");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 169, -1, -1));
        jPanel1.add(txtSDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 200, 34));
        jPanel1.add(txtTuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 200, 34));

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });
        jPanel1.add(lblHinhAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 140, 140));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("SDT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Email");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 200, 34));

        tblList.setModel(new javax.swing.table.DefaultTableModel(
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
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 800, 140));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tim theo ten");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 90, 20));
        jPanel1.add(txtFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 260, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Tuổi");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jButton1.setText("Cap nhat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 140, 30));

        jButton2.setText("Xoa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 140, 30));

        jButton3.setText("Them");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 140, 30));

        jButton4.setText("Tim kiem");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 140, 30));

        btnSort3.setBackground(new java.awt.Color(204, 204, 255));
        btnSort3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSort3.setText("Sắp xếp");
        btnSort3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnSort3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSort3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSort3MouseExited(evt);
            }
        });
        btnSort3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSort3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSort3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        int i = tblList.getSelectedRow();
        txtMakh.setText(list.get(i).getMaKH());
        txtTuoi.setText(String.valueOf(list.get(i).getTuoi()));
        txtHoTen.setText(list.get(i).getTenKH());
        txtEmail.setText(list.get(i).getEmail());
        txtSDT.setText(list.get(i).getDt());

        this.hinhAnh = list.get(i).getHinhAnh();
        lblHinhAnh.setIcon(new ImageIcon(this.hinhAnh));
    }//GEN-LAST:event_tblListMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (KhachHang sv : list) {
            if (!sv.getMaKH().equalsIgnoreCase(txtMakh.getText())) {
                try {
                    int tuoi = Integer.valueOf(txtTuoi.getText());
                    kh.add(txtMakh.getText(), txtHoTen.getText(), tuoi, txtSDT.getText(), txtEmail.getText(), this.hinhAnh);
                    JOptionPane.showMessageDialog(this, "Them thanh cong");
                    cloneData();
                    loadDataTable();
                    return;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Tuoi khong hop le");
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Ma KH da ton tai");
        //


    }//GEN-LAST:event_jButton3ActionPerformed

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        choseImage();
    }//GEN-LAST:event_lblHinhAnhMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ms = JOptionPane.showInputDialog("Vui long nhap MaKH muon xoa:");
        for (KhachHang kh : list) {
            if (kh.getMaKH().equalsIgnoreCase(ms)) {
                kh.delete(ms);
                JOptionPane.showMessageDialog(this, "Xoa thanh cong!");
                cloneData();
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Khong the xoa");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (KhachHang sv : list) {
            if (sv.getMaKH().equalsIgnoreCase(txtMakh.getText())) {
                try {
                    int tuoi = Integer.valueOf(txtTuoi.getText());
                    kh.update(txtMakh.getText(), txtHoTen.getText(), tuoi, txtSDT.getText(), txtEmail.getText(), this.hinhAnh);
                    JOptionPane.showMessageDialog(this, "cap nhat thanh cong");
                    cloneData();
                    return;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Tuoi khong hop le");
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Khong the cap nhat");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cloneData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnSort3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSort3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSort3MouseEntered

    private void btnSort3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSort3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSort3MouseExited

    public void sort() {
        List<KhachHang> listTemp = new ArrayList<>();
        listTemp.addAll(list);
        for (int i = 0; i < listTemp.size()-1 ; i++) {
            for (int j = i+1; j < listTemp.size(); j++) {
                String nameKHFirst = listTemp.get(i).getTenKH();
                String nameKHLast = listTemp.get(j).getTenKH();
                if (nameKHFirst.compareToIgnoreCase(nameKHLast) <= 0) {
                    if (nameKHFirst.compareToIgnoreCase(nameKHLast) == 0) {
                        if (listTemp.get(i).getTuoi() < listTemp.get(j).getTuoi()) {
                            KhachHang index = new KhachHang();
                            index = listTemp.get(j);
                            listTemp.add(i, index);
                            listTemp.remove(j+1);
                        }
                    } else {
                        KhachHang index = new KhachHang();
                        index = listTemp.get(j);
                        listTemp.add(i, index);
                        listTemp.remove(j+1);
                    }
                }
            }
        }
        list.clear();
        list.addAll(listTemp);
    }
    
    public void sortG() {
        List<KhachHang> listTemp = new ArrayList<>();
        listTemp.addAll(list);
        for (int i = 0; i < listTemp.size() - 1; i++) {
            for (int j = i+1; j < listTemp.size(); j++) {
                String nameKHFirst = listTemp.get(i).getTenKH();
                String nameKHLast = listTemp.get(j).getTenKH();
                if (nameKHFirst.compareToIgnoreCase(nameKHLast) >= 0) {
                    if (nameKHFirst.compareToIgnoreCase(nameKHLast) == 0) {
                        if (listTemp.get(i).getTuoi() > listTemp.get(j).getTuoi()) {
                            KhachHang index = new KhachHang();
                            index = listTemp.get(j);
                            listTemp.add(i, index);
                            listTemp.remove(j+1);
                        }
                    } else {
                        /*
                            i: b
                            j: a
                         */
                        KhachHang index = new KhachHang();
                        index = listTemp.get(j);
                        listTemp.add(i, index);
                        listTemp.remove(j+1);
                    }
                }
            }
        }

        list.clear();
        list.addAll(listTemp);
    }

    private void btnSort3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSort3ActionPerformed
        Comparator<KhachHang> comp = new Comparator<KhachHang>() {
            public int compare(KhachHang s1, KhachHang s2) {
                return s1.getTenKH().compareTo(s2.getTenKH());
            }
        };
        int messageType = JOptionPane.QUESTION_MESSAGE;
        String[] option = {"Tăng dần", "Giảm dần", "Thoát"};
        int code = JOptionPane.showOptionDialog(this, "Bạn muốn sắp xếp tăng hay giảm?", "Sắp xếp", 0, messageType, null, option, "");
        if (code == 0) {
            //Collections.sort(list, comp);
            sort();
            loadDataTable();
            
        } else if (code == 1) {
            //Collections.sort(list, comp.reversed());  //giảm dần
            sortG();
            loadDataTable();
        } else {
            return;
        }
    }//GEN-LAST:event_btnSort3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSort3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMakh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}