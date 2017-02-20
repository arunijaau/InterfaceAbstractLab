/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


import java.util.ArrayList;

/**
 *
 * @author ajayasooriya
 */
public class Semester {

    private final ArrayList<Course> courses;
    private String semesterName;
    private final OutputReport report;

    public Semester(String semesterName, OutputReport report) {
        this.report = report;
        this.setSemesterName(semesterName);
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Error: Course cannot be null.");
        }
        courses.add(course);
        report.addData(course + " course has been added to the " + this + " semester inventory.");
    }

    public String getSemesterName() {
        return semesterName;
    }

    private void setSemesterName(String semesterName) {
        if (semesterName == null || semesterName.isEmpty()) {
            throw new IllegalArgumentException("Error: Semester Name cannot be null or empty.");
        }
        this.semesterName = semesterName;
    }

    @Override
    public String toString() {
        return this.semesterName;
    }
}
