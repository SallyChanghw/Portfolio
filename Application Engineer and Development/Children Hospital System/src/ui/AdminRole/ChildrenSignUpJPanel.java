/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdminRole;

import Hospital.Children.Children;
import Hospital.Hospital;
import Hospital.Organization.PatientOrganization;
import Hospital.Role.ChildrenRole;
import Hospital.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author josie
 */
public class ChildrenSignUpJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Hospital hospital;
    /**
     * Creates new form ChildrenSignUpJPanel
     */
    
    ChildrenSignUpJPanel(JPanel userProcessContainer, Hospital hospital) {
        initComponents();
        
        setSize(1500, 1000);
        this.userProcessContainer = userProcessContainer;
        this.hospital = hospital; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        cboxGender = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Children - Sign Up");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 98, 1374, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("SSN ID :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 217, -1, -1));

        txtSSNID.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtSSNID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNIDActionPerformed(evt);
            }
        });
        add(txtSSNID, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 213, 172, 35));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 275, -1, -1));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 271, 172, 35));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Age :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 328, -1, -1));

        txtAge.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 324, 172, 35));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Gender :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 381, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Birthday :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 434, -1, -1));

        txtBirthday.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdayActionPerformed(evt);
            }
        });
        add(txtBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 430, 172, 35));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Username :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 495, -1, -1));

        txtUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 491, 173, 35));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Password :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 548, -1, -1));

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 544, 173, 35));

        cboxGender.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        cboxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        add(cboxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 377, 172, 35));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 37));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnCreate.setBackground(new java.awt.Color(0, 204, 51));
        btnCreate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(571, Short.MAX_VALUE)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 490, 650));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7+LinkedIn+Profile+Tips+for+Veterans.jpeg"))); // NOI18N
        jLabel9.setToolTipText("");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1500, 1010));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSSNIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdayActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String ssnID = txtSSNID.getText();
        String name = txtName.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String gender = (String) cboxGender.getSelectedItem();
        String ageText = txtAge.getText();
        String birthday = txtBirthday.getText();
                
//      Check if any of the fields is empty
        if (ssnID.isEmpty() || name.isEmpty() || username.isEmpty() || password.isEmpty() ||
        gender.isEmpty() || ageText.isEmpty() || birthday.isEmpty()) {
            
//      Display a message if any field is empty
        JOptionPane.showMessageDialog(this, "Please fill out all the blanks.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Stop further processing
        }
        
        int age;
    
        // Try to parse age as an integer
        try {
            age = Integer.parseInt(ageText);
        } catch (NumberFormatException e) {
            // Display an error message if age is not a valid integer
            JOptionPane.showMessageDialog(this, "Age field should be an integer!", "Error", JOptionPane.ERROR_MESSAGE);
            txtAge.setText("");
            return; // Stop further processing
        }

        
       
        
//      Create a new children using the ChildrenHistory class
        Children c = hospital.getChildrenHistory().addChildren(ssnID, name, age, gender, birthday, "");
        
//      Create a new UserAccount for the children
        UserAccount account = new UserAccount();
        account.setUsername(username);
        account.setPassword(password);
        account.setRole(new ChildrenRole());
        account.setChildren(c);
        
//      Add the new children to the ChildrenHistory
        hospital.getChildrenHistory().getChildrenList().add(c);

//      Add the new UserAccount to the UserAccountDirectory
        hospital.getOrganizationDirectory().getOrganizationList().stream()
            .filter(org -> org instanceof PatientOrganization)
            .map(org -> (PatientOrganization) org)
            .findFirst()
            .ifPresent(patientOrg -> patientOrg.getUserAccountDirectory().getUserAccountList().add(account));

        clearInputFields();
        
//      Display a success message
        JOptionPane.showMessageDialog(this, "User account of doctor has been successfully created!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void clearInputFields() {
        
        txtName.setText("");
        txtSSNID.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtAge.setText("");
        txtBirthday.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> cboxGender;
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
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtSSNID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
