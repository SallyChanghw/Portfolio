/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Children;

import java.util.ArrayList;

/**
 *
 * @author josie
 */
public class ChildrenHistory {
    
    private ArrayList<Children> childrenList;
    
    public ChildrenHistory() {
        childrenList = new ArrayList<>();
    }

    public ArrayList<Children> getChildrenList() {
        return childrenList;
    }
    
    private int childrenIDCounter = 0;
    
    public Children addChildren(String ssnID,String name,int age, String gender,String birthday,String description) {
        
//      Auto-generate InsuranceID
//        String generatedID = generateChildrenID();
        
        Children c = new Children(ssnID);
        c.setName(name);
        c.setAge(age);       
        c.setGender(gender);
        c.setBirthday(birthday);
        //c.setInsuranceID(generatedID);
        c.setDescription(description);
        childrenList.add(c);
        return c;
    }
    

//  Method to generate a unique ID
    private String generateChildrenID() {

        // Increment a counter for each student
        childrenIDCounter++;

        // Format the counter to a string and prepend it with a prefix
        String generatedID = "ci" + String.format("%04d", childrenIDCounter);

        return generatedID;
    }
}
