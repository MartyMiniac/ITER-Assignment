class a8q10
{
	public static void main(String args[])
	{
		int arr[][] = new int[4][4];
		for(int a=0; a<4; a++)
		{
			for(int b=0; b<4; b++)
			{
				arr[a][b]=(int)(Math.random()*2);
			}
		}
		for(int a=0; a<4; a++)
		{
			for(int b=0; b<4; b++)
			{
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println();
		}
		int p=0,v=0;
		for(int a=0; a<4; a++)
		{
			int c=0;
			for(int b=0; b<4; b++)
			{
				c=c+arr[a][b];
			}
			System.out.println(c);
			if(c>v)
			{
				v=c;
				p=a;
			}
		}
		System.out.println("The Largest row index ="+p);
		p=0;
		v=0;
		for(int a=0; a<4; a++)
		{
			int c=0;
			for(int b=0; b<4; b++)
			{
				c=c+arr[b][a];
			}
			System.out.println(c);
			if(c>v)
			{
				v=c;
				p=a;
			}
		}
		System.out.println("The Coloumn row index ="+p);
	}
}
