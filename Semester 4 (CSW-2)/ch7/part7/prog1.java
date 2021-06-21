package ch7.part7;

import java.util.LinkedList;
public class prog1 {
  //keypad model in a 2d array
  private static final int[][] dataset = {
      {},
      
      {},
      {65, 66, 67},
      {68, 69, 70},

      {71, 72, 73},
      {74, 75, 76},
      {77, 78, 79},

      {80, 81, 82, 83},
      {84, 85, 86},
      {87, 88, 89, 90}
    };

  public static void main(String args[]) {
    LinkedList<String> arr = new LinkedList<String>();
    String input="2276696";
    getMnemonics(arr, input);
    for(String s:arr) {
      System.out.println(s);
    }
  }

  private static void getMnemonics(LinkedList<String> arr, String input) {
    solve(arr, input, "", 0);
  }

  private static void solve(LinkedList<String> arr, String input, String output, int pos) {
    if(pos==input.length()) {
      arr.add(output);
      return;
    }
    for(int i:dataset[getVal(input.charAt(pos))]) {
      solve(arr, input, output+(char)(i), pos+1);
    }
  }

  private static int getVal(char ch) {
    return (int)(ch-'0');
  }
}