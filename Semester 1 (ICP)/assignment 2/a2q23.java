class a2q23
{
	public static void main(String args[])
	{
		int a,b,c,s;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		s=a+b+c;
		s=s-Math.max(Math.max(a, b), Math.max(b, c))-Math.min(Math.min(a, b), Math.min(b, c));
		System.out.print(Math.max(Math.max(a, b), Math.max(b, c))+">"+s+">"+Math.min(Math.min(a, b),Math.min(b,c)));
	}
}