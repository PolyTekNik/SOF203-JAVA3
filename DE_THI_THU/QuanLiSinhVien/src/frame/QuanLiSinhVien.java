/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import com.hicode.switchbutton.Event;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
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
 * @author dangt
 */
public class QuanLiSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiSinhVien
     */
    DefaultTableModel model;
    List<SinhVien> list = new ArrayList<>();
    SinhVien sv = new SinhVien();
    String hinhAnh="";

    public QuanLiSinhVien() {
        initComponents();
        cloneData();
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
            JOptionPane.showMessageDialog(this, "Ôi không!\nBạn vừa hủy thao tác mất rồi!");
            return;
        }
        //clone ảnh
        
    }

    public void cloneData() {
        list.clear();
        String temp = txtFind.getText().toLowerCase();
        for (SinhVien sv : sv.getAll()) {
            if (sv.getHoten().contains(temp)) {
                list.add(sv);
            }
        }
        loadDataTableXe();
    }

    public void loadDataTableXe() {
        model = new DefaultTableModel();
        //Tạo các cột
        model.addColumn("MSSV");
        model.addColumn("HO TEN");
        model.addColumn("QUE QUAN");
        model.addColumn("CCCD");
        model.addColumn("GIOI TINH");
        model.addColumn("LOP");
        //model.addColumn("HINH ANH");
        //model.addColumn("TRANG THAI");
        fillToTableXe();
    }

    public void fillToTableXe() {
        //cloneData();
        //System.out.println(listLaptop.get(0).getMaLoai());
        model.setRowCount(0);
        String gioiTinh = "Nu";
        for (SinhVien index : list) {
            if (index.isGioitinh()) {
                gioiTinh = "Nam";
            }
            model.addRow(new Object[]{index.getMSSV(), index.getHoten(), index.getQuequan(), index.getCccd(), gioiTinh, index.getLop()});
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
        txtMSSV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQueQuan = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        lblHinhAnh = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtLop = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFind = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Quan Li Sinh Vien");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 270, -1));
        jPanel1.add(txtMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 102, 172, 34));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("MSSV");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 109, -1, -1));
        jPanel1.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 162, 172, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ho ten");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 169, -1, -1));
        jPanel1.add(txtQueQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 172, 34));
        jPanel1.add(txtCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 172, 34));

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhMouseClicked(evt);
            }
        });
        jPanel1.add(lblHinhAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 140, 140));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Que quan");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nu");
        jPanel1.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        jPanel1.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Lop");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));
        jPanel1.add(txtLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 172, 34));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 780, 120));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Gioi tinh");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tim theo ten");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 90, 20));

        txtFind.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFindCaretUpdate(evt);
            }
        });
        jPanel1.add(txtFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 270, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("CCCD");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jButton1.setText("Cap nhat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 140, 30));

        jButton2.setText("Xoa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 140, 30));

        jButton3.setText("Them");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 140, 30));

        jButton4.setText("In DSSV");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        int i = tblList.getSelectedRow();
        txtMSSV.setText(list.get(i).getMSSV());
        txtCCCD.setText(list.get(i).getCccd());
        txtHoTen.setText(list.get(i).getHoten());
        txtLop.setText(list.get(i).getLop());
        txtQueQuan.setText(list.get(i).getQuequan());
        if(list.get(i).isGioitinh())
            rdoNam.setSelected(true);
        else 
            rdoNu.setSelected(true);
        this.hinhAnh = list.get(i).getHinhanh();
        lblHinhAnh.setIcon(new ImageIcon(this.hinhAnh));
    }//GEN-LAST:event_tblListMouseClicked

    private void txtFindCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFindCaretUpdate
        cloneData();
    }//GEN-LAST:event_txtFindCaretUpdate

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean gt=false;
        if(rdoNam.isSelected())
           gt=true;
        sv.add(txtMSSV.getText(), txtHoTen.getText(), txtQueQuan.getText(), txtCCCD.getText(), gt, txtLop.getText(), hinhAnh);
        JOptionPane.showMessageDialog(this, "Them thanh cong");
        cloneData();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lblHinhAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMouseClicked
        choseImage();
    }//GEN-LAST:event_lblHinhAnhMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String mssv = JOptionPane.showInputDialog("Vui long nhap MSSV muon xoa:");
        for(SinhVien sv:list){
            if(sv.getMSSV().equalsIgnoreCase(mssv)){
                 sv.delete(mssv);
            JOptionPane.showMessageDialog(this, "Xoa thanh cong!");
            cloneData();
            return;
            }
        }
        JOptionPane.showMessageDialog(this, "Khong the xoa");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean gt=false;
        if(rdoNam.isSelected())
           gt=true;
        for(SinhVien sv:list){
            if(sv.getMSSV().equalsIgnoreCase(txtMSSV.getText())){
                sv.update(txtMSSV.getText(), txtHoTen.getText(), txtQueQuan.getText(), txtCCCD.getText(), gt, txtLop.getText(), this.hinhAnh);
            JOptionPane.showMessageDialog(this, "Cap nhat thanh cong!");
            cloneData();
            return;
            }
        }
        JOptionPane.showMessageDialog(this, "Khong the cap nhat");
    }//GEN-LAST:event_jButton1ActionPerformed

    public void saveFile(int index) throws FileNotFoundException, IOException {
        String gt = "Nam";
        if( !list.get(index).isGioitinh()){
            gt ="Nữ";
        }
        String[] data = {
            /*
                String.valueOf(txtUserName.getText()),
                String.valueOf(txtPassword.getText()),
                String.valueOf(txtConfirmPassword.getText())
             */
            "\t Thông tin sinh viên: " + list.get(index).getHoten()+  "\n",
            "Mã số sinh viên: " + list.get(index).getMSSV()+  "\n",
            "Tên sinh viên: " + list.get(index).getHoten()+ "\n",
            "số CCCD: " +  list.get(index).getCccd()+ "\n",
            "Quê quán: " +  list.get(index).getQuequan()+ "\n",
            "Lớp: " +  list.get(index).getLop()+"\n",
            "Giới tính: " +  gt+"\n",
            "\t\t\t\tCửa hàng laptop: RyzenV",
            "\t\t\t\t Công ty Phần mềm DAVISY",
            "\t\t\t\t Chi tiết liên hệ: ",
            "\t\t\t\t         github.com/TheanIshtar"
        };

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn đường dẫn lưu văn bản!");

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            //WriteToFile(fileToSave.getAbsolutePath() + ".docx");

            /*  
                abcde.docx
                x : length-1
                . : length-5
             */
            String path = fileToSave.getAbsoluteFile().toString();
            String file = fileToSave.getAbsolutePath();
            if (!path.contains(".doc")) {
                file = fileToSave.getAbsolutePath() + ".doc";
            }

            OutputStream outputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

            for (String item : data) {
                outputStreamWriter.write(item);
                // Dùng để xuống hàng
                outputStreamWriter.write("\n");
            }
            // Đây là phương thức quan trọng!
            // Nó sẽ bắt chương trình chờ ghi dữ liệu xong thì mới kết thúc chương trình.
            outputStreamWriter.flush();
            JOptionPane.showMessageDialog(this, "Đã in thông tin nhân viên vào: "+path);
        }
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int index = tblList.getSelectedRow();
        try {
            saveFile(index);
        } catch (IOException ex) {
            Logger.getLogger(QuanLiSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtQueQuan;
    // End of variables declaration//GEN-END:variables
}
