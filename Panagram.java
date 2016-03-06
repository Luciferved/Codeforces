import java.util.*;
import java.io.*;
public class Panagram
{
	public static void main(String...args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		str = str.toLowerCase();
		System.out.println(panagramOrNot(str));
	}
	
	private static String panagramOrNot(String str)
	{
		TreeSet<String> ts1 = new TreeSet<String>();
		char c = 'a';
		TreeSet<String> ts2 = new TreeSet<String>();
		for(int i=0;i<26;i++)
			ts1.add((c++)+"");
		for(int i=0;i<str.length();i++)
			ts2.add(str.charAt(i)+"");
		ts2.retainAll(ts1);
		if(ts2.size() == 26)
			return "YES";
		else
			return "NO";
	}
}