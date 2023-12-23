/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uni.Student;

import java.util.ArrayList;
import Uni.Course.Course;
import Uni.Professor.Professor;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import Uni.Uni;

/**
 *
 * @author josie
 */
public class Student {
    private static SecretKeySpec secretKey;
    private static byte[] key;
    private static final String ALGORITHM = "AES";    
    private static final String FinalSecretKey ="5100";
    
    private String studentName;
    private String studentID;
    private String studentUserID;
    private String studentPassword;
    private int gpa;
    private String registerCourseID;
    ArrayList<Course> registerCourses;
    
    public Student(String id) {

        this.studentID = id;
        registerCourses = new ArrayList();
    }
    

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentUserID() {
        return studentUserID;
    }

    public void setStudentUserID(String studentUserID) {
        this.studentUserID = studentUserID;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getRegisterCourseID() {
        return registerCourseID;
    }

    public void setRegisterCourseID(String registerCourseID) {
        this.registerCourseID = registerCourseID;
    }
    
    public ArrayList<Course> getRegisterCourses() {
        return registerCourses;
    }
    
    public boolean isMatchID(String id) {
        if (getStudentID().equals(id)) {
            return true;
        }
        return false;
    }
    
    public boolean isMatchUserID(String id) {
        if (getStudentUserID().equals(id)) {
            return true;
        }
        return false;
    }
    
     public boolean isIDPassword(String id, String password) {
        if (getStudentUserID().equals(id) && getStudentPassword().equals(password)) {
            return true;
        }
        return false;
    }
    
        
    public boolean isMatchStudentName(String studentName) {
        if (getStudentName().equals(studentName)) {
            return true;
        }
        return false;
    }
    
 
    
//    public Course newStudentCourse(String id){
//        for(Course c : registerCourses){
//            if(c.isMatch(id)){
//                return c;
//            }
//        }
//        Course c = new Course(id);
//        registerCourses.add(c);
//        return c;
//    }
//    
//    public boolean setCourseScore(String courseID, int score){
//        for(Course c : registerCourses){
//            if(c.isMatch(courseID)){
//                c.setCourseScore(score);
//                return true;
//            }
//        }
//    
//    return false;
//    }
//    public Course newStudentCourse(String id){
//        for(Course c : registerCourses){
//            if(c.isMatchID(id)){
//                return c;
//            }
//        }
//        Course c = new Course(id);
//        registerCourses.add(c);
//        return c;
//    }
//   
//       public Course newStudentCourse(Course course){
//        for(Course c : registerCourses){
//            if(c.isMatchID(course.getCourseID())){
//                return c;
//            }
//        }
//        registerCourses.add(course);
////        Course c = new Course(id);
////        registerCourses.add(c);
//        return course;
//    }
//    
//    public Course getStudentCourse(Course course){
//        for(Course c : registerCourses){
//            if(c.isMatchID(course.getCourseID())){
//                return c;
//            }
//        }
//       return null;
//    }
//    
    
     public Course newStudentCourse(String id){
        for(Course c : registerCourses){
            if(c.isMatchID(id)){
                return c;
            }
        }
        Course c = new Course(id);
        registerCourses.add(c);
        return c;
    }
    
    public Course getStudentCourse(String id){
        for(Course c : registerCourses){
            if(c.isMatchID(id)){
                return c;
            }
        }
       return null;
    }
    
    public boolean setCourseAttendencies(String courseID, int attendencies){
        for(Course c : registerCourses){
            if(c.isMatchID(courseID)){
                c.setAttendencies(attendencies);
                return true;
            }
        }
    
    return false;
    } 
    
    public boolean setCourseScore(String courseID, int score){
        for(Course c : registerCourses){
            if(c.isMatchID(courseID)){
                c.setCourseScore(score);
                return true;
            }
        }
    
    return false;
    } 
   
    public int getNumberOfCoursesObtained() {
    int coursesWithScores = 0;

    for (Course course : registerCourses) {
        int courseScore = course.getCourseScore();
        // Check if the student has received a score for the course.
        if (courseScore >= 60) {
            coursesWithScores++;
        }
    }

    return coursesWithScores;
}

   
    @Override
    public String toString(){
        return studentName;
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
