package ch8.part7;


class LinkedList {
	private Node head;
	
	LinkedList() {
		this.head=null;
	}
	
	public void add(int data) {
		if(head==null) {
			head=new Node(data);
			return;
		}
		
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		temp.setNext(new Node(data));
	}
	
	public Node getHead() {
		return this.head;
	}
	
	public void deleteFromLast(int k) {
		Node ptr=this.head;
		ptr=increaseBy(k+1, ptr);
		Node kLag=this.head;
		
		while(ptr.getNext()!=null) {
			ptr=ptr.getNext();
			kLag=kLag.getNext();
		}
		
		kLag.setNext(kLag.getNext().getNext());
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
