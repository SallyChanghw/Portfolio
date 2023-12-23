/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Uni.Student.StudentHistory;
import Uni.Student.Student;
import Uni.Professor.Professor;
import Uni.Professor.ProfessorHistory;
import Uni.Uni;

/**
 *
 * @author sally
 */
public class StudentSignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentSignJPanel
     */
    private JPanel workArea;
    private Uni uni;
//    private studentHistory studentHistory;
//    private professorHistory professorHistory;
    
    StudentSignJPanel(JPanel workArea, Uni uni) {
        initComponents();
        this.workArea=workArea;
        this.uni=uni;
//        this.studentHistory= studentHistory;
//        this.professorHistory= professorHistory;
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
        btnSave = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        paPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(205, 237, 253));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 30)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SIGN UP - STUDENT");

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setText("Name :");

        lblUserID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblUserID.setText("User ID :");

        btnSave.setBackground(new java.awt.Color(237, 163, 90));
        btnSave.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPassword.setText("Password :");

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
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName)
                                    .addComponent(lblUserID))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(lblPassword)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(paPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 176, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnBack)
                .addGap(50, 50, 50)
                .addComponent(lblTitle)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPassword)
                        .addComponent(paPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUserID)
                        .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name=txtName.getText();
        String userid=txtUserID.getText();
        String password=paPassword.getText();
        
        Student s=uni.getStudentHistory().findStudent(userid);
        Professor p=uni.getProfessorHistory().findProfessor(userid);
        
        //        if complete information
        if(name.isEmpty() || userid.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "The information isn't completed! Please check!");     
        }
        else{            
            boolean useridExists=false;
            if(s!=null){
                useridExists=true;
            }
            else if(p!=null){
                useridExists=true;
            }

            // User ID validation
            for (Student existingUserid : uni.studentHistory.getStudentHistory()) {
                if (userid.equals(existingUserid.getStudentUserID())) {
                    useridExists = true;
                    break;
                }
            }

            // Password validation
            boolean isValidPassword = password.length() >= 8 &&
                    password.matches(".*[a-z].*") &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*\\d.*");

            if (useridExists==true && !isValidPassword){
                JOptionPane.showMessageDialog(null, "UserID already exists! \nPassword must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.");
                txtUserID.setText("");
                paPassword.setText("");
            }
            else if(useridExists==true){
                JOptionPane.showMessageDialog(null, "UserID already exists!");
                txtUserID.setText("");
            }
            else if (!isValidPassword) {
                JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.");
                paPassword.setText("");
            }
            else {
                Student student=uni.getStudentHistory().newStudent(userid);
                student.setStudentName(name);
                student.setStudentUserID(userid);
                student.setStudentPassword(password);
                JOptionPane.showMessageDialog(null, "User information successfully created!");
                
                txtName.setText("");
                txtUserID.setText("");
                paPassword.setText("");
            }

            
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JPasswordField paPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}