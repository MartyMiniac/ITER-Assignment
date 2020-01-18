//a1q3
import java.util.*;
class a1q3
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        char ch[] = {'a','r','b','o','n'};
        a1q3 ob = new a1q3();
        int i=1;
        for(int a=0; a<5; a++)
        {
            for(int b=0; b<5; b++)
            {
                for(int c=0; c<5; c++)
                {
                    for(int d=0; d<5; d++)
                    {
                        for(int e=0; e<5; e++)
                        {
                            String s=""+ch[a]+ch[b]+ch[c]+ch[d]+ch[e];
                            if(ob.check(s))
                            {
                                System.out.println(i+") "+s);
                                i++;
                            }
                        }
                    }
                }
            }
        }
    }
    public boolean check(String s)
    {
        boolean k=true;
        for(int a=0; a<s.length()-1; a++)
        {
            for(int b=a+1; b<s.length(); b++)
            {
                if(s.charAt(a)==s.charAt(b))
                {
                    k=false;
                    break;
                }
            }
        }
        return k;
    }
}