/*

There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.

Input
The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.

The next line contains string s, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.

Output
Print a single integer — the answer to the problem.

Sample test(s)
input
3
RRG
output
1
input
5
RRRRR
output
4
input
4
BRBG
output
0


*/

import java.util.*;
import java.io.*;
public class StonesOnTheTable
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int count = 0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
				count++;
		}
		System.out.println(count);
	}
}
