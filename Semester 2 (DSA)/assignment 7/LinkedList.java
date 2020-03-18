public class LinkedList
{
	Node head;
	LinkedList()
	{
		head=null;
	}
	//Insertion
	public void add(int data)
	{
		Node t=head;
		if(head==null)
		{
			head = new Node(data);
		}
		else
		{
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next= new Node(data);
		}
	}
	//Deletion
	public void del()
	{
		if(head==null)
			System.out.println("Stack Underflow");
		else
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
	public void display()
	{
		Node n=head;
		if(n==null)
			System.out.println("Queue is Empty");
		else
		{
			while(n.next!=null)
			{
				System.out.println(n);
				n=n.next;
			}
			System.out.println(n);
		}
	}
}
