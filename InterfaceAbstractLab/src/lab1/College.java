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
public class College {
    
    private Semester semester;
    private OutputReport report;
    private String name;

    public College(String name, OutputReport report) {
        this.name = name;
        this.report = report;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
  
    public void addCourseToSemester(String courseName){
        this.semester.addCourse(courseName);
        this.report.addData(courseName + " has been added to the " + this.semester + " semester inventory.");
    }
}
