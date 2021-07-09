package ch8.helpers;

public class LinkedList<e> {
	private Node<e> head;
	private Node<e> temp;
	public LinkedList(e value) {
		head = new Node<e>(value);
		temp=head;
	}
	
	public LinkedList(e[] values) {
		head = new Node<e>(values[0]);
		temp=head;
		
		for(int i=1; i<values.length; i++) {
			this.push(values[i]);
		}
	}
	//Insertion
	
	//Adds to the end
	public void append(e value) {
		Node<e> t = head;
		while(t.hasNext()) {
			t=t.getNext();
		}
		t.setNext(new Node<e>(value));
	}
	//Adds to the Begining
	public void push(e value) {
		Node<e> t = new Node<e>(value);
		t.setNext(this.head);
		this.head=t;
		
		if(temp==head.getNext()) {
			temp=head;
		}
	}
	
	//Deletion
	
	//Deletes from end
	public e popEnd() {
		Node<e> t = head;
		if(!t.hasNext()) {
			System.err.println("Error : Head cannot be deleted");
			return null;
		}
		while(t.getNext().hasNext()) {
			t=t.getNext();
		}
		
		e value = t.getNext().getValue();
		t.setNext(null);
		return value;
	}
	//Deletes from start
	public e popStart() {
		Node<e> t = head;
		if(!head.hasNext()) {
			System.err.println("Error : More than one elements need to be in the LinkedList");
			return null;
		}
		
		if(temp==head) {
			temp=temp.getNext();
		}
		head=head.getNext();
		
		return t.getValue();
	}
	
	public void resetIterator() {
		temp=head;
	}
	public boolean hasNext() {
		return temp.hasNext();
	}
	public e getNext() {
		if(temp==null) {
			temp=head;
			return null;
		}
		e value=temp.getValue();
		temp=temp.getNext();
		return value;
	}
	public e get() {
		return temp.getValue();
	}
	public void move() {
		temp=temp.getNext();
	}
	
	public String toString() {
		String rt="["+head.getValue().toString();
		Node<e> it=head.getNext();
		
		while(it!=null) {
			rt+=", "+it.getValue().toString();
			it=it.getNext();
		}
		
		rt+="]";
		
		return rt;		
	}
}

class Node<e> {
	private e value;
	Node<e> next;
	public Node(e value) {
		this.value=value;
		this.next=null;
	}
	public e getValue() {
		return value;
	}
	public void setNext(Node<e> next) {
		this.next=next;
	}
	public Node<e> getNext() {
		return this.next;
	}
	public boolean hasNext() {
		return this.next!=null;
	}
}