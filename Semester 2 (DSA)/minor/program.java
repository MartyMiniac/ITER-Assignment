import java.util.*;
public class program
{
	public static void main(String args[])
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