//a1q12
import java.util.*;
class flower
{
	String name;
	int n;
	float price;
	public void setFlowerName()
	{
		name="";
	}
	public void setFlowerName(String s)
	{
		name=s;
	}
	public void setPetalNumber()
	{
		n=0;
	}
	public void setPetalNumber(int i)
	{
		n=i;
	}
	public void setPrice()
	{
		price=0.0f;
	}
	public void setPrice(float p)
	{
		price=p;
	}
	public String getFlowerName()
	{
		return name;
	}
	public int getPetalNumber()
	{
		return n;
	}
	public float getPrice()
	{
		return price;
	}
}
public class a1q12
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		flower ob1 = new flower();
		flower ob2 = new flower();
		System.out.println("Enter the Flower\'s Name : ");
		ob1.setFlowerName(in.nextLine());
		System.out.println("Enter the Flower\'s number of Petals : ");
		ob1.setPetalNumber(in.nextInt());
		System.out.println("Enter the Flower\'s Price : ");
		ob1.setPrice(in.nextFloat());
		System.out.println("Name of Flower : "+ob1.getFlowerName());
		System.out.println("Number of Petals is the Flower : "+ob1.getPetalNumber());
		System.out.println("Price of Flower : "+ob1.getPrice());
		ob2.setFlowerName();
		ob2.setPetalNumber();
		ob2.setPrice();
		System.out.println("Name of Flower : "+ob2.getFlowerName());
		System.out.println("Number of Petals is the Flower : "+ob2.getPetalNumber());
		System.out.println("Price of Flower : "+ob2.getPrice());
	}
}