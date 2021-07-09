package ch8.part11;

public class prog1 {
	public static void main(String args[]) {
		LinkedList li = new LinkedList();

		for(int i=1; i<6; i++) {
			li.add(i);
		}
		for(int i=5; i>0; i--) {
			li.add(i);
		}
		System.out.println(li);
		
		System.out.println(li.checkPalindrome());
	}
}
