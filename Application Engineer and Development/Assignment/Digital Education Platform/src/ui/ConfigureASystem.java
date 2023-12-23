/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import Uni.Course.Course;
import Uni.Course.CourseHistory;
import Uni.Student.Student;
import Uni.Student.StudentHistory;
import Uni.Professor.Professor;
import Uni.Professor.ProfessorHistory;
import Uni.Uni;

/**
 *
 * @author josie
 */
public class ConfigureASystem {
    
    static Uni initialize() {
        Uni uni = new Uni();
        
//        Create Students
        StudentHistory studentHistory = uni.getStudentHistory();
                
        Student studentD1 = studentHistory.defaultStudent("Josie Fu", "josie123", "josie123");
        Student studentD2 = studentHistory.defaultStudent("Ingrid Lin", "ingrid123", "ingrid123");
        Student studentD3 = studentHistory.defaultStudent("Sally Chang", "sally123", "sally123");
        Student studentD4 = studentHistory.defaultStudent("Wesley Li", "wesley123", "wesley123");
        Student studentD5 = studentHistory.defaultStudent("Laura Chen", "laura123", "laura123");
        Student studentD6 = studentHistory.defaultStudent("Vikki Jiang", "vikki123", "vikki123");
        Student studentD7 = studentHistory.defaultStudent("Tini Chen", "tini123", "tini123");
        Student studentD8 = studentHistory.defaultStudent("Alllen Liao", "alan123", "alan123");
        Student studentD9 = studentHistory.defaultStudent("Patrick Chiu", "patrick123", "patrick123");
        Student studentD10 = studentHistory.defaultStudent("Joe Wu", "joe123", "joe123");
        
//        Create Professor
        ProfessorHistory professorHistory = uni.getProfessorHistory();
        Professor professorD1 = professorHistory.defaultProfessor("Sam Smith", "sam1234", "sam1234", "United States", "English");
        Professor professorD2 = professorHistory.defaultProfessor("Jay Chou", "jay1234", "jay1234", "Taiwan", "Mandarin");
        Professor professorD3 = professorHistory.defaultProfessor("Eason Chen", "eason1234", "eason1234", "Hong Kong", "Cantonese");
        Professor professorD4 = professorHistory.defaultProfessor("Shawn Mendes", "shawn1234", "shawn1234", "Canada", "English");
        Professor professorD5 = professorHistory.defaultProfessor("Celine Dion", "celine1234", "celine1234", "Canada", "English");
        Professor professorD6 = professorHistory.defaultProfessor("Troye Sivan", "troye1234", "troye1234", "Australia", "English");
        Professor professorD7 = professorHistory.defaultProfessor("Ariana Grande", "ariana1234", "ariana1234", "United States", "English");
        Professor professorD8 = professorHistory.defaultProfessor("Tanya Chua", "tanya1234", "tanya1234", "Singapore", "Mandarin");
        Professor professorD9 = professorHistory.defaultProfessor("Jieun Lee", "jieun1234", "jieun1234", "Korea", "Korean");
        Professor professorD10 = professorHistory.defaultProfessor("Aden Wang", "aden1234", "aden1234", "Taiwan", "Mandarin");
        
        
        
//        Create Courses
        CourseHistory courseHistory = uni.getCourseHistory();
        
        Course courseD1 = courseHistory.defaultCourse("CS", "2023Spring", "Introductions to Computer Science",2);
        Course courseD2 = courseHistory.defaultCourse("CS", "2023Spring", "Data Structures",4);
        Course courseD3 = courseHistory.defaultCourse("CS", "2023Fall", "Introductions to Machine Learning",3);
        Course courseD4 = courseHistory.defaultCourse("CS", "2023Fall", "Shallow Deep Learning and Applications",2);
        Course courseD5 = courseHistory.defaultCourse("BA", "2023Spring", "Junior Accounting",2);
        Course courseD6 = courseHistory.defaultCourse("BA", "2023Fall", "Corporate Ethics",2);
        Course courseD7 = courseHistory.defaultCourse("BA", "2023Fall", "Bussiness Analysis",3);
        Course courseD8 = courseHistory.defaultCourse("LAW", "2023Fall", "Introduction to Civil Law",2);
        Course courseD9 = courseHistory.defaultCourse("LAW", "2023Spring", "Introduction to Criminal Law",2);
        Course courseD10 = courseHistory.defaultCourse("LAW", "2023Fall", "Introduction to Land Law",2);
        Course courseD11 = courseHistory.defaultCourse("CS", "2023Fall", "Web Design",4);
        Course courseD12 = courseHistory.defaultCourse("CS", "2023Fall", "Algorithm",2);
        Course courseD13 = courseHistory.defaultCourse("CS", "2023Fall", "Database Management",2);
        Course courseD14 = courseHistory.defaultCourse("BA", "2023Spring", "Marketing Management",2);
        Course courseD15 = courseHistory.defaultCourse("BA", "2023Spring", "Human Resource Management",2);
        Course courseD16 = courseHistory.defaultCourse("BA", "2023Fall", "Operations Management",4);
        Course courseD17 = courseHistory.defaultCourse("LAW", "2023Spring", "Environmental Law",2);
        Course courseD18 = courseHistory.defaultCourse("LAW", "2023Fall", "International Law",3);
        Course courseD19 = courseHistory.defaultCourse("LAW", "2023Fall", "Family Law",2);
        Course courseD20 = courseHistory.defaultCourse("CS", "2023Spring", "Object-Oriented Programming",3);
        Course courseD21 = courseHistory.defaultCourse("CS", "2023Fall", "Operating Systems",2);
        Course courseD22 = courseHistory.defaultCourse("CS", "2023Fall", "Software Engineering",2);
        Course courseD23 = courseHistory.defaultCourse("BA", "2023Spring", "Organizational Behavior",3);
        Course courseD24 = courseHistory.defaultCourse("BA", "2023Spring", "Entrepreneurship and Small Business Management",2);
        Course courseD25 = courseHistory.defaultCourse("BA", "2023Fall", "International Business",3);
        Course courseD26 = courseHistory.defaultCourse("LAW", "2023Spring", "Property Law",3);
        Course courseD27 = courseHistory.defaultCourse("LAW", "2023Fall", "Civil Procedure",2);
        Course courseD28 = courseHistory.defaultCourse("LAW", "2023Fall", "Constitutional Law",4);
        Course courseD29 = courseHistory.defaultCourse("CS", "2023Spring", "Artificial Intelligence",4);
        Course courseD30 = courseHistory.defaultCourse("CS", "2023Fall", "Cybersecurity",3);
        
            
        
        
       //        Set Courses ProfessorUserID    
        courseD1.setProfessorUserID(professorD1.getProfessorUserID());
        courseD2.setProfessorUserID(professorD1.getProfessorUserID());
        courseD3.setProfessorUserID(professorD1.getProfessorUserID());
        courseD4.setProfessorUserID(professorD1.getProfessorUserID());
        courseD5.setProfessorUserID(professorD2.getProfessorUserID());
        courseD6.setProfessorUserID(professorD2.getProfessorUserID());
        courseD7.setProfessorUserID(professorD2.getProfessorUserID());
        courseD8.setProfessorUserID(professorD3.getProfessorUserID());
        courseD9.setProfessorUserID(professorD3.getProfessorUserID());
        courseD10.setProfessorUserID(professorD3.getProfessorUserID());
        courseD11.setProfessorUserID(professorD4.getProfessorUserID());
        courseD12.setProfessorUserID(professorD4.getProfessorUserID());
        courseD13.setProfessorUserID(professorD4.getProfessorUserID());
        courseD14.setProfessorUserID(professorD5.getProfessorUserID());
        courseD15.setProfessorUserID(professorD5.getProfessorUserID());
        courseD16.setProfessorUserID(professorD5.getProfessorUserID());
        courseD17.setProfessorUserID(professorD6.getProfessorUserID());
        courseD18.setProfessorUserID(professorD6.getProfessorUserID());
        courseD19.setProfessorUserID(professorD6.getProfessorUserID());
        courseD20.setProfessorUserID(professorD7.getProfessorUserID());
        courseD21.setProfessorUserID(professorD7.getProfessorUserID());
        courseD22.setProfessorUserID(professorD7.getProfessorUserID());
        courseD23.setProfessorUserID(professorD8.getProfessorUserID());
        courseD24.setProfessorUserID(professorD8.getProfessorUserID());
        courseD25.setProfessorUserID(professorD8.getProfessorUserID());
        courseD26.setProfessorUserID(professorD9.getProfessorUserID());
        courseD27.setProfessorUserID(professorD9.getProfessorUserID());
        courseD28.setProfessorUserID(professorD9.getProfessorUserID());
        courseD29.setProfessorUserID(professorD10.getProfessorUserID());
        courseD30.setProfessorUserID(professorD10.getProfessorUserID());
        
        
     //     Set Student Courses  
        studentD1.newStudentCourse(courseD1.getCourseID());
        studentD1.newStudentCourse(courseD5.getCourseID());
        studentD1.newStudentCourse(courseD8.getCourseID());
        studentD1.newStudentCourse(courseD11.getCourseID());
        studentD2.newStudentCourse(courseD1.getCourseID());
        studentD2.newStudentCourse(courseD5.getCourseID());
        studentD2.newStudentCourse(courseD8.getCourseID());
        studentD2.newStudentCourse(courseD11.getCourseID());  
        studentD3.newStudentCourse(courseD1.getCourseID());
        studentD3.newStudentCourse(courseD5.getCourseID());
        studentD3.newStudentCourse(courseD8.getCourseID());
        studentD3.newStudentCourse(courseD11.getCourseID());
        studentD3.newStudentCourse(courseD2.getCourseID());
        studentD3.newStudentCourse(courseD6.getCourseID());
        studentD3.newStudentCourse(courseD9.getCourseID());
        studentD3.newStudentCourse(courseD12.getCourseID());
        studentD4.newStudentCourse(courseD1.getCourseID());
        studentD4.newStudentCourse(courseD5.getCourseID());
        studentD4.newStudentCourse(courseD8.getCourseID());
        studentD4.newStudentCourse(courseD11.getCourseID());
        studentD4.newStudentCourse(courseD2.getCourseID());
        studentD4.newStudentCourse(courseD6.getCourseID());
        studentD4.newStudentCourse(courseD9.getCourseID());
        studentD4.newStudentCourse(courseD12.getCourseID());
        studentD5.newStudentCourse(courseD1.getCourseID());
        studentD5.newStudentCourse(courseD5.getCourseID());
        studentD5.newStudentCourse(courseD8.getCourseID());
        studentD5.newStudentCourse(courseD11.getCourseID());
        studentD6.newStudentCourse(courseD2.getCourseID());
        studentD6.newStudentCourse(courseD6.getCourseID());
        studentD6.newStudentCourse(courseD9.getCourseID());
        studentD6.newStudentCourse(courseD12.getCourseID());
        studentD7.newStudentCourse(courseD2.getCourseID());
        studentD7.newStudentCourse(courseD6.getCourseID());
        studentD7.newStudentCourse(courseD9.getCourseID());
        studentD7.newStudentCourse(courseD12.getCourseID()); 
        studentD8.newStudentCourse(courseD2.getCourseID());
        studentD8.newStudentCourse(courseD6.getCourseID());
        studentD8.newStudentCourse(courseD9.getCourseID());
        studentD8.newStudentCourse(courseD12.getCourseID()); 
        studentD9.newStudentCourse(courseD2.getCourseID());
        studentD9.newStudentCourse(courseD6.getCourseID());
        studentD9.newStudentCourse(courseD9.getCourseID());
        studentD9.newStudentCourse(courseD12.getCourseID()); 
        studentD10.newStudentCourse(courseD2.getCourseID());
        studentD10.newStudentCourse(courseD6.getCourseID());
        studentD10.newStudentCourse(courseD9.getCourseID());
        studentD10.newStudentCourse(courseD12.getCourseID()); 
        
        
        
     //     Set Student Course Score         
        studentD1.getStudentCourse(courseD1.getCourseID()).setCourseScore(91);
        studentD1.getStudentCourse(courseD5.getCourseID()).setCourseScore(55);
        studentD1.getStudentCourse(courseD8.getCourseID()).setCourseScore(71);
        studentD1.getStudentCourse(courseD11.getCourseID()).setCourseScore(80);
        studentD2.getStudentCourse(courseD1.getCourseID()).setCourseScore(59);
        studentD2.getStudentCourse(courseD5.getCourseID()).setCourseScore(95);
        studentD2.getStudentCourse(courseD8.getCourseID()).setCourseScore(97);
        studentD2.getStudentCourse(courseD11.getCourseID()).setCourseScore(80);
        studentD3.getStudentCourse(courseD1.getCourseID()).setCourseScore(84);
        studentD3.getStudentCourse(courseD5.getCourseID()).setCourseScore(93);
        studentD3.getStudentCourse(courseD8.getCourseID()).setCourseScore(77);
        studentD3.getStudentCourse(courseD11.getCourseID()).setCourseScore(83);
        studentD3.getStudentCourse(courseD2.getCourseID()).setCourseScore(93);
        studentD3.getStudentCourse(courseD6.getCourseID()).setCourseScore(83);
        studentD3.getStudentCourse(courseD9.getCourseID()).setCourseScore(78);
        studentD3.getStudentCourse(courseD12.getCourseID()).setCourseScore(90);
        studentD4.getStudentCourse(courseD1.getCourseID()).setCourseScore(88);
        studentD4.getStudentCourse(courseD5.getCourseID()).setCourseScore(66);
        studentD4.getStudentCourse(courseD8.getCourseID()).setCourseScore(79);
        studentD4.getStudentCourse(courseD11.getCourseID()).setCourseScore(82);
        studentD4.getStudentCourse(courseD2.getCourseID()).setCourseScore(88);
        studentD4.getStudentCourse(courseD6.getCourseID()).setCourseScore(77);
        studentD4.getStudentCourse(courseD9.getCourseID()).setCourseScore(79);
        studentD4.getStudentCourse(courseD12.getCourseID()).setCourseScore(98);
        studentD5.getStudentCourse(courseD1.getCourseID()).setCourseScore(85);
        studentD5.getStudentCourse(courseD5.getCourseID()).setCourseScore(97);
        studentD5.getStudentCourse(courseD8.getCourseID()).setCourseScore(98);
        studentD5.getStudentCourse(courseD11.getCourseID()).setCourseScore(89);
        studentD6.getStudentCourse(courseD2.getCourseID()).setCourseScore(93);
        studentD6.getStudentCourse(courseD6.getCourseID()).setCourseScore(83);
        studentD6.getStudentCourse(courseD9.getCourseID()).setCourseScore(78);
        studentD6.getStudentCourse(courseD12.getCourseID()).setCourseScore(50);
        studentD7.getStudentCourse(courseD2.getCourseID()).setCourseScore(91);
        studentD7.getStudentCourse(courseD6.getCourseID()).setCourseScore(45);
        studentD7.getStudentCourse(courseD9.getCourseID()).setCourseScore(71);
        studentD7.getStudentCourse(courseD12.getCourseID()).setCourseScore(80);
        studentD8.getStudentCourse(courseD2.getCourseID()).setCourseScore(91);
        studentD8.getStudentCourse(courseD6.getCourseID()).setCourseScore(80);
        studentD8.getStudentCourse(courseD9.getCourseID()).setCourseScore(71);
        studentD8.getStudentCourse(courseD12.getCourseID()).setCourseScore(80);
        studentD9.getStudentCourse(courseD2.getCourseID()).setCourseScore(99);
        studentD9.getStudentCourse(courseD6.getCourseID()).setCourseScore(80);
        studentD9.getStudentCourse(courseD9.getCourseID()).setCourseScore(74);
        studentD9.getStudentCourse(courseD12.getCourseID()).setCourseScore(82);
        studentD10.getStudentCourse(courseD2.getCourseID()).setCourseScore(91);
        studentD10.getStudentCourse(courseD6.getCourseID()).setCourseScore(90);
        studentD10.getStudentCourse(courseD9.getCourseID()).setCourseScore(66);
        studentD10.getStudentCourse(courseD12.getCourseID()).setCourseScore(76);
        
        
    //     Set Student Rate Professor Score
        studentD1.getStudentCourse(courseD1.getCourseID()).setProfessorRateScore(9);
        studentD1.getStudentCourse(courseD5.getCourseID()).setProfessorRateScore(7);
        studentD1.getStudentCourse(courseD8.getCourseID()).setProfessorRateScore(3);
        studentD1.getStudentCourse(courseD11.getCourseID()).setProfessorRateScore(8);
        studentD2.getStudentCourse(courseD1.getCourseID()).setProfessorRateScore(7);
        studentD2.getStudentCourse(courseD5.getCourseID()).setProfessorRateScore(6);
        studentD2.getStudentCourse(courseD8.getCourseID()).setProfessorRateScore(8);
        studentD2.getStudentCourse(courseD11.getCourseID()).setProfessorRateScore(6);
        studentD3.getStudentCourse(courseD1.getCourseID()).setProfessorRateScore(7);
        studentD3.getStudentCourse(courseD5.getCourseID()).setProfessorRateScore(5);
        studentD3.getStudentCourse(courseD8.getCourseID()).setProfessorRateScore(8);
        studentD3.getStudentCourse(courseD11.getCourseID()).setProfessorRateScore(9);
        studentD4.getStudentCourse(courseD1.getCourseID()).setProfessorRateScore(6);
        studentD4.getStudentCourse(courseD5.getCourseID()).setProfessorRateScore(5);
        studentD4.getStudentCourse(courseD8.getCourseID()).setProfessorRateScore(9);
        studentD4.getStudentCourse(courseD11.getCourseID()).setProfessorRateScore(6);
        studentD5.getStudentCourse(courseD1.getCourseID()).setProfessorRateScore(3);
        studentD5.getStudentCourse(courseD5.getCourseID()).setProfessorRateScore(4);
        studentD5.getStudentCourse(courseD8.getCourseID()).setProfessorRateScore(7);
        studentD5.getStudentCourse(courseD11.getCourseID()).setProfessorRateScore(10);
        studentD6.getStudentCourse(courseD2.getCourseID()).setProfessorRateScore(7);
        studentD6.getStudentCourse(courseD6.getCourseID()).setProfessorRateScore(8);
        studentD6.getStudentCourse(courseD9.getCourseID()).setProfessorRateScore(9);
        studentD6.getStudentCourse(courseD12.getCourseID()).setProfessorRateScore(6);
        studentD7.getStudentCourse(courseD2.getCourseID()).setProfessorRateScore(7);
        studentD7.getStudentCourse(courseD6.getCourseID()).setProfessorRateScore(4);
        studentD7.getStudentCourse(courseD9.getCourseID()).setProfessorRateScore(4);
        studentD7.getStudentCourse(courseD12.getCourseID()).setProfessorRateScore(3);
        studentD8.getStudentCourse(courseD2.getCourseID()).setProfessorRateScore(4);
        studentD8.getStudentCourse(courseD6.getCourseID()).setProfessorRateScore(5);
        studentD8.getStudentCourse(courseD9.getCourseID()).setProfessorRateScore(6);
        studentD8.getStudentCourse(courseD12.getCourseID()).setProfessorRateScore(6);
        studentD9.getStudentCourse(courseD2.getCourseID()).setProfessorRateScore(7);
        studentD9.getStudentCourse(courseD6.getCourseID()).setProfessorRateScore(7);
        studentD9.getStudentCourse(courseD9.getCourseID()).setProfessorRateScore(8);
        studentD9.getStudentCourse(courseD12.getCourseID()).setProfessorRateScore(7);
        studentD10.getStudentCourse(courseD2.getCourseID()).setProfessorRateScore(5);
        studentD10.getStudentCourse(courseD6.getCourseID()).setProfessorRateScore(6);
        studentD10.getStudentCourse(courseD9.getCourseID()).setProfessorRateScore(7);
        studentD10.getStudentCourse(courseD12.getCourseID()).setProfessorRateScore(9);
        
        
        return uni;
      
    }
}
