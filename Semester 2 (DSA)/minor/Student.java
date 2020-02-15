import java.util.*;
public class Student
{
	String name;
	int roll,qty;
	Date issueDate, returnDate;
	Student()
	{
		name="";
		roll=0;
		qty=0;
	}
	public static void main(String args[])
	{
		
	}
	public String getName()
	{
		return name;
	}
	public int getRoll()
	{
		return roll;
	}
	public void issueBook()
	{
		
	}
	public void depositBook()
	{
		
	}
}
class Author
{
	private String name, email;
	private char gender;
	Author(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public char getGender()
	{
		return gender;
	}
	public String toString()
	{
		return "[name="+name+",email="+email+",gender="+gender+"]";
	}
}
class Book
{
	private String name;
	private Author author;
	private double price;
	private int qty;
	Book(String name, Author author, double price)
	{
		this.name=name;
		this.author=author;
		this.price=price;
	}
	Book(String name, Author author, double price, int qty)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	public String getName()
	{
		return name;
	}
	public Author getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty()
	{
		this.qty=qty;
	}
	public String toString()
	{
		return "[name="+name+",Author="+author.toString()+"price="+price+",quantity="+qty+"]";
	}
}
class Date
{
	int dd, mm, yyyy;
	Date(int dd, int mm, int yyyy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	Date()
	{
		dd=0;
		mm=0;
		yyyy=0;
	}
	public int getDD()
	{
		return dd;
	}
	public int getMM()
	{
		return mm;
	}
	public int getYYYY()
	{
		return yyyy;
	}
	public String toString()
	{
		return "[DD="dd+",MM="+mm+",YYYY="+yyyy+"]";
	}
}
