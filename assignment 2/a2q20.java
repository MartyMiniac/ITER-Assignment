class a2q20
{
	public static void main(String args[])
	{
		double d,m;
		d=Double.parseDouble(args[0]);
		m=Double.parseDouble(args[1]);
		if(m==3)
		{
			if(d>20)
				System.out.print(true);
			else
				System.out.print(false);
		}
		else if(m>3 && m<6)
		{
			System.out.print(true);
		}
		else if(m==6)
		{
			if(d<20)
				System.out.print(true);
			else
				System.out.print(false);
		}
		else
			System.out.print(false);;
	}
}