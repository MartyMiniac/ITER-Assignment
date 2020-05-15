import java.util.*;
public class part1
{
	public static final int MAX=5;
	public static int front=-1;
	public static int rear=-1;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int queue[]=new int[MAX];
		while(true)
		{
			System.out.println("***MENU***");
			System.out.println("0: Exit");
			System.out.println("1: Insert");
			System.out.println("2: Delete");
			System.out.println("3: Display");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 0:
					System.out.println("Exitting Program ");
					System.exit(0);
					break;
				case 1:
					insert(queue);
					break;
				case 2:
					delete(queue);
					break;
				case 3:
					display(queue);
					break;
				default:
				System.out.println("Invalid choice");
			}
		}
	}
	public static void insert(int Q[])
	{
		if(isFull())
		{
			System.out.println("Error : Stack OverFlow");
		}
		else
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter value to be inserted : ");
			Q[++rear]=in.nextInt();
		}
	}
	public static void delete(int Q[])
	{
		if(isEmpty())
		{
			System.out.println("Error : Stack UnderFlow");
		}
		else
		{
			front++;
		}
	}
	public static void display(int Q[])
	{
		if(isEmpty())
		{
			System.out.println("Error : Queue is Empty");
		}
		else
		{
			System.out.println("Queue Contains");
		}
			for(int i=front+1; i<=rear; i++)
			{
				System.out.println(Q[i]);
			}
	}
	public static boolean isFull()
	{
		return rear==MAX-1;
	}
	public static boolean isEmpty()
	{
		return rear==front;
	}
}