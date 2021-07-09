package ch8.part10;


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
	
	public void evenOddMerge() {
		Node current = this.head;
		Node tail = this.head;
		int len=0;
		while(tail.getNext()!=null) {
			tail=tail.getNext();
			len++;
		}
		for(int i=0; i<Math.ceil(len/2.0); i++) {
			Node temp = current.getNext();
			current.setNext(temp.getNext());
			current=current.getNext();
			tail.setNext(temp);
			tail=tail.getNext();
			tail.setNext(null);
		}
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
