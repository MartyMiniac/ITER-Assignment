package ch7.part5;

public class prog1 {
	public static void main(String args[]) {
	    String input="abc cac cba.";
	
	    System.out.println(isPalindrome(input));
	}
	
	private static boolean isPalindrome(String str) {
	    return check(str, 0, str.length()-1);
	}
	
	private static boolean check(String str, int start, int end) {
	    start=offShift(str, start, 1);
	    end=offShift(str, end, -1);
	    if(start>=end) {
	      return true;
	    }
	    if(str.charAt(start)!=str.charAt(end)) {
	      return false;
	    }
	    return check(str, ++start, --end);
	}
	
	private static int offShift(String str, int inp, int dir) {
	    while(!Character.isLetterOrDigit(str.charAt(inp))) {
	      inp=inp+dir;
	    }
	    return inp;
	}
}
