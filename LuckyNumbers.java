/*

Petya loves lucky numbers. Everybody knows that lucky numbers are positive integers whose decimal representation contains only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Petya calls a number almost lucky if it could be evenly divided by some lucky number. Help him find out if the given number n is almost lucky.

Input
The single line contains an integer n (1 ≤ n ≤ 1000) — the number that needs to be checked.

Output
In the only line print "YES" (without the quotes), if number n is almost lucky. Otherwise, print "NO" (without the quotes).

Sample test(s)
input
47
output
YES
input
16
output
YES
input
78
output
NO
Note
Note that all lucky numbers are almost lucky as any number is evenly divisible by itself.

In the first sample 47 is a lucky number. In the second sample 16 is divisible by 4.


LOGIC :CHECK WHETHER NO CONTAINS 4 ND 7 NLY..IF YES..DEN CHEK IF NO % I(lucky no..det contains nly 4 nd 7) == 0 IF TRUE DEN YES ELSE NO

*/

import java.util.*;
import java.io.*;
public class LuckyNumbers
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean flag = false;
		for(int i=1;i<=n;i++)
		{
			if(chkLucky(i+""))
			{
				if(n % i == 0)
				{
					System.out.println(n+" "+i);
					flag = true;
				}
			}
		}
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	private static boolean chkLucky(String str)
	{
		int count = 0;
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == '4' || ch[i] == '7')
				count++;
		}
		if(count == str.length())
			return true;
		else
			return false;
	}
}