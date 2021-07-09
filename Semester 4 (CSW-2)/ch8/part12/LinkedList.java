package ch8.part12;


class LinkedList {
	private Node head;
	
	LinkedList() {
		this.head=null;
	}
	LinkedList(Node head) {
		this.head=head;
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
	
	public void add(Node data) {
		if(head==null) {
			head=data;
			return;
		}
		
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		
		temp.setNext(data);
	}
	
	public Node getHead() {
		return this.head;
	}
	
	public void piviot(int pivot) {
		Node h_less = null;
		Node h_equal = null;
		Node h_more = null;
		Node less = null;
		Node equal = null;
		Node more = null;
		
		Node temp = this.head;
		while(temp!=null) {
			if(temp.getData()<pivot) {
				if(h_less==null) {
					h_less=temp;
					less=temp;
				}
				else {
					less.setNext(temp);
					less=less.getNext();				
				}
			}
			else if(temp.getData()==pivot) {
				if(h_equal==null) {
					h_equal=temp;
					equal=temp;
				}
				else {
					equal.setNext(temp);
					equal=equal.getNext();		
				}
			}
			else {
				if(h_more==null) {
					h_more=temp;
					more=temp;
				}
				else {
					more.setNext(temp);
					more=more.getNext();				
				}
			}
			
			temp=temp.getNext();
		}
		
		this.head=h_less;
		less.setNext(h_equal);
		equal.setNext(h_more);
		
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
