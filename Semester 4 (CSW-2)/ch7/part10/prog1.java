package ch7.part10;

import java.util.LinkedList;

public class prog1 {
	public static void main(String args[]) {
		String input="19216811";
	    LinkedList<String> arr = new LinkedList<String>();
	
	    computeAll(input, arr);
	
	    for(String s: arr) {
	    	System.out.println(s);
	    }
	}
	
	private static void computeAll(String input, LinkedList<String> arr) {
	    int dec1=1;
	    int dec2=dec1+1;
	    int dec3=dec2+1;
	    while(dec1<input.length()-2) {
	    	if(!isValid(input.substring(0, dec1))) {
	    		dec1++;
	    		continue;
	    	}
	    	
	    	dec2=dec1+1;
	    	
	    	while(dec2<input.length()-1) {
		        if(!isValid(input.substring(dec1, dec2))) {
		        	dec2++;
		        	continue;
		        }
	        
		        dec3=dec2+1;
	        
		        while(dec3<input.length()) {
		        	if(isValid(input.substring(dec2, dec3)) && isValid(input.substring(dec3, input.length()))) {
		        		arr.add(getIP(input, dec1, dec2, dec3));
	        		}
		        	dec3++;
	        	}
	        
		        dec2++;
	    	}
    	
	    	dec1++;
	    }
	}
	private static boolean isValid(String substring) {
		return substring.length()<4 && !substring.startsWith("0") && Integer.parseInt(substring) < 256;
	}
	private static String getIP(String input, int dec1, int dec2, int dec3) {
		StringBuffer sb = new StringBuffer();
	    int counter=0;
	    for(char ch:input.toCharArray()) {
	    	if(counter==dec1 || counter==dec2 || counter==dec3) {
	    		sb.append('.');
	    	}
	    	sb.append(ch);
	    	counter++;
	    }
	
	    return sb.toString();
	}
}
