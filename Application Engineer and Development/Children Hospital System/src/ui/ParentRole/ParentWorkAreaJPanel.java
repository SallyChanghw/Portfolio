/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ParentRole;

import Hospital.Hospital;
import Hospital.Organization.PatientOrganization;
import Hospital.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import ui.DoctorRole.DInventoryJPanel;

/**
 *
 * @author josie
 */
public class ParentWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private PatientOrganization organization;
    private Hospital hospital;
    private UserAccount userAccount;
    /**
     * Creates new form ParentWorkAreaJPanel
     */

    public ParentWorkAreaJPanel(JPanel workArea, UserAccount account, PatientOrganization organization, Hospital hospital) {
        initComponents();
        
        setSize(1500, 1000);
        this.workArea = workArea;
        this.organization = organization;
        this.hospital = hospital;
        this.userAccount = account;
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
        btnProfile = new javax.swing.JButton();
        btnMakeAppointment = new javax.swing.JButton();
        btnChildren = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setText("Parent Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        btnProfile.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnProfile.setText("Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 319, 43));

        btnMakeAppointment.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnMakeAppointment.setText("Make an appointment for children");
        btnMakeAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeAppointmentActionPerformed(evt);
            }
        });
        add(btnMakeAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, 43));

        btnChildren.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnChildren.setText("Children History & Give Feedback");
        btnChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChildrenActionPerformed(evt);
            }
        });
        add(btnChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 319, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Suzie158.jpeg"))); // NOI18N
        jLabel2.setToolTipText("");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1500, 1000));
    }// </editor-fold>//GEN-END:initComponents

    private void btnChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChildrenActionPerformed
        // TODO add your handling code here:
        ChildrenJPanel cjp = new ChildrenJPanel(workArea,userAccount,organization,hospital);
        workArea.add("ChildrenJPanel",cjp);
        CardLayout layout=(CardLayout) workArea.getLayout();
        layout.next(workArea);           
    }//GEN-LAST:event_btnChildrenActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        // TODO add your handling code here:
        ParentProfileJPanel pjp = new ParentProfileJPanel(workArea,userAccount,organization,hospital);
        workArea.add("ProfileJPanel",pjp);
        CardLayout layout=(CardLayout) workArea.getLayout();
        layout.next(workArea); 
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnMakeAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeAppointmentActionPerformed
        // TODO add your handling code here:
        MakeAppointmentJPanel majp = new MakeAppointmentJPanel(workArea,userAccount,organization,hospital);
        workArea.add("MakeAppointmentJPanel",majp);
        CardLayout layout=(CardLayout) workArea.getLayout();
        layout.next(workArea); 
    }//GEN-LAST:event_btnMakeAppointmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChildren;
    private javax.swing.JButton btnMakeAppointment;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}