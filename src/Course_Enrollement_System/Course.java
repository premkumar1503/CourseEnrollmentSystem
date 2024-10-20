package Course_Enrollement_System;

public class Course
{
    private int courseId;
    private String courseName;
    private String instructor;

    public Course(int courseId, String courseName, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }
    public void displayCourseinfo()
    {
        System.out.println("Course ID : "+courseId+", Course Name : "+courseName+", Instructor : "+instructor);
    }
}
