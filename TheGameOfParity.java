import java.util.*;
import java.io.*;
public class TheGameOfParity
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		long n = Long.parseLong(split[0]);
		long k = Long.parseLong(split[1]);
		//System.out.println("n : "+n);
		//System.out.println("k : "+k);
		
		
		long res[] = new long[(int)n];
		String str1 = br.readLine();
		String split1[] = str1.split(" ");
		for(int i=0;i<res.length;i++)
			res[i] = Long.parseLong(split1[i]);
			
		long sum = 0;
		long uptill = n-k;
		for(int i=0;i<uptill;i++)
		{
			sum+=res[i];
		}
		if(sum%2==0)
			System.out.println("Daenerys");
		else
			System.out.println("Stannis");
	}
}
		