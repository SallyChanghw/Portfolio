/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author harshalneelkamal
 */
public class DataGenerator {
        
    private static DataGenerator instance;
    
    private FileWriter writer;
    private File file;
    
    private final Random rand;
    
    private final int employeeProfileRange;
    private final int salesProfileRange;
    private final int marketingProfileRange;
    private final int customerProfileRange;
    private final int supplierRange;
    private final int orderidRange;
    private final int productProfileRange;
    private final int priceRange;
    
    
    private final String LINE_BREAK = "\n";    
    private final String PERSON_HEADER = "Person-Id,Profile-Type"; 
    private final String PRODUCT_HEADER = "Supplier,ProductName,FloorPrice,CeilingPrice,TargetPrice";    
    private final String ORDER_HEADER = "OrdetID,Customer,SalesPerson,Supplier,ProductNo,Actual-Price,Quantity";    
    
    
    private final String PERSON_CAT_PATH = "./PersonCatalogue.csv";
    private final String ORDER_CAT_PATH = "./OrderCatalogue.csv";
    private final String PRODUCT_CAT_PATH = "./ProductCatalogue.csv";
    
    private DataGenerator() throws IOException {
                
        rand = new Random();
                
        salesProfileRange = 5;
        marketingProfileRange = 5;        
        employeeProfileRange = 5;
        customerProfileRange = 5 ;    
        supplierRange = 5;
        orderidRange = 10;
        productProfileRange = 10;
        priceRange =20;
        
        generatePersonFile(); 
        generateProductFile();
        generateOrderFile();
       
    }
    
    public static DataGenerator getInstance() throws IOException{
        if(instance == null)
        {
            instance = new DataGenerator();
        }
        return instance;
    }
    
