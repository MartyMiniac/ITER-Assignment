class a4q11
{
	public static void main(String args[])
	{
		int s1=0;
		for(int a=1; a<=100; a++)
		{
			s1=s1+a*a;
		}
		System.out.println("The sum if the squares of the first ten natural numbers is, "+s1);
		int s2=0;
		for(int a=1; a<=100; a++)
		{
			s2=s2+a;
		}
		s2=s2*s2;
		System.out.println("The square of the sum of the first ten natural numbers is, "+s2);
		System.out.println("Hence the diffenece between the sum of the squares if the first ten natural numbers and the square of the sum is "+s2+" - "+s1+" = "+(s2-s1));
	}
}
