package ch8.part4;

public class prog1 {
	public static void main(String args[]) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList common = new LinkedList();

		l1.add(new Node(1));
		l1.add(new Node(2));
		l1.add(new Node(3));
		l1.add(new Node(4));
		
		l2.add(new Node(2));
		l2.add(new Node(3));
		l2.add(new Node(4));
		
		for(int i=5; i<11; i++) {
			Node n = new Node(i);
			common.add(n);
		}

		l1.add(common.getHead());
		l2.add(common.getHead());
		
		System.out.println(l1);
		System.out.println(l2);
		
		LinkedList temp = new LinkedList();
		
		Node t = LinkedList.getCommon(l1, l2);
		temp.add(t);
		
		System.out.println("Common Area : "+temp);
	}
}