    private void generatePersonFile() throws IOException{
        //generate Product file
        
        try {
            
            file = new File(PERSON_CAT_PATH);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
            System.out.println("New Person Catalogue Created");
            writer = new FileWriter(file);
        
            writer.append(PERSON_HEADER);
            writer.append(LINE_BREAK);            
            generatePersonColumns();   
            
        }finally{            
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
      
    }
    
    private void generatePersonColumns() throws IOException{
        int userId = 0;
        //the loop for salesProfile
        while(userId < salesProfileRange){
            //items for a salesProfile
            userId++;
            String personId = "Xerox sales"+ String.format("%03d", userId);
            String profileType = "Sales";
                        
            String column = personId+","+profileType;
            
            writer.append(column);
            writer.append(LINE_BREAK);              
        }
        
        //the loop for marketingProfile
        userId = 0;
        while(userId < marketingProfileRange){
            //items for a marketingProfile
            userId++;            
            String personId = "Xerox marketing"+ String.format("%03d", userId);
            String profileType = "Marketing";
                        
            String column = personId+","+profileType;
            
            writer.append(column);
            writer.append(LINE_BREAK);              
        }
        //the loop for employeeProfile
        userId = 0;
        while(userId < employeeProfileRange){
            //items for a employeeProfile
            userId++;            
            String personId = "Xerox employee"+ String.format("%03d", userId);
            String profileType = "Employee";
                        
            String column = personId+","+profileType;
            
            writer.append(column);
            writer.append(LINE_BREAK);              
        }
        //the loop for customerProfile
        userId = 0;
        while(userId < customerProfileRange){
            //items for a customerProfile
            userId++;            
            String personId = "Xerox customer"+ String.format("%03d", userId);
            String profileType = "Customer";
                        
            String column = personId+","+profileType;
            
            writer.append(column);
            writer.append(LINE_BREAK);              
        }
    }
    
    private void generateProductFile() throws IOException{
        //generate Product file
        
        try {
            
            file = new File(PRODUCT_CAT_PATH);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
            System.out.println("New Product Catalogue Created");
            writer = new FileWriter(file);
        
            writer.append(PRODUCT_HEADER);
            writer.append(LINE_BREAK);            
            generateProductColumns();   
            
        }finally{            
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
      
    }
    
    private void generateProductColumns() throws IOException{
        int supplierId = 0;  
        int productId = 0;
        String supplier;
        String productName; 
        
        //the loop for supplier
        while(supplierId < supplierRange){
            //items for a supplierId
            supplierId++;
            supplier = "Supplier"+ String.format("%03d", supplierId);
            //the loop for products
            productId = 0;
            while(productId < productProfileRange) {                               
                int floorPrice = 0;
                int ceilingPrice = 0;
                int targetPrice = 0;
                int retry = 0;
                productId++; 
                productName = "Product"+ "S" + supplierId + "P" + String.format("%03d", productId);                
                targetPrice = rand.nextInt(priceRange) * 1000;                 
                if (targetPrice < 5000) targetPrice=5000;
                if (targetPrice > 15000) targetPrice=15000;
                
                while (floorPrice == 0 ) {
                    int price = rand.nextInt(priceRange) * 1000;
                    retry++;
                    if (price < targetPrice ) {
                        floorPrice = price;
                    }else 
                    {
                        if (retry>1000) {
                            floorPrice = targetPrice-2000;
                        }
                    }
                    
                }
                retry = 0;
                while (ceilingPrice == 0) {
                    int price = rand.nextInt(priceRange) * 1000;
                    retry++;
                    if (price > targetPrice ) {
                        ceilingPrice = price;
                    }else 
                    {
                        if (retry>1000) {
                            ceilingPrice = targetPrice+2000;
                        }
                    }                    
                }
                String column = supplier+","+productName+","+floorPrice+","+ceilingPrice+","+targetPrice;            
                writer.append(column);
                writer.append(LINE_BREAK);             
            }             
        }        
        
    }
    
    private void generateOrderFile() throws IOException{
        //generate Order file
        
        try {
            
            file = new File(ORDER_CAT_PATH);
            if(file.exists()){
                file.delete();
            }
            file.createNewFile();
            System.out.println("New Order Catalogue Created");
            writer = new FileWriter(file);
        
            writer.append(ORDER_HEADER);
            writer.append(LINE_BREAK);            
            generateOrderColumns();   
            
        }finally{            
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
      
    }
    
    private void generateOrderColumns() throws IOException{
        int orderId = 0;
        int productId = 0;
        int customerId = 0;  
        int salesId = 0;
        int supplierId = 0;
        //the loop for Order        
        while(orderId < orderidRange){            
            int iterations = rand.nextInt(10)+1;
            orderId++;
            customerId=rand.nextInt(customerProfileRange)+1;
            salesId=rand.nextInt(salesProfileRange)+1;
            supplierId=rand.nextInt(supplierRange)+1;             
            //the loop for products
            productId = 0;
            while(iterations > 0) {
                //items for a Order                
                productId++; 
                int price = rand.nextInt(priceRange) * 1000;
                int qty = rand.nextInt(10) +1;
                String column = orderId+","+customerId+","+salesId+","+ supplierId+","+productId+ ","+price+","+qty;            
                writer.append(column);
                writer.append(LINE_BREAK); 
                iterations--;
            }             
        }   

      }
        //the loop for marketingProfile
//        userId = 0;
//        while(userId < marketingProfileRange){
//            //items for a marketingProfile
//            userId++;            
//            String personId = "Xerox marketing"+ String.format("%03d", userId);
//            String profileType = "Marketing";
//                        
//            String column = personId+","+profileType;
//            
//            writer.append(column);
//            writer.append(LINE_BREAK);              
//        }
//        //the loop for employeeProfile
//        userId = 0;
//        while(userId < employeeProfileRange){
//            //items for a employeeProfile
//            userId++;            
//            String personId = "Xerox employee"+ String.format("%03d", userId);
//            String profileType = "Employee";
//                        
//            String column = personId+","+profileType;
//            
//            writer.append(column);
//            writer.append(LINE_BREAK);              
//        }
//        //the loop for customerProfile
//        userId = 0;
//        while(userId < customerProfileRange){
//            //items for a customerProfile
//            userId++;            
//            String personId = "Xerox customer"+ String.format("%03d", userId);
//            String profileType = "Customer";
//                        
//            String column = personId+","+profileType;
//            
//            writer.append(column);
//            writer.append(LINE_BREAK);              
//        }
    
    
    public String getPersonFilePath(){
        return PERSON_CAT_PATH;
    }
  
    public String getProductFilePath(){
        return PRODUCT_CAT_PATH;
    }
    
    public String getOrderFilePath(){
        return ORDER_CAT_PATH;
    }
}
