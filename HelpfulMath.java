import java.util.*;
import java.io.*;
public class HelpfulMath
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split("\\+");
		int a[] = new int [split.length];
		for(int i=0;i<a.length;i++)
			a[i] = Integer.parseInt(split[i]);

		Arrays.sort(a);
		
		int i = 0;
		String sum="";
		int len = a.length;
		while(i<a.length)
		{
			sum +=a[i]+"+";
			i++;
		}
			System.out.println(sum.substring(0,sum.length()-1));
	}
}