/*

Petr stands in line of n people, but he doesn't know exactly which position he occupies. He can say that there are no less than a people standing in front of him and no more than b people standing behind him. Find the number of different positions Petr can occupy.

Input
The only line contains three integers n, a and b (0 ≤ a, b < n ≤ 100).

Output
Print the single number — the number of the sought positions.

Sample test(s)
input
3 1 1
output
2
input
5 2 3
output
3
Note
The possible positions in the first sample are: 2 and 3 (if we number the positions starting with 1).

In the second sample they are 3, 4 and 5.

logic : a+b < n = b + 1
		a+b > n = n - a
		
		dunno y givin dis as wrong ans...
		
		int count = 0;
		for(int i=a;i<n;i++)
			count++;
		System.out.println(count);

*/

import java.util.*;
import java.io.*;
public class NoOfPos
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		int n = Integer.parseInt(split[0]);
		int a = Integer.parseInt(split[1]);
		int b = Integer.parseInt(split[2]);
		if(a+b<n)
			System.out.println(b+1);
		else
			System.out.println(n-a);
	}
}