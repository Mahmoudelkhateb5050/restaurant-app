
package programming;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends javax.swing.JFrame {
    private double total=0.0;
    private int x=0;

    public Main() {
        initComponents();
        init();

    }

    public void init(){
        setImage();
        setTime();

    }
    public void setImage(){
        ImageIcon icon1 = new ImageIcon(getClass().getResource("/images/Pizza.png"));
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/Burger.png"));
        ImageIcon icon3 = new ImageIcon(getClass().getResource("/images/Hotdog.png"));
        ImageIcon icon4 = new ImageIcon(getClass().getResource("/images/Desert.png"));
        ImageIcon icon5 = new ImageIcon(getClass().getResource("/images/Coffee.png"));
        ImageIcon icon6 = new ImageIcon(getClass().getResource("/images/Tea.png"));
        ImageIcon icon7 = new ImageIcon(getClass().getResource("/images/Fries.png"));
        ImageIcon icon8 = new ImageIcon(getClass().getResource("/images/Soda.png"));
        Image img1 = icon1.getImage().getScaledInstance(Image_1.getWidth(),Image_1.getHeight(),Image.SCALE_SMOOTH);
        Image img2 = icon2.getImage().getScaledInstance(Image_2.getWidth(),Image_2.getHeight(),Image.SCALE_SMOOTH);
        Image img3 = icon3.getImage().getScaledInstance(Image_3.getWidth(),Image_3.getHeight(),Image.SCALE_SMOOTH);
        Image img4 = icon4.getImage().getScaledInstance(Image_4.getWidth(),Image_4.getHeight(),Image.SCALE_SMOOTH);
        Image img5 = icon5.getImage().getScaledInstance(Image_5.getWidth(),Image_5.getHeight(),Image.SCALE_SMOOTH);
        Image img6 = icon6.getImage().getScaledInstance(Image_6.getWidth(),Image_6.getHeight(),Image.SCALE_SMOOTH);
        Image img7 = icon7.getImage().getScaledInstance(Image_7.getWidth(),Image_7.getHeight(),Image.SCALE_SMOOTH);
        Image img8 = icon8.getImage().getScaledInstance(Image_8.getWidth(),Image_8.getHeight(),Image.SCALE_SMOOTH);

        Image_1.setIcon(new ImageIcon(img1));
        Image_2.setIcon(new ImageIcon(img2));
        Image_3.setIcon(new ImageIcon(img3));
        Image_4.setIcon(new ImageIcon(img4));
        Image_5.setIcon(new ImageIcon(img5));
        Image_6.setIcon(new ImageIcon(img6));
        Image_7.setIcon(new ImageIcon(img7));
        Image_8.setIcon(new ImageIcon(img8));
    }

    public boolean quantityIsZero(int qty){
        if(qty==0){
            JOptionPane.showMessageDialog(null,"Please increase the item quantity");
            return false;
        }
        return true;
    }

    public void reset(){
        jButton1.setEnabled(true);
        total=0.0;
        x=0;
        jSpinner_1.setValue(0);
        jSpinner_2.setValue(0);
        jSpinner_3.setValue(0);
        jSpinner_4.setValue(0);
        jSpinner_5.setValue(0);
        jSpinner_6.setValue(0);
        jSpinner_7.setValue(0);
        jSpinner_8.setValue(0);
        jTextFieldTotal.setText("0.0");
        jTextArea.setText("");
        jCheckBox_1.setSelected(false);
        jCheckBox_2.setSelected(false);
        jCheckBox_3.setSelected(false);
        jCheckBox_4.setSelected(false);
        jCheckBox_5.setSelected(false);
        jCheckBox_6.setSelected(false);
        jCheckBox_7.setSelected(false);
        jCheckBox_8.setSelected(false);
        jTextFieldTotal.setText("0.0");


    }
    public void dudate(){
        jTextFieldTotal.setText(String.valueOf(total));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JP1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner_1 = new javax.swing.JSpinner();
        jCheckBox_1 = new javax.swing.JCheckBox();
        Image_1 = new javax.swing.JLabel();
        JP2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSpinner_2 = new javax.swing.JSpinner();
        jCheckBox_2 = new javax.swing.JCheckBox();
        Image_2 = new javax.swing.JLabel();
        JP3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSpinner_3 = new javax.swing.JSpinner();
        jCheckBox_3 = new javax.swing.JCheckBox();
        Image_3 = new javax.swing.JLabel();
        JP4 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jCheckBox_4 = new javax.swing.JCheckBox();
        Image_4 = new javax.swing.JLabel();
        jSpinner_4 = new javax.swing.JSpinner();
        JP5 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jSpinner_5 = new javax.swing.JSpinner();
        jCheckBox_5 = new javax.swing.JCheckBox();
        Image_5 = new javax.swing.JLabel();
        JP6 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jSpinner_6 = new javax.swing.JSpinner();
        jCheckBox_6 = new javax.swing.JCheckBox();
        Image_6 = new javax.swing.JLabel();
        JP8 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jSpinner_8 = new javax.swing.JSpinner();
        jCheckBox_8 = new javax.swing.JCheckBox();
        Image_8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jTxTime = new javax.swing.JLabel();
        jTxtDate = new javax.swing.JLabel();
        JP7 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jSpinner_7 = new javax.swing.JSpinner();
        jCheckBox_7 = new javax.swing.JCheckBox();
        Image_7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 240));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JP1.setBackground(new java.awt.Color(230, 230, 230));
        JP1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JP1.setPreferredSize(new java.awt.Dimension(112, 198));

        jLabel1.setText("Name");

        jLabel2.setText("Price");

        jLabel3.setText("Quantity");

        jLabel4.setText("Purchase");

        jLabel5.setText("Pizza");

        jLabel6.setText("$50.0");

        jSpinner_1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner_1.setMinimumSize(null);
        jSpinner_1.setPreferredSize(new java.awt.Dimension(52, 22));

        jCheckBox_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP1Layout = new javax.swing.GroupLayout(JP1);
        JP1.setLayout(JP1Layout);
        JP1Layout.setHorizontalGroup(
                JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Image_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(JP1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jCheckBox_1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(JP1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinner_1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        JP1Layout.setVerticalGroup(
                JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP1Layout.createSequentialGroup()
                                .addComponent(Image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jSpinner_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_1)
                                        .addComponent(jLabel4)))
        );

        JP2.setBackground(new java.awt.Color(230, 230, 230));
        JP2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JP2.setPreferredSize(new java.awt.Dimension(112, 198));

        jLabel7.setText("Name");

        jLabel8.setText("Price");

        jLabel9.setText("Quantity");

        jLabel10.setText("Purchase");

        jLabel11.setText("Burger");

        jLabel12.setText("$25.0");

        jSpinner_2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner_2.setMinimumSize(null);
        jSpinner_2.setPreferredSize(new java.awt.Dimension(52, 22));

        jCheckBox_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP2Layout = new javax.swing.GroupLayout(JP2);
        JP2.setLayout(JP2Layout);
        JP2Layout.setHorizontalGroup(
                JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JP2Layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP2Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP2Layout.createSequentialGroup()
                                                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(JP2Layout.createSequentialGroup()
                                                                .addComponent(jLabel10)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jCheckBox_2)
                                                                .addGap(0, 13, Short.MAX_VALUE))
                                                        .addGroup(JP2Layout.createSequentialGroup()
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSpinner_2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                                .addContainerGap())
                                        .addComponent(Image_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        JP2Layout.setVerticalGroup(
                JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP2Layout.createSequentialGroup()
                                .addComponent(Image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jSpinner_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_2)
                                        .addComponent(jLabel10)))
        );

        JP3.setBackground(new java.awt.Color(230, 230, 230));
        JP3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JP3.setPreferredSize(new java.awt.Dimension(112, 198));

        jLabel13.setText("Name");

        jLabel14.setText("Price");

        jLabel15.setText("Quantity");

        jLabel16.setText("Purchase");

        jLabel17.setText("Hotdog");

        jLabel18.setText("$20.0");

        jSpinner_3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner_3.setMinimumSize(null);
        jSpinner_3.setPreferredSize(new java.awt.Dimension(52, 22));

        jCheckBox_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP3Layout = new javax.swing.GroupLayout(JP3);
        JP3.setLayout(JP3Layout);
        JP3Layout.setHorizontalGroup(
                JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JP3Layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP3Layout.createSequentialGroup()
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP3Layout.createSequentialGroup()
                                                .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(JP3Layout.createSequentialGroup()
                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSpinner_3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                        .addGroup(JP3Layout.createSequentialGroup()
                                                                .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(JP3Layout.createSequentialGroup()
                                                                                .addComponent(jLabel16)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jCheckBox_3)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(6, 6, 6))))
        );
        JP3Layout.setVerticalGroup(
                JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP3Layout.createSequentialGroup()
                                .addComponent(Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jSpinner_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_3)
                                        .addComponent(jLabel16)))
        );

        JP4.setBackground(new java.awt.Color(230, 230, 230));
        JP4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JP4.setPreferredSize(new java.awt.Dimension(112, 198));

        jLabel37.setText("Name");

        jLabel38.setText("Price");

        jLabel39.setText("Quantity");

        jLabel40.setText("Purchase");

        jLabel41.setText("Cake");

        jLabel42.setText("$10.0");

        jCheckBox_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_4ActionPerformed(evt);
            }
        });

        jSpinner_4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner_4.setMinimumSize(null);
        jSpinner_4.setPreferredSize(new java.awt.Dimension(52, 22));

        javax.swing.GroupLayout JP4Layout = new javax.swing.GroupLayout(JP4);
        JP4.setLayout(JP4Layout);
        JP4Layout.setHorizontalGroup(
                JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JP4Layout.createSequentialGroup()
                                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP4Layout.createSequentialGroup()
                                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP4Layout.createSequentialGroup()
                                                .addGroup(JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(JP4Layout.createSequentialGroup()
                                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSpinner_4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                        .addGroup(JP4Layout.createSequentialGroup()
                                                                .addGroup(JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(JP4Layout.createSequentialGroup()
                                                                                .addComponent(jLabel40)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jCheckBox_4)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(6, 6, 6))))
        );
        JP4Layout.setVerticalGroup(
                JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP4Layout.createSequentialGroup()
                                .addComponent(Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel37)
                                        .addComponent(jLabel41))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel38)
                                        .addComponent(jLabel42))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel39)
                                        .addComponent(jSpinner_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_4)
                                        .addComponent(jLabel40)))
        );

        JP5.setBackground(new java.awt.Color(230, 230, 230));
        JP5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JP5.setPreferredSize(new java.awt.Dimension(112, 198));

        jLabel43.setText("Name");

        jLabel44.setText("Price");

        jLabel45.setText("Quantity");

        jLabel46.setText("Purchase");

        jLabel47.setText("Coffee");

        jLabel48.setText("$4.0");

        jSpinner_5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner_5.setMinimumSize(null);
        jSpinner_5.setPreferredSize(new java.awt.Dimension(52, 22));

        jCheckBox_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP5Layout = new javax.swing.GroupLayout(JP5);
        JP5.setLayout(JP5Layout);
        JP5Layout.setHorizontalGroup(
                JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JP5Layout.createSequentialGroup()
                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP5Layout.createSequentialGroup()
                                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP5Layout.createSequentialGroup()
                                                .addGroup(JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(JP5Layout.createSequentialGroup()
                                                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSpinner_5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                        .addGroup(JP5Layout.createSequentialGroup()
                                                                .addGroup(JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Image_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(JP5Layout.createSequentialGroup()
                                                                                .addComponent(jLabel46)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jCheckBox_5)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(6, 6, 6))))
        );
        JP5Layout.setVerticalGroup(
                JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP5Layout.createSequentialGroup()
                                .addComponent(Image_5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel43)
                                        .addComponent(jLabel47))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel44)
                                        .addComponent(jLabel48))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel45)
                                        .addComponent(jSpinner_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_5)
                                        .addComponent(jLabel46)))
        );

        JP6.setBackground(new java.awt.Color(230, 230, 230));
        JP6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JP6.setPreferredSize(new java.awt.Dimension(112, 198));

        jLabel49.setText("Name");

        jLabel50.setText("Price");

        jLabel51.setText("Quantity");

        jLabel52.setText("Purchase");

        jLabel53.setText("Tea");

        jLabel54.setText("$3.0");

        jSpinner_6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner_6.setMinimumSize(null);
        jSpinner_6.setPreferredSize(new java.awt.Dimension(52, 22));

        jCheckBox_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP6Layout = new javax.swing.GroupLayout(JP6);
        JP6.setLayout(JP6Layout);
        JP6Layout.setHorizontalGroup(
                JP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JP6Layout.createSequentialGroup()
                                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP6Layout.createSequentialGroup()
                                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP6Layout.createSequentialGroup()
                                                .addGroup(JP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(JP6Layout.createSequentialGroup()
                                                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSpinner_6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                        .addGroup(JP6Layout.createSequentialGroup()
                                                                .addGroup(JP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Image_6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(JP6Layout.createSequentialGroup()
                                                                                .addComponent(jLabel52)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jCheckBox_6)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(6, 6, 6))))
        );
        JP6Layout.setVerticalGroup(
                JP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP6Layout.createSequentialGroup()
                                .addComponent(Image_6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel49)
                                        .addComponent(jLabel53))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel50)
                                        .addComponent(jLabel54))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel51)
                                        .addComponent(jSpinner_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_6)
                                        .addComponent(jLabel52)))
        );

        JP8.setBackground(new java.awt.Color(230, 230, 230));
        JP8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JP8.setPreferredSize(new java.awt.Dimension(112, 198));

        jLabel67.setText("Name");

        jLabel68.setText("Price");

        jLabel69.setText("Quantity");

        jLabel70.setText("Purchase");

        jLabel71.setText("Soda");

        jLabel72.setText("$2.0");

        jSpinner_8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner_8.setMinimumSize(null);
        jSpinner_8.setPreferredSize(new java.awt.Dimension(52, 22));

        jCheckBox_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP8Layout = new javax.swing.GroupLayout(JP8);
        JP8.setLayout(JP8Layout);
        JP8Layout.setHorizontalGroup(
                JP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JP8Layout.createSequentialGroup()
                                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP8Layout.createSequentialGroup()
                                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP8Layout.createSequentialGroup()
                                                .addGroup(JP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(JP8Layout.createSequentialGroup()
                                                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSpinner_8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                        .addGroup(JP8Layout.createSequentialGroup()
                                                                .addGroup(JP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Image_8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(JP8Layout.createSequentialGroup()
                                                                                .addComponent(jLabel70)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jCheckBox_8)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(6, 6, 6))))
        );
        JP8Layout.setVerticalGroup(
                JP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP8Layout.createSequentialGroup()
                                .addComponent(Image_8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel67)
                                        .addComponent(jLabel71))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel68)
                                        .addComponent(jLabel72))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel69)
                                        .addComponent(jSpinner_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_8)
                                        .addComponent(jLabel70)))
        );

        jButton1.setText("Total");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Receipt");

        jButton3.setText("Rest");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jTextArea.setPreferredSize(new java.awt.Dimension(240, 84));
        jScrollPane1.setViewportView(jTextArea);

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setText("0.0");
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jLabel57.setText("total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(24, 24, 24)
                                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jTxtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JP7.setBackground(new java.awt.Color(230, 230, 230));
        JP7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JP7.setPreferredSize(new java.awt.Dimension(112, 198));

        jLabel79.setText("Name");

        jLabel80.setText("Price");

        jLabel81.setText("Quantity");

        jLabel82.setText("Purchase");

        jLabel83.setText("Fries");

        jLabel84.setText("$10.0");

        jSpinner_7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        jSpinner_7.setMinimumSize(null);
        jSpinner_7.setPreferredSize(new java.awt.Dimension(52, 22));

        jCheckBox_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP7Layout = new javax.swing.GroupLayout(JP7);
        JP7.setLayout(JP7Layout);
        JP7Layout.setHorizontalGroup(
                JP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(JP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JP7Layout.createSequentialGroup()
                                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP7Layout.createSequentialGroup()
                                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(JP7Layout.createSequentialGroup()
                                                .addGroup(JP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(JP7Layout.createSequentialGroup()
                                                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSpinner_7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                        .addGroup(JP7Layout.createSequentialGroup()
                                                                .addGroup(JP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Image_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(JP7Layout.createSequentialGroup()
                                                                                .addComponent(jLabel82)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jCheckBox_7)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(6, 6, 6))))
        );
        JP7Layout.setVerticalGroup(
                JP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JP7Layout.createSequentialGroup()
                                .addComponent(Image_7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel79)
                                        .addComponent(jLabel83))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel80)
                                        .addComponent(jLabel84))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel81)
                                        .addComponent(jSpinner_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox_7)
                                        .addComponent(jLabel82)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JP4, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(JP7, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(JP1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JP6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JP3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(JP1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                                        .addComponent(JP3, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                                        .addComponent(JP2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(JP4, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                                                .addGap(9, 9, 9)
                                                                .addComponent(JP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(JP5, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                                                                .addGap(9, 9, 9))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(JP6, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(JP8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jButton3)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton2)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton1)))))))
                                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void restaurant(){
        jTextArea.setText(
                "******************Restaurant******************\n"
                        +"Time: "+jTxTime.getText()+"Date: "+jTxtDate.getText()+"\n"
                        +"************************************************\n"
                        +"Item Name:\t\t"+"Price($)\n");


    }
    private void jCheckBox_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_1ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner_1.getValue().toString());
        if(quantityIsZero(qty) && jCheckBox_1.isSelected()){
            x++;
            if(x==1){
                restaurant();
            }
            double price = qty*50.0;
            total+=price;
            jTextArea.setText(jTextArea.getText()+x+". "+jLabel5.getText()+"\t\t"+price+ "\n");
            dudate();
        }
        else{
            jCheckBox_1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox_1ActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    private void jCheckBox_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_2ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner_2.getValue().toString());
        if(quantityIsZero(qty) && jCheckBox_2.isSelected()){
            x++;
            if(x==1){
                restaurant();
            }
            double price = qty*25.0;
            total+=price;
            jTextArea.setText(jTextArea.getText()+x+". "+jLabel11.getText()+"\t\t"+price+ "\n");
            dudate();
        }
        else{
            jCheckBox_2.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox_2ActionPerformed

    private void jCheckBox_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_3ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner_3.getValue().toString());
        if(quantityIsZero(qty) && jCheckBox_3.isSelected()){
            x++;
            if(x==1){
                restaurant();
            }
            double price = qty*20.0;
            total+=price;
            jTextArea.setText(jTextArea.getText()+x+". "+jLabel17.getText()+"\t\t"+price+ "\n");
            dudate();
        }
        else{
            jCheckBox_3.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox_3ActionPerformed

    private void jCheckBox_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_4ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner_4.getValue().toString());
        if(quantityIsZero(qty) && jCheckBox_4.isSelected()){
            x++;
            if(x==1){
                restaurant();
            }
            double price = qty*10.0;
            total+=price;
            jTextArea.setText(jTextArea.getText()+x+". "+jLabel41.getText()+"\t\t"+price+ "\n");
            dudate();
        }
        else{
            jCheckBox_4.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox_4ActionPerformed

    private void jCheckBox_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_5ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner_5.getValue().toString());
        if(quantityIsZero(qty) && jCheckBox_5.isSelected()){
            x++;
            if(x==1){
                restaurant();
            }
            double price = qty*4.0;
            total+=price;
            jTextArea.setText(jTextArea.getText()+x+". "+jLabel47.getText()+"\t\t"+price+ "\n");
            dudate();
        }
        else{
            jCheckBox_5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox_5ActionPerformed

    private void jCheckBox_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_6ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner_6.getValue().toString());
        if(quantityIsZero(qty) && jCheckBox_6.isSelected()){
            x++;
            if(x==1){
                restaurant();
            }
            double price = qty*3.0;
            total+=price;
            jTextArea.setText(jTextArea.getText()+x+". "+jLabel53.getText()+"\t\t"+price+ "\n");
            dudate();
        }
        else{
            jCheckBox_6.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox_6ActionPerformed

    private void jCheckBox_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_7ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner_7.getValue().toString());
        if(quantityIsZero(qty) && jCheckBox_7.isSelected()){
            x++;
            if(x==1){
                restaurant();
            }
            double price = qty*10.0;
            total+=price;
            jTextArea.setText(jTextArea.getText()+x+". "+jLabel83.getText()+"\t\t"+price+ "\n");
            dudate();
        }
        else{
            jCheckBox_7.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox_7ActionPerformed

    private void jCheckBox_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_8ActionPerformed
        // TODO add your handling code here:
        int qty = Integer.parseInt(jSpinner_8.getValue().toString());
        if(quantityIsZero(qty) && jCheckBox_8.isSelected()){
            x++;
            if(x==1){
                restaurant();
            }
            double price = qty*2.0;
            total+=price;
            jTextArea.setText(jTextArea.getText()+x+". "+jLabel71.getText()+"\t\t"+price+ "\n");
            dudate();
        }
        else{
            jCheckBox_8.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox_8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(total==0.0){
            JOptionPane.showMessageDialog(null,"You haven't selected any item");
        }
        else{
            jTextArea.setText(jTextArea.getText()
                    +"\n************************************************\n"
                    +"Total \t\t "+total+"\n"
                    +"************************************************"
            );
            jButton1.setEnabled(false);


        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void setTime(){
        new Thread (new Runnable(){
            @Override
            public void run (){
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE,dd/mm/yyyy");
                    String time = tf.format(date);
                    jTxTime.setText(time.split(" ") [0]+" "+time.split(" ")[1]);
                    jTxtDate.setText(df.format(date));
                }
            }
        }).start();
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
    private javax.swing.JLabel Image_1;
    private javax.swing.JLabel Image_2;
    private javax.swing.JLabel Image_3;
    private javax.swing.JLabel Image_4;
    private javax.swing.JLabel Image_5;
    private javax.swing.JLabel Image_6;
    private javax.swing.JLabel Image_7;
    private javax.swing.JLabel Image_8;
    private javax.swing.JPanel JP1;
    private javax.swing.JPanel JP2;
    private javax.swing.JPanel JP3;
    private javax.swing.JPanel JP4;
    private javax.swing.JPanel JP5;
    private javax.swing.JPanel JP6;
    private javax.swing.JPanel JP7;
    private javax.swing.JPanel JP8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox_1;
    private javax.swing.JCheckBox jCheckBox_2;
    private javax.swing.JCheckBox jCheckBox_3;
    private javax.swing.JCheckBox jCheckBox_4;
    private javax.swing.JCheckBox jCheckBox_5;
    private javax.swing.JCheckBox jCheckBox_6;
    private javax.swing.JCheckBox jCheckBox_7;
    private javax.swing.JCheckBox jCheckBox_8;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_1;
    private javax.swing.JSpinner jSpinner_2;
    private javax.swing.JSpinner jSpinner_3;
    private javax.swing.JSpinner jSpinner_4;
    private javax.swing.JSpinner jSpinner_5;
    private javax.swing.JSpinner jSpinner_6;
    private javax.swing.JSpinner jSpinner_7;
    private javax.swing.JSpinner jSpinner_8;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JLabel jTxtDate;
    private javax.swing.JLabel jTxTime;
}
