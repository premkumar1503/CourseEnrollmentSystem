package Course_Enrollement_System;

import java.util.ArrayList;

public class University
{
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public University()
    {
        this.students=new ArrayList<>();
        this.courses=new ArrayList<>();
    }
    //Course
    public void addCourse(Course course)
    {
        courses.add(course);
        System.out.println("Coures added : "+course.getCourseName());
    }
    public void displayAllCourses()
    {
        if(courses.isEmpty())
        {
            System.out.println("No course available.");
        }
        else
        {
            System.out.println("Available Course : ");
            for (Course course : courses)
            {
                course.displayCourseinfo();
            }
        }

    }
    //Student
    public void addStudent(Student student)
    {
        students.add(student);
        System.out.println("Added Student : "+student.getStudentName());
    }

    public Student findStudentById(int studentId)
    {
        for (Student student : students)
        {
            if(student.getStudentId() == studentId)
            {
                return student;
            }
        }
        return null;
    }
    public ArrayList<Course> getCourses()
    {
        return courses;
    }

    public void displayAllStudents()
    {
        if(students.isEmpty())
        {
            System.out.println("No student Enrolled!!!");
        }
        else
        {
            for (Student student : students)
            {
                System.out.println("Student ID : "+student.getStudentId()+" , Student Name : "+student.getStudentName());
            }
        }
    }
}
