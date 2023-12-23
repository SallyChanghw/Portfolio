/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Appointment;

import java.util.Date;

/**
 *
 * @author josie
 */
public class Appointment {
    
    private String ssnID;
    private String childName;
    private String doctorID;
    private String department;
    private String appointmentDate;
    private String nextAppointmentDate;
    private String status;
    private String appointmentID;
    private String medicine;
    private String timeSlot;
    private String description;
    private String feedback;

    public Appointment(String id) {
        this.appointmentID = id;        
    }
    
    public String getAppointmentID() {
        return appointmentID;
    }
    
    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }
    
    public String getSSNID() {
        return ssnID;
    }
    
    public void setSSNID(String ssnID) {
        this.ssnID = ssnID;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getNextAppointmentDate() {
        return nextAppointmentDate;
    }

    public void setNextAppointmentDate(String nextAppointmentDate) {
        this.nextAppointmentDate = nextAppointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMedicine() {
        return medicine;
    }
    
    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
    public String getTimeSlot() {
        return timeSlot;
    }
    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
   
    public boolean isMatch(String id) {
        if (getAppointmentID().equals(id)) {
            return true;
        }
        return false;
    }

    
}
