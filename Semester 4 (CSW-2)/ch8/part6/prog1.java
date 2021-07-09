package ch8.part6;

public class prog1 {
	public static void main(String args[]) {
		LinkedList li = new LinkedList();
		for(int i=0; i<10; i++) {
			li.add(i);
		}
		System.out.println(li);
		
		Node toDelete = li.getHead();
		for(int i=0; i<Math.random()*9; i++) {
			toDelete=toDelete.getNext();			
		}
		
		LinkedList.deleteNode(toDelete);
		
		System.out.println(li);
	}
}
