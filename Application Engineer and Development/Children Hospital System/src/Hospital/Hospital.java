/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import Hospital.Appointment.AppointmentHistory;
import Hospital.Children.Children;
import Hospital.Children.ChildrenHistory;
import Hospital.Doctor.Doctor;
import Hospital.Doctor.DoctorHistory;
import Hospital.Organization.OrganizationDirectory;
import Hospital.Enterprise.ManufacturerDirectory;
import Hospital.Parent.Parent;
import Hospital.Parent.ParentHistory;
import Hospital.PurchasingOfficer.PurchasingOfficer;
import Hospital.PurchasingOfficer.PurchasingOfficerHistory;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author josie
 */
public class Hospital {
    
    private static Hospital hospital;
    private OrganizationDirectory organizationDirectory;
    public DoctorHistory doctorHistory;
    public ParentHistory parentHistory;
    public ChildrenHistory childrenHistory;
    public PurchasingOfficerHistory purchasingOfficerHistory;
    private AppointmentHistory appointmentHistory;
    public ManufacturerDirectory manufacturerDirectory;
    
    public static Hospital getInstance() {
        if (hospital == null) {
            hospital = new Hospital();
        }
        return hospital;
    }
    
    private Hospital() {
        organizationDirectory = new OrganizationDirectory();
        doctorHistory = new DoctorHistory();
        parentHistory = new ParentHistory();
        childrenHistory = new ChildrenHistory();
        purchasingOfficerHistory = new PurchasingOfficerHistory();
        appointmentHistory = new AppointmentHistory();
        manufacturerDirectory = new ManufacturerDirectory();

    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public DoctorHistory getDoctorHistory() {
        return doctorHistory;
    }
    public ParentHistory getParentHistory() {
        return parentHistory;
    }
    public ChildrenHistory getChildrenHistory() {
        return childrenHistory;
    }    
    public PurchasingOfficerHistory getPurchasingOfficerHistory() {
        return purchasingOfficerHistory;
    }
    public AppointmentHistory getAppointmentHistory() {
        return appointmentHistory;
    }
    
     public ManufacturerDirectory getManufacturerDirectory() {
        return manufacturerDirectory;
    }
    
    
    public boolean existingSSN(String ssn) {
    Set<String> existingSSNs = new HashSet<>();

        // Check Doctor Role ID
        for (Doctor doctor : doctorHistory.getDoctorList()) {
            existingSSNs.add(doctor.getSSNID());
        }

        // Check Parent Role ID
        for (Parent parent : parentHistory.getParentList()) {
            existingSSNs.add(parent.getSSNID());
                for (Children children : parent.getChildrenList()) {
                existingSSNs.add(children.getSSNID());
            }
        }
        
        // Check if the provided Role ID already exists
        if (existingSSNs.contains(ssn)) {
            return true; // Role ID exists
        } else {
            return false; // Role ID does not exist
        }
    }
}
    
