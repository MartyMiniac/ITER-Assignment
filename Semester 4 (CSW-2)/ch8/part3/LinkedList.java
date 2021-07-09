package ch8.part3;

class LinkedList {
	private Node head;
	public void add(Node n) {
		Node temp=head;
		if(temp==null) {
			this.head=n;
			return;
		}
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(n);
	}
	public void add(int i) {
		Node temp=head;
		if(temp==null) {
			this.head=new Node(i);
			return;
		}
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(new Node(i));
	}
	public Node getHead() {
		return this.head;
	}
	
	public Node hasCycle() {
		Node fast=this.head;
		Node slow=this.head;
		while(fast!=null && slow!=null) {
			slow=slow.getNext();
			fast=fast.getNext();
			if(fast==null) {
				break;
			}
			fast=fast.getNext();
			if(slow==fast) {
				System.out.println("Cycle found");
				
				int len=0;
				
				do {
					len++;
					slow=slow.getNext();
				} while(slow!=fast);
				
				System.out.println("Length: "+len);
				
				return slow;
			}
		}
		System.out.println("Cycle not found");
		return null;
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
