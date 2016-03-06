/*

B. Vanya and Books
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Vanya got an important task — he should enumerate books in the library and label each book with its number. 
Each of the n books should be assigned with a number from 1 to n. Naturally, distinct books should be assigned distinct numbers.

Vanya wants to know how many digits he will have to write down as he labels the books.

Input
The first line contains integer n (1 ≤ n ≤ 109) — the number of books in the library.

Output
Print the number of digits needed to number all the books.

Sample test(s)
input
13
output
17
input
4
output
4
Note
Note to the first test. The books get numbers 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, which totals to 17 digits.

Note to the second sample. The books get numbers 1, 2, 3, 4, which totals to 4 digits.

*/

import java.util.*;
import java.io.*;
public class VyasaAndBooks
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println(calculate(n));
	}
	
	private static long calculate(long n)
	{
		String str = n+"";
		long len = str.length();
		if(len == 1)
		{
			return n;
		}
		else if(len==2)
		{
			long temp = n-10+1;
			return 9+2*temp;
		}
		else if(len==3)
		{
			long temp = n-100+1;
			return 9+2*90L+3*temp;
		}
		else if(len==4)
		{
			long temp = n-1000+1;
			return 9+2*90L+3*900L+4*temp;
		}
		else if(len==5)
		{
			long temp = n-10000+1;
			return 9+2*90L+3*900L+4*9000L+5*temp;
		}
		else if(len==6)
		{
			long temp = n-100000+1;
			return 9+2*90L+3*900L+4*9000L+5*90000L+6*temp;
		}
		else if(len==7)
		{
			long temp = n-1000000+1;
			return 9+2*90L+3*900L+4*9000L+5*90000L+6*900000L+7*temp;
		}
		else if(len==8)
		{
			long temp = n-10000000+1;
			return 9+2*90L+3*900L+4*9000L+5*90000L+6*900000L+7*9000000L+8*temp;
		}
		else if(len==9)
		{
			long temp = n-100000000+1;
			return 9+2*90L+3*900L+4*9000L+5*90000L+6*900000L+7*9000000L+8*90000000L+9*temp;
		}
		else if(len==10)
		{
			long temp = n-1000000000L+1;
			return 9+2*90L+3*900L+4*9000L+5*90000L+6*900000L+7*9000000L+8*90000000L+9*900000000L+10*temp;
		}
	return -1;
	}
}


