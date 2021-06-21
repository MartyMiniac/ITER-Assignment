package ch6.part1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class prog1 {
	private static enum Color {RED, WHITE, BLUE}
	
	public static void main(String args[]) {
		List<Color> arr = new LinkedList<Color>();
		arr.addAll(Arrays.asList(Color.RED, Color.WHITE, Color.BLUE, Color.RED, Color.WHITE, Color.BLUE, Color.RED, Color.WHITE, Color.BLUE));
		System.out.println(arr);
		dutchFlag(arr);
		System.out.println(arr);
	}
	
	public static void dutchFlag(List<Color> arr) {
		int low=0, mid=0, high=arr.size()-1;
		while(mid<=high) {
			switch(arr.get(mid).ordinal()) {
			case 0:
				Collections.swap(arr, mid++, low++);
				break;
			case 1:
				mid++;
				break;
			case 2:
				Collections.swap(arr, mid, high--);
				break;
			}
		}
	}
}
