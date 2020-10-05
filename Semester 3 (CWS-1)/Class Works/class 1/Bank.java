import java.util.Scanner;

//Write a Program to create a bank application to perform basic operations like withdraw and deposit
public class Bank
{
	private long balance;
	Bank()
	{
		balance=0;
	}
	Bank(long b)
	{
		this.balance=b;
	}
	void deposit(int d)
	{
		if(d<0)
		{
			System.out.println("Error : Deposit amount cannont be Negative");
			return;
		}
		this.balance+=d;
	}
	void withdraw(int d)
	{
		if(d<0)
		{
			System.out.println("Error : Withdraw amount cannot be Negative");
			return;
		}
		this.balance-=d;
		if(this.balance<0)
		{
			this.balance+=d;
			System.out.println("Error : Your Balance Cannot be Negative");
		}
	}
	void displayBalance()
	{
		System.out.println("Your Current Balance is : "+this.balance);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Inital Balance : ");
		long b=in.nextLong();
		Bank ob = new Bank(b);
		while(true)
		{
			System.out.println("Enter\n0 to Exit\n1 to Deposit\n2 to Withdraw\n3 to Display Balance");
			int ch=in.nextInt();
			switch(ch)
			{
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.print("Enter amount to be Deposited : ");
				int tmp=in.nextInt();
				ob.deposit(tmp);
				ob.displayBalance();
				break;
			case 2:
				System.out.print("Enter amount to be Withdrawn : ");
				tmp=in.nextInt();
				ob.withdraw(tmp);
				ob.displayBalance();
				break;
			case 3:
				ob.displayBalance();
				break;
			default:
				System.out.println("Error : Invalid Option");
			}
		}
	}
}
