import java.util.regex.*;
public class prog7
{
	public static void main(String args[])
	{
		String s = "xxfoooooooooofoo";
		Pattern p1 = Pattern.compile(".*foo");
		Matcher m = null;
		m=p1.matcher(s);
		while(m.find())
			System.out.println(s.substring(m.start(),m.end()));
		Pattern p2 = Pattern.compile(".*?foo");
		m=p2.matcher(s);
		while(m.find())
			System.out.println(s.substring(m.start(),m.end()));
		Pattern p3 = Pattern.compile(".*+foo");
		m=p3.matcher(s);
		while(m.find())
			System.out.println(s.substring(m.start(),m.end()));
	}
}
