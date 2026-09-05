import java.util.*;

public class StudentResult {

    String name;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;

    public StudentResult(String name, int sub1, int sub2, int sub3, int sub4, int sub5) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }

    public int percentage() {
        return (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
    }

    public void display() {

        System.out.println("Name: " + name);

        System.out.println("Percentage: " + percentage());

        if (percentage() >= 90) {
            System.out.println("Grade: A+");
        }
        else if (percentage() >= 80) {
            System.out.println("Grade: A");
        }
        else if (percentage() >= 70) {
            System.out.println("Grade: B");
        }
        else if (percentage() >= 60) {
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: D");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of student:");
        String name = sc.nextLine();

        System.out.println("Enter marks of subject 1:");
        int sub1 = sc.nextInt();

        System.out.println("Enter marks of subject 2:");
        int sub2 = sc.nextInt();

        System.out.println("Enter marks of subject 3:");
        int sub3 = sc.nextInt();

        System.out.println("Enter marks of subject 4:");
        int sub4 = sc.nextInt();

        System.out.println("Enter marks of subject 5:");
        int sub5 = sc.nextInt();

        StudentResult sr = new StudentResult(
            name, sub1, sub2, sub3, sub4, sub5
        );

        sr.display();

        sc.close();
 }
}