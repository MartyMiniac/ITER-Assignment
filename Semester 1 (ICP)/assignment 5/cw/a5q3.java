class a5q3
{
	public static void main(String args[])
	{
		int c=0;
		for(int a=100; a<=1000; a++)
		{
			if(a%5==0 && a%6==0)
			{
				System.out.print(a+" ");
				c++;
			}
			if(c==10)
			{
				c=0;
				System.out.println();
			}
		}
	}
}
