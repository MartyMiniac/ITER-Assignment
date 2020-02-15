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
}
class Manager extends Employee implements EmpInterface
{
	double bonus;
	String empID, fName;
	double salary;
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
		Manager ob = new Manager();
		System.out.print("Enter the Name of the Employee :");
		String name=in.nextLine();
		System.out.print("Enter the Employee ID : ");
		String id=in.nextLine();
		System.out.print("Enter the Employee Salary : ");
		double salary=in.nextDouble();
		ob.
	}
}