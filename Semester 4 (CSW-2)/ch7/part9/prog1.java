package ch7.part9;

import java.util.HashMap;

public class prog1 {
	private static HashMap<Character, Integer> map;
	
	private static void init() {
		map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}
	
	public static void main(String args[]) {
		init();
		String input="XXXXXVIIII";
		System.out.println(r2n(input));
	}

	private static int r2n(String input) {
		int value=0;
		for(char ch:input.toCharArray()) {
			value=value+map.get(ch);
		}
		return value;
	}
}
