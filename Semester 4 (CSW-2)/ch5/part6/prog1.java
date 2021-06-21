package ch5.part6;

public class prog1 {
	public static void main(String[] args) {
		int x=27,y=3,res=0;;
		int k=4;
		int y2k=y<<4;
		while(x>=y) {
			while(y2k>x) {
				y2k>>=1;
				k--;
			}
			res+=1<<k;
			x-=y2k;
		}
		System.out.println(res);
	}

}
