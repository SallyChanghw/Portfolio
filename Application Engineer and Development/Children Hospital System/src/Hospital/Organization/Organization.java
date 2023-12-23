/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Organization;

import Hospital.Enterprise.ManufacturerDirectory;
import Hospital.Role.Role;
import Hospital.UserAccount.UserAccountDirectory;
import Hospital.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author josie
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;    
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        Admin("Admin Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        }, Doctor("Doctor Organization"){
//            public Organization createOrganization() {
//                return new DoctorOrganization();
//            }
        }, Staff("Staff Organization"){
//            public Organization createOrganization() {
//                return new StaffOrganization();
//            }
        }, Patient("Patient Organization"){
//            public Organization createOrganization() {
//                return new CustomerOrganization();
//            }            
            
        };
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

        
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
}
