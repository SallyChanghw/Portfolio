/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sally
 */
public class Patient {
    
    private String patientID;
    private String primaryDoc;
    private String allergies;
    private String onMedication;
    private String dateOfNextApp;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPrimaryDoc() {
        return primaryDoc;
    }

    public void setPrimaryDoc(String primaryDoc) {
        this.primaryDoc = primaryDoc;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnMedication() {
        return onMedication;
    }

    public void setOnMedication(String onMedication) {
        this.onMedication = onMedication;
    }

    public String getDateOfNextApp() {
        return dateOfNextApp;
    }

    public void setDateOfNextApp(String dateOfNextApp) {
        this.dateOfNextApp = dateOfNextApp;
    }
    
}
