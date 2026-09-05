import java.util.Scanner;
public class University {
    String sub1;
    String sub2;
    String sub3;
    String sub4;
    String sub5;
    public University(String sub1, String sub2, String sub3, String sub4, String sub5) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }
    public void register(){
        System.out.println("Subject 1: "+sub1);
        System.out.println("Subject 2: "+sub2);
        System.out.println("Subject 3: "+sub3);
        System.out.println("Subject 4: "+sub4);
        System.out.println("Subject 5: "+sub5);
    }
    public void display(){
        System.out.println("Registered Subjects:");
        System.out.println(sub1+", "+sub2+", "+sub3+", "+sub4+", "+sub5);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Subject 1: ");
        String sub1=sc.nextLine();
        System.out.print("Enter Subject 2: ");
        String sub2=sc.nextLine();
        System.out.print("Enter Subject 3: ");
        String sub3=sc.nextLine();
        System.out.print("Enter Subject 4: ");
        String sub4=sc.nextLine();
        System.out.print("Enter Subject 5: ");
        String sub5=sc.nextLine();
        University u1=new University(sub1, sub2, sub3, sub4, sub5);
        u1.register();
        u1.display();
    }
    
}
