/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdminRole;

import Hospital.Appointment.Appointment;
import Hospital.Children.Children;
import Hospital.Hospital;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josie
 */
public class AvgAgeJPanel extends javax.swing.JPanel {

    JPanel workArea;
    Hospital hospital;
    /**
     * Creates new form AvgAgeJPanel
     */

    public AvgAgeJPanel(JPanel workArea, Hospital hospital) {
        initComponents();
        setSize(1500, 1000);
        this.workArea = workArea;
        this.hospital = hospital; 
        
        populateAvgAgeTable();
    }
    
    public void populateAvgAgeTable() {
    
       // Initialize data structures to store the total appointments and total age for each department
    Map<String, Integer> totalAppointments = new HashMap<>();
    Map<String, Integer> totalAge = new HashMap<>();

    // Iterate through appointments to calculate total appointments and total age for each department
    for (Appointment appointment : hospital.getAppointmentHistory().getAppointmentList()) {
        // Find the corresponding Children object using ssnID
        Children matchedChild = hospital.getChildrenHistory().getChildrenList()
                .stream()
                .filter(child -> child.matchSSNID(appointment.getSSNID()))
                .findFirst()
                .orElse(null);

        if (matchedChild != null) {
            String department = appointment.getDepartment(); // Use department from appointment

            // Update total appointments and total age for the department
            totalAppointments.put(department, totalAppointments.getOrDefault(department, 0) + 1);

            // Now you can get the age from the matchedChild
            int age = matchedChild.getAge();

            // Update total age for the department
            totalAge.put(department, totalAge.getOrDefault(department, 0) + age);
        }
    }

    // Create or get the DefaultTableModel from tblAvgAge
    DefaultTableModel model = (DefaultTableModel) tblAvgAge.getModel();

    // Clear existing rows in the table model
    model.setRowCount(0);

    // Populate the table model with the results
    for (String department : totalAppointments.keySet()) {
        int appointments = totalAppointments.getOrDefault(department, 0);
        int ageSum = totalAge.getOrDefault(department, 0);
        double averageAge = appointments > 0 ? (double) ageSum / appointments : 0;

        // Add a row to the table model
        Object[] row = { department, averageAge };
        model.addRow(row);
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAvgAge = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, 37));

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Average patient age for each department");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 1510, -1));

        tblAvgAge.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        tblAvgAge.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Department", "Avg. age of patients"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAvgAge);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VWH_Illustration_What-is-a-Fistula_Illustrator_Laura-Porter_No-Text_Final-74dde8ca763c43e8ba76d647ec34b8a0.jpeg"))); // NOI18N
        jLabel9.setToolTipText("");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1500, 1010));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAvgAge;
    // End of variables declaration//GEN-END:variables
}
