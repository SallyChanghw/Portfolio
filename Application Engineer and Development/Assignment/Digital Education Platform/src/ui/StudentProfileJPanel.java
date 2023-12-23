/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Uni.Course.CourseHistory;
import Uni.Student.Student;
import Uni.Student.StudentHistory;
import Uni.Uni;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author josie
 */
public class StudentProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentProfile
     */
 
    private JPanel workArea;
    private Student student;
    private Uni uni;
    
    StudentProfileJPanel(JPanel workArea, Student student, Uni uni) {
        initComponents();
        this.workArea=workArea;
        this.student=student;
        this.uni=uni;
        
        displayStudent();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }
    
    private void displayStudent() {
    if (student != null) {
        txtName.setText(student.getStudentName());
        txtUserID.setText(student.getStudentUserID());
        txtStudentID.setText(student.getStudentID());
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

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUserID = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        lblSutdentID = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(205, 237, 253));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("MY PROFILE");

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setText("Name :");

        txtName.setEnabled(false);

        lblUserID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblUserID.setText("User ID :");

        txtUserID.setEnabled(false);

        lblSutdentID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblSutdentID.setText("Student ID :");

        txtStudentID.setEnabled(false);

        btnBack.setBackground(new java.awt.Color(237, 163, 90));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(237, 163, 90));
        btnSave.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(237, 163, 90));
        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPassword.setText("Password :");

        txtPassword.setText("jPasswordField1");
        txtPassword.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUserID)
                                .addGap(18, 18, 18)
                                .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSutdentID)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtName, txtStudentID, txtUserID});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnBack)
                .addGap(40, 40, 40)
                .addComponent(lblTitle)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSutdentID)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserID)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout=(CardLayout)workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEnabled(false);
        txtStudentID.setEnabled(false);
        txtUserID.setEnabled(true);
        txtPassword.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if(txtName.getText().isEmpty() || txtUserID.getText().isEmpty() || txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "The information isn't completed! Please check!");
            txtUserID.setEnabled(false);
            txtPassword.setEnabled(false);

            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
        }
        
        else{
             
            // User ID validation
            String userID=txtUserID.getText();
            boolean useridExists = false;
            for (Student existingUserid : uni.studentHistory.getStudentHistory()) {
                if (userID.equals(existingUserid.getStudentUserID()) && !userID.equals(student.getStudentUserID())) {
                    useridExists = true;
                    break;
                }
            }

            // Password validation
            String password=txtPassword.getText();
            boolean isValidPassword = password.length() >= 8 &&
                    password.matches(".*[a-z].*") &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*\\d.*");
            
            if (useridExists==true && !isValidPassword){
                JOptionPane.showMessageDialog(null, "UserID already exists! \nPassword must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.");
                txtUserID.setText("");
                txtPassword.setText("");
            }
            else if(useridExists==true){
                JOptionPane.showMessageDialog(null, "UserID already exists!");
                txtUserID.setText("");
            }
            else if (!isValidPassword) {
                JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.");
                txtPassword.setText("");
            } 
            else {
                String newPassword = txtPassword.getText();

                if (!newPassword.equals(student.getStudentPassword())) {
                    student.setStudentPassword(newPassword);
                } else {
                    student.setStudentPassword(student.encrypt(txtPassword.getText(), "a"));
                }

                student.setStudentName(txtName.getText());
                student.setStudentUserID(txtUserID.getText());
                
                btnSave.setEnabled(false);
                btnUpdate.setEnabled(true);
                JOptionPane.showMessageDialog(null,"User Information updated successfully!");

                txtName.setEnabled(false);
                txtUserID.setEnabled(false);
                txtPassword.setEnabled(false);
            }
            
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSutdentID;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}