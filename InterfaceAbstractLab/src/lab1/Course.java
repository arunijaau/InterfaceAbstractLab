/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author ajayasooriya
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private College college;
    
public Course(String name, String number, College college){
    this.courseName = name;
    this.courseNumber = number;
    this.college = college;
}

public final void setCourseName(String courseName){
    if(courseName == null || courseName.isEmpty()) {
        throw new IllegalArgumentException("Error: courseName cannot be null of empty string");
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseName cannot be null of empty string");
//            System.exit(0);
        }
        this.courseName = courseName;
};

public final void setCourseNumber(String courseNumber){
    if(courseNumber == null || courseNumber.isEmpty()) {
        throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseNumber cannot be null of empty string");
//            System.exit(0);
        }
        this.courseNumber = courseNumber;
};

public final void setCredits(double credits){
    if(credits < 0.5 || credits > this.college.getMaxCredits()) {
        throw new IllegalArgumentException("Error: credits must be in the range 0.5 to " + this.college.getMaxCredits());
//            JOptionPane.showMessageDialog(null,
//                    "Error: credits must be in the range 0.5 to " + this.college.getMaxCredits());
//            System.exit(0);
        }
        this.credits = credits;
}

public final void setPrerequisites(String prerequisites){
    if(prerequisites == null || prerequisites.isEmpty()) {
        throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
//            JOptionPane.showMessageDialog(null,
//                    "Error: prerequisites cannot be null of empty string");
//            System.exit(0);
        }
        this.prerequisites = prerequisites;
}

public String getPrerequisites(){
    return null;
}

public final String getCourseName() {
        return courseName;
    }

public final String getCourseNumber() {
        return courseNumber;
    }

public final double getCredits() {
        return credits;
    }
    
@Override
    public String toString(){
        return this.courseName;
    }

}
