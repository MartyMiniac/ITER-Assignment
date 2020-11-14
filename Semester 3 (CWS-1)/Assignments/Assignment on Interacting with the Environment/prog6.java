/*. Write a program which ask the user to enter a jar file name and check
whether the jar file is install or not.*/
import java.io.File;
import java.util.*;

public class prog6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the File Location : ");
        File f1 = new File(in.nextLine());
        in.close();
        String[] List = f1.list();
        for(String str1 : List) {
            int i = str1.lastIndexOf('.');
            String ext=str1.substring(i+1);
            if(ext.equals("jar")){
                System.out.println("Jar File");
            }
            else{
                System.out.println("Not a Jar File");
            }
        }
    }
}
