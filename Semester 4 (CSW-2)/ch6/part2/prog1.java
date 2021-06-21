package ch6.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prog1 {
	public static void main(String args[]) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.addAll(Arrays.asList(1,9,9));
		System.out.println(arr);
		addOne(arr);
		System.out.println(arr);
	}
	
	public static void addOne(List<Integer> arr) {
		int temp=arr.get(arr.size()-1);
		temp++;
		arr.set(arr.size()-1, temp);
		for(int i=arr.size()-1; i>-1; i--) {
			if(arr.get(i)==10) {
				arr.set(i, 0);
				arr.set(i-1, arr.get(i-1)+1);
			}
		}
	}
}
