package ch8.part1;

class LinkedList {
	private Node head;
	public LinkedList(int... values) {
		this.head = new Node();
		Node temp=head;
		for(int i=0; i<values.length; i++) {
			temp.setValue(values[i]);
			if(i!=values.length-1) {
				temp.setNext(new Node());				
			}
			temp=temp.getNext();
		}
	}
	
	private LinkedList(Node head) {
		this.head=head;
	}
	
	public static LinkedList merge(LinkedList l1, LinkedList l2) {
		Node returnHead = new Node();
		Node n1=l1.head;
		Node n2=l2.head;
		
		if(n1.getValue()<n2.getValue()) {
			returnHead.setValue(n1.getValue());
			n1=n1.getNext();
		}
		else {
			returnHead.setValue(n2.getValue());
			n2=n2.getNext();
		}
		Node temp=returnHead;
		
		while(n1!=null && n2!=null) {
			if(n1.getValue()<n2.getValue()) {
				Node t = new Node();
				t.setValue(n1.getValue());
				temp.setNext(t);
				n1=n1.getNext();
				temp=temp.getNext();
			}
			else {
				Node t = new Node();
				t.setValue(n2.getValue());
				temp.setNext(t);
				n2=n2.getNext();
				temp=temp.getNext();
			}
		}
		
		Node tmp=n1==null?n2:n1;
		while(tmp!=null) {
			Node t = new Node();
			t = new Node();
			t.setValue(tmp.getValue());
			temp.setNext(t);
			tmp=tmp.getNext();
			temp=temp.getNext();
		}
		
		return new LinkedList(returnHead);
	}
	
	public String toString() {
		Node temp=head;
		StringBuffer sb = new StringBuffer("["+temp.getValue());
		temp=temp.getNext();
		while(temp!=null) {
			sb.append(", ");
			sb.append(temp.getValue());
			temp=temp.getNext();
		}
		sb.append("]");
		
		
		return sb.toString();
	}
}
