/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Role;

import Hospital.Hospital;
import Hospital.Organization.Organization;
import Hospital.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.AdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author josie
 */
public class AdminRole extends Role {
    
    public AdminRole() {
        this.type = RoleType.Admin;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Hospital hospital) {
        this.type = RoleType.Admin;
        return new AdminWorkAreaJPanel(userProcessContainer, Hospital.getInstance());
    }
}
