package ch8.part5;

class LinkedList {
	private Node head;
	
	LinkedList() {
		this.head=null;
	}
	
	public void add(Node n) {
		if(head==null) {
			head=n;
			return;
		}
		
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		temp.setNext(n);
	}
	
	public Node getHead() {
		return this.head;
	}
	
	public static Node getCommon(LinkedList l1, LinkedList l2) {
		Node root1 = l1.hasCycle();
		Node root2 = l2.hasCycle();
		
		if(root1 == null && root2 == null) {
			System.out.println("Both are acyclic");
			return null;
		}
		
		else if((root1 !=null && root2 == null) || (root1 == null && root2 !=null )) {
			System.out.println("One is cyclic and other is acyclic");
			return null;
		}
		
		else {
			Node temp = root2;
			do {
				temp = temp.getNext();
			} while(temp!=root1 && temp!=root2);
			
			if(temp != root1) {
				System.out.println("Cycles are disjoined");
				return null;
			}
			
			int stem1Length = distance(l1.getHead(), root1), stem2Length = distance(l2.getHead(), root2);

			Node L1=l1.getHead();
			Node L2=l2.getHead();
			
			if(stem1Length > stem2Length) {
				L1=increaseBy(stem1Length-stem2Length, L1);
			}
			else {
				L2=increaseBy(stem2Length-stem1Length, L2);
			}
			
			while(L1 != L2 && L1 != root1 && L2 != root2) {
				L1 = L1.getNext();
				L2 = L2.getNext();
			}
			
			return L1 == L2 ? L1: root1;
		}
	}
	
	
	private static int distance(Node a, Node b) {
		int dis=0;
		while(a!=b) {
			a = a.getNext();
			dis++;
		}
		
		return dis;
	}
	
	private Node hasCycle() {
		Node fast = this.getHead();
		Node slow = this.getHead();
		while(fast!=null || slow!=null) {
			fast=fast.getNext();
			slow=slow.getNext();
			if(fast==null) {
				break;
			}
			fast=fast.getNext();
			if(fast==slow) {
				
				do {
					slow=slow.getNext();
				} while(slow!=fast);
			
				return slow;
			}
			
		}
		return null;
	}
	private static Node increaseBy(int counter, Node temp) {
		for(int i=0; i<counter; i++) {
			temp=temp.getNext();
		}
		
		return temp;
	}
	
	public String toString() {
		Node temp=head;
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		sb.append(temp.getData());
		temp=temp.getNext();
		while(temp!=null) {
			sb.append(", ");
			sb.append(temp.getData());
			temp=temp.getNext();
		}
		sb.append(']');
		return sb.toString();
	}
}
