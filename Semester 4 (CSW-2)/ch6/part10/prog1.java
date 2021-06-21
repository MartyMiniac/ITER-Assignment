package ch6.part10;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class prog1 {
	public static void main(String args[]) {
		List<Integer> perm = new LinkedList<Integer>();
		perm.addAll(Arrays.asList(2, 3, 1, 4));
		System.out.println(perm);
		nextPerm(perm);
		System.out.println(perm);
	}
	
	public static void nextPerm(List<Integer> perm) {
		int k=-1;
		
		for(int i=0; i<perm.size()-1; i++) {
			if(perm.get(i)<perm.get(i+1)) {
				k=i;
			}
		}
		for(int i=perm.size()-1; i>k; i--) {
			if(perm.get(i)>perm.get(k)) {
				Collections.swap(perm, k, i);
				break;
			}
		}
		
		Collections.reverse(perm.subList(k+1, perm.size()));
	}
}
