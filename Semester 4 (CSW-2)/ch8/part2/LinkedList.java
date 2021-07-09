package ch8.part2;

class LinkedList {
	Node head;
	public LinkedList(int... arr) {
		Node temp = null;
		for(int i:arr) {
			if(head==null) {
				head = new Node();
				head.setData(i);
				temp = head;
			}
			else {
				Node t=new Node();
				t.setData(i);
				temp.setNext(t);
				temp=temp.getNext();
			}
		}
	}
	
	public void reverse(int start, int end) {
		Node shead=head;
		Node send=null;
		for(int i=1; i<start-1; i++) {
			shead=shead.getNext();
		}
		
		Node temp = shead.getNext();
		Node[] arr = new Node[end-start+1];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=temp;
			temp=temp.getNext();
		}
		
		send=temp;
		temp=shead;
		
		for(int i=arr.length-1; i>-1; i--) {
			temp.setNext(arr[i]);
			temp=temp.getNext();
		}
		
		temp.setNext(send);
	}
	
	public void reverse2(int start, int end) {
		Node shead=head;
		for(int i=1; i<start-1; i++) {
			shead=shead.getNext();
		}
		Node prev=shead;
		shead=shead.getNext();
		for(int i=start; i<end; i++) {
			Node next_node=shead.getNext();
			shead.setNext(prev);
			prev=shead;
			shead=next_node;
		}
	}
	
	public String toString() {
		Node temp=head;
		StringBuffer sb = new StringBuffer("["+temp.getData());
		temp=temp.getNext();
		while(temp!=null) {
			//System.out.println(temp);
			sb.append(", ");
			sb.append(temp.getData());
			temp=temp.getNext();
		}
		sb.append("]");
		
		
		return sb.toString();
	}
}
