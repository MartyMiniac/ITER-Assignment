public class Node
{
	protected int exp, coeff;
	protected Node next;
	Node(int coeff, int exp)
	{
		this.coeff=coeff;
		this.exp=exp;
		this.next=null;
	}
	public int getExp()
	{
		return this.exp;
	}
	public int getCoeff()
	{
		return this.coeff;
	}
}
