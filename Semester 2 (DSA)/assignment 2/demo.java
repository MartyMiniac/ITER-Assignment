//a2q1.java
import java.util.*;
public class demo
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Sales Ammount :");
        double sales=in.nextDouble();
        Comission ob = new Comission(sales);
        String res=ob.getComission();
        if(res.equals("Invalid Input")==false)
        {
            System.out.println("You Recieved Rs. "+res+" as Comission");
        }
        else
        {
            System.out.println(res);
        }
    }
}
class Comission
{
    double sales;
    Comission(double sales)
    {
        this.sales=sales;
    }
    String getComission()
    {
        String s="Invalid Input";
        if(sales<500 && sales>0)
        {
            s=""+(sales*0.02)+"0";
        }
        else if(sales>=500 && sales<5000)
        {
            s=""+(sales*0.05)+"0";
        }
        else if(sales>=5000)
        {
            s=""+(sales*0.08)+"0";
        }
        return s;
    }
}