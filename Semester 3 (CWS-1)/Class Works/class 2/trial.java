import java.util.*;
public class trial
{
	public static void main(String args[])
	{
		Map<String, String> m = System.getenv();
		for(Map.Entry<String, String> s:m.entrySet())
		{
			System.out.println(s.getKey()+"\t"+s.getValue());
		}
	}
}
