//a2q2.java
import java.util.*;
class Complex
{
    double real, imag;
    Complex()
    {
        real=0.0d;
        imag=0.0d;
    }
    void setData(double real, double imag)
    {
        this.real=real;
        this.imag=imag;
    }
    public Complex add(Complex ob1, Complex ob2)
    {
        Complex ob = new Complex();
        ob.real=ob1.real+ob2.real;
        ob.imag=ob1.imag+ob2.imag;
        return ob;
    }
    void display()
    {
        System.out.println(real+"+"+imag+"i");
    }
    public static void main(String args[])
    {
        Scanner in =  new Scanner(System.in);
        Complex ob = new Complex();
        Complex ob1 = new Complex();
        Complex ob2 = new Complex();
        double r, i;
        System.out.println("Enter values for the First Number :");
        System.out.print("Enter the Real Value :");
        r=in.nextDouble();
        System.out.print("Enter the Imaginary Value :");
        i=in.nextDouble();
        ob1.setData(r,i);
        System.out.println("Enter values for the Second Number :");
        System.out.print("Enter the Real Value :");
        r=in.nextDouble();
        System.out.print("Enter the Imaginary Value :");
        i=in.nextDouble();
        ob2.setData(r,i);
        Complex obNew=ob.add(ob1, ob2);
        System.out.print("Sum = ");
        obNew.display();
    }
}
