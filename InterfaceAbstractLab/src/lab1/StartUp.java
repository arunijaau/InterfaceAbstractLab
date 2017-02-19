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
        wctc.setSemester(new Semester("Spring 2017", report));

        Course course1 = new IntroToProgrammingCourse("Introduction to Programming", "152-107", wctc);
        Course course2 = new IntroJavaCourse("Introduction to Java", "152-134", wctc);
        Course course3 = new AdvancedJavaCourse("Advanced Java", "152-135", wctc);

        wctc.addCourseToSemester(course1);
        wctc.addCourseToSemester(course2);
        wctc.addCourseToSemester(course3);
        report.ShowData();

    }
}
