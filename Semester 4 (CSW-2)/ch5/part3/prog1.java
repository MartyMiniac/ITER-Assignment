package ch5.part3;

public class prog1 {
	public static int precomputedReverse(int x,int i,int j){
		if (((x>>i)&1)!=((x>>j)&1)){
			int bm =(1<<i)|(1<<j);
			x^=bm;
		}
		return x;
	}
	public static void main(String[] args) {
		int ws=2,bm=0b11,x=0b10010011,
				res=(precomputedReverse(x&bm, 1, 0)<<(3*ws))|(precomputedReverse((x>>ws)&bm,1,0)<<(2*ws))|(precomputedReverse((x>>(2*ws))&bm, 1, 0)<<(1*ws))|(precomputedReverse((x>>(3*ws))&bm, 1, 0));
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(res));
	}
}
