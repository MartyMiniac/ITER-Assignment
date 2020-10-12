import java.util.*;
public class prog3
{
	public static void main(String[] args)
	{		
		try
		{		
			Class.forName("javax.swing.JButton"); 
			System.out.print("JButton is Present ");
		}
		catch(ClassNotFoundException e)
		{
			String failure = "Sorry, but this version of Java Runtime with JFC/Swing components\n not having the final names (javax.swing.*)";
			System.err.println(failure);
		}
	}
}