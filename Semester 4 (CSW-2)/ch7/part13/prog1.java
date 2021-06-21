package ch7.part13;

public class prog1 {
	public static void main(String args[]) {
		String text="a good string search algo is fundamental to the performance of many applications. sveral clever alo have been proposed.";
		String searchString="performance";
		
		System.out.println(search(text, searchString));
	}
	
	private static int search(String text, String s) {
		int startFrom=0;
		boolean found=false;
		boolean indexing=false;
		
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) == s.charAt(i-startFrom)) {
				indexing=true;
				if(s.length()==(i-startFrom+1)) {
					found=true;
					break;
				}
			}
			else {
				if(indexing) {
					i=startFrom+1;
					indexing=false;
				}
				startFrom++;
			}
		}
		
		return found?startFrom:-1;
	}
}
