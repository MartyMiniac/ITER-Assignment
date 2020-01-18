import java.util.*;
class a3q17
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an Integer : ");
		int n=in.nextInt();
		boolean k1=false,k2=false;
		if((n%5==0)&&(n%6==0))
			k1=true;
		if((n%5==0)||(n%6==0))
			k2=true;
		System.out.println("Is "+n+" divisible by 5 and 6? "+k1);
		System.out.println("Is "+n+" divisible by 5 or 6? "+k2);
		System.out.println("Is "+n+" divisible by 5 or 6 but not both? "+((k1==false)&&(k2==true)));
	}
}