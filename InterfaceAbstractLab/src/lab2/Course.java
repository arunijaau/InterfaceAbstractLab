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
public interface Course {

    public void setCourseName(String courseName);

    public void setCourseNumber(String courseNumber);

    public void setCredits(double credits);

    public String getCourseName();

    public String getCourseNumber();

    public double getCredits();

}
