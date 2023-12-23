/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uni.Course;

/**
 *
 * @author josie
 */
public class Course {
    
    private String courseID;
    private String semester;
    private String courseName;
    private int courseScore;
    private String professorID;
    private String professorUserID;
    private String department;
    private int courseCredits;
    private int attendencies;
    private int professorRateScore;
//    static IntegercCounter=0;

    public Course(String id) {
        this.courseID = id;
    }
    
    public String getProfessorID() {
        return professorID;
    }

    public void setProfessorID(String professorID) {
        this.professorID = professorID;
    }
    
    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(int courseScore) {
        this.courseScore = courseScore;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    
    public String getProfessorUserID() {
        return professorUserID;
    }

    public void setProfessorUserID(String professorUserID) {
        this.professorUserID = professorUserID;
    }
    
    public int getProfessorRateScore() {
        return professorRateScore;
    }

    public void setProfessorRateScore(int professorRateScore) {
        this.professorRateScore = professorRateScore;
    }
    
    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredit(int courseCredits) {
        this.courseCredits = courseCredits;
    }
    
    public int getAttendencies() {
        return attendencies;
    }

    public void setAttendencies(int attendencies) {
        this.attendencies = attendencies;
    }
    
    public boolean isMatchProfessorUserID(String id, String professorUserid) {
        if (getCourseID().equals(id) && getProfessorUserID().equals(professorUserid)) {
            return true;
        }
        return false;
    }
     
    public boolean isMatchProfessorUserID2(String name, String professorUserid) {
        if (getCourseName().equals(name) && getProfessorUserID().equals(professorUserid)) {
            return true;
        }
        return false;
    }
    
    public boolean isMatchID(String id) {
        if (getCourseID().equals(id)) {
            return true;
        }
        return false;
    }
    
    public boolean isCurrentCourse(String semester, String professorUserid) {
        if (getSemester().equals(semester) && getProfessorUserID().equals(professorUserid)) {
            return true;
        }
        return false;
    }
    
     public boolean isSemesterCourse(String semester) {
        if (getSemester().equals(semester)) {
            return true;
        }
        return false;
    }

    
}
