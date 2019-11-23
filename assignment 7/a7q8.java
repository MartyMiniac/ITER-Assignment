import java.util.*;
class a7q8
{
	public static void main(String args[])throws Exception
	{
		int arr[];
		boolean k=true;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n=in.nextInt();
		arr = new int[n];
		for(int a=0; a<n; a++)
		{
			arr[a]=0;
		}
		while(k)
		{
			System.out.println("Choose Your Option :");
			System.out.println("a. Display the array elements\nb. Insert an element at specific position\nc. Delete an element at a given position\nd. Exit");
			char c=in.next().charAt(0);
			switch(c)
			{
				case 'a':
					for(int a=0; a<arr.length; a++)
					{
						System.out.println(arr[a]);
					}
					break;
				case 'b':
					System.out.print("Enter the Value to Insert :");
					int i=in.nextInt();
					System.out.print("Enter the position number to Insert :");
					int p=in.nextInt();
					arr[p]=i;
					break;
				case 'c':
					System.out.print("Enter the Position Number to Delete :");
					int ps=in.nextInt();
					System.out.println(arr[ps]+" at position number "+ps+" deleted");
					arr[ps]=0;
					break;
				case 'd':
					k=false;
					break;
				default :
					System.out.println("Invalid Option");
			}
		}
		System.out.println("Exiting Program");
	}
}
