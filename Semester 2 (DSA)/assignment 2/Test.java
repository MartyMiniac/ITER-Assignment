//a2q8.java
import java.util.*;
interface EmpInterface
{
	void displayEmp();
	void giveBonus(double amount);
}
abstract class Employee
{
	String empID, fName;
	double salary;
	Employee(String empID, String fName, double salary)
	{
		this.empID=empID;
		this.fName=fName;
		this.salary=salary;
	}
}
class Manager extends Employee implements EmpInterface
{
	double bonus;
	Manager(String empID, String fName, double salary)
	{
		super(empID, fName, salary);
	}
	public void displayEmp()
	{
		System.out.println("Employee Id : "+empID);
		System.out.println("Employee Name : "+fName);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Bonus : "+bonus);
		}
	public void giveBonus(double amount)
	{
		bonus=amount;
	}
}
public class Test
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Name of the Employee :");
		String name=in.nextLine();
		System.out.print("Enter the Employee ID : ");
		String id=in.nextLine();
		System.out.print("Enter the Employee Salary : ");
		double salary=in.nextDouble();
		Manager ob = new Manager(id, name, salary);
		System.out.print("Enter the Amount of Bonus :");
		ob.giveBonus(in.nextDouble());
		ob.displayEmp();
	}
}
