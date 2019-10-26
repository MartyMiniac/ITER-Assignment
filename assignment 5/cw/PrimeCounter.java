class PrimeCounter
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		for(int a=2; a<=n; a++)
		{
			int no=1,c=0;
			while(no<=a)
			{
				if(a%no==0)
					c++;
				no++;
			}
			if(c==2)
				System.out.println(a);
		}
	}
}
