/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ChildrenRole;

import Hospital.Children.Children;
import Hospital.Hospital;
import Hospital.Organization.PatientOrganization;
import Hospital.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author josie
 */
public class ChildrenProfileJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private PatientOrganization organization;
    private Hospital hospital;
    private UserAccount userAccount;
    private Children children;
    /**
     * Creates new form ProfileJPanel
     */

    public ChildrenProfileJPanel(JPanel workArea,UserAccount userAccount, PatientOrganization organization, Hospital hospital) {
        initComponents();
        setSize(1500, 1000);
        this.workArea = workArea;
        this.organization = organization;
        this.hospital = hospital;
        this.userAccount = userAccount;
        children=userAccount.getChildren();
        
        setSize(1500, 1000);
        displayProfile();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
//        
//        displayMode(true);
    }

    private void displayProfile() {
        txtSSNID.setText(children.getSSNID());
        txtName.setText(children.getName());
        txtUsername.setText(userAccount.getUsername());
        txtPassword.setText(userAccount.getPassword());
        txtAge.setText(Integer.toString(children.getAge()));
        cboxGender.setSelectedItem(children.getGender()); 
        txtBirthday.setText(children.getBirthday());
         
    }
//    // update mode: t==false 
//    private void displayMode(boolean t) {
//        btnSave.setEnabled(!t);
//        btnUpdate.setEnabled(t);
//        txtSSNID.setEditable(false);
//        txtName.setEditable(false);
//        txtAge.setEnabled(!t);
//        txtGender.setEnabled(!t);
//        txtBirthday.setEnabled(!t);
//        txtUsername.setEnabled(!t);
//        txtPassword.setEnabled(!t);
//              
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSSNID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cboxGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Profile");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 90, 1500, -1));

        btnBack6.setBackground(new java.awt.Color(0, 0, 0));
        btnBack6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack6.setForeground(new java.awt.Color(255, 255, 255));
        btnBack6.setText("< Back");
        btnBack6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack6ActionPerformed(evt);
            }
        });
        add(btnBack6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 37));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Role ID :");

        txtSSNID.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtSSNID.setEnabled(false);
        txtSSNID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Name :");

        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtName.setEnabled(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Age :");

        txtAge.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtAge.setEnabled(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Gender :");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Birthday :");

        txtBirthday.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtBirthday.setEnabled(false);
        txtBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdayActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Username :");

        txtUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtUsername.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Password :");

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtPassword.setText("jPasswordField1");
        txtPassword.setEnabled(false);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cboxGender.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        cboxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        cboxGender.setEnabled(false);

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("MM/DD/YYYY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(txtSSNID, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(txtBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                .addComponent(cboxGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSSNID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 430, 590));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel11.setText("Children's username & password are default to be Role ID once created.");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7+LinkedIn+Profile+Tips+for+Veterans.jpeg"))); // NOI18N
        jLabel9.setToolTipText("");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1500, 1010));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSSNIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
//        displayMode(false);
//        txtUsername.requestFocusInWindow();
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        txtAge.setEnabled(true);
        cboxGender.setEnabled(true);
        txtBirthday.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        // Password validation
        String password = txtPassword.getText();
        boolean isValidPassword = password.length() >= 8 &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*");

        if( txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() || txtUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The information isn't completed! Please check!");
            
        }  
        else{
            
            String ageText = txtAge.getText();
            int age;
                try {
                    age = Integer.parseInt(ageText);
                } catch (NumberFormatException e) {
                    // Display an error message if age is not a valid integer
                    JOptionPane.showMessageDialog(this, "Age field should be an integer!", "Error", JOptionPane.ERROR_MESSAGE);
                    txtAge.setText("");
                    return; // Stop further processing
                }            
            
            String birthday = txtBirthday.getText();
            // Validate birthday format
            if (!birthday.matches("\\d{2}/\\d{2}/\\d{4}")) {
                // Display a message if SSN is not in the correct form
                JOptionPane.showMessageDialog(this, "Birthday you entered is not in the correct form MM/DD/YYYY. Please check.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Stop further processing
            }
            
            // User Name validation
            String username=txtUsername.getText();            
            if (organization.getUserAccountDirectory().findUserAccount(username) != null && !(userAccount.getUsername().equals(username))) {
                JOptionPane.showMessageDialog(null, "Username already exists! ");
            } 
            else {
                
                userAccount.setPassword(txtPassword.getText());
                userAccount.setUsername(username);
                children.setBirthday(txtBirthday.getText());
                children.setAge(Integer.parseInt(txtAge.getText()));
                children.setGender((String) cboxGender.getSelectedItem());
                
//                displayMode(true);
                JOptionPane.showMessageDialog(null,"User Information updated successfully!");
                
                txtUsername.setEnabled(false);
                txtPassword.setEnabled(false);
                txtAge.setEnabled(false);
                cboxGender.setEnabled(false);
                txtBirthday.setEnabled(false);
                
                btnSave.setEnabled(false);
                btnUpdate.setEnabled(true);
            } 
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdayActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBack6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack6ActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBack6ActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack6;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboxGender;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSSNID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
