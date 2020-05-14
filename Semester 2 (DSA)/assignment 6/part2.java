import java.util.*;
public class part2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Node top=null;
		while(true)
		{
			System.out.println("****MENU****");
			System.out.println("0:Exit");
			System.out.println("1:Push");
			System.out.println("2:Pop");
			System.out.println("3:Display");
			System.out.println("Enter your choice");
			int choice=in.nextInt();
			switch(choice)
			{
				case 0:
					System.out.println("Exiting Program");
					System.exit(0);
					break;
				case 1:
					top=push(top);
					break;
				case 2:
					top=pop(top);
					break;
				case 3:
					display(top);
					break;
				default:
				System.out.println("Wrong choice");
			}
		}
	}
	public static Node push(Node top)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value to Push :");
		Node n = new Node(in.nextInt());
		n.next=top;
		top=n;
		return top;
	}
	public static Node pop(Node top)
	{
		if(top==null)
		{
			System.out.println("Error : Stack UnderFlow");
			return null;
		}
		else
		{
			Node n=top;
			n=n.next;
			return n;
		}
	}
	public static void display(Node top)
	{
		if(top==null)
		{
			System.out.println("Stack Empty");
		}
		else
		{
			System.out.println("Elements of Stack");
			Node n=top;
			while(n!=null)
			{
				System.out.println(n.info);
				n=n.next;
			}
		}
	}
}