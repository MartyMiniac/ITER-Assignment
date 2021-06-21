package ch6.part7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class prog1 {
	public static void main(String args[]) {
		List<Integer> arr = new LinkedList<Integer>();
		arr.addAll(Arrays.asList(12,11,13,9,12,8,14,13,15));
		System.out.println(arr);
		System.out.println(buy2sell2(arr));
	}
	
	public static int buy2sell2(List<Integer> arr) {
		List<Integer> pr = new LinkedList<Integer>();
		int maxProfit=0, minPrice=Integer.MAX_VALUE;
		
		for(int p:arr) {
			minPrice=Math.min(minPrice, p);
			maxProfit=Math.max(maxProfit, p-minPrice);
			pr.add(maxProfit);
		}
		
		int maxPrice=Integer.MIN_VALUE;
		for(int i=arr.size()-1; i>0; i--) {
			maxPrice=Math.max(maxPrice, arr.get(i));
			maxProfit=Math.max(maxProfit, maxPrice-arr.get(i)+pr.get(i-1));
		}
		
		return maxProfit;
	}
	
}
