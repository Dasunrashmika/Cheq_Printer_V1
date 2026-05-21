import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChequePrinterApp extends JFrame {







  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        lblTotalPrinted = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboTemplate = new javax.swing.JComboBox<>();
        txtAmountLKR = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtChqNo = new javax.swing.JTextField();
        txtAmountInWords = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboPayee = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        chkACPayee = new javax.swing.JCheckBox();
        previewArea = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnNewCheque = new javax.swing.JButton();
        btnVoid = new javax.swing.JButton();
        btnSavePrint = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setBackground(new java.awt.Color(153, 153, 153));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(this::btnSaveActionPerformed);
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        lblTotalPrinted.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalPrinted.setText("TOTAL PRINTED : 50");
        jPanel1.add(lblTotalPrinted, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Amount LKR :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Bank Template");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Payee Name :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Chq No :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, 30));

        comboTemplate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboTemplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 170, 30));

        txtAmountLKR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAmountLKRKeyReleased(evt);
            }
        });
        jPanel1.add(txtAmountLKR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 170, 30));
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 170, 30));
        jPanel1.add(txtChqNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 170, 30));

        txtAmountInWords.setText("Amount in Word");
        txtAmountInWords.addActionListener(this::txtAmountInWordsActionPerformed);
        jPanel1.add(txtAmountInWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 550, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Date :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        comboPayee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboPayee, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Bank Template");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 30));

        chkACPayee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chkACPayee.setText("A/C Payee");
        chkACPayee.addActionListener(this::chkACPayeeActionPerformed);
        jPanel1.add(chkACPayee, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, 30));

        previewArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel8.setText("Cheque Preview Area");

        javax.swing.GroupLayout previewAreaLayout = new javax.swing.GroupLayout(previewArea);
        previewArea.setLayout(previewAreaLayout);
        previewAreaLayout.setHorizontalGroup(
            previewAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(430, Short.MAX_VALUE))
        );
        previewAreaLayout.setVerticalGroup(
            previewAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jPanel1.add(previewArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 550, 120));

        btnNewCheque.setBackground(new java.awt.Color(153, 153, 153));
        btnNewCheque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNewCheque.setText("+ NEW CHEQUE");
        btnNewCheque.addActionListener(this::btnNewChequeActionPerformed);
        jPanel1.add(btnNewCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnVoid.setBackground(new java.awt.Color(153, 153, 153));
        btnVoid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoid.setText("Void Cheque");
        btnVoid.addActionListener(this::btnVoidActionPerformed);
        jPanel1.add(btnVoid, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        btnSavePrint.setBackground(new java.awt.Color(153, 153, 153));
        btnSavePrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSavePrint.setText("Save & Print");
        btnSavePrint.addActionListener(this::btnSavePrintActionPerformed);
        jPanel1.add(btnSavePrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        jMenu1.setText("Bank Templates");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reports");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         if (validateFields()) 
                JOptionPane.showMessageDialog(this, "Cheque Data Saved Successfully!");
            
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAmountInWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountInWordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountInWordsActionPerformed

    private void chkACPayeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkACPayeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkACPayeeActionPerformed

    private void btnNewChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewChequeActionPerformed

    private void btnVoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoidActionPerformed

    private void btnSavePrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePrintActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnSavePrintActionPerformed

    private void txtAmountLKRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountLKRKeyReleased
        // TODO add your handling code here:
                                               
    try {
        if (!txtAmountLKR.getText().isEmpty()) {
            int amount = Integer.parseInt(txtAmountLKR.getText());
            // අපි හදපු NumberToWords class එක පාවිච්චි කරනවා
            String words = NumberToWords.convert(amount);
            txtAmountInWords.setText(words + " Only");
        } else {
            txtAmountInWords.setText("");
        }
    } catch (NumberFormatException e) {
        // අකුරු ටයිප් කළොත් error එකක් නොදී ඉන්න
    }
}
    }//GEN-LAST:event_txtAmountLKRKeyReleased



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewCheque;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSavePrint;
    private javax.swing.JButton btnVoid;
    private javax.swing.JCheckBox chkACPayee;
    private javax.swing.JComboBox<String> comboPayee;
    private javax.swing.JComboBox<String> comboTemplate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTotalPrinted;
    private javax.swing.JPanel previewArea;
    private javax.swing.JTextField txtAmountInWords;
    private javax.swing.JTextField txtAmountLKR;
    private javax.swing.JTextField txtChqNo;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables

