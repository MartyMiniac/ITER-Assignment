package ch8.part4;

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
		int lenl1=0, lenl2=0;

		Node temp1=l1.head;
		while(temp1!=null) {
			temp1=temp1.getNext();
			lenl1++;
		}
		
		Node temp2=l2.head;
		while(temp2!=null) {
			temp2=temp2.getNext();
			lenl2++;
		}
		
		int diff=Math.abs(lenl1-lenl2);
		
		if(lenl1>lenl2) {
			temp1=increaseBy(diff, l1.head);
			temp2=l2.head;
		}
		else {
			temp2=increaseBy(diff, l2.head);
			temp1=l1.head;
		}
		
		while(temp1!=temp2) {
			temp1=temp1.getNext();
			temp2=temp2.getNext();
		}
		
		return temp1;
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
