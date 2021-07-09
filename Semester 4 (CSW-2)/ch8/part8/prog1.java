package ch8.part8;

public class prog1 {
	public static void main(String args[]) {
		LinkedList li = new LinkedList();

		li.add(2);
		li.add(2);
		li.add(3);
		li.add(5);
		li.add(5);
		li.add(5);
		li.add(5);
		li.add(7);
		li.add(11);
		li.add(11);
		
		System.out.println(li);
		
		li.deleteDuplicate();
		
		System.out.println(li);
	}
}
