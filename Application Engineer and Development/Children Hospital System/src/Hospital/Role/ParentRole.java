/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Role;

import Hospital.Hospital;
import Hospital.Organization.Organization;
import Hospital.Organization.PatientOrganization;
import Hospital.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.ParentRole.ParentWorkAreaJPanel;

/**
 *
 * @author josie
 */
public class ParentRole extends Role{
    
    public ParentRole() {
        this.type = RoleType.Parent;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Hospital hospital) {
        this.type = RoleType.Parent;
        return new ParentWorkAreaJPanel(userProcessContainer, account, (PatientOrganization) organization, hospital);
    }
}
