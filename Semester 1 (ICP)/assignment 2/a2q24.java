class a2q24
{
	public static void main(String args[])
	{
		double a,b,c,d,e,av,mean;
		a=Math.random();
		b=Math.random();
		c=Math.random();
		d=Math.random();
		e=Math.random();
		av=a+b+c+d+e;
		av/=5.0;
		mean=Math.max(Math.max(Math.max(a, b), Math.max(c, d)), e);
		System.out.println("Number are :");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println("Average ="+av);
		System.out.println("Maximum ="+mean);
	}
}