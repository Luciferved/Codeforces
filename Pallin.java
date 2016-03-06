import java.util.*;
import java.io.*;
class Pallin
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(isPallin(n));
	}
	
	private static boolean isPallin(int n)
	{
		int no = n;
		int rev = 0;
		if(n<0)
		{
			return false;
		}
		else
		{
			
			
			int digit = 0;
			while(n>0)
			{
				digit = n%10;
				rev = rev*10+digit;
				n = n/10;
			}
		}
		if(rev==no)
			return true;
		else	
			return false;
	}
}