class a4q17
{
	public static void main(String args[])
	{
		for(int a=1; a<=10; a++)
		{
			System.out.print("* ");
		}
		System.out.println("1");
		for(int a=2; a<=10; a++)
		{
			for(int b=1;b<=10; b++)
			{
				if(b==1)
				{
					System.out.print("* ");
				}
				else if(a==b)
				{
					System.out.print("* ");
				}
				else if((a%2==0 && b==2) || (a==2 && b%2==0))
				{
					System.out.print("* ");
				}
				else if((a%3==0 && b==3) || (a==3 && b%3==0))
				{
					System.out.print("* ");
				}
				else if((a%4==0 && b==4) || (a==4 && b%4==0))
				{
					System.out.print("* ");
				}
				else if((a%5==0 && b==5) || (a==5 && b%5==0))
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
