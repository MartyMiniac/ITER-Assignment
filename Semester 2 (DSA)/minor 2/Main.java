import java.util.Scanner;
public class Main
{
	public static Node create()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the degree of Equation :");
		int d=in.nextInt();
		d++;
		int arr[] = new int[d];
		
		for(int i=0; i<d; i++)
		{
			System.out.println("Enter for x^"+i);			
			arr[i]=in.nextInt();
			for(int j=i; j>=0; j--)
			{
				if(arr[j]>0)
					System.out.print("+");
				System.out.print(arr[j]+"x^"+j);
			}
			System.out.println();
		}
		Node start= new Node(arr[0],0);
		Node n,t;
		n=start;
		for(int i=1; i<d; i++)
		{
			t= new Node(arr[i],i);
			n.next=t;
			n=t;
		}
		return start;
	}
	public static Node rev(Node n)
	{
		if(n==null)
		{
			return null;
		}
		else
		{
			int len=len(n);
			int arr[][] = new int[2][len];
			for(int i=0; i<arr[0].length; i++)
			{
				arr[0][i]=n.getCoeff();
				arr[1][i]=n.getExp();
				n=n.next;
			}
			Node t = new Node(arr[0][arr[0].length-1],arr[1][arr[0].length-1]);
			Node rt=t;
			for(int i=arr[0].length-2; i>=0; i--)
			{
				Node tmp = new Node(arr[0][i], arr[1][i]);
				t.next=tmp;
				t=tmp;
			}
			return rt;
		}
	}
	public static void display(Node n)
	{
		if(n==null)
		{
			System.out.println("The Expression doesn't Exists First Create the Expression");
		}
		else
		{
			n=rev(n);
			System.out.print(n.getCoeff()+"x^"+n.getExp());
			n=n.next;
			while(n!=null)
			{
				if(n.getCoeff()>0)
				{
					System.out.print("+");
				}
				System.out.print(n.getCoeff()+"x^"+n.getExp());
				n=n.next;
			}
		}
		System.out.println();
	}
	public static int len(Node n)
	{
		int c=0;
		if(n==null)
		{
			return 0;
		}
		else
		{
			while(n!=null)
			{
				c++;
				n=n.next;
			}
			return c;
		}
	}
	public static int degree(Node n)
	{
		if(n==null)
		{
			return 0;
		}
		else
		{
			int d=0;
			while(n!=null)
			{
				d++;
				n=n.next;
			}
			return d;
		}
	}
	public static Node add(Node exp1, Node exp2)
	{
		if(exp1==null)
		{
			System.out.println("Error : Expression 1 Not Entered");
			return null;
		}
		else if(exp2==null)
		{
			System.out.println("Error : Expression 2 Not Entered");
			return null;
		}
		else
		{
			int l1=len(exp1), l2=len(exp2), len3=Math.max(l1, l2);
			int degree=Math.max(degree(exp1), degree(exp2));
			int arr[] = new int[degree+1];
			for(int i=0; i<=degree; i++)
			{
				arr[i]=0;
			}
			Node n=exp1;
			int d=0;
			while(n!=null)
			{
				arr[n.getExp()]+=n.getCoeff();
				n=n.next;
			}
			n=exp2;
			while(n!=null)
			{
				arr[n.getExp()]+=n.getCoeff();
				n=n.next;
			}
			Node exp3 = new Node(arr[0],0);
			Node t;
			n=exp3;
			for(int i=1; i<degree; i++)
			{
				t= new Node(arr[i],i);
				n.next=t;
				n=t;
			}
			return exp3;
		}
	}
	public static void main(String args[])
	{
		//exp3 is the final expression after the summation
		Node exp1=null, exp2=null, exp3=null;
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("***MENU***");
			System.out.println("0: Exit");
			System.out.println("1: Enter the First Expression");
			System.out.println("2: Enter the Second Expression");
			System.out.println("3: Display the First Expression");
			System.out.println("4: Display the Second Expression");
			System.out.println("5: Display the Final Expression after Summation");
			System.out.println("6: Add the First and the Second Expression");
			int ch=in.nextInt();
			switch(ch)
			{
				case 0:
					System.out.println("Exiting the program");
					in.close();
					System.exit(0);
				break;
				case 1:
					exp1=create();
				break;
				case 2:
					exp2=create();
				break;
				case 3:
					display(exp1);
				break;
				case 4:
					display(exp2);
				break;
				case 5:
					display(exp3);
				break;
				case 6:
					exp3=add(exp1,exp2);
				break;
				default:
					System.out.println("Option not Available\nPlease Try Again");
			}
		}
	}
}
