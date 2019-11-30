import java.util.*;
class a8q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[4][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[6];
		arr[3] = new int[8];
		for(int a=0; a<4; a++)
		{
			for(int b=0; b<arr[a].length; b++)
			{
				arr[a][b]=(int)(Math.random()*10);
			}
		}
		int arrn[][]=arr.clone();
		for(int a=0; a<4; a++)
		{
			for(int b=0; b<arr[a].length; b++)
			{
				System.out.print(arrn[a][b]+"\t");
			}
			System.out.println();
		}
	}
}
