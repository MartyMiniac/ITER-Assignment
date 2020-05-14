public class Node
{
	protected int regd_no;
	protected float mark;
	protected Node next;
	protected Node prev;
	Node(int regd_no, float mark, Node prev)
	{
		this.regd_no=regd_no;
		this.mark=mark;
		this.prev=prev;
		this.next=null;
	}	
}