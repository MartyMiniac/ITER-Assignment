import java.util.*;
class a6q9
{
	public static void main(String args[])
	{
		a6q9 ob = new a6q9();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value for the form a/b + c/d\n a = ");
		int a=in.nextInt();
		System.out.print(" b = ");
		int b=in.nextInt();
		System.out.print(" c = ");
		int c=in.nextInt();
		System.out.print(" d = ");
		int d=in.nextInt();
		int lcm=ob.LCM(b,d);
		a=ob.commonD(a,b,lcm);
		c=ob.commonD(c,d,lcm);
		int f1=a+c, f2=f1/lcm;
		f1=f1%lcm;
		System.out.println("Answer = "+f2+"+("+f1+"/"+lcm+")");
	}
	public int LCM(int n1, int n2)
	{
		int l=1;
		int a=2;
		while(true)
		{
			if(n1%a==0 && n2%a==0)
			{
				l=l*a;
				n1=n1/a;
				n2=n2/a;
			}
			else
			{
				a++;
			}
			if(a>Math.max(n1,n2))
				break;
		}
		l=l*n1*n2;
		return l;
	}
	public int commonD(int r,int a, int l)
	{
		int m=l/a;
		return r*m;
	}
}
