package ch7.part11;

public class prog1 {
	public static void main(String args[]) {
		String input = "Hello_World";
		
		System.out.println(getSnakeString(input));
	}
	
	private static String getSnakeString(String input) {
		char[] arr = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		//level1
		for(int i=1; i<arr.length; i+=4) {
			sb.append(arr[i]);
		}
		
		//level2
		for(int i=0; i<arr.length; i+=2) {
			sb.append(arr[i]);
		}
		
		//level3
		for(int i=3; i<arr.length; i+=4) {
			sb.append(arr[i]);
		}
		
		return sb.toString();
	}
}
