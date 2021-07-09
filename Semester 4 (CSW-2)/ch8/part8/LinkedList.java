package ch8.part8;


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
	
	public void deleteDuplicate() {
		Node current=this.head;
		Node ahead=this.head.getNext();
		while(ahead!=null) {
			if(current.getData()==ahead.getData()) {
				ahead=ahead.getNext();
				continue;
			}
			else {
				current.setNext(ahead);
				current=current.getNext();
				ahead=ahead.getNext();
			}
		}
		current.setNext(ahead);
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
