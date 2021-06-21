package ch6.part11;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class prog1 {
	public static void main(String args[]) {
		List<String> names = new LinkedList<String>();
		names.addAll(Arrays.asList("Rohan", "Rituraj", "Samarveer", "Rahul", "Arshdeep", "Sanket", "Sahil", "Shivam"));
		System.out.println(names);
		System.out.println(sampleData(names, 2));
	}
	
	public static <E> List<E> sampleData(List<E> data, int size) {
		Random rd = new Random();
		for(int i=0; i<size; i++) {
			Collections.swap(data, i, rd.nextInt(data.size()-1));
		}
		
		return data.subList(0, size);
	}
}
