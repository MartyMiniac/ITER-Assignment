class a2q14
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.print(((a%b==0)&&(b%a==0))?"True":"False");
	}
}