//swap the bits i and j
package ch5.part2;

public class prog1 {
	public static void main(String args[]) {
		int num=0b110000;
		int i=1;
		int j=4;
		 System.out.println(Integer.toBinaryString(swap(num, i, j)));
	}
	public static int swap(int num, int i, int j) {
		if(((num>>i)&1) == ((num>>j)&1)) {
			return num;
		}
		int bitmask=(1<<i) | (i<<j);
		bitmask^=num;
		return bitmask;
	}
}