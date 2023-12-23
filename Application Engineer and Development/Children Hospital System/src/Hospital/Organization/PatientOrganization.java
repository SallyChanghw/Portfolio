/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Organization;

import Hospital.Role.ChildrenRole;
import Hospital.Role.ParentRole;
import Hospital.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author josie
 */
public class PatientOrganization extends Organization{
    
    public PatientOrganization() {
         super(Organization.Type.Patient.getValue());
    }
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ChildrenRole());
        roles.add(new ParentRole());
        return roles;
    }
}
