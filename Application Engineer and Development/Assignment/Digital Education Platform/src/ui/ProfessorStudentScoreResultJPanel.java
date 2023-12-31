/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Uni.Course.Course;
import Uni.Course.CourseHistory;
import Uni.Professor.Professor;
import Uni.Student.Student;
import Uni.Student.StudentHistory;
import Uni.Uni;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josie
 */
public class ProfessorStudentScoreResultJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorStudentScoreResultJPanel
     */
    private JPanel workArea;
    private Professor professor;
    private Uni uni;
    private String studentId;

    ProfessorStudentScoreResultJPanel(JPanel workArea,Professor professor,Uni uni, String studentId) {
        initComponents();
        this.workArea=workArea;
        this.uni=uni;
        this.professor=professor;
        this.studentId=studentId;
        this.queryStudentRanking( professor.getProfessorUserID(), studentId );
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentRanking = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(205, 237, 253));

        lblRanking.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        lblRanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRanking.setText("STUDENT SCORE");

        tblStudentRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SEMESTER", "COURSE ID", "COURSE NAME", "SCORE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStudentRanking);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBack)
                        .addGap(0, 741, Short.MAX_VALUE))
                    .addComponent(lblRanking, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(lblRanking)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here: 
        workArea.remove(this);
        CardLayout layout=(CardLayout)workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void queryStudentRanking(String professorUserID,String studentID){
    
    StudentHistory studentHistory = uni.getStudentHistory(); 
    Student student= studentHistory.findStudent(studentID);
    if (student != null) { 
        ArrayList<Course> registerCourses=student.getRegisterCourses();
        String courseID,pfUserID;
        String courseName,semester;
        Integer grade;

        CourseHistory courseHistory = uni.getCourseHistory();    

        DefaultTableModel model = (DefaultTableModel) tblStudentRanking.getModel();
        model.setRowCount(0);

        for(Course c : registerCourses){
            courseID= c.getCourseID();         

            courseName=courseHistory.findCourse(courseID).getCourseName();
            grade=c.getCourseScore();            
            semester=courseHistory.findCourse(courseID).getSemester();
            pfUserID=courseHistory.findCourse(courseID).getProfessorUserID();
            if (pfUserID.equals(professorUserID)){
                Object[] row = new Object[4];
                row[0] = semester;
                row[1] = courseID;
                row[2] = courseName;
                row[3] = grade;
                model.addRow(row);
            }
        }  
    }
       
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRanking;
    private javax.swing.JTable tblStudentRanking;
    // End of variables declaration//GEN-END:variables
}
