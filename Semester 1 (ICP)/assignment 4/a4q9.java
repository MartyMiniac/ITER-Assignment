class a4q9
{
	public static void main(String args[])
	{
		int s=0;
		for(int a=1; a<=1000; a++)
		{
			if(a%3==0 || a%5==0)
				s=s+a;
		}
		System.out.println("Sum of multiples of 3 and 5 ="+s);
	}
}
