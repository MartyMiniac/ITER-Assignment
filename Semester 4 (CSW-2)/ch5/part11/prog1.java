package ch5.part11;

public class prog1 {
	public static void main(String args[]) {
		Rectangle r1, r2;
		r1 = new Rectangle(0, 0, 5, 5);
		r2 = new Rectangle(3, 3, 2, 2);
		
		System.out.println(Rectangle.intersects(r1, r2));
	}
}
