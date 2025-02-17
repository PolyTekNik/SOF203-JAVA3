/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Laptop;
import model.LaptopDAO;
import model.Loai;
import model.Nhanhieu;

/**
 *
 * @author dangt
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    DefaultTableModel model;
    List<Laptop> listLaptop = new ArrayList<>();
    List<Nhanhieu> listHieu = new ArrayList<>();
    List<Loai> listLoai = new ArrayList<>();
    LaptopDAO dao = new LaptopDAO();
    public Main() {
        initComponents();
        loadDataTable();
        loadHieu();
        loadLoai();
        fillCboHieu();
        fillCboLoai();
        cardHieu.setVisible(false);
        cardLoaiSanPham.setVisible(false);
        cardSanPham.setVisible(false);
        cardTaiKhoan.setVisible(false);
    }
    
    public void loadSanPham(){
        listLaptop.clear();
        for(Laptop index: dao.getAll()){
            listLaptop.add(index);
        } 
    }
    
    public void loadHieu(){
        listHieu.clear();
        for(Nhanhieu index: dao.getAllNhan()){
            listHieu.add(index);
        }
    }
    
    public void loadLoai(){
        listLoai.clear();
        for(Loai loai: dao.getAllLoai()){
            listLoai.add(loai);
        }
    }
    
    public void fillCboHieu(){
        cboHieu.removeAllItems();
        for(Nhanhieu index: listHieu){
            //listHieu.add(index);
            cboHieu.addItem(index.getTenNhan());
        }
        
    }
    
    public void fillCboLoai(){
        cboLoai.removeAllItems();
        for(Loai index: listLoai){
            //listHieu.add(index);
            cboLoai.addItem(index.getTenLoai());
        }
        
    }
    
    public void loadDataTable() {
        model = new DefaultTableModel();
        //Tạo các cột
        model.addColumn("MÃ SẢN PHẨM");
        model.addColumn("TÊN SẢN PHẨM");
        model.addColumn("NHÃN HIỆU");
        model.addColumn("LOẠI");
        model.addColumn("MÀU");
        model.addColumn("GIÁ");
        //txtAccountRecord.setText("Bảng ghi: 0 trên " + listAccount.size());
        //lưu file
        //Đẩy Data từ List --> model
        //fillToTable();
        fillToTable();
    }

    public void fillToTable() {
        loadSanPham();
        //System.out.println(listLaptop.get(0).getMaLoai());
        model.setRowCount(0);
        for (Laptop index : listLaptop) {
            model.addRow(new Object[]{index.getMaSP(), index.getTenSp(), index.getMaHieu(), index.getMaLoai(), index.getMau(), index.getGia()});
        }
        tblList.setModel(model);
    }
    
    public void showDetail(int i){
        txtMasp.setText(listLaptop.get(i).getMaSP());
        txtTen.setText(listLaptop.get(i).getTenSp());
        txtMau.setText(listLaptop.get(i).getMau());
        txtGia.setText( String.valueOf(listLaptop.get(i).getGia()));
        cboHieu.setSelectedItem(listHieu.get(i).getTenNhan());
        cboLoai.setSelectedItem(listLoai.get(i).getTenLoai());
        
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
        cardTrangchu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cardTaiKhoan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cardSanPham = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboHieu = new javax.swing.JComboBox<>();
        cboLoai = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMasp = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMau = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cardHieu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cardLoaiSanPham = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Trang chủ");

        javax.swing.GroupLayout cardTrangchuLayout = new javax.swing.GroupLayout(cardTrangchu);
        cardTrangchu.setLayout(cardTrangchuLayout);
        cardTrangchuLayout.setHorizontalGroup(
            cardTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardTrangchuLayout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(413, 413, 413))
        );
        cardTrangchuLayout.setVerticalGroup(
            cardTrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTrangchuLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jPanel1.add(cardTrangchu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        cardTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        cardTaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÍ TÀI KHOẢN");
        cardTaiKhoan.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 61));

        jPanel1.add(cardTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        cardSanPham.setBackground(new java.awt.Color(255, 255, 255));
        cardSanPham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÍ SẢN PHẨM");
        cardSanPham.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 61));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nhãn hiệu");
        cardSanPham.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 30));

        cboHieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cardSanPham.add(cboHieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 30));

        cboLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cardSanPham.add(cboLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mã laptop");
        cardSanPham.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Loại");
        cardSanPham.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 30));
        cardSanPham.add(txtMasp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 220, 30));
        cardSanPham.add(txtTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 220, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tên laptop");
        cardSanPham.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 120, 30));
        cardSanPham.add(txtMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 220, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Màu");
        cardSanPham.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 120, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Giá");
        cardSanPham.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 120, 30));
        cardSanPham.add(txtGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 220, 30));

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã laptop", "Tên laptop", "Nhãn hiệu", "Loại", "Màu", "Giá"
            }
        ));
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblList);

        cardSanPham.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 307, 890, 180));

        jButton1.setText("Sửa");
        cardSanPham.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 90, 30));

        jButton2.setText("Xóa");
        cardSanPham.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 90, 30));

        jButton3.setText("Thêm");
        cardSanPham.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 90, 30));

        jPanel1.add(cardSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        cardHieu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUẢN LÍ HIỆU");

        javax.swing.GroupLayout cardHieuLayout = new javax.swing.GroupLayout(cardHieu);
        cardHieu.setLayout(cardHieuLayout);
        cardHieuLayout.setHorizontalGroup(
            cardHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        cardHieuLayout.setVerticalGroup(
            cardHieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardHieuLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 439, Short.MAX_VALUE))
        );

        jPanel1.add(cardHieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        cardLoaiSanPham.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("QUẢN LÍ LOẠI SẢN PHẨM");

        javax.swing.GroupLayout cardLoaiSanPhamLayout = new javax.swing.GroupLayout(cardLoaiSanPham);
        cardLoaiSanPham.setLayout(cardLoaiSanPhamLayout);
        cardLoaiSanPhamLayout.setHorizontalGroup(
            cardLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        cardLoaiSanPhamLayout.setVerticalGroup(
            cardLoaiSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLoaiSanPhamLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 439, Short.MAX_VALUE))
        );

        jPanel1.add(cardLoaiSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        jMenu1.setText("Quản lí");

        jMenu3.setText("Tài khoản");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenu4.setText("Sản phẩm");
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                jMenu4MenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu4);

        jMenu5.setText("Hiệu");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenu6.setText("Loại sản phẩm");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Trợ giúp");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
       cardTaiKhoan.setVisible(true);
       cardHieu.setVisible(false);
       cardLoaiSanPham.setVisible(false);
       cardSanPham.setVisible(false);
       cardTrangchu.setVisible(false);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MenuCanceled

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        cardTaiKhoan.setVisible(false);
       cardHieu.setVisible(false);
       cardLoaiSanPham.setVisible(false);
       cardSanPham.setVisible(true);
       cardTrangchu.setVisible(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        cardTaiKhoan.setVisible(false);
       cardHieu.setVisible(true);
       cardLoaiSanPham.setVisible(false);
       cardSanPham.setVisible(false);
       cardTrangchu.setVisible(false);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        cardTaiKhoan.setVisible(false);
       cardHieu.setVisible(false);
       cardLoaiSanPham.setVisible(true);
       cardSanPham.setVisible(false);
       cardTrangchu.setVisible(false);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        try {
            int index = tblList.getSelectedRow();
            showDetail(index);
        } catch (Exception e) {
            System.out.println("Đã click");
        }
    }//GEN-LAST:event_tblListMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardHieu;
    private javax.swing.JPanel cardLoaiSanPham;
    private javax.swing.JPanel cardSanPham;
    private javax.swing.JPanel cardTaiKhoan;
    private javax.swing.JPanel cardTrangchu;
    private javax.swing.JComboBox<String> cboHieu;
    private javax.swing.JComboBox<String> cboLoai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextField txtMau;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
