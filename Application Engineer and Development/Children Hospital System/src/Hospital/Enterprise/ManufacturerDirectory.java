/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Enterprise;

import java.util.ArrayList;


/**
 *
 * @author josie
 */
public class ManufacturerDirectory {
    
    ArrayList<Manufacturer> manufacturerDirectory;
    
    public ManufacturerDirectory() {
        manufacturerDirectory = new ArrayList();
    }

    public ArrayList<Manufacturer> getManufacturerDirectory() {
        return manufacturerDirectory;
    }

    public void setManufacturerDirectory(ArrayList<Manufacturer> manufacturerDirectory) {
        this.manufacturerDirectory = manufacturerDirectory;
    }
    
    public Manufacturer usernamePass(String username, String password) {

        for (Manufacturer m : manufacturerDirectory) {

            if (m.isUsernamePassword(username,password)) {
                return m;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public Manufacturer addManufacturer(String username, String password, String manufacturerName,String productName, int quantity, int price) {
        
        Manufacturer m = new Manufacturer();
        m.setUsername(username);
        m.setPassword(password);
        m.setManufactureName(manufacturerName);
        m.setProductName(productName);
        m.setQuantity(quantity);
        m.setPrice(price);
        manufacturerDirectory.add(m);
        return m;
    }
    
//    public Manufacturer addManufacturer(){
//        Manufacturer manufacturer=new Manufacturer();
//        manufacturerDirectory.add(manufacturer);
//        return manufacturer;   
//    }
    
}
