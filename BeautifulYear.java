/*

It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.

Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.

Input
The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.

Output
Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.

Sample test(s)
input
1987
output
2013
input
2013
output
2014

*/

import java.util.*;
import java.io.*;
public class BeautifulYear
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		calculateNextBeauYear(year);
	}
	
	private static void calculateNextBeauYear(int n)
	{
		for(int i=n;i<=9015;i++)
		{
			if(distinctDigit(i))
			{
				if(i>n)
				{
					System.out.println(i);
					break;
				}
			}
			else
			{
				continue;
			}
		}
	}
	
	private static boolean distinctDigit(int i)
	{
		String str = i+"";
		String a = str.valueOf(str.charAt(0));
		String b = str.valueOf(str.charAt(1));
		String c = str.valueOf(str.charAt(2));
		String d = str.valueOf(str.charAt(3));
		if(!(a.equals(b)) && !(a.equals(c)) && !(a.equals(d)) && !(b.equals(c)) && !(b.equals(d)) && !(c.equals(d)))
			return true;
		else
			return false;
	}
		
}
		
		