package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private int balance;

    private String studentID;
    private String courses;

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


        System.out.print(this.firstName + " " + this.lastName + ", " + this.year+ ", " + this.studentID);
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

    // View Balance

    // Pay tuition

    // Display status of student
}
