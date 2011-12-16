/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmAddEmployee.java
 *
 * Created on Dec 16, 2011, 11:23:52 AM
 */
package vn.edu.nuce.lms.ui;

/**
 *
 * @author Dell
 */
public class FrmAddEmployee extends javax.swing.JFrame {

    /** Creates new form FrmAddEmployee */
    public FrmAddEmployee() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSex = new javax.swing.ButtonGroup();
        lblAdd = new javax.swing.JLabel();
        lblEmID = new javax.swing.JLabel();
        lblEmName = new javax.swing.JLabel();
        lblBirthDay = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblJoinDat = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmID = new javax.swing.JTextField();
        txtEmName = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtDayOfLeave = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtBirthDay = new com.toedter.calendar.JDateChooser();
        txtJoinDay = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADD EMPLOYEE");

        lblAdd.setFont(new java.awt.Font("Tahoma", 1, 36));
        lblAdd.setForeground(new java.awt.Color(255, 0, 0));
        lblAdd.setText("Thêm Nhân Viên");
        lblAdd.setName("lblAdd"); // NOI18N

        lblEmID.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblEmID.setForeground(new java.awt.Color(0, 51, 255));
        lblEmID.setText("EmID");
        lblEmID.setName("lblEmID"); // NOI18N

        lblEmName.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblEmName.setForeground(new java.awt.Color(0, 51, 255));
        lblEmName.setText("EmName");
        lblEmName.setName("lblEmName"); // NOI18N

        lblBirthDay.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblBirthDay.setForeground(new java.awt.Color(0, 51, 255));
        lblBirthDay.setText("BirthDay");
        lblBirthDay.setName("lblBirthDay"); // NOI18N

        lblLevel.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblLevel.setForeground(new java.awt.Color(0, 51, 255));
        lblLevel.setText("Level");
        lblLevel.setName("lblLevel"); // NOI18N

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblEmail.setForeground(new java.awt.Color(0, 0, 255));
        lblEmail.setText("Email");
        lblEmail.setName("lblEmail"); // NOI18N

        lblPhone.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblPhone.setForeground(new java.awt.Color(0, 0, 255));
        lblPhone.setText("Phone");
        lblPhone.setName("lblPhone"); // NOI18N

        lblJoinDat.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblJoinDat.setForeground(new java.awt.Color(0, 0, 255));
        lblJoinDat.setText("Join Day");
        lblJoinDat.setName("lblJoinDat"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Day Of Leave");
        jLabel9.setName("jLabel9"); // NOI18N

        txtEmID.setName("txtEmID"); // NOI18N

        txtEmName.setName("txtEmName"); // NOI18N

        txtLevel.setName("txtLevel"); // NOI18N

        txtEmail.setForeground(new java.awt.Color(0, 0, 255));
        txtEmail.setName("txtEmail"); // NOI18N

        txtPhone.setForeground(new java.awt.Color(0, 0, 255));
        txtPhone.setName("txtPhone"); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtDayOfLeave.setForeground(new java.awt.Color(0, 0, 255));
        txtDayOfLeave.setName("txtDayOfLeave"); // NOI18N

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnAdd.setForeground(new java.awt.Color(0, 0, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/edu/nuce/lms/image/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("");
        btnAdd.setName("btnAdd"); // NOI18N

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnClose.setForeground(new java.awt.Color(0, 0, 255));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/edu/nuce/lms/image/delete.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.setName("btnClose"); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vn/edu/nuce/lms/image/refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setName("btnReset"); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtBirthDay.setName("txtBirthDay"); // NOI18N

        txtJoinDay.setName("txtJoinDay"); // NOI18N

        jLabel1.setText("Sex :");
        jLabel1.setName("jLabel1"); // NOI18N

        buttonGroupSex.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.setName("jRadioButton1"); // NOI18N

        buttonGroupSex.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.setName("jRadioButton2"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmID)
                    .addComponent(lblEmName)
                    .addComponent(lblBirthDay)
                    .addComponent(lblLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmName, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(txtLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(txtBirthDay, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jRadioButton2)
                        .addGap(36, 36, 36))
                    .addComponent(txtEmID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lblEmail)
                    .addComponent(lblJoinDat)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDayOfLeave, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(txtJoinDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(lblAdd)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnAdd)
                .addGap(39, 39, 39)
                .addComponent(btnReset)
                .addGap(46, 46, 46)
                .addComponent(btnClose)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(624, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblJoinDat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtJoinDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDayOfLeave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmID))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBirthDay))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLevel))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jRadioButton1))
                    .addComponent(jRadioButton2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnReset)
                    .addComponent(btnClose))
                .addGap(40, 40, 40))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-675)/2, (screenSize.height-372)/2, 675, 372);
    }// </editor-fold>//GEN-END:initComponents

private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtPhoneActionPerformed

private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
// TODO add your handling code here:
    txtEmID.setText("");
    txtEmName.setText("");
    txtEmail.setText("");
    txtLevel.setText("");
    txtBirthDay.setDate(null);
    txtDayOfLeave.setText("");
    txtPhone.setText("");
    txtJoinDay.setDate(null);
}//GEN-LAST:event_btnResetActionPerformed

private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmAddEmployee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroupSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblBirthDay;
    private javax.swing.JLabel lblEmID;
    private javax.swing.JLabel lblEmName;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblJoinDat;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblPhone;
    private com.toedter.calendar.JDateChooser txtBirthDay;
    private javax.swing.JTextField txtDayOfLeave;
    private javax.swing.JTextField txtEmID;
    private javax.swing.JTextField txtEmName;
    private javax.swing.JTextField txtEmail;
    private com.toedter.calendar.JDateChooser txtJoinDay;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
