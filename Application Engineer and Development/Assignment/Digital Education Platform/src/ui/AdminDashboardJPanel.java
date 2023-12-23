/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Uni.Professor.Professor;
import Uni.Student.Student;
import Uni.Uni;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author josie
 */
public class AdminDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DashBoardJPanel
     */
    JPanel workArea;
    Uni uni;
    Student student;
    Professor professor;

    AdminDashboardJPanel(JPanel workArea, Professor professor, Student student, Uni uni) {
        initComponents();
        this.workArea=workArea;
        this.professor=professor;
        this.student=student;
        this.uni=uni;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        btnViewStudent = new javax.swing.JButton();
        btnViewProfessor = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnLogOut1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(205, 237, 253));

        btnViewStudent.setBackground(new java.awt.Color(237, 163, 90));
        btnViewStudent.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnViewStudent.setText("VIEW STUDENT");
        btnViewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudentActionPerformed(evt);
            }
        });

        btnViewProfessor.setBackground(new java.awt.Color(237, 163, 90));
        btnViewProfessor.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnViewProfessor.setText("VIEW PROFESSOR");
        btnViewProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfessorActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        lblTitle.setText("ADMIN");

        btnLogOut1.setBackground(new java.awt.Color(153, 204, 255));
        btnLogOut1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnLogOut1.setText("LOG OUT");
        btnLogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOut1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(btnViewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addContainerGap(602, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut1)
                .addGap(83, 83, 83))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnViewProfessor, btnViewStudent});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblTitle)
                .addGap(56, 56, 56)
                .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnViewProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(btnLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnViewProfessor, btnViewStudent});

    }// </editor-fold>//GEN-END:initComponents

    private void btnViewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudentActionPerformed
        // TODO add your handling code here:
        AdminViewStudentJPanel panel= new AdminViewStudentJPanel(workArea, student, uni);
        workArea.add("ViewStudentJPanel",panel);
        CardLayout layout=(CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewStudentActionPerformed

    private void btnViewProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfessorActionPerformed
        // TODO add your handling code here:
        AdminViewProfessorJPanel panel= new AdminViewProfessorJPanel(workArea, professor, uni);
        workArea.add("ViewProfessorJPanel",panel);
        CardLayout layout=(CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewProfessorActionPerformed

    private void btnLogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOut1ActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure about logging out of the system?", "Log Out Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION){

            // Remove all panels from the workArea
            workArea.removeAll();
            // Repaint the workArea
            workArea.revalidate();
            workArea.repaint();
        }

    }//GEN-LAST:event_btnLogOut1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLogOut1;
    private javax.swing.JButton btnViewProfessor;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
