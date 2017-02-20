package lab2;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public final class IntroJavaCourse implements Course {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private final College college;

    public IntroJavaCourse(String courseName, String courseNumber, College college) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.college = college;
    }

    @Override
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");
        }
        this.courseName = courseName;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.isEmpty()) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > this.college.getMaxCredits()) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to " + this.college.getMaxCredits());
        }
        this.credits = credits;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.isEmpty()) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null of empty string");
        }
        this.prerequisites = prerequisites;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public String toString(){
        return this.courseName;
    }
}
