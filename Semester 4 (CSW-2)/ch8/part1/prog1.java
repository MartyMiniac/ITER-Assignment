package ch8.part1;

public class prog1 {
	public static void main(String args[]) {
		LinkedList l1 = new LinkedList(2, 5, 7);
		LinkedList l2 = new LinkedList(3, 11);
		
		LinkedList r = LinkedList.merge(l1, l2);
		
		System.out.println(r);
	}
}
