/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjrs;

import com.sun.javafx.tk.Toolkit;
import java.awt.Image;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author surap
 */
public class System_Order extends javax.swing.JFrame {

    String nm_makan, nm_makan1, nm_minum, pesan;
    int Harga, Harga1, Harga2, jumlah_Beli, jumlah_Beli1, jumlah_Beli2, Jumlah, total_Harga, total_pajak, jumlahby, kembalian,totalpaket,totalalacarte,totalminuman;

    String txt;
    String Gantiformat = "";
    StringTokenizer token;
  public String calculate(){
       txt_nama_cashier.setText(Login_Form.jTextField1.getText());

        if (jumlah_Beli >= 0 && jumlah_Beli1 >= 0 && jumlah_Beli2 >= 0) {
            Receipt f3 = new Receipt();

            jumlah_Beli = Integer.parseInt(sp_jumlah_paket.getValue().toString());
            jumlah_Beli1 = Integer.parseInt(sp_jumlah_alacarte.getValue().toString());
            jumlah_Beli2 = Integer.parseInt(sp_jumlah_drinks.getValue().toString());
             totalpaket=(multiply(jumlah_Beli, Harga));
            totalalacarte=(multiply(jumlah_Beli1, Harga1));
            totalminuman=(multiply(jumlah_Beli2, Harga2));
            total_pajak = pajak(totalpaket, totalalacarte, totalminuman, 10, 100);
            
           
            
            total_Harga =total(totalpaket, totalalacarte, totalminuman, total_pajak);

            Gantiformat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(total_Harga);
            token = new StringTokenizer(Gantiformat, ".");
            Gantiformat = token.nextToken();
            Gantiformat = Gantiformat.replace('.', '.');
            txt_total_harga_frame2.setText(Gantiformat);
        }
        if (jumlah_Beli < 1 && jumlah_Beli1 < 1 && jumlah_Beli2 < 1) {
            JOptionPane.showMessageDialog(null, "Masukkan Jumlah Beli");
        }
        Receipt f3 = new Receipt();
return null;
  }
  public String combo(){
      nm_makan = (String) cb_paket_frame2.getSelectedItem();

        if (nm_makan == "Pilih Pesanan") {
            Harga = 0;
            Jumlah = 0;

        } else if (nm_makan == "Combo A") {
            Harga = 27000;

        } else if (nm_makan == "Combo B") {
            Harga = 27000;

        } else if (nm_makan == "Combo C") {
            Harga = 25000;

        } else if (nm_makan == "Combo D") {
            Harga = 23000;

        }

        Gantiformat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(Harga);
        token = new StringTokenizer(Gantiformat, ".");
        Gantiformat = token.nextToken();
        Gantiformat = Gantiformat.replace('.', '.');
        txt_harga_paket_frame2.setText(Gantiformat);

        Gantiformat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(Jumlah);
        token = new StringTokenizer(Gantiformat, ".");
        Gantiformat = token.nextToken();
        Gantiformat = Gantiformat.replace('.', '.');
        return null;
  }
  
