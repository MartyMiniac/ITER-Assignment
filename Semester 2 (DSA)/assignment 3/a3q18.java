import java.util.*;
public class a3q18
{
	public static void main(String args[])
	{
		queue arr[] = new queue[3];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number of Rings :");
		int n=in.nextInt();
		for(int i=0; i<3; i++)
		{
			arr[i]= new queue(n, "Queue "+i);
		}
		for(int i=n; i>=1; i--)
		{
			arr[0].push(i);
			System.out.println(arr[0]);
		}
		set(n, arr, 0, 1, 2);
	}
	public static void set(int i, queue[] arr, int q1, int q2, int q3)
	{
		if(i>0)
		{
			set(i-1, arr, q1, q3, q2);
			swapDisk(q1, q2, arr);
			for(queue t:arr)
			{
				System.out.println(t.getName()+" :"+t);
			}
			set(i-1, arr, q3, q2, q1);
		}
	}
	public static void swapDisk(int q1, int q2, queue[] arr)
	{
		int t=arr[q1].peek();
		if(t>0)
		{	
			arr[q2].push(t);
			arr[q1].pop();
		}
	}
}
class queue
{
	private int arr[];
	private String name;
	int top;
	queue(int n, String name)
	{
		this.name=name;
		top=-1;
		arr = new int[n];
	}
	String getName()
	{
		return name;
	}
	void pop()
	{
		if(top==-1)
		{
			try
			{
				throw new StackUnderflowException("Queue is already Empty");
			}
			catch(StackUnderflowException e)
			{
				e.printStackTrace();
			}
		}
		else
			top--;
	}
	int peek()
	{
		if(top!=-1)
		{
			return arr[top];
		}
		else
		{
			System.out.print("Queue is Empty, Nothing to show");
			return -1;
		}
	}
	void push(int i)
	{
		if(top==arr.length)
		{
			try
			{
				throw new StackOverflowException("Queue is already full");
			}
			catch(StackOverflowException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			top++;
			arr[top]=i;
		}
	}
	int[] show()
	{
		if(top==-1)
		{			
				return null;
		}
		else
		{
			int rt[] = new int[top+1];
			for(int i=0; i<=top; i++)
			{
				rt[i]=arr[i];
			}
			return rt;
		}
	}
	public String toString()
	{
		if(show()!=null)
		{
			int[] rt=show();
			String s="[";
			for(int i:rt)
			{
				s=s+i+", ";
			}
			s=s+"]";
			return s;
		}
		else
			return "[ ]";
	}
}
class StackUnderflowException extends Exception
{
	StackUnderflowException(String s)
	{
		super(s);
	}
}
class StackOverflowException extends Exception
{
	StackOverflowException(String s)
	{
		super(s);
	}
}
