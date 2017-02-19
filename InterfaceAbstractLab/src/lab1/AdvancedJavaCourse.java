package lab1;

//import javax.swing.JOptionPane;
/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course {

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, College college) {
        super(courseName, courseNumber, college);

    }

    @Override
    public String getPrerequisites() {
        return prerequisites;
    }

}
