package ch5.part5;

public class prog1 {
	public static void main(String args[]) {
		System.out.println(multiply(3, 7));
	}
	public static int multiply(int a, int b) {
		int sum = 0;
		while(a!=0) {
			if((a & 1) == 1) {
				sum = add(sum, b);
			}
			
			a>>>=1;
			b<<=1;
		}
		
		return sum;
	}
	private static int add(int a, int b) {
		int sum=0, carryin=0, mask=1, tempA=a, tempB=b;
		while(tempA!=0 || tempB!=0) {
			int ak= a & mask;
			int bk= b & mask;
			int carryout = (ak & bk) | (ak & carryin) | (bk & carryin);
			sum = sum | (ak ^ bk ^ carryin);
			carryin = carryout<<1;
			tempA>>>=1;
			tempB>>>=1;
			mask <<=1;
		}
		return sum | carryin;
	}
}
