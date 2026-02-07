import java.util.*;

class Employee 
{
    private String employeeName;
    private double employeeSalary;    
    void readEmployeeData() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        employeeSalary = scanner.nextDouble();
    }
    void displayEmployeeData() 
    {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}  

public class Program2_2 
{   
    public static void main(String args[]) 
    {
        Employee emp1 = new Employee();
        emp1.readEmployeeData();
        System.out.println();
        emp1.displayEmployeeData();
    }
}