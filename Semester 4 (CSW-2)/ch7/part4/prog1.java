package ch7.part4;

public class prog1 {
	public static void main(String args[]) {
		final String inp="acdbbca";
		char[] ch = inp.toCharArray();
		System.out.println(process(ch));
	}
	private static String process(char[] arr) {
		StringBuffer sb = new StringBuffer();
		for(char ch:arr) {
			if(ch=='a') {
				sb.append("dd");
				continue;
			}
		sb.append(ch);
		}
		
		return sb.toString();
	}
}
