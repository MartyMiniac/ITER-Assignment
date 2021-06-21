package ch6.part14;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Random;

public class prog1 {
	public static void main(String args[]) {
		System.out.println(Arrays.toString(randomSubset(20,5)));
	}
	
	public static int[] randomSubset(int arraySize, int sampleSize) {
		int[] rt = new int[sampleSize];
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
		Random rd = new Random();
		for(int i=0; i<sampleSize; i++) {
			int no = rd.nextInt(arraySize);
			if(h.get(no)==null && h.get(i)==null) {
				h.put(no, i);
				h.put(i, no);
			}
			else if(h.get(no)==null && h.get(i)!=null) {
				h.put(no, h.get(i));
				h.put(i, no);
			}
			else if(h.get(no)!=null && h.get(i)==null) {
				h.put(i, h.get(no));
				h.put(no, i);
			}
			else {
				int temp=h.get(i);
				h.put(i, h.get(no));
				h.put(no, temp);
			}
		}
		
		for(int i=0; i<sampleSize; i++) {
			rt[i]=h.get(i);
		}
		
		return rt;
	}
}
