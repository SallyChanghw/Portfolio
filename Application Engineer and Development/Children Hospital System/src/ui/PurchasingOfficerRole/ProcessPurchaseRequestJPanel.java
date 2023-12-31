/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PurchasingOfficerRole;

import Hospital.Hospital;
import Hospital.UserAccount.UserAccount;
import Hospital.WorkQueue.PurchaseRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author josie
 */
public class ProcessPurchaseRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    PurchaseRequest request;
    /**
     * Creates new form ProcessPurchaseRequestJPanel
     */
    public ProcessPurchaseRequestJPanel(JPanel userProcessContainer, PurchaseRequest request) {
        initComponents();
        
        setSize(1500, 1000);
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        txtResults = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnBack8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        lblTitle.setText("Result Submission");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, -1, -1));

        lblResult.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        lblResult.setText("Result :");
        add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, -1, -1));
        add(txtResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 421, 117));

        btnSubmit.setBackground(new java.awt.Color(0, 204, 51));
        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit Result");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, -1, 41));

        btnBack8.setBackground(new java.awt.Color(0, 0, 0));
        btnBack8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack8.setForeground(new java.awt.Color(255, 255, 255));
        btnBack8.setText("< Back");
        btnBack8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack8ActionPerformed(evt);
            }
        });
        add(btnBack8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 37));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cute-emotive-woman-happy-achieve-goal-accomplish-good-result-clenches-fists-smiles-happily.jpeg"))); // NOI18N
        jLabel7.setToolTipText("");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1500, 1140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        request.setPurchaseResult(txtResults.getText());
        request.setStatus("Verified");
        JOptionPane.showMessageDialog(null, "Message processed");

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBack8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack8ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PurchaseRequestJPanel prjp = (PurchaseRequestJPanel) component;
//        prjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack8;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtResults;
    // End of variables declaration//GEN-END:variables
}
