public class Course {
    private String courseName;
    private int numberOfStudents;
    private String courseLecturer;
    // Constructor
    public Course(String courseName, int numberOfStudents, String courseLecturer) {
        this.courseName = courseName;
        this.numberOfStudents = numberOfStudents;
        this.courseLecturer = courseLecturer;
    }
    // Get method
    public String getCourseName() {
        return courseName;
    }
    // Set method
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    public String getCourseLecturer() {
        return courseLecturer;
    }
    public void setCourseLecturer(String courseLecturer) {
        this.courseLecturer = courseLecturer;
    }
    // toString() method
    public String toString() {
        return "("+courseName+", "+courseLecturer+" , "+numberOfStudents+" )";
    }
}