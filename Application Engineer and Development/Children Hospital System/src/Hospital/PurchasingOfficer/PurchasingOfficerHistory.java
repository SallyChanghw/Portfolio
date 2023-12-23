/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.PurchasingOfficer;

import java.util.ArrayList;
/**
 *
 * @author josie
 */
public class PurchasingOfficerHistory {
    
    private ArrayList<PurchasingOfficer> purchasingOfficerList;
    
    public PurchasingOfficerHistory() {
        purchasingOfficerList = new ArrayList<>();
    }

    public ArrayList<PurchasingOfficer> getPurchasingOfficerList() {
        return purchasingOfficerList;
    }

    public PurchasingOfficer addPurchasingRequest(){
        PurchasingOfficer purchasingOfficer=new PurchasingOfficer();
        purchasingOfficerList.add(purchasingOfficer);
        return purchasingOfficer;   
    }
    
}

