/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Hospital.Enterprise.ManufacturerDirectory;
import Hospital.Hospital;
import Hospital.Organization.Organization;
import Hospital.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.AdminRole.AppointmentScheduleRequestJPanel;

/**
 *
 * @author josie
 */
public class OrganizationLoginScreen extends javax.swing.JPanel {

    JPanel mainWorkArea;
    Hospital hospital;
    ManufacturerDirectory manufacturerDirectory;
    /**
     * Creates new form LoginScreen
     */
    public OrganizationLoginScreen(JPanel mainWorkArea, Hospital hospital) {
        initComponents();
        
        setSize(1500, 1000);
        this.mainWorkArea = mainWorkArea;
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

        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnManufacturer2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUser.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("Username :");
        add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password :");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        txtUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 326, 45));

        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 326, 45));

        btnLogin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 142, 51));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome to Boston Children Hospital !");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel4.setText("Welcome to Boston Children Hospital !");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 65, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Manufacturer? Click here to login !");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 740, -1, -1));

        btnManufacturer2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnManufacturer2.setText("Login");
        btnManufacturer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufacturer2ActionPerformed(evt);
            }
        });
        add(btnManufacturer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 800, 142, 51));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org_background.jpeg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1510, 1010));
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        // Get user name
        String userName = txtUsername.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        boolean flag = false;

        UserAccount userAccount = null;
        for (Organization organization : hospital.getOrganizationDirectory().getOrganizationList()){
            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
            if (userAccount != null){
                
                JPanel mainScreen = new MainScreen(mainWorkArea, userAccount, organization, hospital);
                mainWorkArea.add("MainScreen", mainScreen);
                CardLayout layout = (CardLayout) mainWorkArea.getLayout();
                layout.next(mainWorkArea);
                
                flag = true;
                break;
            }
        }

        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Invalid User Name/ Password.");
            txtUsername.setText("");
            txtPassword.setText("");
            return;
        }
        
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnManufacturer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufacturer2ActionPerformed
        // TODO add your handling code here:
        EnterpriseLoginJPanel elj = new EnterpriseLoginJPanel(mainWorkArea, hospital, manufacturerDirectory);
        mainWorkArea.add("EnterpriseLoginJPanel", elj);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnManufacturer2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnManufacturer;
    private javax.swing.JButton btnManufacturer1;
    private javax.swing.JButton btnManufacturer2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
