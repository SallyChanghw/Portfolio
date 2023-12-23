/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uni.Student;

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
public class StudentHistory {
    private static SecretKeySpec secretKey;
    private static byte[] key;
    private static final String ALGORITHM = "AES";    
    private static final String FinalSecretKey ="5100";
    
    ArrayList<Student> studentHistory;
    
    public StudentHistory(){
        
        studentHistory=new ArrayList();
        
    }

    public ArrayList<Student> getStudentHistory() {
        return studentHistory;
    }

    public void setStudentHistory(ArrayList<Student> studentHistory) {
        this.studentHistory = studentHistory;
    }
    
     public Student newStudent(String generateStudentID){
        //      Auto-generate student ID
        String generatedID = generateStudentID();
        
        Student s = new Student(generatedID);
        studentHistory.add(s);
        return s;
    }

    
    private int studentIDCounter = 0;
    
    public Student defaultStudent(String name,String userID, String password) {
        
//      Auto-generate student ID
        String generatedID = generateStudentID();
        
        Student s = new Student(generatedID);
        s.setStudentName(name);
        s.setStudentUserID(userID);
        s.setStudentPassword(password);
        studentHistory.add(s);
        return s;
    }
    

//  Method to generate a unique student ID
    private String generateStudentID() {

        // Increment a counter for each student
        studentIDCounter++;

        // Format the counter to a string and prepend it with a prefix
        String generatedID = "s" + String.format("%04d", studentIDCounter);

        return generatedID;
    }
   
        
    public Student findStudent(String id) {

        for (Student s : studentHistory) {

            if (s.isMatchID(id)) {
                return s;
            }
        }
            return null; //not found after going through the whole list
    }
    
      public Student findStudentName(String name) {

        for (Student s : studentHistory) {

            if (s.isMatchStudentName(name)) {
                return s;
            }
        }
            return null; //not found after going through the whole list
    }
    
    
    public Student idPass(String id, String password) {

        for (Student s : studentHistory) {

            if (s.isIDPassword(id,password)) {
                return s;
            }
        }
            return null; //not found after going through the whole list
    } 

    public Student registerStudent(String name, String userID, String password){
        for(Student s : studentHistory){
            if (s.isMatchUserID(userID)) {
                JOptionPane.showMessageDialog(null, "Student UserID exist! Please check!");  
                return null;
            }
        }
        Student s = new Student(userID);
        s.setStudentName(name);
        s.setStudentUserID(userID);
        s.setStudentPassword(password);

        return s; 
    }
    
    public Student searchStudentByName(String StudentName){
        
        for (Student s : studentHistory) {

            if (s.isMatchStudentName(StudentName)) {
                return s;
            }
        }
            return null; //not found after going through the whole list
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
