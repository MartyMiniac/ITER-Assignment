class a2q15
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		int r=Math.min(a, b)+(int)(Math.random()*Math.abs(a-b));
		System.out.println(r);
	}
}