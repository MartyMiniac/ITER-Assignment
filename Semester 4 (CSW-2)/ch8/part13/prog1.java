package ch8.part13;

public class prog1 {
	public static void main(String args[]) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList sum = new LinkedList();

		l1.add(3);
		l1.add(1);
		l1.add(4);

		l2.add(7);
		l2.add(0);
		l2.add(9);
		l2.add(9);
		
		System.out.print(l1);
		System.out.print("+");
		System.out.print(l2);
		System.out.print("=");
		
		sum.add(l1,l2);
		
		System.out.println(sum);
	}
}
