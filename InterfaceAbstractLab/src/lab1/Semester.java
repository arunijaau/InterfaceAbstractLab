/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author ajayasooriya
 */
public class Semester {
    private ArrayList<Course> courses;
    private String semesterName;
    private OutputReport report;

    public Semester(String semesterName, OutputReport report ) {
        this.report = report;
        this.setSemesterName(semesterName);
        this.courses = new ArrayList<>(); 
        
    }

    public void addCourse(Course course) {
        if(course == null){
            throw new IllegalArgumentException("Error: Course cannot be null.");
        }
        courses.add(course);
        report.addData(course + " has been added to the " + this + " inventory.");
        
    }

    public String getSemesterName() {
        return semesterName;
    }

    private void setSemesterName(String semesterName) {
        if(semesterName == null || semesterName.isEmpty()){
            throw new IllegalArgumentException("Error: Semester Name cannot be null or empty.");
        }
        this.semesterName = semesterName;
    }
    
    @Override
    public String toString(){
        return this.semesterName;
    }
}
