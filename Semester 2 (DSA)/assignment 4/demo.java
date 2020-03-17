import java.util.*;
public class demo
{
	LinkedList list = new LinkedList();
	public static void main(String args[])
	{
		demo ob = new demo();
		ob.start();
	}
	public void start()
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("****MENU*****");
			System.out.println("0:Exit");
			System.out.println("1:Insertion");
			System.out.println("2:Deletion");
			System.out.println("3:Search");
			System.out.println("4:Sort");
			System.out.println("5:Count");
			System.out.println("6:Reverse");
			System.out.println("7:Display");
			System.out.println("Enter the choice");
			int choice=in.nextInt();
			switch(choice)
			{
				case 0:
				System.out.print("Exiting");
				System.exit(0);
				case 1:
				insert();
				break;
				case 2:
				delete();
				break;
				case 3:
				System.out.print("Enter the Regd No of search Element :");
				int n=in.nextInt();
				list.search(n);
				break;
				case 4:
				list.sort();
				System.out.println("List Sorted");
				break;
				case 5:
				System.out.println("Number of Elements ="+list.count());
				break;
				case 6:
				list.reverse();
				System.out.println("List Reversed");
				break;
				case 7:
				list.display();
				break;
				default:
				System.out.println("Wrong choice");
			}
		}
	}
	public void insert()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Regd No :");
		int reg=in.nextInt();
		System.out.print("Enter the Marks :");
		float m=in.nextFloat();
		Node n = new Node(reg,m);
		System.out.println("****MENU*****");
		System.out.println("0:Exit");
		System.out.println("1:Insert in the Begnning");
		System.out.println("2:Insert in the Ending");
		System.out.println("3:Insert in the Between");
		System.out.println("Enter the choice");
		int choice=in.nextInt();
		switch(choice)
		{
			case 0:
			System.exit(0);
			case 1:
			list.InsBeg(n);
			break;
			case 2:
			list.InsEnd(n);
			break;
			case 3:
			System.out.print("Enter the Postion you want to insert to :");
			int p=in.nextInt();
			list.InsAny(p, n);
			break;
			default:
			System.out.println("Wrong choice");
		}
	}
	public void delete()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("****MENU*****");
		System.out.println("0:Exit");
		System.out.println("1:Delete from the Begnning");
		System.out.println("2:Delete from the Ending");
		System.out.println("3:Delete from the Between");
		System.out.println("Enter the choice");
		int choice=in.nextInt();
		switch(choice)
		{
			case 0:
			System.exit(0);
			case 1:
			list.DelBeg();
			break;
			case 2:
			list.DelEnd();
			break;
			case 3:
			System.out.print("Enter the Postion you want to delete :");
			int p=in.nextInt();
			list.DelAny(p);
			break;
			default:
			System.out.println("Wrong choice");
		}
	}
}
