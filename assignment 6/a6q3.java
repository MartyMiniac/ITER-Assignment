import java.util.*;
class a6q3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n=in.nextInt();
		System.out.println("Reverse Nunber ="+reverse(n));
		if(isPalindrome(n))
			System.out.println(n+" is a palindrome number");
		else
			System.out.println(n+" is not a palindrome number");
	}
	public static int reverse(int number)
	{
		int s=0;
		while(number>0)
		{
			s=s*10+number%10;
			number/=10;
		}
		return s;
	}
	public static boolean isPalindrome(int number)
	{
		return number==reverse(number);
	}
}
