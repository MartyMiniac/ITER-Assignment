package ch7.part12;

public class prog1 {
	public static void main(String args[]) {
		String input = "aaaabcccaa";
		String encodedString=encode(input);
		String decodedString=decode(encodedString);

		System.out.println("Encoded String : "+encodedString);
		System.out.println("Decoded String : "+decodedString);
	}
	
	private static String encode(String input) {
		StringBuffer sb = new StringBuffer();
		int count=0;
		char letter=input.charAt(0);
		
		for(char ch: input.toCharArray()) {
			if(ch!=letter) {
				sb.append(count);
				sb.append(letter);
				count=0;
				letter=ch;
			}
			count++;
		}

		sb.append(count);
		sb.append(letter);
		
		return sb.toString();
	}
	
	private static String decode(String input) {
		StringBuffer sb = new StringBuffer();
		
		int count=0;
		char letter='0';
		for(char ch:input.toCharArray()) {
			if(Character.isDigit(ch)) {
				count=count*10+ch-'0';
			}
			else {
				sb.append(getString(count, ch));
				count=0;	
			}
		}

		sb.append(getString(count, letter));
		
		return sb.toString();
	}
	
	private static String getString(int count, char ch) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<count; i++) {
			sb.append(ch);
		}
		
		return sb.toString();
	}
}
