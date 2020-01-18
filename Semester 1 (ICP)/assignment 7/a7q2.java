import java.util.*;
class a7q2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int no[] = new int[100];
		System.out.println("Enter the integer between 1 and 100 :");
		while(true)
		{
			int n=in.nextInt();
			if(n==0)
				break;
			else if(n>0 && n<=100)
			{
				no[n-1]++;
			}
		}
		for(int a=0; a<100; a++)
		{
			if(no[a]!=0)
			{
				if(no[a]==1)
					System.out.println((a+1)+" occurs "+no[a]+" time");
				else
					System.out.println((a+1)+" occurs "+no[a]+" times");
			}
		}
	}
}

