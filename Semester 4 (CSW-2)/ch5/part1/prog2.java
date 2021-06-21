//calculate the parity
package ch5.part1;

public class prog2 {
	public static void main(String args[]) {
		System.out.println(getParity(0b11));
	}
	public static int getParity(int num) {
		int result=0;
		while(num!=0) {
			result^=1;
			num&=(num-1);
		}
		return result;
	}
}
