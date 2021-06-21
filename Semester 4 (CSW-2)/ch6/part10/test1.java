package ch6.part10;

import java.util.Arrays;

public class test1 {
	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 5};

		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length-2; j>-1; j--) {
				//if(arr[j]<arr[j+1]) {
					swap(arr, j, j+1);
					System.out.println(Arrays.toString(arr));					
				//}
			}
		}
	}
	
	private static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
