import java.util.*;
public class Program
{
	Books b[] = new Books[10];
	Student student[];
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Program ob = new Program();
		ob.randomBookGen();
		System.out.print("Enter the Number of Students :");
		int n=in.nextInt();
		ob.createStudentArray(n);
		ob.basicinfo();
		while(true)
		{
			System.out.println("You Have Entered an Infinite Loop\n to Exit press 0 when asked to Exit");
			int index=ob.init();
			ob.choice(index);
			System.out.println("Do you want to Exit ??");
			System.out.println("Press any number to continue");
			System.out.println("Press 0 to Exit");
			int i=in.nextInt();
			if(i==0)
				break;
		}
	}
	public int init()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Press ");
		for(int i=0; i<student.length; i++)
		{
			System.out.println(i+" for "+student[i].getName()+" (Roll Number "+student[i].getRoll()+")");
		}
		int n=in.nextInt();
		if(n<0 || n>=student.length)
		{
			System.out.println("Invalid Selection");
			System.out.println("Default Selection 0");
			return 0;
		}
		return n;
	}
	public void choice(int index)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want to do ??");
		System.out.println("Press 1 for Issue a Book");
		System.out.println("Press 2 to Return a Book");
		System.out.println("Press 3 to View of Issued Books");
		switch(in.nextInt())
		{
			case 1:
			student[index].issueBook();
			break;
			case 2:
			student[index].depositBook();
			break;
			case 3:
			student[index].issueList();
			break;
			default:
			System.out.println("Invalid Selection");
			System.out.println("Operation Failed");
		}
	}
	public void basicinfo()
	{
		Scanner in = new Scanner(System.in);
		for(int i=0; i<student.length; i++)
		{
			System.out.print("Enter the Name : ");
			String nm=in.nextLine();
			System.out.print("Enter the Roll Number :");
			int rn=in.nextInt();
			student[i] = new Student(nm,rn,b);
			in.nextLine();
		}
	}
	public void createStudentArray(int n)
	{
		student = new Student[n];
	}
	public void randomBookGen()
	{
		for(int i=0; i<10; i++)
		{
			b[i] = new Books(randomName(10),randomAuthor(),(int)(Math.random()*2000),(int)(Math.random()*10));
		}
	}
	public String randomName(int n)
	{
		String s="";
		for(int i=0; i<n; i++)
		{
			s=s+(char)((int)(65+Math.random()*26));
		}
		return s;
	}
	public Author randomAuthor()
	{
		char ch='M';
		switch((int)(Math.random()*2))
		{
			case 0:
			ch='M';
			break;
			case 1:
			ch='F';
			break;
		}
		Author a = new Author(randomName(5)+" "+randomName(5), randomName(5)+"@gmail.com", ch);
		return a;
	}
}
class Student
{
	String name;
	int roll,qty;
	Date issueDate, returnDate;
	Books list[] = new Books[5];
	Books b[];
	Student(String name, int roll, Books b[])
	{
		this.name=name;
		this.roll=roll;
		this.b=b;
		qty=0;
	}
	public String getName()
	{
		return name;
	}
	public int getRoll()
	{
		return roll;
	}
	public void issueBook()
	{
		//change the value here back to qty<5 before upload
		if(qty<5)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Books Available for issue :");
			for(int i=0; i<10; i++)
			{
				System.out.println(b[i].display());			
			}
			System.out.print("Enter Book to Issue :");
			String bName=in.nextLine();
			boolean k=getIssue(bName);
			if(k)
			{
				System.out.println("Enter the Todays date in DDMMYYYY format :");
				String dt=in.nextLine();
				try
				{
					int dd=Integer.parseInt(dt.substring(0,2));
					int mm=Integer.parseInt(dt.substring(2,4));
					int yyyy=Integer.parseInt(dt.substring(4,8));
					issueDate = new Date(dd,mm,yyyy);
				}
				catch(StringIndexOutOfBoundsException e)
				{
					System.out.println("Invalid Date Format\nTaking Date as 00000000");
					issueDate = new Date(00,00,0000);
				}
				qty++;
				System.out.println("The Book\""+bName.toUpperCase()+"\" issued to "+name);
			}
			else
			{
				System.out.println("Book Issue Failed");
			}
		}
		else
		{
			System.out.println("Book Issue Limit Exceeded");
			System.out.println("Book Issue Failed");
		}
	}
	public boolean getIssue(String s)
	{
		int n=-1;
		for(int i=0; i<10; i++)
		{
			String nm=b[i].getName();
			if(nm.equalsIgnoreCase(s))
			{
				n=i;
				System.out.println("Book Found Getting an Issue");
				addBook(b[n]);
				break;
			}
		}
		if(n!=-1)
		{
			int t=b[n].getQty();
			if(t!=0)
			{
				b[n].setQty(t-1);
				return true;
			}
			else
			{
				System.out.println("Book Not is Stock");
				return false;
			}
		}
		else
		{
			System.out.println("Book not Found");
			return false;
		}
	}
	public void depositBook()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Issued Books are :");
		issueList();
		System.out.println("Name of Book to Return");
		String bName=in.nextLine();
		boolean k=returnBook(bName);

		if(k)
		{
			System.out.println("Enter the Todays date in DDMMYYYY format :");
			String dt=in.nextLine();
			try
			{
				int dd=Integer.parseInt(dt.substring(0,2));
				int mm=Integer.parseInt(dt.substring(2,4));
				int yyyy=Integer.parseInt(dt.substring(4,8));
				returnDate = new Date(dd,mm,yyyy);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Date Entered in Wrong Format\nTaking date as 00000000");
				returnDate = new Date(00,00,0000);
			}
			qty--;
			System.out.println("Book Unissued Successfuly");
		}
		else
		{
			System.out.println("Book Unissueing Failed");
		}
	}
	public boolean returnBook(String s)
	{
		int n=-1;
		for(int i=0; i<10; i++)
		{
			int t=-1;
			String nm=b[i].getName();
			if(nm.equalsIgnoreCase(s))
			{
				t=i;
			}
			try
			{
				if(removeBook(b[t]))
				{
					n=i;
					System.out.println("Book Found, Unissueing");
					break;
				}
			}
			catch(Exception e)
			{
				//Nothing to do Errors Expected
			}
		}
		if(n!=-1)
		{
			int t=b[n].getQty();
			b[n].setQty(t+1);
			return true;
		}
		else
		{
			System.out.println("Book not Found\nCheck The Name of the Book");
			return false;
		}
	}
	public boolean removeBook(Books bk)
	{
		String s=bk.display();
		for(int i=0; i<list.length; i++)
		{
			if(s.equals(list[i].display()))
			{
				list[i]=null;
				System.out.println("Book Removed from Students issue list !!");
				return true;
			}
		}
		System.out.println("Book Not found !!");
		return false;
	}
	public void addBook(Books bk)
	{
		String s=bk.display();
		for(int i=0; i<list.length; i++)
		{
			try
			{
				list[i].display();
			}
			catch(NullPointerException e)
			{
				//throw exception because the object not initalized
				System.out.println("Book Added to Issue List");
				list[i] = bk;
				list[i].setQty(1);
				break;
			}
		}
	}
	public void issueList()
	{
		for(int i=0; i<list.length; i++)
		{
			try
			{
				System.out.println(list[i].display());
			}
			catch(NullPointerException e)
			{
				//Book slot is empty
			}
		}
	}
}
class Author
{
	private String name, email;
	private char gender;
	Author(String name, String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public char getGender()
	{
		return gender;
	}
	public String display()
	{
		return "[name="+name+",email="+email+",gender="+gender+"]";
	}
}
class Books
{
	private String name;
	private Author author;
	private double price;
	private int qty;
	Books(String name, Author author, double price)
	{
		this.name=name;
		this.author=author;
		this.price=price;
	}
	Books(String name, Author author, double price, int qty)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}
	Books(Books b)
	{
		this.name=b.name;
		this.author=b.author;
		this.price=b.price;
		this.qty=1;
	}
	public String getName()
	{
		return name;
	}
	public Author getAuthor()
	{
		return author;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public String display()
	{
		String s="[name="+name+",Author="+author.display()+"price="+price+",quantity="+qty+"]";
		return s;
	}
}
class Date
{
	int dd, mm, yyyy;
	Date(int dd, int mm, int yyyy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	Date()
	{
		dd=0;
		mm=0;
		yyyy=0;
	}
	public int getDD()
	{
		return dd;
	}
	public int getMM()
	{
		return mm;
	}
	public int getYYYY()
	{
		return yyyy;
	}
	public String display()
	{
		return "[DD="+dd+",MM="+mm+",YYYY="+yyyy+"]";
	}
}
