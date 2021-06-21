package ch6.part8;

import java.util.LinkedList;
import java.util.List;

public class prog1 {
	public static void main(String args[]) {
		System.out.println(generatePrime(999999));
	}
	
	public static List<Integer> generatePrime(int n) {
		List<Integer> arr = new LinkedList<Integer>();
		arr.add(2);
		for(int i=3; i<=n; i+=2) {
			boolean isPrime=true;
			for(int j:arr) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				arr.add(i);
			}
		}
		System.out.println("done");
		return arr;
	}
}
