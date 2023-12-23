/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Doctor;

import java.util.ArrayList;
/**
 *
 * @author josie
 */
public class DoctorHistory {
    
    private ArrayList<Doctor> doctorList;
    
    public DoctorHistory() {
        doctorList = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }
    
    private int doctorIDCounter = 0;
    
    public Doctor addDoctor(String ssnID,String name,String location, String department,String specialty,String time,String status) {
        
//      Auto-generate doctor ID
        String generatedID = generateDoctorID();
        
        Doctor d = new Doctor(generatedID);
        d.setSSNID(ssnID);
        d.setName(name);
        d.setLocation(location);
        d.setDepartment(department);
        d.setSpecialty(specialty);
        d.setTime(time);
        d.setStatus(status);        
        doctorList.add(d);
        return d;
    }
    

//  Method to generate a unique ID
    private String generateDoctorID() {

        // Increment a counter for each student
        doctorIDCounter++;

        // Format the counter to a string and prepend it with a prefix
        String generatedID = "d" + String.format("%04d", doctorIDCounter);

        return generatedID;
    }
    
    public Doctor findDoctor(String id) {

        for (Doctor d : doctorList) {
            
              if (d.isMatch(id)) {
                return d;
            }
        }
        return null; //not found after going through the whole list
    }
}
