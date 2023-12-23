/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uni.Course;

import Uni.Professor.Professor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author josie
 */
public class CourseHistory {
    
    ArrayList<Course> courseHistory;
    
    public CourseHistory(){
        
        courseHistory=new ArrayList();
        
    }
    

    public ArrayList<Course> getCourseHistory() {
        return courseHistory;
    }

    public void setCourseHistory(ArrayList<Course> courseHistory) {
        this.courseHistory = courseHistory;
    }
    
    public Course newCourse(String id) {
        Course c = new Course(id);
        courseHistory.add(c);
        return c;
    }
    
//    public Course defaultCourse(String id, String semester, String courseName){
//        
//        Course c = new Course(id);
//        c.setCourseID(id);
//        c.setSemester(semester);
//        c.setCourseName(courseName);
//        
//        courseHistory.add(c);
//        return c;
//    }
    
    private Map<String, Integer> departmentCourseCount = new HashMap<>();
    public Course defaultCourse(String department, String semester, String courseName, int courseCredits) {
        
// Determine the course ID based on the department and count.
        int courseCount = departmentCourseCount.getOrDefault(department, 0) + 1;
        departmentCourseCount.put(department, courseCount);
        String courseId = department + String.format("%03d", courseCount);

        // Create the Course object with the generated course ID.
        Course c = new Course(courseId);
        c.setCourseID(courseId);
        c.setSemester(semester);
        c.setCourseName(courseName);
        c.setCourseCredit(courseCredits);
        courseHistory.add(c);
        return c;
}


    public Course findCourseProfessor(String id,String professorUserID) {

        for (Course c : courseHistory) {

            if (c.isMatchProfessorUserID(id,professorUserID)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public Course findCourseProfessor2(String name,String professorUserID) {

        for (Course c : courseHistory) {

            if (c.isMatchProfessorUserID2(name,professorUserID)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public Course findCourse(String id) {

        for (Course c : courseHistory) {

            if (c.isMatchID(id)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public Course findCurrentCourse(String semester,String professorUserID) {

        for (Course c : courseHistory) {

            if (c.isCurrentCourse(semester,professorUserID)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public Course findSemesterCourse(String semester) {

        for (Course c : courseHistory) {

            if (c.isSemesterCourse(semester)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
    }
    

}
