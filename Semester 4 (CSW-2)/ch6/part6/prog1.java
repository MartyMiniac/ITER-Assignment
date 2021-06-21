package ch6.part6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class prog1 {
	public static void main(String args[]) {
		List<Integer> arr = new LinkedList<Integer>();
		arr.addAll(Arrays.asList(310,315, 275, 295, 260, 270, 290, 230, 255, 250));
		System.out.println(arr);
		System.out.println(buy1sell1(arr));
	}
	
	public static int buy1sell1(List<Integer> arr) {
		int minPrice=Integer.MAX_VALUE;
		int maxProfit=0;
		for(int p : arr) {
			maxProfit=Math.max(maxProfit, p-minPrice);
			minPrice=Math.min(minPrice, p);
		}
		return maxProfit;
	}
}
