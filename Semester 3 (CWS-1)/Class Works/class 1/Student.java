/*Write a Program to create a student class with data members as name, branch section, 
registration number, mark1 , mark2 and data function as getdata() = to get info, 
display()= to display info, add()= to add the marks and display it using display method.*/

import java.util.*;
public class Student
{
	int mark1, mark2;
	String name, branch;
	char section;
	long regno;
	Student()
	{
		mark1=0;
		mark2=0;
		name="";
		regno=0;
		section='\0';
	}
	Student(String name, String branch, char section, long regno, int mark1, int mark2)
	{
		this.name=name;
		this.branch=branch;
		this.section=section;
		this.regno=regno;
		this.mark1=mark1;
		this.mark2=mark2;
	}
	void display()
	{
		System.out.println("Hi, "+this.name+" ("+this.regno+")");
		System.out.println("Your Branch is "+this.branch);
		System.out.println("Your Section is "+this.section);
		System.out.println("Your Mark1 is "+this.mark1);
		System.out.println("Your Mark2 is "+this.mark2);
	}
	void add()
	{
		int total=this.mark1+this.mark2;
		this.display();
		System.out.println("Your Total is : "+total);
	}
}
