package ch6.part17;

import java.util.*;
public class prog1 {
	  public static void main(String args[]) {
		    int[][] arr ={
		      {1,  2,   3, 4},
		      {12, 13, 14, 5},
		      {11, 16, 15, 6},
		      {10,  9,  8, 7},
		    };
		
		    /*
		    int[][] arr = {
		      {1, 2, 3},
		      {8, 9, 4},
		      {7, 6, 5}
		    };
		    */
		
		    int[] order = spiral(arr);
		
		    System.out.println(Arrays.toString(order));
	  }
	
	  private static int[] spiral(int[][] arr) {
		    int[] rt = new int[(int)(Math.pow(arr.length, 2))];
		    Entity cursor = new Entity(arr.length);
		    int[] pos={0,0};
		
		    for(int i=0; i<rt.length; i++) {
			      rt[i]=getValue(arr, pos);
			      pos=cursor.move();
		    }
		
		    return rt;
	  }
	
	  //internal function  
	  private static int getValue(int[][] arr, int[] pos) {
		    int x=pos[0];
		    int y=pos[1];
		    return arr[x][y];
	  }
}
