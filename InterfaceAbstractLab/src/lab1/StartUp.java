/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author ajayasooriya
 */
public class StartUp {
    public static void main(String[] args) {
        OutputReport report = new OutputReport();
        College wctc = new College("WCTC", report);
        wctc.setSemester(new Semester("Spring 2017"));
        
        ProgrammingCourse course1 = new IntroToProgrammingCourse("Introduction to Programming", "111-234");
        ProgrammingCourse course2 = new IntroJavaCourse("Introduction to Java", "123-456"); 
        ProgrammingCourse course3 = new AdvancedJavaCourse("Advanced Java", "223-456");
        
//        System.out.println(course1.getCourseName());
        
        wctc.addCourseToSemester(course1.getCourseName());
        wctc.addCourseToSemester(course2.getCourseName());
        wctc.addCourseToSemester(course3.getCourseName());
        report.ShowData();
        
        
    }
}
