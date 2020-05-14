import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Node start=null, end=null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{	
			System.out.println("****MENU*****");
			System.out.println("0:Exit");
			System.out.println("1:Creation");
			System.out.println("2:Display");
			System.out.println("3:Insert in Begining");
			System.out.println("4:Insert in Ending");
			System.out.println("5:Insert at any Positon");
			System.out.println("6:Delete in Begining");
			System.out.println("7:Delete in Ending");
			System.out.println("8:Delete at any Positon");
			System.out.println("9:Search the Linked List");
			
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 0:
					System.out.println("Exiting The Program");
					sc.close();
					System.exit(0);
				case 1:
					start=create(start,end);
					end=start;
				break;
				case 2:
					display(start,end);
				break;
				case 3:
					start=InsBeg(start,end);
					if(start==null)
					{
						start=create(start,end);
						end=start;
					}
				break;
				case 4:
					end=InsEnd(start,end);
					if(end==null)
					{
						start=create(start, end);
						end=start;
					}
				break;
				case 5:
					start=InsAny(start,end);
					end=getEnd(start);
				break;
				case 6:
					start=DelBeg(start,end);
				break;
				case 7:
					end=DelEnd(start,end);
				break;
				case 8:
					start=DelAny(start,end);
					end=getEnd(start);
				break;
				case 9:
					search(start);
				break;
				default:
					System.out.println("Wrong choice");
			}
		}
	}
	public static Node create(Node start, Node end)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Regd_no : ");
		int regd_no=in.nextInt();
		System.out.print("Enter the Marks :");
		float mark=in.nextFloat();
		Node n = new Node(regd_no, mark, null);
		return n;
	}
	public static void display(Node start, Node end)
	{
		Node n=start;
		if(n==null)
		{
			System.out.println("Linked List is Empty");
		}
		else
		{
			int i=0;
			System.out.println("Position Number\tRegd No.\tMarks");
			do
			{
				System.out.println(i++ + "\t\t"+n.regd_no+"\t\t"+n.mark);
				n=n.next;
			}
			while(n!=null);
		}
	}
	public static Node getEnd(Node start)
	{
		if(start==null)
		{
			return null;
		}
		else
		{
			Node n=start;
			while(n.next!=null)
			{
				n=n.next;
			}
			return n;
		}
	}
	public static Node InsBeg(Node start, Node end)
	{
		if(start==null)
		{
			return null;
		}
		else
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the Regd_no : ");
			int regd_no=in.nextInt();
			System.out.print("Enter the Marks :");
			float mark=in.nextFloat();
			Node n = new Node(regd_no, mark, null);
			start.prev=n;
			n.next=start;
			return n;
		}
	}
	public static Node InsEnd(Node start, Node end)
	{
		if(end==null)
		{
			return null;
		}
		else
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the Regd_no :");
			int regd_no=in.nextInt();
			System.out.print("Enter the marks :");
			float mark=in.nextFloat();
			Node n = new Node(regd_no, mark, end);
			end.next=n;
			return n;
		}
	}
	public static Node InsAny(Node start, Node end)
	{
		if(start==null)
		{
			return null;
		}
		else
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the Position number where to add the Node :");
			int c=in.nextInt();
			Node t=start;
			int i=0;
			while(i<c)
			{
				i++;
				if(t.next==null)
				{
					System.out.print("Error : Entered Position number is more that the length of Linked List");
					return start;
				}
				t=t.next;
			}
			System.out.print("Enter the Regd_no :");
			int regd_no=in.nextInt();
			System.out.print("Enter the marks :");
			float mark=in.nextFloat();
			Node n = new Node(regd_no, mark, t);
			n.next=t.next;
			t.next.prev=n;
			t.next=n;
			return start;
		}
	}
	public static Node DelBeg(Node start, Node end)
	{
		if(start==null)
		{
			System.out.println("Linked List Empty ");
			return null;
		}
		else
		{
			Node n=start;
			n=n.next;
			n.prev=null;
			return n;
		}
	}
	public static Node DelEnd(Node start, Node end)
	{
		if(end==null)
		{
			System.out.print("Linked List Empty");
			return null;
		}
		else
		{
			Node n = end;
			n=n.prev;
			n.next=null;
			return n;
		}
	}
	public static Node DelAny(Node start, Node end)
	{
		if(start==null)
		{
			return null;
		}
		else
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the Position number to be deleted");
			int c=in.nextInt();
			if(c==0)
			{
				return DelBeg(start,end);
			}
			else
			{
				Node n=start;
				int i=0;
				while(i<c-1)
				{
					n=n.next;
					if(n==null)
					{
						System.out.println("Error : Entered Position number is more that the length of Linked List");
						return start;
					}
					i++;
				}
				try
				{
					n.next=n.next.next;
					n.next.prev=n;
				}
				catch(NullPointerException e)
				{
					//expeected null pointer exception
				}
				System.out.println("Postion number "+c+" deleted");
				return start;
			}
		}
	}
	public static void search(Node start)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Regd_no. to be searched : ");
		int se=in.nextInt();
		boolean k=false;
		Node n=start;
		while(n!=null)
		{
			if(n.regd_no==se)
			{
				k=true;
				break;
			}
			else
			{
				n=n.next;
			}
		}
		if(k)
		{
			System.out.println(n.regd_no+" has got "+n.mark+" marks");
		}
		else
		{
			System.out.println("Search Element not found");
		}
	}
}
