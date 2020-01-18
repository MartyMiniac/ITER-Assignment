class a6q2
{
	public static void main(String args[])
	{
		for(int a=1; a<=100; a++)
		{
			System.out.print(getPentagonalNumber(a)+"\t");
			if(a%10==0)
				System.out.println();
		}
	}
	public static int getPentagonalNumber(int n)
	{
		return n*(3*n-1)/2;
	}
}
