class a2q8
{
	public static void main(String args[])
	{
		System.out.println("a\tb\tpow(a,b)");
		for(int a=1; a<=5; a++)
		{
			System.out.println(a+"\t"+(a+1)+"\t"+(int)Math.pow(a, (a+1)));
		}
	}
}