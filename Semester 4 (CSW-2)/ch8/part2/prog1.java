package ch8.part2;

public class prog1 {
	public static void main(String args[]) {
		LinkedList li = new LinkedList(1, 2, 3, 4, 5);
		System.out.println(li);
		li.reverse(2, 5);
		System.out.println(li);
	}
}
