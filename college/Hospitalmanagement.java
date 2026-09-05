import java.util.Scanner;
public class Hospitalmanagement {
    int patientId;
    String patientName;
    int age;
    int Temprature;
    public Hospitalmanagement(int patientId, String patientName, int age, int Temprature) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.Temprature = Temprature;
    }
    public void temp(){
        if(Temprature>100.4){
            System.out.println("Fever");
        }
        else{
            System.out.println("Normal");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Patient ID: ");
        int patientId=sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Patient Name: ");
        String patientName=sc.nextLine();
        System.out.print("Enter Age: ");
        int age=sc.nextInt();
        System.out.print("Enter Temprature: ");
        int Temprature=sc.nextInt();
        Hospitalmanagement h1=new Hospitalmanagement(patientId, patientName, age, Temprature);
        h1.temp();
    }
}
