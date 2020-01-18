class a5q24
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		for(int a=0;a<=n; a++)
		{
			for(int b=0; b<=a; b++)
			{
				for(int c=0; c<=(a*a*a+b*b*b);c++)
				{
					for(int d=0; d<=(a*a*a+b*b*b); d++)
					{
						if((a*a*a+b*b*b)==(c*c*c*+d*d*d))
						{
							System.out.println("a= "+a+"  b= "+b+"  c= "+c+"  d= "+d);
						}
					}
				}
			}
		}
	}
}
