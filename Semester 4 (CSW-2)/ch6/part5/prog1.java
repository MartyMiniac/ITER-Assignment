package ch6.part5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class prog1 {
	public static void main(String args[]) {
		List<Integer> arr = new LinkedList<Integer>();
		arr.addAll(Arrays.asList(2,3,5,5,7,11,11,11,13));
		System.out.println(arr);
		removeDuplicate(arr);
		System.out.println(arr);
	}
	
	public static void removeDuplicate(List<Integer> arr) {
		int lastElement=arr.get(0);
		for(int i=1; i<arr.size(); i++) {
			if(lastElement==arr.get(i)) {
				arr.remove(i);
				i--;
			}
			else {
				lastElement=arr.get(i);
			}
		}
	}
}
