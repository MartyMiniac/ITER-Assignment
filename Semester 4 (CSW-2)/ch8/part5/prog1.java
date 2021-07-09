package ch8.part5;

public class prog1 {
	public static void main(String args[]) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		setUp(l1, l2);
		
		System.out.println(LinkedList.getCommon(l1, l2));
	}
	
	private static void setUp(LinkedList l1, LinkedList l2) {
		l1.add(new Node(1));
		l1.add(new Node(2));
		l1.add(new Node(3));
		for(int i=4; i<9; i++) {
			l2.add(new Node(i));
		}

		l2.add(l2.getHead());
		Node temp=l2.getHead();
		temp=temp.getNext();
		temp=temp.getNext();
		
		l1.add(temp);
	}
}
