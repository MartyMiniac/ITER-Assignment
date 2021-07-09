package ch8.prac1;

import ch8.helpers.LinkedList;

public class prog1 {
	public static void main(String args[]) {
		LinkedList<Integer> l = new LinkedList<Integer>(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		l.append(6);
		l.append(7);
		l.append(8);
		l.append(9);
		l.append(10);
		
		Integer i;
		while((i=l.getNext())!=null) {
			System.out.println(i);
		}

		System.out.println(l.popEnd()+" deleted");
		System.out.println(l.popStart()+" deleted");
		
		while((i=l.getNext())!=null) {
			System.out.println(i);
		}
	}
}
