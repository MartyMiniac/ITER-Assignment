class a4q17
{
	public static void main(String args[])
	{
		for(int a=1; a<=10; a++)
		{
			for(int b=1;b<=10; b++)
			{
				if(a%b==0 || b%a==0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print(a);
			System.out.println();
		}
	}
}
