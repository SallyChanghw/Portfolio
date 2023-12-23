/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.UserAccount;

import Hospital.Children.Children;
import Hospital.Doctor.Doctor;
import Hospital.Enterprise.Manufacturer;
import Hospital.Parent.Parent;
import Hospital.PurchasingOfficer.PurchasingOfficer;
import Hospital.Role.Role;
import Hospital.WorkQueue.WorkQueue;


/**
 *
 * @author josie
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Role role;
    private Manufacturer manufacturer;
    public Doctor doctor;
    private Parent parent;
    private Children children;
    private PurchasingOfficer purchasingOfficer;  
    private WorkQueue workQueue;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public Parent getParent() {
        return parent;
    }
    public void setParent(Parent parent) {
        this.parent = parent;
    }
    
    public Children getChildren() {
        return children;
    }
    public void setChildren(Children children) {
        this.children = children;
    }
    
    
    public PurchasingOfficer getPurchasingOfficer() {
        return purchasingOfficer;
    }
    public void setPurchasingOfficer(PurchasingOfficer purchasingOfficer) {
        this.purchasingOfficer = purchasingOfficer;
    }

    public boolean isMatchUsername(String username) {
        if (getUsername().equals(username)) {
            return true;
        }
        return false;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    @Override
    public String toString() {
        return username;
    }
}
