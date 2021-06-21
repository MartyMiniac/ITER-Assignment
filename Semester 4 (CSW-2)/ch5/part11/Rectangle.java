package ch5.part11;

public class Rectangle {
	private double x, y, width, height;
	
	public Rectangle(double x, double y, double width, double height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	public static boolean intersects(Rectangle r1, Rectangle r2) {
		if(r1.x <= r2.x && (r1.x+r1.width) <= (r2.x+r2.width)) {
			return (r1.y+r1.height)>=r2.y || (r1.x+r1.width)>=r2.x;
		}
		if(r2.x <= r1.x && (r2.x+r2.width) <= (r1.x+r1.width)) {
			return (r2.y+r2.height)>=r1.y || (r2.x+r2.width)>=r1.x;
		}
		if(r1.y <= r2.y && (r1.y+r1.height) <= (r2.y+r2.height)) {
			return (r1.x+r1.width)>=r2.x;
		}
		if(r2.y <= r1.y && (r2.y+r2.height) <= (r1.y+r1.height)) {
			return (r2.x+r2.width)>=r1.x;
		}
		return false;
	}
	
}
