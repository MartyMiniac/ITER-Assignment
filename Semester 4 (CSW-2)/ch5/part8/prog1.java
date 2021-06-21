package ch5.part8;

public class prog1 {
	public static void main(String args[]) {
		System.out.println(reverse(12345));
	}
	public static long reverse(long x) {
		long rt = 0;
		while(x!=0) {
			rt=rt*10+x%10;
			x/=10;
		}
		return rt;
	}
}
