/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Appointment;

import java.util.ArrayList;

/**
 *
 * @author josie
 */
public class AppointmentHistory {
    
    private ArrayList<Appointment> appointmentList;
    private ArrayList<AppointmentSchedule> appScheduleList;
    
    public AppointmentHistory() {
        appointmentList = new ArrayList<>();
        appScheduleList = new ArrayList<>();
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }
    public ArrayList<AppointmentSchedule> getAppScheduleList() {
        return appScheduleList;
    }
    
    public Appointment newAppointment(String ssnID,String childName,String doctorID,String department,String appDate,String timeSlot,String status) {
        //      Auto-generate appointment ID
        String generatedID = generateAppointmentID();
        Appointment a = new Appointment(generatedID);
        a.setChildName(childName);
        a.setSSNID(ssnID);     
        a.setDoctorID(doctorID);
        a.setDepartment(department);        
        a.setAppointmentDate(appDate);
        a.setTimeSlot(timeSlot);
        a.setStatus(status);
        
        appointmentList.add(a);
        return a;
    }
    public AppointmentSchedule newAppSchedule(String doctorID,String department,String timeSlot,String scheduleDate,int availability,String status) {
        AppointmentSchedule as = new AppointmentSchedule();
        as.setDoctorID(doctorID);
        as.setDepartment(department);
        as.setTimeSlot(timeSlot);
        as.setScheduleDate(scheduleDate);
        as.setAvailability(availability);
        as.setStatus(status);
        
        appScheduleList.add(as);
        return as;
    }
    
    private int appointmentIDCounter = 0;
    //  Method to generate a unique ID
    private String generateAppointmentID() {

        // Increment a counter for each student
        appointmentIDCounter++;

        // Format the counter to a string and prepend it with a prefix
        String generatedID = "ap" + String.format("%04d", appointmentIDCounter);

        return generatedID;
    }
    public Appointment findAppointment(String id) {

        for (Appointment ap : appointmentList) {
            
              if (ap.isMatch(id)) {
                return ap;
            }
        }
        return null; //not found after going through the whole list
    }
}
