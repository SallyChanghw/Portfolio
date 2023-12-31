/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PurchasingOfficerRole;

import Hospital.Hospital;
import Hospital.Organization.Organization;
import Hospital.Organization.StaffOrganization;
import Hospital.PurchasingOfficer.PurchasingOfficer;
import Hospital.UserAccount.UserAccount;
import Hospital.WorkQueue.PurchaseRequest;
import Hospital.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josie
 */
public class PurchaseRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Hospital hospital;
    PurchaseRequest request;
    private UserAccount userAccount;
    StaffOrganization staffOrganization;
    
    /**
     * Creates new form PurchaseRequestJPanel
     */
    public PurchaseRequestJPanel(JPanel userProcessContainer, Hospital hospital, Organization organization, UserAccount account) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.hospital = hospital;
        this.staffOrganization = (StaffOrganization) organization;
        this.userAccount = account;
        
        setSize(1500, 1000);
        requestTable();
//        populateTable();
    }

    private void requestTable(){
        DefaultTableModel dtm=(DefaultTableModel) tblPurchaseRequest.getModel();
        dtm.setRowCount(0);
        for(PurchasingOfficer purchasingOfficer :hospital.purchasingOfficerHistory.getPurchasingOfficerList()){
            Object[] row =new Object[8];
            row[0]=purchasingOfficer.getDate();
            row[1]=purchasingOfficer.getDoctorName();
            row[2]=purchasingOfficer.getManufactureName();
            row[3]=purchasingOfficer.getProductName();
            row[4]=purchasingOfficer.getQuantity();
            row[5]=purchasingOfficer.getPrice();
            row[6]=purchasingOfficer.getMessage();
            row[7]=purchasingOfficer.getStatus();
            
            dtm.addRow(row);
        }
    }
    

//    public void populateTable() {
//        DefaultTableModel model = (DefaultTableModel) tblPurchaseRequest.getModel();
//
//        model.setRowCount(0);
//
//        for (WorkRequest request : staffOrganization.getWorkQueue().getWorkRequestList()) {
//            Object[] row = new Object[7];
//            row[0] = request.getRequestDate();
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//            row[3] = request.getStatus();
//            row[4] = request.getStatus();
//            row[5] = request.getMessage();
//            row[6] = request.getStatus();
//
//            model.addRow(row);
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnProcess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPurchaseRequest = new javax.swing.JTable();
        btnBack8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Purchase Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, 1494, -1));

        btnProcess.setBackground(new java.awt.Color(255, 51, 51));
        btnProcess.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 600, 129, 45));

        tblPurchaseRequest.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        tblPurchaseRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Doctor", "Manufacturer", "Product", "Quantity", "Price", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPurchaseRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 164, 1425, 400));

        btnBack8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack8.setForeground(new java.awt.Color(51, 51, 51));
        btnBack8.setText("< Back");
        btnBack8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack8ActionPerformed(evt);
            }
        });
        add(btnBack8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 37));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/63349a177a686dbf2f246572_hero-standard-service-request.jpeg"))); // NOI18N
        jLabel7.setToolTipText("");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1500, 1140));
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblPurchaseRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            String status = (String) tblPurchaseRequest.getValueAt(selectedRow, 7);
            if(status=="Verified"){
                JOptionPane.showMessageDialog(null,"Please select other requests to verify.","Information",JOptionPane.INFORMATION_MESSAGE);
            }
           
            else{               
                String date = (String) tblPurchaseRequest.getValueAt(selectedRow, 0);
                for(PurchasingOfficer test :hospital.purchasingOfficerHistory.getPurchasingOfficerList()){
                    if(date.equals(test.getDate())){
                        test.setStatus("Verified");
                    }

                }

                JOptionPane.showMessageDialog(null,"The request is verified now! Please wait for the Admin to approve","Information",JOptionPane.INFORMATION_MESSAGE);
                requestTable();
            }
        }
//        int selectedRow = tblPurchaseRequest.getSelectedRow();
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) tblPurchaseRequest.getValueAt(selectedRow, 0);
//            if (request.getMessage().equalsIgnoreCase("Verified")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
//        ProcessPurchaseRequestJPanel pprj = new ProcessPurchaseRequestJPanel(userProcessContainer, request);
//        userProcessContainer.add("ProcessPurchaseRequestJPanel", pprj);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnBack8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack8ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack8;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPurchaseRequest;
    // End of variables declaration//GEN-END:variables
}
