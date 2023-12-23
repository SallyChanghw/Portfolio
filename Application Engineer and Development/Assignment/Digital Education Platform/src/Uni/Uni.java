/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uni;

import Uni.Course.CourseHistory;
import Uni.Student.StudentHistory;
import Uni.Professor.ProfessorHistory;
/**
 *
 * @author josie
 */
public class Uni {
    
    public CourseHistory courseHistory;
    public StudentHistory studentHistory;
    public ProfessorHistory professorHistory;
    
    public Uni(){
        
//        String name;
        
        courseHistory= new CourseHistory();
        studentHistory=new StudentHistory();
        professorHistory=new ProfessorHistory();
    }
    

    public CourseHistory getCourseHistory() {
        return courseHistory;
    }

    public StudentHistory getStudentHistory() {
        return studentHistory;
    }

    public ProfessorHistory getProfessorHistory() {
        return professorHistory;
    }

    
    
}
