import java.util.*;
class a4q1
{
	public static void main(String arsg[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String :");
		String str=in.nextLine();
		for(int a=1; a<=10; a++)
		{
			System.out.print(a);
			if(a==1)
				System.out.print("st ");
			else if(a==2)
				System.out.print("nd ");
			else if(a==3)
				System.out.print("rd ");
			else
				System.out.print("th ");
			System.out.println(str);
		}
	}
}