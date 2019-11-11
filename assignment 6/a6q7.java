class a6q7
{
	public static void main(String args[])
	{
		a6q7 ob = new a6q7();
		for(int a=2; a<=1000; a++)
		{
			if(ob.isPrime(a) && ob.isPrime(a+2))
			{
				System.out.println("("+a+","+(a+2)+")");
			}
		}
	}
	public boolean isPrime(int n)
	{
		int c=0;
		for(int a=2; a<=Math.sqrt(n); a++)
		{
			if(n%a==0)
				c++;
		}
		return c==0;
	}
}
