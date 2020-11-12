import java.util.*;

//Print all system properties.
public class prog3
{
	public static void main(String args[])
	{
		Properties m = System.getProperties();
		Enumeration keys=m.keys();
		while(keys.hasMoreElements())
		{
			String key=(String)keys.nextElement();
			String val=m.getProperty(key);
			System.out.println(key+" : "+val);
		}
	}
}
