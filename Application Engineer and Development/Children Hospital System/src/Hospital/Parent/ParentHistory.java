/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Parent;

import java.util.ArrayList;

/**
 *
 * @author ingrid
 */
public class ParentHistory {
    
    private ArrayList<Parent> parentList;
    
    public ParentHistory() {
        parentList = new ArrayList<>();
    }

    public ArrayList<Parent> getParentList() {
        return parentList;
    }
    
    private int parentIDCounter = 0;
    
    public Parent addParent(String ssnID,String name,String feedback,String status) {
        
//      Auto-generate parent ID
        String generatedID = generateParentID();
        
        Parent p = new Parent(generatedID);
        p.setSSNID(ssnID);
        p.setName(name);
        p.setFeedback(feedback);       
        p.setStatus(status);        
        parentList.add(p);
        return p;
    }
    

//  Method to generate a unique ID
    private String generateParentID() {

        // Increment a counter for each student
        parentIDCounter++;

        // Format the counter to a string and prepend it with a prefix
        String generatedID = "p" + String.format("%04d", parentIDCounter);

        return generatedID;
    }
    
}
