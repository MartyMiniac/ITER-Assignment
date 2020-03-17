public class Node
{
	protected Node next;
	protected int regd_no;
	protected float marks;
	
	Node()
	{
		next=null;
	}
	Node(int regd_no, float marks)
	{
		this.regd_no=regd_no;
		this.marks=marks;
		next=null;
	}
	void setMarks(float marks)
	{
		this.marks=marks;
	}
	int getregd_no()
	{
		return regd_no;
	}
	float getmarks()
	{
		return marks;
	}
}