  public String bayar(){
         if (Harga == 0 && Harga1 == 0 && Harga2 == 0 || total_pajak == 0) {
            JOptionPane.showMessageDialog(null, "Masukan Pesanan");
        }
        jumlahby = Integer.parseInt(txt_jumlah_bayar_frame2.getText());

        kembalian = subtract(jumlahby, total_Harga);

        if (jumlahby < total_Harga) {
            JOptionPane.showMessageDialog(null, "Uang Yang Dimasukan Tidak Cukup");
        } else if (jumlahby >= total_Harga) {
            
            Gantiformat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(jumlahby);
            token = new StringTokenizer(Gantiformat, ".");
            Gantiformat = token.nextToken();
            Gantiformat = Gantiformat.replace('.', '.');
            txt_jumlah_bayar_frame2.setText(Gantiformat);

            Gantiformat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(kembalian);
            token = new StringTokenizer(Gantiformat, ".");
            Gantiformat = token.nextToken();
            Gantiformat = Gantiformat.replace('.', '.');
            txt_jumlah_kembalian_frame2.setText(Gantiformat);
            return null;
        }
        return null;
  }
  public String alacarte(){
        nm_makan1 = (String) cb_alacarte_frame2.getSelectedItem();

        if (nm_makan1 == "Pilih Pesanan") {
            Harga1 = 0;
            Jumlah = 0;
        }
        if (nm_makan1 == "Dada Ayam") {
            Harga1 = 12000;
        }
        if (nm_makan1 == "Paha Atas Ayam") {
            Harga1 = 13000;
        }
        if (nm_makan1 == "Paha Bawah Ayam") {
            Harga1 = 12000;
        }
        if (nm_makan1 == "Sayap Ayam") {
            Harga1 = 11000;
        }
        if (nm_makan1 == "Cheese Burger") {
            Harga1 = 13000;
        }
        if (nm_makan1 == "Beef Burger") {
            Harga1 = 13000;
        }
        if (nm_makan1 == "Chicken Burger") {
            Harga1 = 11000;
        }
        if (nm_makan1 == "French Fries") {
            Harga1 = 10000;
        }
        if (nm_makan1 == "Nasi") {
            Harga1 = 5000;
        }

        Gantiformat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(Harga1);
        token = new StringTokenizer(Gantiformat, ".");
        Gantiformat = token.nextToken();
        Gantiformat = Gantiformat.replace('.', '.');
        txt_harga_alacarte_frame2.setText(Gantiformat);

        Gantiformat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(Jumlah);
        token = new StringTokenizer(Gantiformat, ".");
        Gantiformat = token.nextToken();
        Gantiformat = Gantiformat.replace('.', '.');
        return null;
  }
    public String drink(){
        nm_minum = (String) cb_drinks_frame2.getSelectedItem();

        if (nm_minum == "Pilih Pesanan") {
            Harga2 = 0;
            Jumlah = 0;
        }
        if (nm_minum == "Air Mineral") {
            Harga2 = 6000;
        }
        if (nm_minum == "Soda") {
            Harga2 = 8000;
        }
        if (nm_minum == "Ice Tea") {
            Harga2 = 5000;
        }
        if (nm_minum == "Lemon Tea") {
            Harga2 = 6000;
        }
        if (nm_minum == "Black Coffee") {
            Harga2 = 7000;
        }
        if (nm_minum == "Capuccino") {
            Harga2 = 10000;
        }

        Gantiformat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(Harga2);
        token = new StringTokenizer(Gantiformat, ".");
        Gantiformat = token.nextToken();
        Gantiformat = Gantiformat.replace('.', '.');
        txt_harga_drinks_frame2.setText(Gantiformat);

        Gantiformat = NumberFormat.getNumberInstance(Locale.ENGLISH).format(Jumlah);
        token = new StringTokenizer(Gantiformat, ".");
        Gantiformat = token.nextToken();
        Gantiformat = Gantiformat.replace('.', '.');
//        txt_jumlah_drinks_frame2.setText(Gantiformat);

return null;
    }
    public System_Order() {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("Combo A(1).png"));
        Image img = icon.getImage().getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), Image.SCALE_SMOOTH);
        jLabel19.setIcon(new ImageIcon(img));

        ImageIcon icon1 = new ImageIcon(getClass().getResource("Combo B(1).png"));
        Image img1 = icon1.getImage().getScaledInstance(jLabel22.getWidth(), jLabel22.getHeight(), Image.SCALE_SMOOTH);
        jLabel22.setIcon(new ImageIcon(img1));

        ImageIcon icon2 = new ImageIcon(getClass().getResource("Combo C(1).png"));
        Image img2 = icon2.getImage().getScaledInstance(jLabel24.getWidth(), jLabel24.getHeight(), Image.SCALE_SMOOTH);
        jLabel24.setIcon(new ImageIcon(img2));

        ImageIcon icon3 = new ImageIcon(getClass().getResource("Combo D(1).png"));
        Image img3 = icon3.getImage().getScaledInstance(jLabel26.getWidth(), jLabel26.getHeight(), Image.SCALE_SMOOTH);
        jLabel26.setIcon(new ImageIcon(img3));
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
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cb_paket_frame2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_harga_paket_frame2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_alacarte_frame2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_harga_alacarte_frame2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_harga_drinks_frame2 = new javax.swing.JTextField();
        cb_drinks_frame2 = new javax.swing.JComboBox<>();
        btn_ok_frame2 = new javax.swing.JButton();
        btn_reset_frame2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sp_jumlah_paket = new javax.swing.JSpinner();
        sp_jumlah_alacarte = new javax.swing.JSpinner();
        sp_jumlah_drinks = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_total_harga_frame2 = new javax.swing.JTextField();
        txt_jumlah_bayar_frame2 = new javax.swing.JTextField();
        txt_jumlah_kembalian_frame2 = new javax.swing.JTextField();
        btn_bayar_frame2 = new javax.swing.JButton();
        btn_struk_frame2 = new javax.swing.JButton();
        txt_nama_cashier = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 255));

        jLabel2.setFont(new java.awt.Font("COCOMAT", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Pilih Menu");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 230, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Paket");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        cb_paket_frame2.setBackground(new java.awt.Color(153, 153, 153));
        cb_paket_frame2.setFont(new java.awt.Font("COCOMAT", 1, 16)); // NOI18N
        cb_paket_frame2.setForeground(new java.awt.Color(204, 204, 204));
        cb_paket_frame2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Pesanan", "Combo A", "Combo B", "Combo C", "Combo D" }));
        cb_paket_frame2.setBorder(null);
        cb_paket_frame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_paket_frame2ActionPerformed(evt);
            }
        });
        jPanel4.add(cb_paket_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 190, -1));

        jLabel4.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Alacarte");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Harga  ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        txt_harga_paket_frame2.setEditable(false);
        txt_harga_paket_frame2.setBackground(new java.awt.Color(255, 255, 255));
        txt_harga_paket_frame2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        txt_harga_paket_frame2.setForeground(new java.awt.Color(0, 0, 0));
        txt_harga_paket_frame2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_harga_paket_frame2.setText("0");
        txt_harga_paket_frame2.setBorder(null);
        jPanel4.add(txt_harga_paket_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, 30));

        jLabel6.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("Jumlah  ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 160, -1));

        cb_alacarte_frame2.setFont(new java.awt.Font("COCOMAT", 1, 16)); // NOI18N
        cb_alacarte_frame2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Pesanan", "Dada Ayam", "Paha Atas Ayam", "Paha Bawah Ayam", "Sayap Ayam", "Cheese Burger", "Beef Burger", "Chicken Burger", "French Fries", "Nasi" }));
        cb_alacarte_frame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_alacarte_frame2ActionPerformed(evt);
            }
        });
        jPanel4.add(cb_alacarte_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 190, 30));

        jLabel7.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Harga");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Jumlah");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        txt_harga_alacarte_frame2.setEditable(false);
        txt_harga_alacarte_frame2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        txt_harga_alacarte_frame2.setForeground(new java.awt.Color(0, 0, 0));
        txt_harga_alacarte_frame2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_harga_alacarte_frame2.setText("0");
        jPanel4.add(txt_harga_alacarte_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 140, 30));

        jLabel9.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("Drinks");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 255));
        jLabel10.setText("Harga");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        jLabel11.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 255));
        jLabel11.setText("Jumlah");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        txt_harga_drinks_frame2.setEditable(false);
        txt_harga_drinks_frame2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        txt_harga_drinks_frame2.setForeground(new java.awt.Color(0, 0, 0));
        txt_harga_drinks_frame2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_harga_drinks_frame2.setText("0");
        jPanel4.add(txt_harga_drinks_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 140, 30));

        cb_drinks_frame2.setFont(new java.awt.Font("COCOMAT", 1, 16)); // NOI18N
        cb_drinks_frame2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Pesanan", "Air Mineral", "Soda", "Ice Tea", "Lemon Tea", "Black Coffee", "Capuccino" }));
        cb_drinks_frame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_drinks_frame2ActionPerformed(evt);
            }
        });
        jPanel4.add(cb_drinks_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 190, 30));

        btn_ok_frame2.setBackground(new java.awt.Color(0, 102, 255));
        btn_ok_frame2.setFont(new java.awt.Font("COCOMAT", 1, 14)); // NOI18N
        btn_ok_frame2.setForeground(new java.awt.Color(204, 204, 204));
        btn_ok_frame2.setText("CALCULATE");
        btn_ok_frame2.setBorder(null);
        btn_ok_frame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ok_frame2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_ok_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 110, 30));

        btn_reset_frame2.setBackground(new java.awt.Color(0, 102, 255));
        btn_reset_frame2.setFont(new java.awt.Font("COCOMAT", 1, 14)); // NOI18N
        btn_reset_frame2.setForeground(new java.awt.Color(204, 204, 204));
        btn_reset_frame2.setText("RESET");
        btn_reset_frame2.setBorder(null);
        btn_reset_frame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reset_frame2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn_reset_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, 90, 30));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("COCOMAT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Rp");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, 30));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("COCOMAT", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Rp");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, 30));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("COCOMAT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Rp");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, 30));

        sp_jumlah_paket.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        sp_jumlah_paket.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        sp_jumlah_paket.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.add(sp_jumlah_paket, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, 30));

        sp_jumlah_alacarte.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        sp_jumlah_alacarte.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel4.add(sp_jumlah_alacarte, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 190, 30));

        sp_jumlah_drinks.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        sp_jumlah_drinks.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel4.add(sp_jumlah_drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 190, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 450, 710));

        jPanel7.setBackground(new java.awt.Color(0, 102, 255));

        jLabel12.setFont(new java.awt.Font("COCOMAT", 1, 29)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Pembayaran");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(32, 32, 32))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 250, 50));

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Earwig Factory", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Food JRS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 300, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -10, 1130, 120));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 255));
        jLabel13.setText("Total Harga");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 255));
        jLabel14.setText("Jumlah Bayar");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("COCOMAT", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 255));
        jLabel15.setText("Jumlah Kembalian");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txt_total_harga_frame2.setEditable(false);
        txt_total_harga_frame2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        txt_total_harga_frame2.setText("0");
        jPanel6.add(txt_total_harga_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 160, 30));

        txt_jumlah_bayar_frame2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        txt_jumlah_bayar_frame2.setText("0");
        jPanel6.add(txt_jumlah_bayar_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 160, 30));

        txt_jumlah_kembalian_frame2.setEditable(false);
        txt_jumlah_kembalian_frame2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        txt_jumlah_kembalian_frame2.setText("0");
        jPanel6.add(txt_jumlah_kembalian_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 160, 30));

        btn_bayar_frame2.setBackground(new java.awt.Color(0, 102, 255));
        btn_bayar_frame2.setFont(new java.awt.Font("COCOMAT", 1, 14)); // NOI18N
        btn_bayar_frame2.setForeground(new java.awt.Color(204, 204, 204));
        btn_bayar_frame2.setText("BAYAR");
        btn_bayar_frame2.setBorder(null);
        btn_bayar_frame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bayar_frame2ActionPerformed(evt);
            }
        });
        jPanel6.add(btn_bayar_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 90, 30));

        btn_struk_frame2.setBackground(new java.awt.Color(0, 102, 255));
        btn_struk_frame2.setFont(new java.awt.Font("COCOMAT", 1, 14)); // NOI18N
        btn_struk_frame2.setForeground(new java.awt.Color(204, 204, 204));
        btn_struk_frame2.setText("STRUK");
        btn_struk_frame2.setBorder(null);
        btn_struk_frame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_struk_frame2ActionPerformed(evt);
            }
        });
        jPanel6.add(btn_struk_frame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 90, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 450, 490));

        txt_nama_cashier.setForeground(new java.awt.Color(204, 204, 204));
        txt_nama_cashier.setText("jLabel19");
        jPanel2.add(txt_nama_cashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, -1, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 1040, 910));

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBorder(null);
        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jPanel11.setBackground(new java.awt.Color(0, 82, 165));

        jLabel20.setFont(new java.awt.Font("Anime Ace", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("COMBO A");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel20)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addContainerGap())
        );

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 170, 30));

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 82, 165), 2, true));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjrs/Combo A(1).png"))); // NOI18N
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 240, 210));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 230, 150));

        jPanel12.setBackground(new java.awt.Color(0, 82, 165));

        jLabel21.setFont(new java.awt.Font("Anime Ace", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("COMBO B");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel21)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jPanel8.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jPanel13.setBackground(new java.awt.Color(153, 153, 153));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 82, 165), 2, true));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjrs/Combo B(1).png"))); // NOI18N
        jPanel13.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 210, 180));

        jPanel8.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 230, 150));

        jPanel14.setBackground(new java.awt.Color(0, 82, 165));

        jLabel23.setFont(new java.awt.Font("Anime Ace", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("COMBO D");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel23)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        jPanel8.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 600, -1, 30));

        jPanel16.setBackground(new java.awt.Color(0, 82, 165));

        jLabel25.setFont(new java.awt.Font("Anime Ace", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("COMBO C");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel25)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        jPanel8.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, 30));

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 82, 165), 2, true));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjrs/Combo C(1).png"))); // NOI18N
        jPanel15.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 210, 180));

        jPanel8.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 230, 150));

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 82, 165), 2, true));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectjrs/Combo D(1).png"))); // NOI18N
        jPanel17.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 140));

        jPanel8.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 230, 150));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 90, 360, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reset_frame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reset_frame2ActionPerformed
       Reset2();

    }//GEN-LAST:event_btn_reset_frame2ActionPerformed

    private void btn_ok_frame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ok_frame2ActionPerformed
       calculate();

    }//GEN-LAST:event_btn_ok_frame2ActionPerformed

    private void cb_paket_frame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_paket_frame2ActionPerformed
       combo();
