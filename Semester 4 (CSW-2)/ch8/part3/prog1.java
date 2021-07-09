package ch8.part3;

public class prog1 {
	public static void main(String args[]) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		//l.add(5);
		
		System.out.println(l.hasCycle());
		
		//Making the LinkedList Cyclic
		l.add(l.getHead());
		
		
		System.out.println(l.hasCycle());
	}
}
