package ch7.part8;

import java.util.LinkedList;
public class prog1 {
	public static void main(String args[]) {
		int input=16;
		System.out.println(lookNSay(input));
	}
	private static int lookNSay(int pos) {
		LinkedList<Integer> arr = new LinkedList<Integer>();
		arr.add(1);
		while(arr.size()<pos) {
	      pos=pos-arr.size();
	      arr=process(arr);
		}
	    return arr.get(pos-1);
	}

	private static LinkedList<Integer> process(LinkedList<Integer> arr) {
	    LinkedList<Integer> buffer = new LinkedList<Integer>();
	    int count=0;
	    int digit=arr.get(0);
	    for(int i:arr) {
	    	if(digit==i) {
	    		count++;
	    	}
	    	else {
		        buffer.add(count);
		        buffer.add(digit);
		        digit=i;
		        count=1;
	    	}
	    }
    
	    buffer.add(count);
	    buffer.add(digit);

	    return buffer;
	}
}