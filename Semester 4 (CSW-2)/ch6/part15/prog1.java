package ch6.part15;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class prog1 {
	public static void main(String args[]) {
		List<Integer> arr = new LinkedList<Integer>();
		arr.addAll(Arrays.asList(3, 5, 7, 11));
		
		List<Double> prob = new LinkedList<Double>();
		prob.addAll(Arrays.asList(9/18.0, 6/18.0, 2/18.0, 1/18.0));
		
		System.out.println(nonUniRand(arr, prob, 100));
	}
	
	public static <E> List<E> nonUniRand(List<E> arr, List<Double> prob, int calls) {
		List<E> rt = new LinkedList<E>();
		
		for(int i=0; i<prob.size(); i++) {
			prob.set(i, Math.ceil(prob.get(i)*calls));
		}
		
		Random rd = new Random();
		
		for(int i=0; i<=calls; i++) {
			int no=rd.nextInt(arr.size());
			rt.add(arr.get(no));
			prob.set(no, prob.get(no)-1);
			if(prob.get(no)==0) {
				prob.remove(no);
				arr.remove(no);
			}
		}
		
		return rt;
	}
}
