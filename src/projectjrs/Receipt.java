/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjrs;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger; 
import javax.swing.JOptionPane;
import static projectjrs.System_Order.cb_alacarte_frame2;
import static projectjrs.System_Order.cb_drinks_frame2;
import static projectjrs.System_Order.cb_paket_frame2;
import static projectjrs.System_Order.txt_harga_alacarte_frame2;
import static projectjrs.System_Order.txt_harga_drinks_frame2;
import static projectjrs.System_Order.txt_harga_paket_frame2;
import static projectjrs.System_Order.txt_total_harga_frame2;

/**
 *
 * @author surap
 */
public class Receipt extends javax.swing.JFrame {

    /**
     * Creates new form Frame_3
     */
    public Receipt() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_check_frame3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_jumlah_paket_frame3 = new javax.swing.JTextField();
        txt_jumlah_alacarte_frame3 = new javax.swing.JTextField();
        txt_jumlah_drinks_frame3 = new javax.swing.JTextField();
        txt_harga_paket_frame3 = new javax.swing.JTextField();
        txt_harga_alacarte_frame3 = new javax.swing.JTextField();
        txt_harga_drinks_frame3 = new javax.swing.JTextField();
        txt_paket_frame3 = new javax.swing.JTextField();
        txt_alacarte_frame3 = new javax.swing.JTextField();
        txt_drinks_frame3 = new javax.swing.JTextField();
        txt_total_harga_frame3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btn_struk_frame2 = new javax.swing.JButton();
        txt_cashier = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_total_bayar_frame3 = new javax.swing.JTextField();
        txt_total_kembalian_frame3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Earwig Factory", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Food JRS");

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("cashier");

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("--------------------------------------------");

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("--------------------------------------------");

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("paket");

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("alacarte");

        jLabel7.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("drinks");

        jLabel8.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("--------------------------------------------");

        jLabel9.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("--------------------------------------------");

        jLabel10.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("total harga");

        btn_check_frame3.setBackground(new java.awt.Color(255, 255, 255));
        btn_check_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        btn_check_frame3.setForeground(new java.awt.Color(0, 0, 0));
        btn_check_frame3.setText("CHECK");
        btn_check_frame3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_check_frame3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("x");

        jLabel12.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("x");

        jLabel13.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("x");

        txt_jumlah_paket_frame3.setEditable(false);
        txt_jumlah_paket_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_jumlah_paket_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_jumlah_paket_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_jumlah_paket_frame3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_jumlah_paket_frame3.setBorder(null);
        txt_jumlah_paket_frame3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlah_paket_frame3ActionPerformed(evt);
            }
        });

        txt_jumlah_alacarte_frame3.setEditable(false);
        txt_jumlah_alacarte_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_jumlah_alacarte_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_jumlah_alacarte_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_jumlah_alacarte_frame3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_jumlah_alacarte_frame3.setBorder(null);

        txt_jumlah_drinks_frame3.setEditable(false);
        txt_jumlah_drinks_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_jumlah_drinks_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_jumlah_drinks_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_jumlah_drinks_frame3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_jumlah_drinks_frame3.setBorder(null);

        txt_harga_paket_frame3.setEditable(false);
        txt_harga_paket_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_harga_paket_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_harga_paket_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_harga_paket_frame3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_harga_paket_frame3.setBorder(null);
        txt_harga_paket_frame3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_harga_paket_frame3ActionPerformed(evt);
            }
        });

        txt_harga_alacarte_frame3.setEditable(false);
        txt_harga_alacarte_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_harga_alacarte_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_harga_alacarte_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_harga_alacarte_frame3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_harga_alacarte_frame3.setBorder(null);

        txt_harga_drinks_frame3.setEditable(false);
        txt_harga_drinks_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_harga_drinks_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_harga_drinks_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_harga_drinks_frame3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_harga_drinks_frame3.setBorder(null);

        txt_paket_frame3.setEditable(false);
        txt_paket_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_paket_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_paket_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_paket_frame3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_paket_frame3.setBorder(null);

        txt_alacarte_frame3.setEditable(false);
        txt_alacarte_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_alacarte_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_alacarte_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_alacarte_frame3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_alacarte_frame3.setBorder(null);

        txt_drinks_frame3.setEditable(false);
        txt_drinks_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_drinks_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_drinks_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_drinks_frame3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_drinks_frame3.setBorder(null);

        txt_total_harga_frame3.setEditable(false);
        txt_total_harga_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_total_harga_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_total_harga_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_total_harga_frame3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_total_harga_frame3.setBorder(null);
        txt_total_harga_frame3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_harga_frame3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText(":");

        btn_struk_frame2.setBackground(new java.awt.Color(255, 255, 255));
        btn_struk_frame2.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        btn_struk_frame2.setForeground(new java.awt.Color(0, 0, 0));
        btn_struk_frame2.setText("SELESAI");
        btn_struk_frame2.setBorder(null);
        btn_struk_frame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_struk_frame2ActionPerformed(evt);
            }
        });

        txt_cashier.setEditable(false);
        txt_cashier.setBackground(new java.awt.Color(255, 255, 255));
        txt_cashier.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_cashier.setForeground(new java.awt.Color(0, 0, 0));
        txt_cashier.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_cashier.setBorder(null);

        jLabel14.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("total bayar");

        jLabel15.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("total kembalian");

        jLabel16.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText(":");

        jLabel18.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText(":");

        txt_total_bayar_frame3.setEditable(false);
        txt_total_bayar_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_total_bayar_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_total_bayar_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_total_bayar_frame3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_total_bayar_frame3.setBorder(null);

        txt_total_kembalian_frame3.setEditable(false);
        txt_total_kembalian_frame3.setBackground(new java.awt.Color(255, 255, 255));
        txt_total_kembalian_frame3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        txt_total_kembalian_frame3.setForeground(new java.awt.Color(0, 0, 0));
        txt_total_kembalian_frame3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_total_kembalian_frame3.setBorder(null);

        jLabel19.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("*harga sudah termasuk ppN 10%");

        jLabel20.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btn_check_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btn_struk_frame2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_cashier, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(25, 25, 25)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_paket_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_alacarte_frame3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addComponent(txt_drinks_frame3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txt_harga_paket_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txt_harga_drinks_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_harga_alacarte_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_jumlah_drinks_frame3)
                                        .addComponent(txt_jumlah_paket_frame3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                        .addComponent(txt_jumlah_alacarte_frame3)))
                                .addComponent(jLabel8)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel20))
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_total_bayar_frame3)
                                        .addComponent(txt_total_harga_frame3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                        .addComponent(txt_total_kembalian_frame3)))
                                .addComponent(jLabel9)))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_cashier, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_jumlah_paket_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_harga_paket_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_paket_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_alacarte_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_jumlah_alacarte_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_harga_alacarte_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_jumlah_drinks_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_drinks_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_harga_drinks_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_total_harga_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txt_total_bayar_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total_kembalian_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_check_frame3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_struk_frame2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_harga_paket_frame3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_harga_paket_frame3ActionPerformed

    }//GEN-LAST:event_txt_harga_paket_frame3ActionPerformed

    private void btn_check_frame3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_check_frame3ActionPerformed
              txt_cashier.setText(System_Order.txt_nama_cashier.getText());
        txt_total_harga_frame3.setText(System_Order.txt_total_harga_frame2.getText());
        txt_alacarte_frame3.setText((String) System_Order.cb_alacarte_frame2.getSelectedItem());
        txt_harga_alacarte_frame3.setText(System_Order.txt_harga_alacarte_frame2.getText());
        txt_jumlah_paket_frame3.setText(System_Order.sp_jumlah_paket.getValue().toString());
        txt_drinks_frame3.setText((String) System_Order.cb_drinks_frame2.getSelectedItem());
        txt_harga_drinks_frame3.setText(System_Order.txt_harga_drinks_frame2.getText());
        txt_jumlah_alacarte_frame3.setText(System_Order.sp_jumlah_alacarte.getValue().toString());
        txt_paket_frame3.setText((String) System_Order.cb_paket_frame2.getSelectedItem());
        txt_jumlah_drinks_frame3.setText(System_Order.sp_jumlah_drinks.getValue().toString());
        txt_harga_paket_frame3.setText(System_Order.txt_harga_paket_frame2.getText());

        txt_total_bayar_frame3.setText(System_Order.txt_jumlah_bayar_frame2.getText());
        txt_total_kembalian_frame3.setText(System_Order.txt_jumlah_kembalian_frame2.getText());
        if (txt_paket_frame3.getText().equals("Pilih Pesanan")) {
            txt_paket_frame3.setText("---------");
        }
        if (txt_alacarte_frame3.getText().equals("Pilih Pesanan")) {
            txt_alacarte_frame3.setText("---------");
        }
        if (txt_drinks_frame3.getText().equals("Pilih Pesanan")) {
            txt_drinks_frame3.setText("---------");
        }

    }//GEN-LAST:event_btn_check_frame3ActionPerformed

    private void txt_total_harga_frame3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_harga_frame3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_harga_frame3ActionPerformed

    private void txt_jumlah_paket_frame3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlah_paket_frame3ActionPerformed

    }//GEN-LAST:event_txt_jumlah_paket_frame3ActionPerformed

    private void btn_struk_frame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_struk_frame2ActionPerformed
      JOptionPane.showMessageDialog(null, "Terima Kasih");
        int i = JOptionPane.showConfirmDialog(this, "Ingin Memesan Kembali ? ", "Confirm", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (i == JOptionPane.YES_OPTION) {
            System_Order f2 = new System_Order();
            f2.setVisible(true);
            dispose();

        } else if (i == JOptionPane.NO_OPTION) {
            Home_Page f0 = new Home_Page();
            f0.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_btn_struk_frame2ActionPerformed

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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_check_frame3;
    private javax.swing.JButton btn_struk_frame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txt_alacarte_frame3;
    public static javax.swing.JTextField txt_cashier;
    public static javax.swing.JTextField txt_drinks_frame3;
    public static javax.swing.JTextField txt_harga_alacarte_frame3;
    public static javax.swing.JTextField txt_harga_drinks_frame3;
    public static javax.swing.JTextField txt_harga_paket_frame3;
    private javax.swing.JTextField txt_jumlah_alacarte_frame3;
    private javax.swing.JTextField txt_jumlah_drinks_frame3;
    private javax.swing.JTextField txt_jumlah_paket_frame3;
    public static javax.swing.JTextField txt_paket_frame3;
    private javax.swing.JTextField txt_total_bayar_frame3;
    public static javax.swing.JTextField txt_total_harga_frame3;
    private javax.swing.JTextField txt_total_kembalian_frame3;
    // End of variables declaration//GEN-END:variables

  
}
