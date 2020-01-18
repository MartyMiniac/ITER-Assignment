class a6q6
{
	public static void main(String args[])
	{
		a6q6 ob = new a6q6();
		int c=0;
		for(int a=2; c<100; a++)
		{
			if(ob.isPrime(a) && ob.isPalindrome(a))
			{
				System.out.print(a+"\t");
				c++;
				if(c%10==0)
					System.out.println();
			}
		}
	}
	public int reverse(int n)
	{
		int s=0;
		while(n>0)
		{
			s=s*10+n%10;
			n/=10;
		}
		return s;
	}
	public boolean isPalindrome(int n)
	{
		return n==reverse(n);
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
