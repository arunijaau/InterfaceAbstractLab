/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;



/**
 *
 * @author ajayasooriya
 */
public class College {

    private Semester semester;
    private String name;
    private Double maxCredits;
    private final OutputReport report;

    public College(String name, OutputReport report) {
        this.report = report;
        this.setName(name);
    }

    public Double getMaxCredits() {
        return maxCredits;
    }

    public void setMaxCredits(Double maxCredits) {
        if (maxCredits <= 0) {
            throw new IllegalArgumentException("Error: Maximum credits should be greater than zero.");
        }
        this.maxCredits = maxCredits;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Error: Name of college cannot be a null or empty string.");
        }
        this.name = name;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        if (semester == null) {
            throw new IllegalArgumentException("Error: Semester cannot be null.");
        }
        this.semester = semester;
    }

    public void addCourseToSemester(Course course) {
        this.semester.addCourse(course);

    }
}
