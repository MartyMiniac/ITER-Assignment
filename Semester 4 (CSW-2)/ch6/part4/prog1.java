package ch6.part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prog1 {
	public static void main(String args[]) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.addAll(Arrays.asList(3,3,1,0, 2,0,1));
		System.out.println(canReachEnd(arr));
	}
	
	public static boolean canReachEnd(List<Integer> arr) {
		int furthestReachSoFar=0, lastIndex=arr.size()-1;
		for(int i=0; i<=furthestReachSoFar && furthestReachSoFar < lastIndex; i++) {
			furthestReachSoFar = Math.max(furthestReachSoFar, i+arr.get(i));
		}
		return furthestReachSoFar >=lastIndex;
	}
}
