import java.util.Scanner;
class Employee{
    String name;
    int salary;
    public Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{
    int bonus;
    public Manager(String name, int salary, int bonus){
        super(name,salary);
        this.bonus=bonus;
    }
    public void display(){
        super.display();
        System.out.println("Bonus: "+bonus);
    }

}
public class Employeeinherit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        int salary=sc.nextInt();
        System.out.print("Enter Manager Bonus: ");
        int bonus=sc.nextInt();
        Employee e1=new Employee(name,salary);
        e1.display();
        Manager m1=new Manager(name,salary,bonus);
        m1.display();
    }
}