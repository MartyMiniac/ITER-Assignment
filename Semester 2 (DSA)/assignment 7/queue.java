public class queue
{
	int Q[];
	int rear, front;
	
	queue(int n)
	{
		Q = new int[n];
		rear=0;
		front=0;
	}
	public void insert(int i)
	{
		if(front==Q.length)
			System.out.println("Stack Overflow");
		else
		{
			Q[front]=i;
			front++;
		}
	}
	public void delete()
	{
		if(front==rear)
			System.out.println("Stack Underflow");
		else
			rear++;		
	}
	public void display()
	{
		for(int i=rear; i<front; i++)
		{
			System.out.println(Q[i]);
		}
	}
	public boolean is_full()
	{
		return front==Q.length-1;
	}
	public boolean is_empty()
	{
		return front==rear;
	}
}