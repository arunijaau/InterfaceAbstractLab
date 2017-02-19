package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends Course {

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, College college) {
        super(courseName, courseNumber, college);
    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

}
