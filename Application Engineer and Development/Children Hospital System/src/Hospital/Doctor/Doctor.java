/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Doctor;

/**
 *
 * @author josie
 */
public class Doctor {
    
    private String name;
    private String doctorID;
    private String ssnID;
    private String location;
    private String department;
    private String specialty;
    private String time;
    private String status;
    
    public Doctor(String id) {
        this.doctorID = id;        
    }
    
    public String getSSNID() {
        return ssnID;
    }

    public void setSSNID(String ssnID) {
        this.ssnID = ssnID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isMatch(String id) {
        if (getDoctorID().equals(id)) {
            return true;
        }
        return false;
    }

    
}
