package ch6.part15;

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class prog2 {
  public static void main(String args[]) {
    List<Integer> arr = new LinkedList<Integer>();
		arr.addAll(Arrays.asList(3, 5, 7, 11));
		
		List<Double> prob = new LinkedList<Double>();
		prob.addAll(Arrays.asList(9/18.0, 6/18.0, 2/18.0, 1/18.0));

    System.out.println(nonUniRandGen(arr, prob));
  }

  public static <E> E nonUniRandGen(List<E> arr,List<Double> prob) {
    double chance=Math.random();
    double temp=0.0;
    int indx=-1;
    for(int i=0; i<prob.size(); i++) {
      temp+=prob.get(i);
      if(temp-chance>0) {
        indx=i;
        break;
      }
    }
    
    return arr.get(indx);
  }
}