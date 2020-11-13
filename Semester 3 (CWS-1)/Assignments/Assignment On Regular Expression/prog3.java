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
        String regex="\\w+@\\w+(\\.\\w+)";
   
        Pattern p = Pattern.compile(regex);
        Matcher m1 = p.matcher(url);
        
        regex="(http:\\/\\/|https:\\/\\/)?([w]{3}\\.)?\\w+(\\.(com|in|org|ac|gov|co))+";
        
        p = Pattern.compile(regex);
        Matcher m2 = p.matcher(url);
        
        if (m1.matches()||m2.matches())
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("NO");
        }
    }
}