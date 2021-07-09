package ch8.part11;


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
	
	public Node getHead() {
		return this.head;
	}
	
	public boolean checkPalindrome() {
		Node current = this.head;
		Node mid = this.head;
		while(current!=null && current.getNext()!=null) {
			current=current.getNext().getNext();
			mid=mid.getNext();
		}
		
		LinkedList t_li = new LinkedList(mid);
		t_li.reverse();
		mid = t_li.head;
		
		current = this.head;
		while(current!=null && mid!=null) {
			if(current.getData() != mid.getData()) {
				return false;
			}
			current=current.getNext();
			mid=mid.getNext();
		}
		return true;
	}
	
	public void reverse() {
		Node prev=null;
		Node curr=this.head;
		Node next=null;
		while(curr!=null) {
			next=curr.getNext();
			curr.setNext(prev);
			prev=curr;
			curr=next;			
		}
		this.head=prev;
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
