/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author dangt
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Loading() {
        initComponents();

    }
    
    
    
 
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TaiKhoan = new javax.swing.JPanel();
        lblHideTitle = new javax.swing.JLabel();
        lblLoading = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TaiKhoan.setBackground(new java.awt.Color(64, 43, 100));
        TaiKhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHideTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblHideTitle.setForeground(new java.awt.Color(51, 153, 0));
        lblHideTitle.setText("THEAN RYZEN");
        TaiKhoan.add(lblHideTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 280, 90));

        lblLoading.setFont(new java.awt.Font("Segoe UI Semilight", 1, 22)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(102, 102, 255));
        lblLoading.setText("100%");
        TaiKhoan.add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 150, 60));

        loadingbar.setBackground(new java.awt.Color(255, 255, 255));
        loadingbar.setForeground(new java.awt.Color(0, 51, 255));
        TaiKhoan.add(loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 370, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TaiKhoan;
    private javax.swing.JLabel lblHideTitle;
    public javax.swing.JLabel lblLoading;
    public javax.swing.JProgressBar loadingbar;
    // End of variables declaration//GEN-END:variables
}
