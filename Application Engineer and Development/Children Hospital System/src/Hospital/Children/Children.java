/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Children;

/**
 *
 * @author josie
 */
public class Children {
    
    private String name;    
    private int age;
    private String gender;
    private String birthday;
    private String ssnID;
    private String description;
    private String prescription;
    private String date;
    private String nextAppointment;
    
    public Children(String id) {
        this.ssnID = id; 
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSSNID() {
        return ssnID;
    }

    public void setSSNID(String ssnID) {
        this.ssnID = ssnID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(String nextAppointment) {
        this.nextAppointment = nextAppointment;
    }
    
    public boolean isMatchName(String name) {
        if (getName().equals(name)) {
            return true;
        }
        return false;
    }
    
    public boolean isMatchID(String id) {
        if (getSSNID().equals(id)) {
            return true;
        }
        return false;
    }
    
    public boolean matchSSNID(String ssnID) {
        return this.ssnID.equals(ssnID);
    }

}
