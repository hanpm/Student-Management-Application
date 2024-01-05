package studentdatabaseapp;
// this is our main
public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Current Balance: " + student1.getBalance());
        student1.payTuition(500);
        System.out.print("\nNew Balance after $500 payment: " + student1.getBalance());
        System.out.print(student1.displayStats());


    }
}
