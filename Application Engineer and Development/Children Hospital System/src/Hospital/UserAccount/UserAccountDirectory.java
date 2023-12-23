/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.UserAccount;

import Hospital.Enterprise.Manufacturer;
import Hospital.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author josie
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);        
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAccount findUserAccount(String username) {

        for (UserAccount ua : userAccountList) {
            
              if (ua.isMatchUsername(username)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public UserAccount findUserAccountByChildren(String ssnid) {

        for (UserAccount ua : userAccountList) {
           if (ua.getChildren() != null){
               if (ua.getChildren().getSSNID().equals(ssnid)) {
                    return ua;
               }
           }              
        }
            return null; //not found after going through the whole list
    }
    
}
