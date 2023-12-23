/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Uni.Course.Course;
import Uni.Professor.Professor;
import Uni.Uni;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sally
 */
public class ProfessorCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorCourseJPanel
     */
    private JPanel workArea;
    private Uni uni;
    private Professor professor;
//    private Professor professor;

    ProfessorCourseJPanel(JPanel workArea, Professor professor, Uni uni) {
        initComponents();
        this.workArea = workArea;
        this.uni = uni;
        this.professor = professor;
//        this.professor=professor;
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
        lblSemester = new javax.swing.JLabel();
        lblcourseName = new javax.swing.JLabel();
        txtcourseName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblDep = new javax.swing.JLabel();
        depBox = new javax.swing.JComboBox<>();
        semesterBox = new javax.swing.JComboBox<>();
        lblCredit = new javax.swing.JLabel();
        txtCredit = new javax.swing.JTextField();

        setBackground(new java.awt.Color(205, 237, 253));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("REGISTER COURSE");

        lblSemester.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSemester.setText("Semester :");

        lblcourseName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblcourseName.setText("Course Name :");

        btnSave.setBackground(new java.awt.Color(237, 163, 90));
        btnSave.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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

        lblDep.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDep.setText("Department :");

        depBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CS", "BA", "LAW" }));
        depBox.setSelectedIndex(-1);
        depBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depBoxActionPerformed(evt);
            }
        });

        semesterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023Spring", "2023Fall" }));
        semesterBox.setSelectedIndex(-1);

        lblCredit.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblCredit.setText("Credit :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCredit)
                                .addGap(18, 18, 18)
                                .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSemester, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDep, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblcourseName, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(semesterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(depBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtcourseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBack)
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semesterBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSemester))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDep)
                    .addComponent(depBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcourseName)
                    .addComponent(txtcourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCredit)
                    .addComponent(txtCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (semesterBox.getSelectedIndex() == -1 || txtcourseName.getText().isEmpty() || depBox.getSelectedIndex() == -1 || txtCredit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The information isn't completed! Please check!");
        }
        else{
                String semester = semesterBox.getSelectedItem().toString();
                String courseName = txtcourseName.getText();
                String department = depBox.getSelectedItem().toString();
                String professorUserID= professor.getProfessorUserID();

                String credit= txtCredit.getText();
                int credits=Integer.parseInt(credit);


                int courseCount=0;
                String courseid=depBox.getSelectedItem().toString()+ String.format("%04d", courseCount);


                Course c=uni.getCourseHistory().findCourseProfessor(courseid,professorUserID);

         
                boolean useridExists=false;
                if(c!=null){
                    useridExists=true;
                }



                if(useridExists==true){
                    JOptionPane.showMessageDialog(null, "You have already created this course!");
                }
                else {

    //                Course course=uni.getCourseHistory().newCourse(courseid);
    //                //one professor many course
    //                
    //                course.setCourseName(courseName);
    //                course.setSemester(semester);
    //                course.setDepartment(department);
    //                course.setCourseID(courseid);
                    Course course=uni.courseHistory.defaultCourse(department, semester, courseName, credits);
                    course.setProfessorUserID(professorUserID);

                    JOptionPane.showMessageDialog(null, "Course information successfully created!");
                }

                txtcourseName.setText("");
                semesterBox.setSelectedIndex(-1);
                depBox.setSelectedIndex(-1);
                txtCredit.setText("");

        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void depBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depBoxActionPerformed
        // TODO add your handling code here:
        // Create a map to keep track of the course count for each department.
//        Map<String, Integer> departmentCourseCount = new HashMap<>();
//
//        cboxDepartment.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String selectedDepartment = (String) cboxDepartment.getSelectedItem();
//                if (selectedDepartment != null) {
//                    // Get the current count of courses for the selected department.
//                    int courseCount = departmentCourseCount.getOrDefault(selectedDepartment, 0) + 1;
//                    departmentCourseCount.put(selectedDepartment, courseCount);
//
//                    // Generate a unique course ID based on the department and count.
//                    String defaultCourseId = selectedDepartment + String.format("%04d", courseCount);
//
//                    // Set the default course ID in the JTextField.
////                    courseIdTextField.setText(defaultCourseId);
//                }
//            }
//        });
    }//GEN-LAST:event_depBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> depBox;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblDep;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblcourseName;
    private javax.swing.JComboBox<String> semesterBox;
    private javax.swing.JTextField txtCredit;
    private javax.swing.JTextField txtcourseName;
    // End of variables declaration//GEN-END:variables
}
