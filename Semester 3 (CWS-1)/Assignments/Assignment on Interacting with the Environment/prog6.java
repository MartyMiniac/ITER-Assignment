/*. Write a program which ask the user to enter a jar file name and check
whether the jar file is install or not.*/
import java.io.File;

public class prog6 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\mayan\\Downloads");
        String[] List = f.list();
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