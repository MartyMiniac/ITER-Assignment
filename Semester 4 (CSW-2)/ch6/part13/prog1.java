package ch6.part13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class prog1 {
	public static void main(String args[]) {
		System.out.println(randomPermutation(3));
	}
	
	public static ArrayList<Integer> randomPermutation(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		for(int i=0; i<n; i++) {
			arr.add(i);
		}
		
		Random rd = new Random();
		
		for(int i=0; i<n; i++) {
			Collections.swap(arr, i, rd.nextInt(n-1));
		}
		
		
		return arr;
	}
}
