
public class Date {
	private int dd,mm,yyyy;

	Date(int dd, int mm, int yyyy) {
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	public int getDD() {
		return dd;
	}

	public int getMM() {
		return mm;
	}

	public int getYYYY() {
		return yyyy;
	}
	
	public String toString()
	{
		String s = "["+dd+":"+mm+":"+yyyy+"]"; 
		return s;
	}
	

}






// Designed by Ayush Kejariwal

