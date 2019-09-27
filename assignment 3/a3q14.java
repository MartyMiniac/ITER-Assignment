import java.util.Scanner;
class a3q14
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter \n0. Rock\n1. Paper\n2. Scissors");
		int a=in.nextInt();
		int w=0;	//win =1, lose=0, tie=2
		int b=(int)(Math.random()*3);
		if(a==b)
			w=2;
		else if(a<0||a>2)
			w=0;
		else
		{
			if(a==0 && b==1)
				w=0;
			else if(a==1 && b==2)
				w=0;
			else if(a==2 && b==0)
				w=0;
			else
				w=1;
		}
		switch(w)
		{
		case 0:
			System.out.print("You Lost ");
			break;
		case 1:
			System.out.print("You Won");
			break;
		case 2:
			System.out.print("Its a tie");
			break;
		}
	}
}