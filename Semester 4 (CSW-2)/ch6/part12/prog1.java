package ch6.part12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class prog1 {
	public static void main(String args[]) {
		List<String> names = new LinkedList<String>();
		names.addAll(Arrays.asList("Rohan", "Rituraj", "Samarveer", "Rahul", "Arshdeep", "Sanket", "Sahil", "Shivam"));
		System.out.println(names);
		System.out.println(SampleSelector(names.iterator(), 2));
	}
	
	public static <E> List<E> SampleSelector(Iterator<E> data, int size) {
		LinkedList<E> selections = new LinkedList<E>();
		
		for(int i=0; i<size && data.hasNext(); i++) {
			selections.add(data.next());
		}
		
		Random rd = new Random();
		int count=size;
		while(data.hasNext()) {
			E temp=data.next();
			
			int index=rd.nextInt(count);
			
			if(index<size) {
				selections.set(index, temp);
			}
		}
		
		return selections;
	}
}
