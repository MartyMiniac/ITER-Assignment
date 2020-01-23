//Doubt
//Not done yet as the question is not clear
import java.util.*;
public class a2q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The number of Accounts needed to be created : ");
		int n=in.nextInt();
		CreditCard wallet[] = new CreditCard[n];
		for(int i=0; i<n; i++)
		{
			CreditCard[i] = new CreditCard();
		}
	}
}
class CreditCard
{
	// - means private
	// + means protected
	// # means public
	private String customer, bank, account;
	private int limit;
	protected double balance;
	
	CreditCard(String customer, String bank, String account, int limit, double balance)
	{
		this.customer=customer;
		this.bank=bank;
		this.account=account;
		this.limit=limit;
		this.balance=balance;
	}
	CreditCard(String customer, String bank, String account, int limit)
	{
		this.CreditCard(customer, bank, account, limit, 500.0d)
	}

	public String getCustomer()
	{
		return customer;
	}
	public String getBank()
	{
		return bank;
	}
	public String getAccount()
	{
		return account;
	}
	public int getLimit()
	{
		return limit;
	}
	public double getBalance()
	{
		return balance;
	}
	public boolean charge(double price)
	{
		return price>limit;
	}
	public makePayment(double amount)
	{

	}
	public static void printSummary(CreditCard card)
	{
		System.out.println("Sumtomer Name : "+card.customer);
		System.out.println("Bank Name : "+card.bank);
		System.out.println("Account Number : "+card.account);
		System.out.println("Account Limit : "+card.limit);
		System.out.println("Currernt Balance : "+card.balance);
	}
}
class PredatoryCreditCard extends CreditCard
{
	// - means private
	// + means protected
	// # means public
	private double arp;

	PredatoryCreditCard(double arp)
	{
		this.arp=arp;
	}

	protected boolean charge(double price)
	{
		return balance>getLimit();
	}
	protected void processMonth()
	{

	}
}