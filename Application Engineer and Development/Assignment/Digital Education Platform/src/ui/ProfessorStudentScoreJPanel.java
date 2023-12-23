/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Uni.Professor.Professor;
import Uni.Student.Student;
import Uni.Student.StudentHistory;
import Uni.Uni;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author josie
 */
public class ProfessorStudentScoreJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentRanking
     */
    private JPanel workArea;
    private Professor professor;
    private Uni uni;

    ProfessorStudentScoreJPanel(JPanel workArea, Professor professor,Uni uni) {
        initComponents();
        this.workArea=workArea;
        this.uni=uni;
        this.professor=professor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRanking = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtStudentID = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(205, 237, 253));

        lblRanking.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        lblRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRanking.setText("SEARCH STUDENT ");

        lblStudentID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblStudentID.setText("Student ID :");

        btnSearch.setBackground(new java.awt.Color(237, 163, 90));
        btnSearch.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(237, 163, 90));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRanking, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(btnBack))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(252, 252, 252)
                            .addComponent(lblStudentID)
                            .addGap(18, 18, 18)
                            .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(lblRanking)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentID)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        String studentId = txtStudentID.getText();
        if (studentId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Don't leave the Student ID blank", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            StudentHistory studentHistory = uni.getStudentHistory(); 
            Student s = studentHistory.findStudent(txtStudentID.getText());
            if(s == null){
                JOptionPane.showMessageDialog(null, "Student ID you entered does not exist","Warning",JOptionPane.WARNING_MESSAGE);
                txtStudentID.setText("");
            }else{

            ProfessorStudentScoreResultJPanel panel = new ProfessorStudentScoreResultJPanel(workArea,professor,uni,studentId);
            workArea.add("RankingStudentResultJPanel",panel);
            CardLayout layout=(CardLayout) workArea.getLayout();
            layout.next(workArea);
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblRanking;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
