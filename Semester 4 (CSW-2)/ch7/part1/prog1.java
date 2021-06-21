package ch7.part1;

public class prog1 {
  public static void main(String args[]) {
    System.out.println(parse("-123"));
    System.out.println(toString(-123));
  }
  private static int parse(String str) {
    boolean isNegative=false;
    int number=0;
    for(char ch:str.toCharArray()) {
      if(ch=='-') {
        isNegative=true;
        continue;
      }
      number*=10;
      number+=((int)(ch))-48;
    }
    return isNegative?-1*number:number;
  }
  private static String toString(int num) {
    boolean isNegative=num<0;
    num=Math.abs(num);
    String str="";
    while(num!=0) {
      str=(char)(48+num%10)+str;
      num/=10;
    }
    return isNegative?"-"+str:str;
  }
}