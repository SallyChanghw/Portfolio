/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Role;

import Hospital.Hospital;
import Hospital.Organization.DoctorOrganization;
import Hospital.Organization.Organization;
import Hospital.Organization.PatientOrganization;
import Hospital.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AdminRole.AdminWorkAreaJPanel;
import ui.ChildrenRole.ChildrenWorkAreaJPanel;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import ui.ParentRole.ParentWorkAreaJPanel;

/**
 *
 * @author josie
 */
public class ChildrenRole extends Role{

    public ChildrenRole() {
        this.type = RoleType.Children;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Hospital hospital) {
        this.type = RoleType.Children;
        return new ChildrenWorkAreaJPanel(userProcessContainer, account, (PatientOrganization) organization, hospital);
    }
    
}
