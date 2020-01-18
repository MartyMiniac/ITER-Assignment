class a6q4
{
	public static void main(String args[])
	{
		int s=0;
		for(int a=2000; a<=2020; a++)
			s=s+numberOfDaysInAYear(a);
		System.out.println(s);
	}
	public static int numberOfDaysInAYear(int year)
	{
		if((year%4==0 || year%100==0) && year%400!=0)
			return 366;
		else
			return 365;
	}
}
