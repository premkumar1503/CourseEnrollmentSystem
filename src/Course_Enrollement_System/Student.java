package Course_Enrollement_System;

import java.util.ArrayList;

public class Student
{
    private int studentId;
    private String studentName;
    private ArrayList<Course> enrolledCourse;

    public Student(int studentId, String studentName)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.enrolledCourse=new ArrayList<>();
    }

    public int getStudentId()
    {
        return studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }
    //add
    public void enrolledCourse(Course course)
    {
        enrolledCourse.add(course);
        System.out.println("Enrolled course : "+course.getCourseName());
    }
    //display
    public void displayEnrolledCourse()
    {
        if(enrolledCourse.isEmpty())
        {
            System.out.println("No course enrolled");
        }
        else
        {
            System.out.println("Course enrolled by "+studentName+": ");
        }
        for(Course course : enrolledCourse)
        {
            course.displayCourseinfo();
        }
    }
    public void removeCourse(int courseId)
    {
        enrolledCourse.removeIf(course -> course.getCourseId() == courseId);
        System.out.println("Course removed successfully.");
    }
}
