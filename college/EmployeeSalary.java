import java.util.Scanner;

public class EmployeeSalary {
    int employeeId;
    String name;
    int basicSalary;

    public EmployeeSalary(int employeeId, String name, int basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    public void Calculate(){
        int HRA = (basicSalary * 20) / 100;
        int DA = (basicSalary * 10) / 100;
        int grossSalary = basicSalary + HRA + DA;

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + grossSalary);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int employeeId=sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        int basicSalary=sc.nextInt();
        EmployeeSalary e1=new EmployeeSalary(employeeId, name, basicSalary);
        e1.Calculate();
    }
}
