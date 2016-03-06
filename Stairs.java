/*

Dreamoon wants to climb up a stair of n steps. He can climb 1 or 2 steps at each move. Dreamoon wants the number of moves to be a multiple of an integer m.

What is the minimal number of moves making him climb to the top of the stairs that satisfies his condition?

Input
The single line contains two space separated integers n, m (0 < n ≤ 10000, 1 < m ≤ 10).

Output
Print a single integer — the minimal number of moves being a multiple of m. If there is no way he can climb satisfying condition print  - 1 instead.

Sample test(s)
input
10 2
output
6
input
3 5
output
-1
Note
For the first sample, Dreamoon could climb in 6 moves with following sequence of steps: {2, 2, 2, 2, 1, 1}.

For the second sample, there are only three valid sequence of steps {2, 1}, {1, 2}, {1, 1, 1} with 2, 2, and 3 steps respectively. All these numbers are not multiples of 5.

Logic ChckOut

*/

import java.util.*;
import java.io.*;
public class Stairs
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		minMoves(n,m);
	}
	
	private static void minMoves(int n,int m)
	{
		int l = 0;
		if(m > n)
		{
			System.out.println("-1");
		}
		else
		{
			if(n%2 == 0)
			{
				l = n/2;
				//System.out.println("l in if : "+l);	
			}
			else
			{
				l = n/2+1;
				//System.out.println("l in else : "+l);	
			}
			//System.out.println("l out : "+l);
			//System.out.println("M out : "+m);
			
			while(l%m!=0)
			{
				//System.out.println("l%m : "+l%m);
				l++;
				//System.out.println("l in while : "+l);	
			}
			System.out.println(l);	
		}
		
	}
}
			