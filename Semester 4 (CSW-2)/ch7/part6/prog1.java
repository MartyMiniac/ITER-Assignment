package ch7.part6;

public class prog1 {
	public static void main(String args[]) {
	    String input="Alice likes Bob";
	    
	    System.out.println("Input: "+input);
	    char[] arr = input.toCharArray();
	    reverseWords(arr);

	    System.out.println(new String(arr));
	  }

	  private static void reverseWords(char[] arr) {
	    reverse(arr, 0, arr.length-1);
	    int start=0, end=0;
	    while((end=findNextSpace(arr, start))!=-1) {
	      reverse(arr, start, end);
	      start=end+2;
	    }
	  }

	  private static void reverse(char[] arr, int start, int end) {
	    while(start<end) {
	      swap(arr, start, end);
	      start++;
	      end--;
	    }
	  }

	  private static void swap(char[] arr, int pos1, int pos2) {
	    char ch=arr[pos1];
	    arr[pos1]=arr[pos2];
	    arr[pos2]=ch;
	  }

	  private static int findNextSpace(char[] arr, int start) {
	    while((start+1)<arr.length && arr[start+1]!=' ') {
	      start++;
	    }
	    return start<arr.length?start:-1;
	  }
}
