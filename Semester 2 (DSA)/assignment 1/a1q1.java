//a1q1
import java.util.*;
class a1q1
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of a: ");
        int a=in.nextInt();
        System.out.print("Enter the value of b: ");
        int b=in.nextInt();
        System.out.print("Enter the value of c: ");
        int c=in.nextInt();
        boolean k=false;
        if(a+b==c || a==b-c || a*b==c)
            k=true;
        if(k)
        {
            System.out.print(a+", "+b+", "+c+" can be used in an arithmatic formula");
        }
        else
        {
            System.out.print(a+", "+b+", "+c+" cannot be used in an arithmatic formula");
        }
    }
}