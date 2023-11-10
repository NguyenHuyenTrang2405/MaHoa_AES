/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aes;

import java.awt.Font;
import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.*;
import java.math.BigInteger;
//import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
//import org.w3c.dom.Text;

/**
 *
 * @author admin
 */
public class gm_mh_AES extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private SecretKeySpec secretKey;
    public gm_mh_AES() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Mã Hóa Và Giải Mã AES");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textfile = new javax.swing.JTextArea();
        btchonfile = new javax.swing.JButton();
        btkhoa = new javax.swing.JButton();
        btmahoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textin = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btlammoi1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textkhoa = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btchonfile1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btkhoa1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textout = new javax.swing.JTextArea();
        btgiaima = new javax.swing.JButton();
        btlammoi2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        textkhoa1 = new javax.swing.JTextField();
        textnd1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textfile.setEditable(false);
        textfile.setColumns(20);
        textfile.setRows(5);
        jScrollPane3.setViewportView(textfile);

        btchonfile.setText("Chọn File");
        btchonfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchonfileActionPerformed(evt);
            }
        });

        btkhoa.setText("Khóa");
        btkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkhoaActionPerformed(evt);
            }
        });

        btmahoa.setText("Mã hóa");
        btmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmahoaActionPerformed(evt);
            }
        });

        textin.setEditable(false);
        textin.setColumns(20);
        textin.setRows(5);
        jScrollPane1.setViewportView(textin);

        jLabel2.setText("Nội Dung");

        jLabel3.setText("Khóa Bí Mật");

        jLabel4.setText("ND Mã Hóa");

        btlammoi1.setText("Làm Mới");
        btlammoi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlammoi1ActionPerformed(evt);
            }
        });

        jLabel8.setText("MÃ HÓA");

        textkhoa.setEditable(false);
        textkhoa.setColumns(20);
        textkhoa.setRows(5);
        jScrollPane5.setViewportView(textkhoa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btchonfile)
                            .addComponent(btkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btmahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(btlammoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btchonfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btlammoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Nội Dung");

        btchonfile1.setText("Chọn File");
        btchonfile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchonfile1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Khóa Bí Mật");

        btkhoa1.setText("Khóa");
        btkhoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkhoa1ActionPerformed(evt);
            }
        });

        jLabel7.setText("ND Mã Hóa");

        textout.setEditable(false);
        textout.setColumns(20);
        textout.setRows(5);
        jScrollPane2.setViewportView(textout);

        btgiaima.setText("Giải Mã");
        btgiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgiaimaActionPerformed(evt);
            }
        });

        btlammoi2.setText("Làm Mới");
        btlammoi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlammoi2ActionPerformed(evt);
            }
        });

        jLabel9.setText("GIẢI MÃ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textkhoa1)
                            .addComponent(textnd1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btchonfile1)
                            .addComponent(btkhoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addGap(39, 39, 39))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btgiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(btlammoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btchonfile1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textnd1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btkhoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textkhoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btgiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlammoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("MÃ HÓA VÀ GIẢI MÃ AES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(246, 246, 246))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btchonfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchonfileActionPerformed
        // TODO add your handling code here:
        String txt="";
        JFileChooser a = new JFileChooser();
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("docx","txt");
        a.setFileFilter(txtFilter);
        a.setMultiSelectionEnabled(false);

        int x = a.showDialog(this, "Chọn File ");
        if(x == a.APPROVE_OPTION){
            File k = a.getSelectedFile();
            //txtFileKy.setText(k.getPath());
            txt = k.getPath();
        }
        String st="";
        try {
                File file = new File(txt);
                FileInputStream fis = new FileInputStream(file.getAbsolutePath());
                XWPFDocument document = new XWPFDocument(fis);
    
                List<XWPFParagraph> paragraphs = document.getParagraphs();
                for (XWPFParagraph para : paragraphs) {
                    String text = para.getText();
                    st+=text;
                }
                textfile.setText(st);
                fis.close();
            } catch (Exception e) {
            try{
            File ct = new File(txt);
            Scanner sc = new Scanner(ct);
            String content = "";
            while(sc.hasNextLine()) {
                content += sc.nextLine();
            }
            textfile.setText(content);
            }
            catch (FileNotFoundException c) {
             }
            }
    }//GEN-LAST:event_btchonfileActionPerformed

    private void btmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmahoaActionPerformed
        // TODO add your handling code here:
        mahoa();
    }//GEN-LAST:event_btmahoaActionPerformed

    private void btgiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgiaimaActionPerformed
        // TODO add your handling code here:
        giaima();
    }//GEN-LAST:event_btgiaimaActionPerformed

    private void btkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkhoaActionPerformed
        // TODO add your handling code here:
        khoabm();
    }//GEN-LAST:event_btkhoaActionPerformed

    private void btchonfile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchonfile1ActionPerformed
        
        String txt="";
        JFileChooser a = new JFileChooser();
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Text","docx","txt");
        a.setFileFilter(txtFilter);
        a.setMultiSelectionEnabled(false);

        int x = a.showDialog(this, "Chọn File ");
        if(x == a.APPROVE_OPTION){
            File k = a.getSelectedFile();
            txt = k.getPath();
        }
        try {
            FileInputStream fis = new FileInputStream(txt);
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            textnd1.setText(bytesToHex(bytes));
            secretKey= new SecretKeySpec(bytes, "AES");
            fis.close();
            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(gm_mh_AES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btchonfile1ActionPerformed

    private void btkhoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkhoa1ActionPerformed
        String txt="";
        JFileChooser a = new JFileChooser();
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Text","docx","txt");
        a.setFileFilter(txtFilter);
        a.setMultiSelectionEnabled(false);

        int x = a.showDialog(this, "Chọn File ");
        if(x == a.APPROVE_OPTION){
            File k = a.getSelectedFile();
            txt = k.getPath();
        }
        try {
            FileInputStream fis = new FileInputStream(txt);
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            textkhoa1.setText(bytesToHex(bytes));
            secretKey = new SecretKeySpec(bytes, "AES");
            fis.close();
            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(gm_mh_AES.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btkhoa1ActionPerformed

    private void btlammoi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlammoi1ActionPerformed
        textfile.setText(null);
        textin.setText(null);
        textkhoa.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btlammoi1ActionPerformed

    private void btlammoi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlammoi2ActionPerformed
        textnd1.setText(null);
        textout.setText(null);
        textkhoa1.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_btlammoi2ActionPerformed
   
    private void khoabm() {
        
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            SecretKey secret = keyGen.generateKey();
            byte[] keyBytes = secret.getEncoded();
            secretKey = new SecretKeySpec(keyBytes, "AES");
            //Luu khoa 
            FileOutputStream keyOut = new FileOutputStream("E:\\Nhom14_MaHoaAES_Java\\key.txt");
            keyOut.write(keyBytes);
            keyOut.close();
            textkhoa.setText(bytesToHex(keyBytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void mahoa() {
        if(textfile.getText().isEmpty() || textkhoa.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Vui lòng chọn file/ tạo khóa trước khi thực hiên mã hóa");
        else
        {
            JOptionPane.showMessageDialog(this, "Mã Hóa thành công", "Mã Hóa", JOptionPane.INFORMATION_MESSAGE);
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(textfile.getText().getBytes());
            
            // Luu mahoa
            FileOutputStream encryptedOut = new FileOutputStream("E:\\Nhom14_MaHoaAES_Java\\mahoa.txt");
            encryptedOut.write(encryptedBytes);
            encryptedOut.close();

            textin.setText(bytesToHex(encryptedBytes));
        } catch (Exception e) {

        }
        }
    }

    private void giaima() {
        textout.setText(null);
        if(textfile.getText().isEmpty() || textkhoa1.getText().isEmpty())
             JOptionPane.showMessageDialog(this, "Vui lòng chọn file giải mã / khóa trước khi thực hiên giải mã");
        else{
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] encryptedBytes = Files.readAllBytes(new File("E:\\Nhom14_MaHoaAES_Java\\mahoa.txt").toPath());
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

            // Luu giai ma
            FileOutputStream decryptedOut = new FileOutputStream("E:\\Nhom14_MaHoaAES_Java\\giaima.txt");
            decryptedOut.write(decryptedBytes);
            decryptedOut.close();
            String kq=new String(decryptedBytes, StandardCharsets.UTF_8);
            if(!kq.isEmpty())
                textout.setText(kq);
            else
                JOptionPane.showMessageDialog(this,"Không thể giải mã");
            JOptionPane.showMessageDialog(this, "Giải Mã thành công", "Giải mã", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this,"Không thể giải mã");
        }}
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02X", b));
        }
        return result.toString();
    }
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
            java.util.logging.Logger.getLogger(gm_mh_AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gm_mh_AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gm_mh_AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gm_mh_AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gm_mh_AES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btchonfile;
    private javax.swing.JButton btchonfile1;
    private javax.swing.JButton btgiaima;
    private javax.swing.JButton btkhoa;
    private javax.swing.JButton btkhoa1;
    private javax.swing.JButton btlammoi1;
    private javax.swing.JButton btlammoi2;
    private javax.swing.JButton btmahoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea textfile;
    private javax.swing.JTextArea textin;
    private javax.swing.JTextArea textkhoa;
    private javax.swing.JTextField textkhoa1;
    private javax.swing.JTextField textnd1;
    private javax.swing.JTextArea textout;
    // End of variables declaration//GEN-END:variables
}
