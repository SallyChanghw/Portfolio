/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uni.Professor;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

/**
 *
 * @author josie
 */
public class ProfessorHistory {
    
    private static SecretKeySpec secretKey;
    private static byte[] key;
    private static final String ALGORITHM = "AES";    
    private static final String FinalSecretKey ="5100";
         
    ArrayList<Professor> professorHistory;
    
    public ProfessorHistory(){
        
        professorHistory=new ArrayList();
        
    }

    public ArrayList<Professor> getProfessorHistory() {
        return professorHistory;
    }

    public void setProfessorHistory(ArrayList<Professor> professorHistory) {
        this.professorHistory = professorHistory;
    }
    
    
    public Professor newProfessor(String generateProfessorID) {
        //      Auto-generate student ID
        String generatedID = generateProfessorID();
        
        Professor p = new Professor(generatedID);
        professorHistory.add(p);
        return p;
    }
    
    private int professorIDCounter = 0;
    
    public Professor defaultProfessor(String name, String userID, String password, String region, String language){
        
        //      Auto-generate student ID
        String generatedID = generateProfessorID();
        
        Professor p = new Professor(generatedID);
        p.setProfessorName(name);
        p.setProfessorPassword(password);
        p.setProfessorUserID(userID);
        p.setRegion(region);
        p.setLanguage(language);
        professorHistory.add(p);
        return p;
    }
    
    //  Method to generate a unique professor ID
    private String generateProfessorID() {

        // Increment a counter for each professor
        professorIDCounter++;

        // Format the counter to a string and prepend it with a prefix
        String generatedID = "p" + String.format("%04d", professorIDCounter);

        return generatedID;
    }

    public Professor findProfessor(String id) {

        for (Professor p : professorHistory) {
            
              if (p.isMatchID(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public Professor idPass(String id, String password) {

        for (Professor p : professorHistory) {

            if (p.isIDPassword(id,password)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
    } 
    
    public Professor registerProfessor(String name, String userID, String password,String region, String language){
        for(Professor p : professorHistory){
            if(p.isMatchUserID(userID)){
                JOptionPane.showMessageDialog(null, "Professor UserID exist! Please check!");  
                return null;
            }
        }
        Professor p = new Professor(userID);
        p.setProfessorName(name);
        p.setProfessorPassword(password);       
        p.setProfessorUserID(userID);               
        p.setRegion(region);
        p.setLanguage(language);
        return p; 
    }
    
    public void prepareSecreteKey(String myKey) {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
    
    public Professor findSemester(String userid) {

        for (Professor p : professorHistory) {

            if (p.isMatchUserID(userid)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
    }    

     public String encrypt(String strToEncrypt, String secret) {
        try {
            prepareSecreteKey(secret);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public String decrypt(String strToDecrypt, String secret) {
        try {
            prepareSecreteKey(secret);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
   
}
