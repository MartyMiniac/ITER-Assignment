public class a5q18
{
    public static void main(String args[])
    {
        double c = Double.parseDouble(args[0]);
        double e = 1e-10;
        double t = c;
        double k = Double.parseDouble(args[1]);
        while (Math.abs(t - c/t) > e*t)
        {
            t = (c/t + t) / k;
        }
       System.out.println(t);
    }
}
