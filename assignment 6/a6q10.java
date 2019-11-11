class a6q10
{
	public static void main(String args[])
	{
		printChars('1','Z',10);
	}
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		for(int a=0; a<numberPerLine; a++)
		{
			System.out.print((char)((Math.max((int)ch1,(int)ch2)-Math.min((int)ch1,(int)ch2))*Math.random()+1+Math.min((int)ch1,(int)ch2))+" ");
		}
		System.out.println();
	}
}

