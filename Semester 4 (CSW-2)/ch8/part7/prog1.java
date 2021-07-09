package ch8.part7;

public class prog1 {
	public static void main(String args[]) {
		LinkedList li = new LinkedList();
		for(int i=0; i<10; i++) {
			li.add(i);
		}
		System.out.println(li);
		
		li.deleteFromLast(2);
		
		System.out.println(li);
	}
}
