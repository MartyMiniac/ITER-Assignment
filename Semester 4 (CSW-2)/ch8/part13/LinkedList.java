package ch8.part13;


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
	
	public void add(LinkedList l1, LinkedList l2) {
		Node h = new Node();
		this.head=h;
		Node nl1 = l1.head;
		Node nl2 = l2.head;
		
		int sum=nl1.getData()+nl2.getData();
		
		h.setData(sum%10);
		nl1=nl1.getNext();
		nl2=nl2.getNext();
		sum=sum/10;
		
		while(nl1!=null && nl2!=null) {
			sum=sum+nl1.getData()+nl2.getData();
			h.setNext(new Node(sum%10));

			h=h.getNext();
			nl1=nl1.getNext();
			nl2=nl2.getNext();
			sum/=10;
		}

		while(nl1!=null) {
			sum=sum+nl1.getData();
			h.setNext(new Node(sum%10));

			h=h.getNext();
			nl1=nl1.getNext();
			sum/=10;
		}
		while(nl2!=null) {
			sum=sum+nl2.getData();
			h.setNext(new Node(sum%10));

			h=h.getNext();
			nl2=nl2.getNext();
			sum/=10;
		}
		
		h.setNext(new Node(sum));
	}
	
	public String toString() {
		Node temp=head;
		StringBuilder sb = new StringBuilder();
		while(temp!=null) {
			sb.append(temp.getData());
			temp=temp.getNext();
		}
		return sb.reverse().toString();
	}
}
