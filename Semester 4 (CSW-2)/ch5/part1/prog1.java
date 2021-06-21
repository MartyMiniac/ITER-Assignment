//count the number of bits
package ch5.part1;

public class prog1 {
	public static void main(String args[]) {
		System.out.println(countBits(0b101));
	}
	public static int countBits(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num&=(num-1);
		}
		return count;
	}
}
