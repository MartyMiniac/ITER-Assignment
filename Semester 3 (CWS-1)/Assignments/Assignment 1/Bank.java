//Create a bank application to perform basic operation as withdraw and deposit using object-oriented approaches.

import java.util.*;

public class Bank
{
	private long balance;
	Bank(long b)
	{
		this.balance=b;
	}
	Bank()
	{
		this.balance=0;
	}
	private void withdraw(long n)
	{
		if(n<0)
		{
			System.out.println("Error : Withdraw Cannot be Negetive");
			return;
		}
		this.balance-=n;
		if(this.balance<0)
		{
			System.out.println("Error : Not Enough Balance");
			this.balance+=n;
		}
		else
		{
			System.out.println("Withdraw : Rs. "+n+" Withdrawn");
		}
	}
	private void deposit(long n)
	{
		if(n<0)
		{
			System.out.println("Error : Deposit Cannot be Negetive");
			return;
		}
		this.balance+=n;
		System.out.println("Deposit : Rs. "+n+" Deposited");
	}
	private void display()
	{
		System.out.println("Message : Your Current Balance is "+this.balance);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Intial Balance : ");
		Bank ob = new Bank(in.nextLong());
	}
}
