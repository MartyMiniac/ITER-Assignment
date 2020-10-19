//A Simple Text Formatter as in text book.
import java.io.*;
import java.util.*;

public class a3q1
{
	public static void main(String args[])throws IOException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The File Path : ");
		String path=in.nextLine();
		in.close();
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String s="";
		StringBuffer sb1 = new StringBuffer();
		int len=0;
		
		while((s=br.readLine())!=null)
		{
			len=len<s.length()?s.length():len;
			sb1.append(s);
			sb1.append((char)0);
		}
		
		String delim=""+(char)0;
		s=sb1.toString();
		StringTokenizer st = new StringTokenizer(s,delim);
		StringBuffer sb2 = new StringBuffer();
		
		while(st.hasMoreElements())
		{
			StringBuffer tmp = new StringBuffer(st.nextElement().toString());
			int tmplen=tmp.length();
			for(int i=tmplen; i<len; i++)
			{
				tmp.insert(0, " ");
			}
			sb2.append(tmp);
			sb2.append("\n");
		}
		
		fr.close();
		br.close();
		
		FileWriter fw = new FileWriter(path);
		fw.write(sb2.toString());
		fw.close();
	}
}
