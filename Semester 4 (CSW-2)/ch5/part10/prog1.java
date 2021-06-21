package ch5.part10;

public class prog1 {
	public static void main(String args[]) {
		System.out.println(generator(1,6));
		System.out.println(generator(1,6));
		System.out.println(generator(1,6));
		System.out.println(generator(1,6));
		System.out.println(generator(1,6));
	}
	public static long generator(long lower, long upper) {
		long range=upper-lower;
		long result;
		do {
			result=0;
			for(int i=0; (1<<i)<range; i++) {
				result=(result<<1)|gen();
			}
		} while(result>range);
		return lower+result;
	}
	public static int gen() {
		return (int)(Math.random()*2);
	}
}
