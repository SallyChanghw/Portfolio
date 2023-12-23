/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Organization;

import Hospital.Role.PurchasingOfficerRole;
import Hospital.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author josie
 */
public class StaffOrganization extends Organization{
    
    public StaffOrganization() {
        super(Organization.Type.Staff.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PurchasingOfficerRole());
        return roles;
    }
}
