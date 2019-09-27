class a2q18
{
	public static void main(String args[])
	{
		double a,b,c;
		a=Double.parseDouble(args[0]);		
		b=Double.parseDouble(args[1]);
		c=Double.parseDouble(args[2]);
		System.out.print(((a<b)?(b<c)?true:false:false)||((a>b)?(b>c)?true:false:false)?true:false);
	}
}