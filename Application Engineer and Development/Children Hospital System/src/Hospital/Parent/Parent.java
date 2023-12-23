/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Parent;

import Hospital.Children.Children;
import Hospital.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author josie
 */
public class Parent {
    
    private String name;
    private String parentID;
    private String ssnID;
    private ArrayList<Children> childrenList;
    private ArrayList<Doctor> doctorList;
    private String feedback;
    private String status;
    
    public Parent(String id) {
        this.parentID = id; 
        childrenList = new ArrayList();
        doctorList = new ArrayList();
    }
    
    public ArrayList<Children> getChildrenList() {
        return childrenList;
    }
    
    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
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

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    private int childrenIDCounter = 0;
    
    public Children newChildren(String id,String name){
        
        for(Children c : childrenList){
            if(c.isMatchID(id)){
                return c;
            }
        }
        //String generatedID = generateChildrenID();
        Children c = new Children(id);
        c.setName(name);
        childrenList.add(c);
        return c;
    }
    
    //  Method to generate a unique ID
    private String generateChildrenID() {

        // Increment a counter for each student
        childrenIDCounter++;

        // Format the counter to a string and prepend it with a prefix
        String generatedID = "pi" + String.format("%04d", childrenIDCounter);

        return generatedID;
    }
    public Children getChildrenByName(String name){
        for(Children c : childrenList){
            if(c.isMatchName(name)){
                return c;
            }
        }
       return null;
    }
    public Children getChildrenById(String id){
        for(Children c : childrenList){
            if(c.isMatchID(id)){
                return c;
            }
        }
       return null;
    }

    
}
