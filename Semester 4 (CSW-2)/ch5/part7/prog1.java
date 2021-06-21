package ch5.part7;

public class prog1 {
	public static double power(double x,int y) {
		int c=1;
		double res=1;
		if(y<0){
		      y=-y;
		      x=1.0/x;
		    }
		while(y!=0) {
			c++;
			if((y&1)!=0) {
				res*=x;
			}
			x*=x;
			y>>=1;
		}
		System.out.println(c);
		return res;
	}
	public static void main(String[] args) {
		System.out.printf("Required Ans %.2f",power(2,37));

	}
}
