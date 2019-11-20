import java.util.*;
class a7q8
{
	public static void main(String args[])throws Exception
	{
		int arr[];
		boolean k=true;
		Scanner in = new Scanner(System.in);
		while(k)
		{
			System.out.println("Choose Your Option :");
			System.out.println("a. Create an array of n integers\nb. Display the array elements\nc. Insert an element at specific position\nd. Delete an element at a given position\ne. Exit");
			char c=in.next().charAt(0);
			switch(c)
			{
				case 'a':
					System.out.print("Enter the Value of n :");
					int n=in.nextInt();
					arr = new int[n];
					for(int a=0; a<n; a++)
					{
						arr[a]=0;
					}
					break;
				case 'b':
					for(int a=0; a<arr.length; a++)
					{
						System.out.println(arr[a]);
					}
					break;
				case 'c':
					System.out.print("Enter the Value to Insert :");
					int i=in.nextInt();
					System.out.print("Enter the position number to Insert");
					int p=in.nextInt();
					arr[p]=i;
					break;
				case 'd':
					System.out.print("Enter the Position Number to Delete");
					int ps=in.nextInt();
					System.out.print(arr[p]+" at position number "+p+" deleted");
					arr[ps]=0;
					break;
				case 'e':
					k=false;
					break;
				default :
					System.out.println("Invalid Option");
			}
		}
		System.out.println("Exiting Program");
	}
}
