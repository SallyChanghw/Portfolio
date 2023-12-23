/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Role;

import Hospital.Hospital;
import Hospital.Organization.DoctorOrganization;
import Hospital.Organization.Organization;
import Hospital.Role.Role.RoleType;
import Hospital.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author josie
 */
public class DoctorRole extends Role{
    
    public DoctorRole() {
        this.type = RoleType.Doctor;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Hospital hospital) {
        this.type = RoleType.Doctor;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization) organization, hospital);
    }
}
