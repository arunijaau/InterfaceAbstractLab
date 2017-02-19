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
    private ArrayList<String> courses;
    private String semesterName;
    private OutputReport report;

    public Semester(String semesterName) {
        this.semesterName = semesterName;
        this.courses = new ArrayList<>(); 
        this.report = new OutputReport();
    }

    public void addCourse(String courseName) {
        courses.add(courseName);
        report.addData(courseName + " has been added to the " + this.semesterName + " inventory.");
        
    }

    public String getSemesterName() {
        return semesterName;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }
    
    @Override
    public String toString(){
        return this.semesterName;
    }
}
