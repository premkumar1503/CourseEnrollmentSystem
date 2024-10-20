package Course_Enrollement_System;

import java.util.Scanner;

public class CourseEnrollmentSystem
{
    private static University university = new University();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("\nCourse Enrollment System : ");
            System.out.println("1. Add Course");
            System.out.println("2.Enroll Student");
            System.out.println("3.Display All Course");
            System.out.println("4.Display Enrolled Course for a Student");
            System.out.println("5.Remove a Course  from a Student");
            System.out.println("6.Display all Students");
            System.out.println("7.Exit");

            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    addCourse();
                    break;
                case 2:
                    enrollStudent();
                    break;
                case 3:
                    university.displayAllCourses();
                    break;
                case 4:
                    displayEnrolledCourse();
                    break;
                case 5:
                    removeCourseFromStudent();
                    break;
                case 6:
                    university.displayAllStudents();
                    break;
                case 7:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Invalid Choice Try again.");
            }
        }
    }

    private static void enrollStudent()
    {
        System.out.println("Enter the Student ID : ");
        int studentId=scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter Student Name : ");
        String studentName = scanner.nextLine();

        Student student = new Student(studentId,studentName);
        university.addStudent(student);

        System.out.println("Available Course : ");
        university.displayAllCourses();

        System.out.println("Enter Course ID to enroll in : ");
        int courseId = scanner.nextInt();

        Course courseToEnroll = null;
        for(Course course : university.getCourses())
        {
            if(course.getCourseId() == courseId)
            {
                courseToEnroll = course;
                break;
            }
        }
        if(courseToEnroll != null)
        {
            student.enrolledCourse(courseToEnroll);
        }
        else
        {
            System.out.println("Course not found.");
        }
    }

    private static void addCourse()
    {
        System.out.println("Enter Course ID");
        int id =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Course name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Instructor Name : ");
        String instructor = scanner.nextLine();
        Course course = new Course(id,name,instructor);
        university.addCourse(course);
        System.out.println("Course added successfully!");
    }

    private static void displayEnrolledCourse()
    {
        System.out.println("Enter Student ID : ");
        int studentId = scanner.nextInt();
        Student student = university.findStudentById(studentId);
        if(student != null)
        {
            student.displayEnrolledCourse();
        }
        else
        {
            System.out.println("Studnet not found.");
        }
    }
    public static void removeCourseFromStudent()
    {
        System.out.println("Enter Student ID : ");
        int studentId = scanner.nextInt();
        Student student =university.findStudentById(studentId);
        if(student != null )
        {
            System.out.println("Enter Course ID to remove : ");
            int courseId = scanner.nextInt();
            student.removeCourse(courseId);
        }
        else
        {
            System.out.println("Student not found");
        }
    }
}
