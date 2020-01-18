import java.util.*;
class a1q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("Start adding Sentences :");
		for(int i=0; ; i++)
		{
			String s=in.nextLine();
			if(s.equals(""))
			{
				break;
			}
			else
			{
				arr.add(s);
			}
		}
		System.out.println("Printing the Sentences in Reverse order");
		for(int i=arr.size()-1; i>=0; i--)
		{
			System.out.println(arr.get(i));
		}
	}
}