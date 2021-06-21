package ch6.part3;

import java.util.LinkedList;

public class prog1 {
	public static void main(String args[]) {
		LinkedList<Integer> arr1 = new LinkedList<Integer>();
		arr1.push(2);
		arr1.push(8);
		arr1.push(9);
		
		LinkedList<Integer> arr2 = new LinkedList<Integer>();
		arr2.push(2);
		arr2.push(8);
		arr2.push(9);
		arr2.push(7);
		
		LinkedList<Integer> sum = add(arr1, arr2);

		System.out.println(arr1);
		System.out.println(arr2);
				
		System.out.println(sum);
	}
	
	public static LinkedList<Integer> add(LinkedList<Integer> arr1, LinkedList<Integer> arr2) {
		if(arr1.size()>arr2.size()) {
			LinkedList<Integer> tmp=arr1;
			arr1=arr2;
			arr2=tmp;
		}
		int diff=Math.abs(arr1.size()- arr2.size());
		for(int i=0; i<diff; i++) {
			arr1.push(0);
		}
		LinkedList<Integer> sum = new LinkedList<Integer>();
		sum.push(arr1.get(arr1.size()-1)+arr1.get(arr1.size()-1));
		for(int i=arr2.size()-2; i>-1; i--) {
			sum.push(arr2.get(i)+arr1.get(i));
		}
		for(int i=arr2.size()-1; i>-1; i--) {
			if(sum.get(i)>9) {
				if(i==0) {
					sum.set(i, sum.get(i)-10);
					sum.push(1);
				}
				else {
					sum.set(i, sum.get(i)-10);
					sum.set(i-1, sum.get(i-1)+1);
				}
			}
		}
		return sum;
	}
}
