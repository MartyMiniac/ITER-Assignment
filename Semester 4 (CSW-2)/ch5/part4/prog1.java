//closest int same bit

package ch5.part4;

public class prog1 {
	private static final int BIT_SIZE = 32;
	public static void main(String args[]) {
		System.out.println(closestBit(0b01111));
	}
	public static int closestBit(int num) {
		for(int i=0; i<BIT_SIZE-1; i++) {
			if(((num>>i)&1) != ((num>>(i+1))&1)) {
				num ^= (1<<i) | (i<<(i+1));
				return num;
			}
		}
		return 1;
	}
}
