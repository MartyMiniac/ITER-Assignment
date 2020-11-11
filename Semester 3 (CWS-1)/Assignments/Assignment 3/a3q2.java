/* soundex name comparison*/
import java.util.Scanner;

public class a3q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] x = s.toUpperCase().toCharArray();

        String output=""+s.toUpperCase().charAt(0);

        for (int i = 1; i < x.length; i++) {

            switch (x[i]) {

                case 'B':
                case 'F':
                case 'P':
                case 'V':
                    output =output+ '1';
                    break;

                case 'C':
                case 'G':
                case 'J':
                case 'K':
                case 'Q':
                case 'S':
                case 'X':
                case 'Z':
                    output =output+ '2';
                    break;

                case 'D':
                case 'T':
                    output =output+ '3';
                    break;

                case 'L':
                    output =output+ '4';
                    break;

                case 'M':
                case 'N':
                    output =output+ '5';
                    break;

                case 'R':
                    output =output+ '6';
                    break;

                default:

                    break;
            }
        }

        output=output+"0000";

        for(int j=0;j<4;j++){
            System.out.print(output.charAt(j));
        }
    }
}
