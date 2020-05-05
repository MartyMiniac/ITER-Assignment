import java.util.Scanner;
public class LinkedList
{
	public static Node create(Node start)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Regd_no :");
		int r=in.nextInt();
		System.out.print("Enter Marks :");
		float m=in.nextFloat();
		start = new Node(r,m);
		return start;
	}
	public static void display(Node start)
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
				System.out.println(i++ + "\t\t"+n.getRegd_no()+"\t\t"+n.getMarks());
				n=n.next;
			}
			while(n!=null);
		}
	}
	
	//Insertion
	
	public static Node InsBeg(Node start)
	{
		if(start==null)
		{
			start=create(start);
			return start;
		}
		else
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter Regd_no :");
			int r=in.nextInt();
			System.out.print("Enter Marks :");
			float m=in.nextFloat();
			Node n = new Node(r,m);
			n.next=start;
			return n;
		}
	}
	public static Node InsEnd(Node start)
	{
		if(start==null)
		{
			start=create(start);
			return start;
		}
		else
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter Regd_no :");
			int r=in.nextInt();
			System.out.print("Enter Marks :");
			float m=in.nextFloat();
			Node t=start;
			while(t.next!=null)
			{
				t=t.next;
			}
			Node n = new Node(r,m);
			t.next=n;
			return start;
		}
	}
	public static Node InsAny(Node start)
	{
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter the Postion number to insert Node at :");
		int p=in.nextInt();
		if(p==0)
		{
			return InsBeg(start);
		}
		else
		{
			Node n = start;
			for(int i=0; i<p-1; i++)
			{
				try
				{
					n=n.next;
					if(n==null)
						throw new NullPointerException();
				}
				catch(NullPointerException e)
				{
					System.out.println("Failed : Position entered in greater than the size of Linked List");
					return start;
				}
			}
			System.out.print("Enter Regd_no :");
			int r=in.nextInt();
			System.out.print("Enter Marks :");
			float m=in.nextFloat();
			Node t = new Node(r,m);
			t.next=n.next;
			n.next=t;
			return start;
		}
	}
	
	//Deletion
	
	public static Node DelBeg(Node start)
	{
		try
		{
			Node n=start;
			n=n.next;
			System.out.println("Deletion Successful");
			return n;
		}
		catch(NullPointerException e)
		{
			System.out.println("Please Create a Linked List First");
			return null;
		}
	}	
	public static Node DelEnd(Node start)
	{
		Node n=start;
		if(n==null)
		{
			System.out.println("Please Create a Linked List First");			
			return start;
		}
		else if(n.next==null)
		{
			System.out.println("Deletion Successful");
			return null;
		}
		else
		{
			while(n.next.next!=null)
			{
				n=n.next;
			}
			n.next=null;
			System.out.println("Deletion Successful");
			return start;
		}
	}
	public static Node DelAny(Node start)
	{
		Scanner in  = new Scanner(System.in);
		System.out.print("Enter the Postion number to Delete Node at :");
		int p=in.nextInt();
		if(p==0)
		{
			return DelBeg(start);
		}
		else
		{
			Node n = start;
			for(int i=0; i<p-1; i++)
			{
				try
				{
					n=n.next;
					if(n==null)
						throw new NullPointerException();
				}
				catch(NullPointerException e)
				{
					System.out.println("Failed : Position entered in greater than the size of Linked List");
					return start;
				}
			}
			try
			{
				Node t=n;
				t=t.next;
				n.next=t.next;
				System.out.println("Deletion Successful");
			}
			catch(NullPointerException e)
			{
				System.out.println("This Node Doesn't Exists");
			}
			return start;
		}
	}
	
	//search
	public static void search(Node start)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Regd_no. to be searched : ");
		int se=in.nextInt();
		boolean k=false;
		Node n=start;
		while(n!=null)
		{
			if(n.getRegd_no()==se)
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
			System.out.println(n.getRegd_no()+" has got "+n.getMarks()+" marks");
		}
		else
		{
			System.out.println("Search Element not found");
		}
	}
	
	//sort
	public static Node sort(Node start)
	{
		if(start==null)
		{
			System.out.println("Linked List is Empty");
			return null;
		}
		else
		{
			int len=count(start);
			float arr_m[] = new float[len];
			int arr_r[] = new int[len];
			Node n=start;
			for(int i=0; i<len; i++)
			{
				arr_m[i]=n.getMarks();
				arr_r[i]=n.getRegd_no();
				n=n.next;
			}
			for(int i=0; i<len-1; i++)
			{
				for(int j=i; j<len; j++)
				{
					if(arr_m[i]>arr_m[j])
					{
						float t1=arr_m[i];
						arr_m[i]=arr_m[j];
						arr_m[j]=t1;
						int t2=arr_r[i];
						arr_r[i]=arr_r[j];
						arr_r[j]=t2;
					}
				}
			}
			n = new Node(arr_r[0],arr_m[0]);
			start=n;
			for(int i=1; i<len; i++)
			{
				n.next= new Node(arr_r[i],arr_m[i]);
				n=n.next;
			}
			System.out.println("Linked List Sorted");
			return start;
		}
	}
	
	//count
	public static int count(Node start)
	{
		int i=0;
		Node n=start;
		while(n!=null)
		{
			i++;
			n=n.next;
		}
		return i;
	}
	
	//reverse
	public static Node reverse(Node start)
	{
		if(start==null)
		{
			System.out.println("Linked List is Empty");
			return null;
		}
		else
		{
			int len=count(start);
			float arr_m[] = new float[len];
			int arr_r[] = new int[len];
			Node n=start;
			for(int i=0; i<len; i++)
			{
				arr_m[i]=n.getMarks();
				arr_r[i]=n.getRegd_no();
				n=n.next;
			}
			for(int i=0; i<len/2; i++)
			{				
				float t1=arr_m[len-i-1];
				arr_m[len-i-1]=arr_m[i];
				arr_m[i]=t1;
				int t2=arr_r[len-i-1];
				arr_r[len-i-1]=arr_r[i];
				arr_r[i]=t2;
			}
			n = new Node(arr_r[0],arr_m[0]);
			start=n;
			for(int i=1; i<len; i++)
			{
				n.next= new Node(arr_r[i],arr_m[i]);
				n=n.next;
			}
			System.out.println("Linked List Reversed");
			return start;
		}
	}
	
	
	//Main Method
	public static void main(String[] args) 
	{
		Node start=null;
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
			System.out.println("10:Sort the Linked List");
			System.out.println("11:Count the number of elements in the Linked List");
			System.out.println("12:Reverse the Linked List");
			
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 0:
					System.out.println("Exiting The Program");
					sc.close();
					System.exit(0);
				case 1:
					start=create(start);
				break;
				case 2:
					display(start);
				break;
				case 3:
					start=InsBeg(start);
				break;
				case 4:
					start=InsEnd(start);
				break;
				case 5:
					start=InsAny(start);
				break;
				case 6:
					start=DelBeg(start);
				break;
				case 7:
					start=DelEnd(start);
				break;
				case 8:
					start=DelAny(start);
				break;
				case 9:
					search(start);
				break;
				case 10:
					start=sort(start);
				break;
				case 11:
					System.out.println("Number of Nodes in the Linked List ="+count(start));
				break;
				case 12:
					start=reverse(start);
				break;
				default:
					System.out.println("Wrong choice");
			}
		}
	}
}