class a2q22
{
	public static void main(String args[])
	{
		double p,r,t,a;
		p=Double.parseDouble(args[0]);
		r=Double.parseDouble(args[1]);
		t=Double.parseDouble(args[2]);
		r=r/100;
		a=p*Math.exp(r*t);
		a=a/t*12;
		System.out.print("EMI :"+a);
	}
}