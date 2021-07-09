package ch8.part9;


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
	
	public void cyclicRightShift(int k) {
		int len=0;
		Node current=this.head;
		
		while(current!=null) {
			current=current.getNext();
			len++;
		}
		
		k=k%len;
		current=this.head;
		
		for(int i=0; i<k; i++) {
			current=current.getNext();
		}
		
		Node kAhead=this.head;
		
		while(current.getNext()!=null) {
			current=current.getNext();
			kAhead=kAhead.getNext();
		}
		current.setNext(this.head);
		current=kAhead.getNext();
		kAhead.setNext(null);
		this.head=current;
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
