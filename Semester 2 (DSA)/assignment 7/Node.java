public class Node
{
	protected Node next;
	protected int data;
	
	Node()
	{
		next=null;
	}
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	int getdata()
	{
		return data;
	}
	public String toString()
	{
		return data+"";
	}
}
