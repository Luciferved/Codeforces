import java.util.*;
import java.io.*;
public class Magnets
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int last = 0;
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			a[i] = Integer.parseInt(br.readLine());
			if(a[i] != last)
				count++;
			last = a[i];
		}
		System.out.println(count);
	}
}