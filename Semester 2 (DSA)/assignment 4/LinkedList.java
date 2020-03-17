import java.util.*;
public class LinkedList
{
	Node head;
	LinkedList()
	{
		head=null;
	}
	//Insertion
	public void InsBeg(Node start)
	{
		if(head==null)
		{
			this.head=start;
			head = new Node(start.getregd_no(),start.getmarks());
		}
		else
		{
			Node n = new Node(start.getregd_no(),start.getmarks());
			n.next=head;
			head=n;
		}
	}
	public void InsEnd(Node start)
	{
		Node t=head;
		if(head==null)
		{
			this.head=start;
			head = new Node(start.getregd_no(),start.getmarks());
		}
		else
		{
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next= new Node(start.getregd_no(),start.getmarks());
		}
	}
	public void InsAny(int l, Node start)
	{
		l--;
		Node n=head;
		int c=0;
		while(n.next!=null)
		{
			c++;
			if(c==l)
				break;
			n=n.next;
		}
		Node add = new Node(start.getregd_no(),start.getmarks());
		add.next=n.next;
		n.next=add;
	}
	//Deletion
	public void DelBeg()
	{
		head=head.next;
	}
	public void DelEnd()
	{
		int len=this.count();
		len=len-1;
		Node n=head;
		int c=0;
		while(n.next!=null)
		{
			c++;
			if(c==len)
				break;
			n=n.next;
		}
		n.next=null;
	}
	public void DelAny(int no)
	{
		int t=0;
		Node n=head;
		while(n.next!=null)
		{
			t++;
			if(n.getregd_no()==no)
				break;
			n=n.next;
		}
		n=head;
		t--;
		int c=0;
		while(n.next!=null)
		{
			c++;
			if(c==t)
				break;
			n=n.next;
		}
		n.next=(n.next).next;
	}
	public void search(int no)
	{
		boolean k=false;
		Node n=head;
		while(n.next!=null)
		{
			if(n.getregd_no()==no)
			{
				k=true;
				break;
			}
			n=n.next;
		}
		if(k==false)
		{
			System.out.print("Element not Found");
		}
		else
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Element Found");
			System.out.print("Enter the Updated Marks :");
			n.setMarks(in.nextFloat());
		}		
	}
	public void sort()
	{
		Node n=head;
		double arr[][] = new double[this.count()][2];
		for(int i=0; i<arr.length; i++)
		{
			arr[i][0]=n.getregd_no();
			arr[i][1]=n.getmarks();
			n=n.next;
		}
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i][1]<arr[j][1])
				{
					double t=arr[i][1];
					arr[i][1]=arr[j][1];
					arr[j][1]=t;
					t=arr[i][0];
					arr[i][0]=arr[j][0];
					arr[j][0]=t;
				}
			}
		}
		LinkedList ob = new LinkedList();
		for(int i=0; i<arr.length; i++)
		{
			Node nn = new Node((int)arr[i][0],(float)arr[i][1]);
			ob.InsEnd(nn);
		}
		this.head=ob.head;
	}
	public int count()
	{
		int c=0;
		Node n=head;
		while(n.next!=null)
		{
			c++;
			n=n.next;
		}
		c++;
		return c;
	}
	public void reverse()
	{
		Node n=head;
		double arr[][] = new double[this.count()][2];
		for(int i=0; i<arr.length; i++)
		{
			arr[i][0]=n.getregd_no();
			arr[i][1]=n.getmarks();
			n=n.next;
		}
		LinkedList ob = new LinkedList();
		for(int i=arr.length-1; i>=0; i--)
		{
			Node nn = new Node((int)arr[i][0],(float)arr[i][1]);
			ob.InsEnd(nn);
		}
		this.head=ob.head;
	}
	public void display()
	{
		Node n=head;
		while(n.next!=null)
		{
			System.out.println("Regd Number :"+n.getregd_no());
			System.out.println("Marks :"+n.getmarks());
			n=n.next;
		}
		System.out.println("Regd Number :"+n.getregd_no());
		System.out.println("Marks :"+n.getmarks());
	}
}
