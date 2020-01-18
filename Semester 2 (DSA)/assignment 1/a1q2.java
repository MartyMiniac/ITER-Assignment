//a1q2
import java.util.*;
class a1q2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=in.nextInt();
        double t1=Math.log(n), t2=Math.log(2);
        int ans=(int)(t1/t2);
        System.out.print(n+" must be divided by two "+ans+" times to get a value less than 2");
    }
}