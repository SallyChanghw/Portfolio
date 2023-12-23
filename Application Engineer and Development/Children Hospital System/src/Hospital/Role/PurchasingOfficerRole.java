/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Role;

import Hospital.Hospital;
import Hospital.Organization.Organization;
import Hospital.Organization.StaffOrganization;
import Hospital.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PurchasingOfficerRole.PurchasingOfficerWorkAreaJPanel;

/**
 *
 * @author josie
 */
public class PurchasingOfficerRole extends Role {

    public PurchasingOfficerRole() {
        this.type = Role.RoleType.PurchasingOfficer;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Hospital hospital) {
        this.type = Role.RoleType.PurchasingOfficer;
        return new PurchasingOfficerWorkAreaJPanel(userProcessContainer, account, (StaffOrganization) organization, hospital);
    }

}

