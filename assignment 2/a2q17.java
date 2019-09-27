class a2q17
{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		if(a>(b+c))
			System.out.print(true);
		else if(b>(a+c))
			System.out.print(true);
		else if(c>(a+b))
			System.out.print(true);
		else
			System.out.print(false);
	}
}