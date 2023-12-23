/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Address;
import model.Doctor;
import model.Driver;
import model.Insurance;
import model.Patient;
import model.Person;
import model.Vehicle;

/**
 *
 * @author sally
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Person person;
    Address address;
    Driver driver;
    Vehicle vehicle;
    Patient patient;
    Insurance insurance;
    Doctor doctor;
    
    public MainJFrame() {
        initComponents();
        
        person=new Person();
        address=new Address();
        driver=new Driver();
        vehicle=new Vehicle();
        patient=new Patient();
        insurance=new Insurance();
        doctor=new Doctor();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnPerson = new javax.swing.JButton();
        btnAddress = new javax.swing.JButton();
        btnDriver = new javax.swing.JButton();
        btnVehicle = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnInsurance = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle1 = new javax.swing.JLabel();
        lblSubtitle2 = new javax.swing.JLabel();
        lblSubtitle3 = new javax.swing.JLabel();
        Pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(102, 204, 255));

        btnPerson.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPerson.setText("Person");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });

        btnAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAddress.setText("Address");
        btnAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddressActionPerformed(evt);
            }
        });

        btnDriver.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDriver.setText("Driver");
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });

        btnVehicle.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnVehicle.setText("Vehicle");
        btnVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleActionPerformed(evt);
            }
        });

        btnPatient.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnDoctor.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnInsurance.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnInsurance.setText("Insurance");
        btnInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsuranceActionPerformed(evt);
            }
        });

        btnReport.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDriver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsurance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnPerson)
                .addGap(28, 28, 28)
                .addComponent(btnAddress)
                .addGap(27, 27, 27)
                .addComponent(btnDriver)
                .addGap(30, 30, 30)
                .addComponent(btnVehicle)
                .addGap(30, 30, 30)
                .addComponent(btnPatient)
                .addGap(30, 30, 30)
                .addComponent(btnDoctor)
                .addGap(31, 31, 31)
                .addComponent(btnInsurance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        splitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblTitle.setText("Patient Report");

        lblSubtitle1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblSubtitle1.setText("Please click the button on the left side to fill in the information");

        lblSubtitle2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblSubtitle2.setText("After completing all the forms, click the \"Report\" button to produce your report");

        lblSubtitle3.setForeground(new java.awt.Color(255, 0, 0));
        lblSubtitle3.setText("*If you haven't filled all the text fields, you can not see the complete report in the Netbeans output window");

        Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/medical.png"))); // NOI18N

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                        .addGroup(workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(workAreaLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(lblTitle))
                            .addGroup(workAreaLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(lblSubtitle1))
                            .addGroup(workAreaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblSubtitle3))
                            .addComponent(lblSubtitle2))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workAreaLayout.createSequentialGroup()
                        .addComponent(Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(279, 279, 279))))
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workAreaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitle)
                .addGap(31, 31, 31)
                .addComponent(lblSubtitle1)
                .addGap(18, 18, 18)
                .addComponent(lblSubtitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitle3)
                .addGap(123, 123, 123)
                .addComponent(Pic)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
        // TODO add your handling code here:
        PersonJPanel createPerson=new PersonJPanel(person);
        splitPane.setRightComponent(createPerson);
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverActionPerformed
        // TODO add your handling code here:
        DriverJPanel createDriver=new DriverJPanel(driver);
        splitPane.setRightComponent(createDriver);
    }//GEN-LAST:event_btnDriverActionPerformed

    private void btnAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddressActionPerformed
        // TODO add your handling code here:
        AddressJPanel createAddress=new AddressJPanel(address);
        splitPane.setRightComponent(createAddress);
    }//GEN-LAST:event_btnAddressActionPerformed

    private void btnVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleActionPerformed
        // TODO add your handling code here:
        VehicleJPanel createVehicle=new VehicleJPanel(vehicle);
        splitPane.setRightComponent(createVehicle);
    }//GEN-LAST:event_btnVehicleActionPerformed

    private void btnInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsuranceActionPerformed
        // TODO add your handling code here:
        InsuranceJPanel createInsurance=new InsuranceJPanel(insurance);
        splitPane.setRightComponent(createInsurance);
    }//GEN-LAST:event_btnInsuranceActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        PatientJPanel createPatient=new PatientJPanel(patient);
        splitPane.setRightComponent(createPatient);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        DoctorJPanel createDoctor=new DoctorJPanel(doctor);
        splitPane.setRightComponent(createDoctor);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        ReportJPanel createReport=new ReportJPanel(driver,vehicle,address,insurance,patient, doctor, person);
        splitPane.setRightComponent(createReport);
        
        if(person.getName()!=null && person.getSsn() !=null && person.getGender()!=null && person.getAge()!=null && person.getPhonenum()!=null && person.getEmail()!=null && person.getJob()!=null && person.getNationality()!=null && person.getMaritalStatus()!=null && person.getWebsite()!=null &&
           address.getLatitude()!=null && address.getLongitude()!=null && address.getCity()!=null && address.getCountry()!=null && address.getState() !=null &&
           driver.getDriverLicense() !=null &&
           vehicle.getModel()!=null && vehicle.getColor()!=null && vehicle.getSeries()!=null && vehicle.getYear()!=null &&
           patient.getPatientID()!=null && patient.getPrimaryDoc()!=null && patient.getAllergies()!=null && patient.getOnMedication()!=null && patient.getDateOfNextApp()!=null &&
           doctor.getDocName()!=null && doctor.getDocID()!=null && doctor.getOfficeAdd()!=null && doctor.getEducation()!=null && doctor.getSpecialty()!=null && doctor.getLicenseNum()!=null && doctor.getYearOfExp()!=null &&
           insurance.getCorporateID()!=null && insurance.getAddress()!=null && insurance.getPremium()!=null && insurance.getDeductable()!=null && insurance.getBenefit()!=null){  
            
            System.out.println("Person Information");
            System.out.println("Name:"+person.getName());
            System.out.println("SSN:"+person.getSsn());
            System.out.println("Gender:"+person.getGender());
            System.out.println("Age:"+person.getAge());
            System.out.println("Phone Number:"+person.getPhonenum());
            System.out.println("Email:"+person.getEmail());
            System.out.println("Job:"+person.getJob());
            System.out.println("Nationality:"+person.getNationality());
            System.out.println("Marital:"+person.getMaritalStatus());
            System.out.println("Website:"+person.getWebsite());
            System.out.println("\n");            
            
            System.out.println("Address Information");
            System.out.println("Latitude:"+address.getLatitude());
            System.out.println("Longitude:"+address.getLongitude());
            System.out.println("City:"+address.getCity());
            System.out.println("Country:"+address.getCountry());
            System.out.println("State:"+address.getState());
            System.out.println("\n");
        
            System.out.println("Driver Information");
            System.out.println("Driver License:"+driver.getDriverLicense());
            System.out.println("\n"); 
            
            System.out.println("Vehicle Registration Information");
            System.out.println("Model:"+vehicle.getModel());
            System.out.println("Color:"+vehicle.getColor());
            System.out.println("Series:"+vehicle.getSeries());
            System.out.println("Year:"+vehicle.getYear());
            System.out.println("\n");
        
            System.out.println("Patient Information");
            System.out.println("Patient ID:"+patient.getPatientID());
            System.out.println("Primary Doctor:"+patient.getPrimaryDoc());
            System.out.println("Allergies:"+patient.getAllergies());
            System.out.println("Medication:"+patient.getOnMedication());
            System.out.println("Date of Next Appointment:"+patient.getDateOfNextApp());
            System.out.println("\n");
     
            System.out.println("Doctor Information");
            System.out.println("Doctor Name:"+doctor.getDocName());
            System.out.println("Doctor ID:"+doctor.getDocID());
            System.out.println("Office Address:"+doctor.getOfficeAdd());
            System.out.println("Education:"+doctor.getEducation());
            System.out.println("Specialty:"+doctor.getSpecialty());
            System.out.println("License Number:"+doctor.getLicenseNum());
            System.out.println("Year of Experience:"+doctor.getYearOfExp());
            System.out.println("\n");

            System.out.println("Insurance Coverage Information");
            System.out.println("Corporate ID:"+insurance.getCorporateID());
            System.out.println("Address:"+insurance.getAddress());
            System.out.println("Premium:"+insurance.getPremium());
            System.out.println("Deductable:"+insurance.getDeductable());
            System.out.println("Benefits:"+insurance.getBenefit());
            System.out.println("\n");
            
            JOptionPane.showMessageDialog(this, "Congratulations!!! Your have finished the form!");
            
        }
        else{
            String hint="";
            if(person.getName()==null || person.getSsn() ==null || person.getGender()==null || person.getAge()==null || person.getPhonenum()==null || person.getEmail()==null || person.getJob()==null || person.getNationality()==null || person.getMaritalStatus()==null || person.getWebsite()==null){
                hint=hint+" PERSON ";
            }
            if(address.getLatitude()==null || address.getLongitude()==null || address.getCity()==null || address.getCountry()==null || address.getState() ==null){
                hint=hint+" ADDRESS ";
            }
            if(driver.getDriverLicense() ==null){
                hint=hint+" DRIVER ";                
            }
            if(vehicle.getModel()==null || vehicle.getColor()==null ||vehicle.getSeries()==null || vehicle.getYear()==null){
                hint=hint+" VEHICLE ";     
            }
            if(patient.getPatientID()==null || patient.getPrimaryDoc()==null || patient.getAllergies()==null || patient.getOnMedication()==null || patient.getDateOfNextApp()==null){
                hint=hint+" PATIENT ";
            }
            if(doctor.getDocName()==null ||doctor.getDocID()==null || doctor.getOfficeAdd()==null || doctor.getEducation()==null || doctor.getSpecialty()==null || doctor.getLicenseNum()==null || doctor.getYearOfExp()==null){
                hint=hint+" DOCTOR ";   
            }
            if(insurance.getCorporateID()==null || insurance.getAddress()==null || insurance.getPremium()==null || insurance.getDeductable()==null || insurance.getBenefit()==null){
                hint=hint+" INSURANCE ";
            }
            JOptionPane.showMessageDialog(this, "Your information isn't completed!"+"\n"+"Please check the"+hint+"form again!");
            System.out.println("You haven't completed the"+hint+"form!");
            System.out.println("\n");
            
        }
        
//        System.out.println("Person Information");
//        System.out.println("Name:"+person.getName());
//        System.out.println("SSN:"+person.getSsn());
//        System.out.println("Gender:"+person.getGender());
//        System.out.println("Age:"+person.getAge());
//        System.out.println("Phone Number:"+person.getPhonenum());
//        System.out.println("Email:"+person.getEmail());
//        System.out.println("Job:"+person.getJob());
//        System.out.println("Nationality:"+person.getNationality());
//        System.out.println("Marital:"+person.getMaritalStatus());
//        System.out.println("Website:"+person.getWebsite());
//        System.out.println("\n");
        
//        System.out.println("Address Information");
//        System.out.println("Latitude:"+address.getLatitude());
//        System.out.println("Longitude:"+address.getLongitude());
//        System.out.println("City:"+address.getCity());
//        System.out.println("Country:"+address.getCountry());
//        System.out.println("State:"+address.getState());
//        System.out.println("\n");
        
//        System.out.println("Driver Information");
//        System.out.println("Driver License:"+driver.getDriverLicense());
//        System.out.println("\n");
//        
//        System.out.println("Vehicle Registration Information");
//        System.out.println("Model:"+vehicle.getModel());
//        System.out.println("Color:"+vehicle.getColor());
//        System.out.println("Series:"+vehicle.getSeries());
//        System.out.println("Year:"+vehicle.getYear());
//        System.out.println("\n");
        
//        System.out.println("Patient Information");
//        System.out.println("Patient ID:"+patient.getPatientID());
//        System.out.println("Primary Doctor:"+patient.getPrimaryDoc());
//        System.out.println("Allergies:"+patient.getAllergies());
//        System.out.println("Medication:"+patient.getOnMedication());
//        System.out.println("Date of Next Appointment:"+patient.getDateOfNextApp());
//        System.out.println("\n");
//        
//        System.out.println("Doctor Information");
//        System.out.println("Doctor Name:"+doctor.getDocName());
//        System.out.println("Doctor ID:"+doctor.getDocID());
//        System.out.println("Office Address:"+doctor.getOfficeAdd());
//        System.out.println("Education:"+doctor.getEducation());
//        System.out.println("Specialty:"+doctor.getSpecialty());
//        System.out.println("License Number:"+doctor.getLicenseNum());
//        System.out.println("Year of Experience:"+doctor.getYearOfExp());
//        System.out.println("\n");
//        
//        System.out.println("Insurance Coverage Information");
//        System.out.println("Corporate ID:"+insurance.getCorporateID());
//        System.out.println("Address:"+insurance.getAddress());
//        System.out.println("Premium:"+insurance.getPremium());
//        System.out.println("Deductable:"+insurance.getDeductable());
        
    }//GEN-LAST:event_btnReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pic;
    private javax.swing.JButton btnAddress;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnDriver;
    private javax.swing.JButton btnInsurance;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPerson;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnVehicle;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel lblSubtitle1;
    private javax.swing.JLabel lblSubtitle2;
    private javax.swing.JLabel lblSubtitle3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}