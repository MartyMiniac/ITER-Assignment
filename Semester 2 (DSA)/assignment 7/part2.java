import java.util.*;
public class part2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Node front=null, rear=null;
		
		while(true)
		{
			System.out.println("****MENU****");
			System.out.println("0 : Exit");
			System.out.println("1 : Insert");
			System.out.println("2 : Delete");
			System.out.println("3 : Display");
			System.out.println("Enter your Choice ");
			int sw=in.nextInt();
			switch(sw)
			{
				case 0:
					System.out.println("Exitting Program ");
					System.exit(0);
					break;
				case 1:
					front=insert(rear, front);
					rear=getRear(front);
					break;
				case 2:
					front=delete(rear, front);
					break;
				case 3:
					display(rear, front);
					break;
				default:
					System.out.println("Wrong Option Please Try Again");
			}
		}
	}
	public static Node insert(Node rear, Node front)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value to insert in Queue : ");
		Node n = new Node(in.nextInt());
		if(rear==null || front==null)
		{
			front = n;
			rear = n;
		}
		else
		{
			rear.next=n;
			rear=n;
		}
		return front;
	}
	public static Node delete(Node rear, Node front)
	{
		if(front==null)
		{
			System.out.println("Error : Stack UnderFlow");
		}
		else
		{
			front=front.next;
		}
		return front;
	}
	public static void display(Node rear, Node front)
	{
		Node n = front;
		if(n==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Elements of Queue are : ");
			while(n!=null)
			{
				System.out.println(n.info);
				n=n.next;
			}
		}
	}
	public static Node getRear(Node front)
	{
		if(front==null)
		{
			return null;
		}
		else
		{
			Node n = front;
			while(n.next!=null)
			{
				n=n.next;
			}
			return n;
		}
	}
}