/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Uni.Student.Student;
import Uni.Uni;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josie
 */
public class AdminViewStudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminViewStudentJPanel
     */
     
    private JPanel workArea;
    private Student student;
    private Uni uni;
    
    AdminViewStudentJPanel(JPanel workArea, Student student, Uni uni) {
        initComponents();
        this.workArea=workArea;
        this.student=student;
        this.uni=uni;
        
        viewStudentTable();
    }
    
    private void viewStudentTable(){
        
    DefaultTableModel dtm = (DefaultTableModel) tblViewStudent.getModel();
    dtm.setRowCount(0);
    
    // Iterate through your list of students and add each student's information to the table
    for (Student student : uni.studentHistory.getStudentHistory()) { // Replace 'yourListOfStudents' with the actual list of students
        int numberOfObtainedCourses = student.getNumberOfCoursesObtained();
        int coursesLeftToGraduate = 8 - numberOfObtainedCourses;
        String graduateStatus = coursesLeftToGraduate <= 0 ? "Qualified" : "Not Qualified";
        
        Object[] rowData = {
            student.getStudentID(),
            student.getStudentName(),
            numberOfObtainedCourses,
            coursesLeftToGraduate,
            graduateStatus
        };
        
        dtm.addRow(rowData);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewStudent = new javax.swing.JTable();
        lblViewStudent = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(205, 237, 253));

        tblViewStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "OBTAINED COURSES", "COURSES LEFT TO GRADUATE", "GRADUTE STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewStudent);

        lblViewStudent.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        lblViewStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewStudent.setText("VIEW STUDENT");

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
            .addComponent(lblViewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(lblViewStudent)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblViewStudent;
    private javax.swing.JTable tblViewStudent;
    // End of variables declaration//GEN-END:variables
}