import java.util.*;
public class part1
{
	public static final int MAX=10;
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int stack[] = new int[MAX];
		int top=-1;
		while(true)
		{
			System.out.println("***MENU***");
			System.out.println("0: Exit");
			System.out.println("1: Push");
			System.out.println("2: Pop");
			System.out.println("3: Display");
			System.out.println("Enter your choice");
			int choice=in.nextInt();
			switch(choice)
			{
				case 0:
					System.out.println("Exiting Program");
					System.exit(0);
					break;
				case 1:
					top=push(stack,top);
					break;
				case 2:
					top=pop(stack, top);
					break;
				case 3:
					display(stack, top);
					break;
				default:
				System.out.println("Invalid choice");	
			}
		}
	}
	public static int push(int S[], int top)
	{
		if(isFull(top))
		{
			System.out.print("Error : Stack OverFlow");
			return top;
		}
		else
		{
			top++;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the Element to Push : ");
			S[top]=in.nextInt();
			return top;
		}
	}
	public static int pop(int S[], int top)
	{
		if(isEmpty(top))
		{
			System.out.println("Error : Stack UnderFlow");
			return top;
		}
		else
		{
			top--;
			return top;
		}
	}
	public static void display(int S[], int top)
	{
		if(isEmpty(top))
		{
			System.out.println("Stack Empty");
		}
		else
		{
			System.out.println("Elements in the stack");
			for(int i=0; i<=top; i++)
			{
				System.out.println(S[i]);
			}
		}
	}
	public static boolean isFull(int top)
	{
		return MAX-1==top;
	}
	public static boolean isEmpty(int top)
	{
		return top==-1;
	}
}
