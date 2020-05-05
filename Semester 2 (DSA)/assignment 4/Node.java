
public class Node
{
	protected int regd_no;
	protected float mark;
	protected Node next;
	Node(int regd_no, float mark)
	{
		this.regd_no=regd_no;
		this.mark=mark;
		this.next=null;
	}
	public float getMarks()
	{
		return mark;
	}
	public int getRegd_no()
	{
		return regd_no;
	}
}
