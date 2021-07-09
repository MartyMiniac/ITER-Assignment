package ch8.part1;

class Node {
	private int value;
	private Node next;
	
	public Node() {
		value=0;
		this.next=null;
	}
	
	public void setValue(int i) {
		this.value=i;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public void setNext(Node next) {
		this.next=next;
	}
	
	public Node getNext() {
		return this.next;
	}
}
