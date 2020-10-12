//Write program to create a static function to check a number is prime or not. 

import java.util.*;

public class a1q3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=in.nextInt();
		
		if(n%2==0 && n!=2)
		{
			System.out.println(n+" is non Prime");
			System.exit(0);
		}
		int sqrt=(int)(Math.sqrt(n));
		for(int i=3; i<=sqrt; i+=2)
		{
			if(n%i==0)
			{
				System.out.println(n+" is non Prime");
				System.exit(0);
			}
		}
		
		System.out.println(n+" is Prime Number");
		System.exit(0);
	}
}
