import java.util.Properties;

public class prog2
{
    public static void main(String args[])
    {
        Properties jvm=System.getProperties();
        jvm.list(System.out);
    }
}