//      txt_jumlah_paket_frame2.setText(Gantiformat);

    }//GEN-LAST:event_cb_paket_frame2ActionPerformed

    private void btn_bayar_frame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bayar_frame2ActionPerformed

        bayar();


    }//GEN-LAST:event_btn_bayar_frame2ActionPerformed

    private void cb_alacarte_frame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_alacarte_frame2ActionPerformed
      alacarte();
//        txt_jumlah_alacarte_frame2.setText(Gantiformat);

    }//GEN-LAST:event_cb_alacarte_frame2ActionPerformed

    private void cb_drinks_frame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_drinks_frame2ActionPerformed
        drink();
        
    }//GEN-LAST:event_cb_drinks_frame2ActionPerformed

    private void btn_struk_frame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_struk_frame2ActionPerformed
      hilang();
        dispose();
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
            java.util.logging.Logger.getLogger(System_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System_Order().setVisible(true);
            }
        });
    }
    

public int subtract(int firstNumber, int secondNumber){
    return firstNumber-secondNumber;
}
public int multiply(int firstNumber, int secondNumber){
    return firstNumber*secondNumber;
}

public int pajak(int a,int b ,int c,int d,int e){
        return (a+b+c)*d/e;
    
}
public int total(int a,int b ,int c,int d){
    return (a+b+c)+d;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bayar_frame2;
    private javax.swing.JButton btn_ok_frame2;
    private javax.swing.JButton btn_reset_frame2;
    private javax.swing.JButton btn_struk_frame2;
    public static javax.swing.JComboBox<String> cb_alacarte_frame2;
    public static javax.swing.JComboBox<String> cb_drinks_frame2;
    public static javax.swing.JComboBox<String> cb_paket_frame2;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JSpinner sp_jumlah_alacarte;
    public static javax.swing.JSpinner sp_jumlah_drinks;
    public static javax.swing.JSpinner sp_jumlah_paket;
    public static javax.swing.JTextField txt_harga_alacarte_frame2;
    public static javax.swing.JTextField txt_harga_drinks_frame2;
    public static javax.swing.JTextField txt_harga_paket_frame2;
    public static javax.swing.JTextField txt_jumlah_bayar_frame2;
    public static javax.swing.JTextField txt_jumlah_kembalian_frame2;
    public static javax.swing.JLabel txt_nama_cashier;
    public static javax.swing.JTextField txt_total_harga_frame2;
    // End of variables declaration//GEN-END:variables
  

      
        public String Reset2() {
            txt_harga_alacarte_frame2.setText("");
            txt_harga_drinks_frame2.setText("");
            txt_harga_paket_frame2.setText("");
            sp_jumlah_paket.setValue(0);
            sp_jumlah_alacarte.setValue(0);
            sp_jumlah_drinks.setValue(0);
            cb_alacarte_frame2.setSelectedIndex(0);
            cb_drinks_frame2.setSelectedIndex(0);
            cb_paket_frame2.setSelectedIndex(0);
            txt_total_harga_frame2.setText("0");
            txt_jumlah_bayar_frame2.setText("0");
            txt_jumlah_kembalian_frame2.setText("0");
            return null;
        }
    
  public String hilang() {
        Receipt f3 = new Receipt();
        f3.setVisible(true);
        dispose();
        return null;
    }

}
