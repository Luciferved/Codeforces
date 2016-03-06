import java.io.*;
import java.util.*;
public class VasyaAndTriangle
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str[] = new String[n];
		for(int i=0;i<str.length;i++)
			str[i] = br.readLine();
		System.out.println(calculate(n));
	}
	
	private static int calculate(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==3)
		{
			return 1;
		}
		else if(n==4)
		{
			return 3;
		}
		else
		{
			int sum = 1;
			int temp = n-2;
			for(int i=temp;i>=1;i--)
				sum*=i;
			return sum;
		}
	}
}
		
				