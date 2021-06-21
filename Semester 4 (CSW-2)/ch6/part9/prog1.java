package ch6.part9;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class prog1 {
	public static void main(String args[]) {
		List<Integer> perm = new LinkedList<Integer>();
		perm.addAll(Arrays.asList(3, 2, 1, 0));
		List<Character> arr = new LinkedList<Character>();
		arr.addAll(Arrays.asList('a', 'b', 'c', 'd'));

		System.out.println(arr);
		applyPermutation(perm, arr);
		System.out.println(arr);
	}
	
	public static <E> void applyPermutation(List<Integer> perm, List<E> arr) {
		for(int i=0; i<perm.size()-1; i++) {
			for(int j=0; j<perm.size()-i-1; j++) {
				if(perm.get(j)>perm.get(j+1)) {
					Collections.swap(perm, j, j+1);
					Collections.swap(arr, j, j+1);
				}
			}
		}
	}
}
