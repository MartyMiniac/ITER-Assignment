import java.util.*;
class a1q5
{
	public static void main(String args[])
	{
		a1q5 ob = new a1q5();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number :");
		boolean k=ob.isEven(in.nextInt());
		if(k)
		{
			System.out.println("The numbe is Even");
		}
		else
		{
			System.out.println("The numbe is odd");
		}
	}
	public boolean isEven(int n) 
    { 
        boolean k = true; 
          
        for (int i = 1; i <= n; i++)  
            k = !k; 
              
        return k; 
    } 
}