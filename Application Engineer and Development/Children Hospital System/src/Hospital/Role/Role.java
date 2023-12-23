/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Role;

import Hospital.Hospital;
import Hospital.Organization.Organization;
import Hospital.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author josie
 */
public abstract class Role {
    
    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        Parent("Parent"),
        Children("Children"),
        PurchasingOfficer("PurchasingOfficer");
        
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public RoleType type;

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Hospital hospital);

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
}
