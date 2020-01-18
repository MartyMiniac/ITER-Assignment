import java.util.*;
class a5q1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Numbers Seprated by Spaces :");
		String inp=in.nextLine(),t="";
		int cn=0, cp=0;
		inp=inp.trim();
		inp=inp+" ";
		for(int a=0; a<inp.length(); a++)
		{
			char ch=inp.charAt(a);
			if(ch==' ')
			{
				int tmp=Integer.parseInt(t);
				if(tmp<0)
					cn++;
				else
					cp++;
				t="";
			}
			else
			{
				t=t+ch;
			}
		}
		System.out.println("There are "+cn+" Negative Numbers and "+cp+" Non-Negative Numbers");
	}
}
