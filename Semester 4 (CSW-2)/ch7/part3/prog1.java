package ch7.part3;

public class prog1 {
	public static void main(String args[]) {
		System.out.println(getColID("ZZ"));
	}
	
	private static int getColID(String inp) {
		double num=0;
		inp=inp.toUpperCase();
		for(int i=0; i<inp.length(); i++) {
			num=num+getVal(inp.charAt(i))*Math.pow(26, inp.length()-i-1);
		}
		return (int)num;
	}
	private static int getVal(char ch) {
		return (int)(ch-'A'+1);
	}
}
