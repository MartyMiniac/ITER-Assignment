package ch7.part2;

public class prog1 {
	public static void main(String args[]) {
		System.out.println(convert(32, 16));
	}
	private static String convert(int num, int base) {
		StringBuffer rt = new StringBuffer();
		while(num!=0) {
			rt.append(getValue(num%base));
			num/=base;
		}
		return rt.reverse().toString();
	}
	private static char getValue(int num) {
		if(num<10) {
			return (char)('0'+num);
		}
		else {
			return (char)('A'+num-10);
		}
	}
}
