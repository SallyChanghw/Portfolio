/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ParentRole;

import Hospital.Appointment.AppointmentSchedule;
import Hospital.Children.Children;
import Hospital.Hospital;
import Hospital.Organization.PatientOrganization;
import Hospital.Parent.Parent;
import Hospital.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author josie
 */
public class MakeAppointmentJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private PatientOrganization organization;
    private Hospital hospital;
    private UserAccount userAccount;
    private Parent parent;
    private String selectedChildrenName;
    private String selectedDoctor;
    private String selectedDepartment;
    private String selectedDate;
    /**
     * Creates new form MakeAppointmentJPanel
     */
    public MakeAppointmentJPanel(JPanel workArea, UserAccount account, PatientOrganization organization, Hospital hospital) {
        initComponents();
        this.workArea = workArea;
        this.organization = organization;
        this.hospital = hospital;
        this.userAccount = account;
        parent=userAccount.getParent();
        populateChildrenComboBox();
        
    }

    public void populateChildrenComboBox() {
         
         cboxChildren.removeAllItems();
         
         for (Children children : parent.getChildrenList()){
             cboxChildren.addItem(children.getName());
         }                  
     }
    
    public void populateDepartmentComboBox() {
        cboxDepartment.removeAllItems();
        int j=0;        
        for (AppointmentSchedule schedule : hospital.getAppointmentHistory().getAppScheduleList()) {
            String status = schedule.getStatus();
            String department = schedule.getDepartment();
            
            if (status.equals("Verified") && schedule.getAvailability()>0 ){
                if (j==0)  cboxDepartment.addItem(department);
                j++;
                boolean duplicateFlag=false;
                for (int i=0 ; i<cboxDepartment.getItemCount(); i++) {
                    if (cboxDepartment.getItemAt(i).equals(department)) {
                        duplicateFlag=true;
                        break;
                    }
                } 
                if (duplicateFlag==false) {
                    cboxDepartment.addItem(department);
                }
            }            
        }
    }
    
    public void populateDoctorComboBox() {
        cboxDoctor.removeAllItems();
        int j=0;        
        for (AppointmentSchedule schedule : hospital.getAppointmentHistory().getAppScheduleList()) {
            String status = schedule.getStatus();
            String department = schedule.getDepartment();
            String doctor = schedule.getDoctorID();
            
            if (status.equals("Verified")  && schedule.getAvailability()>0 && selectedDepartment.equals(department)){
                if (j==0)  cboxDoctor.addItem(doctor);
                j++;
                boolean duplicateFlag=false;
                for (int i=0 ; i<cboxDoctor.getItemCount(); i++) {
                    if (cboxDoctor.getItemAt(i).equals(doctor)) {
                        duplicateFlag=true;
                        break;
                    }
                } 
                if (duplicateFlag==false) {
                    cboxDoctor.addItem(doctor);
                }
            }
            
        }
    }
    public void populateDayComboBox() {
        cboxDate.removeAllItems();
        int j=0;        
        for (AppointmentSchedule schedule : hospital.getAppointmentHistory().getAppScheduleList()) {
            String status = schedule.getStatus();
            String department = schedule.getDepartment();
            String doctor = schedule.getDoctorID();
            String scheduleDate = schedule.getScheduleDate();
            
            if (status.equals("Verified")  && schedule.getAvailability()>0 && selectedDepartment.equals(department) && selectedDoctor.equals(doctor)){
                if (j==0)  cboxDate.addItem(scheduleDate);
                j++;
                boolean duplicateFlag=false;
                for (int i=0 ; i<cboxDate.getItemCount(); i++) {
                    if (cboxDate.getItemAt(i).equals(scheduleDate)) {
                        duplicateFlag=true;
                        break;
                    }
                } 
                if (duplicateFlag==false) {
                    cboxDate.addItem(scheduleDate);
                }
            }
            
        }
    }
    public void populateTimeSlotComboBox() {
        cboxTimeSlot.removeAllItems();
        int j=0;        
        for (AppointmentSchedule schedule : hospital.getAppointmentHistory().getAppScheduleList()) {
            String status = schedule.getStatus();
            String department = schedule.getDepartment();
            String doctor = schedule.getDoctorID();
            String scheduleDay = schedule.getScheduleDate();
            String timeSlot = schedule.getTimeSlot();
            
            if (status.equals("Verified")  && schedule.getAvailability()>0 && selectedDepartment.equals(department) && selectedDoctor.equals(doctor)
                    && selectedDate.equals(scheduleDay)){
                if (j==0)  cboxTimeSlot.addItem(timeSlot);
                j++;
                boolean duplicateFlag=false;
                for (int i=0 ; i<cboxTimeSlot.getItemCount(); i++) {
                    if (cboxTimeSlot.getItemAt(i).equals(timeSlot)) {
                        duplicateFlag=true;
                        break;
                    }
                } 
                if (duplicateFlag==false) {
                    cboxTimeSlot.addItem(timeSlot);
                }
            }
            
        }
    }
    public AppointmentSchedule findAppSchedule(String selDoctorID,String selDepartment,String selDate,String selTimeSlot) {
        for (AppointmentSchedule schedule : hospital.getAppointmentHistory().getAppScheduleList()) {
            String status = schedule.getStatus();
            String department = schedule.getDepartment();
            String doctor = schedule.getDoctorID();
            String scheduleDay = schedule.getScheduleDate();
            String timeSlot = schedule.getTimeSlot();
            
            if (status.equals("Verified") && selDepartment.equals(department) && selDoctorID.equals(doctor)
                    && selDate.equals(scheduleDay) && selTimeSlot.equals(timeSlot)){
                    return schedule;              
            }            
        }
        return null;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboxDate = new javax.swing.JComboBox<>();
        cboxDoctor = new javax.swing.JComboBox<>();
        cboxDepartment = new javax.swing.JComboBox<>();
        cboxChildren = new javax.swing.JComboBox<>();
        txtSsnID = new javax.swing.JTextField();
        cboxTimeSlot = new javax.swing.JComboBox<>();
        btnBack8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnConfirmAppointment = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxDate.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        cboxDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDateActionPerformed(evt);
            }
        });
        add(cboxDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 149, 34));

        cboxDoctor.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        cboxDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDoctorActionPerformed(evt);
            }
        });
        add(cboxDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 149, 34));

        cboxDepartment.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        cboxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxDepartmentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cboxDepartmentMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cboxDepartmentMousePressed(evt);
            }
        });
        cboxDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDepartmentActionPerformed(evt);
            }
        });
        add(cboxDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 149, 34));

        cboxChildren.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        cboxChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxChildrenActionPerformed(evt);
            }
        });
        add(cboxChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 149, 34));

        txtSsnID.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        txtSsnID.setText("Role ID");
        txtSsnID.setEnabled(false);
        txtSsnID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsnIDActionPerformed(evt);
            }
        });
        add(txtSsnID, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 149, 34));

        cboxTimeSlot.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        cboxTimeSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboxTimeSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 149, 34));

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

        btnConfirmAppointment.setBackground(new java.awt.Color(0, 204, 102));
        btnConfirmAppointment.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnConfirmAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmAppointment.setText("Confirm Appointment");
        btnConfirmAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAppointmentActionPerformed(evt);
            }
        });

        jLabel8.setText("Role ID");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Make an Appointment");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Department :");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Time Slot :");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Date :");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Doctor ID :");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Children :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConfirmAppointment)
                                .addGap(187, 187, 187))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(178, 178, 178))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel8)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)))
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(54, 54, 54)
                .addComponent(btnConfirmAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 600, 560));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppointmentReminderSamples_1020.jpeg"))); // NOI18N
        jLabel7.setToolTipText("");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1500, 1140));
    }// </editor-fold>//GEN-END:initComponents

    private void cboxDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDateActionPerformed
        // TODO add your handling code here:
        if (cboxDate.getSelectedItem() != null) {
            selectedDate=cboxDate.getSelectedItem().toString();
            populateTimeSlotComboBox();       
        }
    }//GEN-LAST:event_cboxDateActionPerformed

    private void cboxDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDoctorActionPerformed
        // TODO add your handling code here:
         if (cboxDoctor.getSelectedItem() != null) {
            selectedDoctor=cboxDoctor.getSelectedItem().toString();
            populateDayComboBox();       
        }
    }//GEN-LAST:event_cboxDoctorActionPerformed

    private void cboxDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxDepartmentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDepartmentMouseClicked

    private void cboxDepartmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxDepartmentMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDepartmentMouseEntered

    private void cboxDepartmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxDepartmentMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDepartmentMousePressed

    private void cboxDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDepartmentActionPerformed
        // TODO add your handling code here:
        if (cboxDepartment.getSelectedItem() != null) {
            selectedDepartment=cboxDepartment.getSelectedItem().toString();
            populateDoctorComboBox();       
        }
    }//GEN-LAST:event_cboxDepartmentActionPerformed

    private void cboxChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxChildrenActionPerformed
        // TODO add your handling code here:
        //String children=cboxChildren.getSelectedItem().toString();

        if (cboxChildren.getSelectedItem() != null) {
            selectedChildrenName=cboxChildren.getSelectedItem().toString();
            Children children=parent.getChildrenByName(selectedChildrenName);
            if (children != null){
                txtSsnID.setText(children.getSSNID());
            }
            populateDepartmentComboBox();       
        }
    }//GEN-LAST:event_cboxChildrenActionPerformed

    private void btnConfirmAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAppointmentActionPerformed
        // TODO add your handling code here:
        if(cboxTimeSlot.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "The Available number of Patients is empty! Please check!");
            
        }  
        else{
            
            String selectedTimeSlot=cboxTimeSlot.getSelectedItem().toString(); 
            String status="Pending";
            
            hospital.getAppointmentHistory().newAppointment(txtSsnID.getText(), selectedChildrenName,
                    selectedDoctor, selectedDepartment, selectedDate,selectedTimeSlot, status);
            
            AppointmentSchedule as = this.findAppSchedule(selectedDoctor, selectedDepartment, selectedDate, selectedTimeSlot);
            if (as != null) {
                int availQty = as.getAvailability();
                as.setAvailability(availQty-1);
            }
           JOptionPane.showMessageDialog(null,"Appointment information updated successfully!");            
        }

    }//GEN-LAST:event_btnConfirmAppointmentActionPerformed

    private void btnBack8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack8ActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBack8ActionPerformed

    private void txtSsnIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsnIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsnIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack8;
    private javax.swing.JButton btnConfirmAppointment;
    private javax.swing.JComboBox<String> cboxChildren;
    private javax.swing.JComboBox<String> cboxDate;
    private javax.swing.JComboBox<String> cboxDepartment;
    private javax.swing.JComboBox<String> cboxDoctor;
    private javax.swing.JComboBox<String> cboxTimeSlot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSsnID;
    // End of variables declaration//GEN-END:variables
}
