/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PurchasingOfficerRole;

import Hospital.Hospital;
import Hospital.Organization.StaffOrganization;
import Hospital.UserAccount.UserAccount;
import Hospital.WorkQueue.PurchaseRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author josie
 */
public class PurchasingOfficerWorkAreaJPanel extends javax.swing.JPanel {

   JPanel userProcessContainer;
   UserAccount account;
   StaffOrganization purchasingOfficerOrganization;
   Hospital hospital;
   
    /**
     * Creates new form PurchasingOfficerWorkAreaJPanel
     */

    public PurchasingOfficerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, StaffOrganization purchasingOfficerOrganization, Hospital hospital) {
        initComponents();
        
        setSize(1500, 1000);
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.purchasingOfficerOrganization = purchasingOfficerOrganization;
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
        btnPurchaseRequest = new javax.swing.JButton();
        btnPurchaseHistory = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Purchasing Officer Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        btnPurchaseRequest.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnPurchaseRequest.setText("Purchase Request");
        btnPurchaseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseRequestActionPerformed(evt);
            }
        });
        add(btnPurchaseRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 241, 46));

        btnPurchaseHistory.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnPurchaseHistory.setText("Purchase History");
        btnPurchaseHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseHistoryActionPerformed(evt);
            }
        });
        add(btnPurchaseHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 241, 46));

        btnProfile.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 241, 46));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FP-BIC-Supervise-e1475817574744.jpeg"))); // NOI18N
        jLabel7.setToolTipText("");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1500, 1140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseRequestActionPerformed
        // TODO add your handling code here:
        PurchaseRequestJPanel prj = new PurchaseRequestJPanel(userProcessContainer, hospital, purchasingOfficerOrganization, account);
        userProcessContainer.add("PurchaseRequestJPanel", prj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPurchaseRequestActionPerformed

    private void btnPurchaseHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseHistoryActionPerformed
        // TODO add your handling code here:
        PurchaseHistoryJPanel phj = new PurchaseHistoryJPanel(userProcessContainer, hospital);
        userProcessContainer.add("PurchaseHistoryJPanel", phj);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPurchaseHistoryActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        PurchasingOfficerProfileJPanel popj = new PurchasingOfficerProfileJPanel(userProcessContainer,account,purchasingOfficerOrganization,hospital);
        userProcessContainer.add("PurchasingOfficerProfileJPanel",popj);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnPurchaseHistory;
    private javax.swing.JButton btnPurchaseRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
