// Java program to check URL is valid or not
// using Regular Expression
 
import java.util.regex.*;
import java.util.*;
class prog3
{   
    public static void main(String args[])
    {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter a String : ");
    	String url=in.nextLine();
    	in.close();
        String regex = "((http|https)://)(www.)?"
                + "[a-zA-Z0-9@:%._\\+~#?&//=]"
                + "{2,256}\\.[a-z]"
                + "{2,6}\\b([-a-zA-Z0-9@:%"
                + "._\\+~#?&//=]*)";
   
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(url);
        if (m.matches())
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
}