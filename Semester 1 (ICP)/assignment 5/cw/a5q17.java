import java.util.*;
public class a5q17
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number to find the square root :");
        double c = in.nextDouble();
        double e = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > e*t)
        {
            t = (c/t + t) / 2.0;
        }
       System.out.println(t);
    }
}
