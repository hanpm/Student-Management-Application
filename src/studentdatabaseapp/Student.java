package studentdatabaseapp;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private int balance = 0;

    private String studentID;
    private ArrayList<String> courses;

    // use static for variables that are supposed to remain constant
    private static int costOfCourse = 600;
    private static int id = 1000;


    /*
    * Constructor that creates and inputs a student (with year) in the management system
    * @param String firstName
    * @param String lastName
    */
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter last name: ");
        this.lastName = in.nextLine();

        this.year = setYear();

        this.studentID = setStudentID();
        this.courses = setCourses();

    }

    private int setYear() {
        System.out.println("Enter year level:\n 1) 1st Year\n 2) 2nd Year\n 3) 3rd Year\n 4) 4th Year");

        Scanner in = new Scanner(System.in);
        int yearChoice = in.nextInt();
        if (yearChoice == 1) {
            return 1;
        }
        else if (yearChoice == 2) {
            return 2;
        }
        else if (yearChoice == 3) {
            return 3;
        }
        else {
            return 4;
        }

    }

    // Generate ID
    private String setStudentID(){
        // studentID = year + static id
        id++;
        return year + "" + id;
    }

    // Enroll in courses
    private ArrayList<String> setCourses() {
        ArrayList<String> studentCourses = new ArrayList<>();
        System.out.println("Enter course to enroll (Q to finish enrollment): ");
        System.out.println("Courses: Math 100, History 100, English 100, Chemistry 100");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();

        while (!Objects.equals(course, "Q")) {
            System.out.println("Add...");
            studentCourses.add(course);
            balance = balance + costOfCourse;
            course = in.nextLine();
        }
        System.out.println("Successfully added courses!");
        return studentCourses;
    }

    // View Balance
    public int getBalance() {
        return balance;
    }

    // Pay tuition
    public void payTuition(int payment) {
        this.balance = balance - payment;
    }

    // Display status of student
    public String displayStats() {
        return "\n\n==== STUDENT INFO ====\n"
                + "First Name: " + this.firstName + "\n"
                + "Last Name: " + this.lastName + "\n"
                + "Year: " + this.year+ "\n"
                + "ID: " + this.studentID + "\n"
                + "Balance: " + this.balance + "\n"
                + "Courses: " + this.courses;
    }
}
