
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Book book[] = new Book[10];
		String bname[] = {"Marvel","Captain America","Iron Man","Spiderman","Black Widow","Hulk","Thor","Hawk Eye","Black Panther","Ant-Man"};
		String aname[] = {"Stan Lee","Chris Evans","Robert Downey Jr.","Tom Holland","Scarlett Johansson","Mark Roffelo","Chris Hamsworth","Jeremy Renner","Chadwick Boseman","Paul Rudd"};
		String aemail[] = {"StanLee@email.com","CrishEvans@email.com","RobertDowneyJr@email.com","TomHolland@email.com","ScarlettJohansson@email.com","MarkRoffelo@email.com","ChrisHamsworth@email.com","JeremyRenner@email.com","ChadwickBoseman@email.com","PaulRudd@email.com"};
		char g = 'm';
		double price = 499.99;
		int qty = 1;
		Author author[] = new Author[10];
		for(int i=0;i<10;i++)
		{
			author[i] = new Author(aname[i],aemail[i],g);
			book[i] = new Book(bname[i],author[i],price,qty);
						
		}
		String sname[] = {"Ayush Kejariwal","Steve Rogers","Tony Stark","Peter Parker","Natasha Romanoff","Dr. Banner","Thor Odenson","Clint Barton","T Challa","Scott Lang"};
		Student student[] = new Student[10];
		for(int i=0;i<10;i++)
		{
			student[i] = new Student(sname[i],(100+i));
		}
		System.out.print("Enter roll no. : ");
		int roll =sc.nextInt();
		int x =-1;
		for(int i=0;i<10;i++)
			if(student[i].getRoll() == roll) {
				x=i;
				System.out.println(student[i]);
			}
		if(x==-1){
			System.out.println("sorry no data found");
			System.exit(0);
		}
		while(true)
		{
			System.out.print("\nenter 1 to issue & 2 to deposit a book\n or press 0 to for another student : ");
			int choice = sc.nextInt();
			if(choice == 1)
				student[x].issueBook(book);
			else if(choice == 2)
				student[x].depositBook(book);
			else if(choice == 0)
			{
				System.out.print("Enter roll no. : ");
				roll =sc.nextInt();
				x =-1;
				for(int i=0;i<10;i++)
					if(student[i].getRoll() == roll) {
						x=i;
						System.out.println(student[i]);
					}
				if(x==-1){
					System.out.println("sorry no data found");
					System.exit(0);
				}
			}
			else
			{
				System.out.println("thank you");
				System.exit(0);
			}
			}
		
	}

}






// Designed by Ayush Kejariwal

