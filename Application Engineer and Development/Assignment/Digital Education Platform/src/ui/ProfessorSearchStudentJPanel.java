/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Uni.Student.Student;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Uni.Student.StudentHistory;
import Uni.Uni;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josie
 */
public class ProfessorSearchStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorSearchStudentJPanel
     */
    private JPanel workArea;
    private Uni uni;
    
    ProfessorSearchStudentJPanel(JPanel workArea, Uni uni) {
        initComponents();
        this.workArea=workArea;
        this.uni=uni;
        populateStudentTable();
    }
    
    private void populateStudentTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblStudent.getModel();
        dtm.setRowCount(0);
        for(Student student: uni.studentHistory.getStudentHistory()){
            Object[] row = new Object[2];
            row[0] = student;
            row[1] = student.getStudentID();
            
            dtm.addRow(row);
        }
    }
    
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack1 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        lblSearchStudentByName = new javax.swing.JLabel();
        txtSearchStudentByName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSearchStudentByName = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSearchStudent = new javax.swing.JTable();

        btnBack1.setText("BACK");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(205, 237, 253));

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STUDENT NAME", "STUDENT ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudent);
        if (tblStudent.getColumnModel().getColumnCount() > 0) {
            tblStudent.getColumnModel().getColumn(0).setResizable(false);
            tblStudent.getColumnModel().getColumn(1).setResizable(false);
        }

        lblSearchStudentByName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSearchStudentByName.setText("Search student by name :");

        txtSearchStudentByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStudentByNameActionPerformed(evt);
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

        btnSearchStudentByName.setBackground(new java.awt.Color(237, 163, 90));
        btnSearchStudentByName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSearchStudentByName.setText("SEARCH");
        btnSearchStudentByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStudentByNameActionPerformed(evt);
            }
        });

        tblSearchStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STUDENT NAME", "STUDENT ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblSearchStudent);
        if (tblSearchStudent.getColumnModel().getColumnCount() > 0) {
            tblSearchStudent.getColumnModel().getColumn(0).setResizable(false);
            tblSearchStudent.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lblSearchStudentByName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearchStudentByName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchStudentByName)))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchStudentByName)
                    .addComponent(txtSearchStudentByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchStudentByName))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchStudentByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchStudentByNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchStudentByNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnSearchStudentByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentByNameActionPerformed
        // TODO add your handling code here:
        
        String studentName = txtSearchStudentByName.getText();
        if (studentName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Don't leave the student name blank.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            
        StudentHistory studentHistory = uni.getStudentHistory(); 
        Student s = studentHistory.findStudentName(txtSearchStudentByName.getText());

        if(s == null){
            JOptionPane.showMessageDialog(null, "Student name you entered does not exist.","Warning",JOptionPane.WARNING_MESSAGE);
            txtSearchStudentByName.setText("");
        }else{

            // Perform the search
            DefaultTableModel dtm = (DefaultTableModel) tblStudent.getModel();
            DefaultTableModel dtmSearch = (DefaultTableModel) tblSearchStudent.getModel();

            // Clear the tblSearchStudent table before adding search results
            dtmSearch.setRowCount(0);

            for (int row = 0; row < dtm.getRowCount(); row++) {
                Student student = (Student) dtm.getValueAt(row, 0);
                if (student.getStudentName().equalsIgnoreCase(txtSearchStudentByName.getText())) {
                    // Add the matching student to tblSearchStudent
                    Object[] rowData = {student.getStudentName(), student.getStudentID()};
                    dtmSearch.addRow(rowData);
                }
            }
        }
    }
    }//GEN-LAST:event_btnSearchStudentByNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnSearchStudentByName;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSearchStudentByName;
    private javax.swing.JTable tblSearchStudent;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtSearchStudentByName;
    // End of variables declaration//GEN-END:variables
}