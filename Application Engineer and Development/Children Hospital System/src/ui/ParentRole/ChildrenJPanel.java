/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ParentRole;

import Hospital.Appointment.Appointment;
import Hospital.Children.Children;
import Hospital.Hospital;
import Hospital.Organization.PatientOrganization;
import Hospital.Parent.Parent;
import Hospital.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josie
 */
public class ChildrenJPanel extends javax.swing.JPanel {

    private JPanel workArea;
    private PatientOrganization organization;
    private Hospital hospital;
    private UserAccount userAccount;
    private Parent parent;
    private String selectedChildrenName;
    private String selectedAppID;
    /**
     * Creates new form Children
     */


    public ChildrenJPanel(JPanel workArea, UserAccount account, PatientOrganization organization, Hospital hospital) {
        initComponents();
        setSize(1500, 1000);
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
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblAppHistory.getModel();

        model.setRowCount(0);

        for (Appointment ap : hospital.getAppointmentHistory().getAppointmentList()) {
            String childName = ap.getChildName();
            if (childName.equals(selectedChildrenName)) {
                Object[] row = new Object[7];
                row[0] = ap.getAppointmentID();
                row[1] = ap.getAppointmentDate();
                row[2] = ap.getDepartment();
                row[3] = hospital.getDoctorHistory().findDoctor(ap.getDoctorID()).getName() ;
                row[4] = ap.getMedicine();
                row[5] = ap.getDescription();
                row[6] = ap.getStatus();
                model.addRow(row);
            }
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

        jLabel1 = new javax.swing.JLabel();
        cboxChildren = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAppHistory = new javax.swing.JTable();
        btnFeedback = new javax.swing.JButton();
        btnBack8 = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Children History & Give Feedback");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 115, 1488, -1));

        cboxChildren.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cboxChildren.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxChildrenActionPerformed(evt);
            }
        });
        add(cboxChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 215, 180, 39));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Select Children :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 221, -1, -1));

        tblAppHistory.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        tblAppHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "Date", "Department", "Doctor", "Medicine", "Description", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAppHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAppHistoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAppHistory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 280, 1390, 278));

        btnFeedback.setBackground(new java.awt.Color(0, 153, 102));
        btnFeedback.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnFeedback.setForeground(new java.awt.Color(255, 255, 255));
        btnFeedback.setText("Give Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });
        add(btnFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, 189, 49));

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

        btnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnRefresh.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 120, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical-pictures-zwokq7ivb2d32hhu.jpeg"))); // NOI18N
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1500, 1140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAppHistory.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from table first.","Warning",JOptionPane.WARNING_MESSAGE);
        } 
        else { 
            selectedAppID = (String) tblAppHistory.getValueAt(selectedRow,0);   
            Appointment appointment = hospital.getAppointmentHistory().findAppointment(selectedAppID);
            if (appointment.getStatus().equals("Assessed")){
                FeedbackJPanel fbjp = new FeedbackJPanel(workArea,userAccount,appointment,hospital);
                workArea.add("FeedbackJPanel",fbjp);
                CardLayout layout=(CardLayout) workArea.getLayout();
                layout.next(workArea);
            }
            else {
                JOptionPane.showMessageDialog(null, "The status of appointment should be Assessed.","Warning",JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void cboxChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxChildrenActionPerformed
        // TODO add your handling code here:
        if (cboxChildren.getSelectedItem() != null) {
            selectedChildrenName=cboxChildren.getSelectedItem().toString();
            populateTable();      
        }
    }//GEN-LAST:event_cboxChildrenActionPerformed

    private void tblAppHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAppHistoryMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblAppHistory.getSelectedRow();
        if(selectedRow>=0){
            selectedAppID = (String) tblAppHistory.getValueAt(selectedRow,0);            
        }
    }//GEN-LAST:event_tblAppHistoryMouseClicked

    private void btnBack8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack8ActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBack8ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack8;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox<String> cboxChildren;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAppHistory;
    // End of variables declaration//GEN-END:variables
}
