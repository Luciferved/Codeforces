/*


Calculating Function
time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
For a positive integer n let's define a function f:

f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn

Your task is to calculate f(n) for a given integer n.

Input
The single line contains the positive integer n (1 ≤ n ≤ 1015).

Output
Print f(n) in a single line.

Sample test(s)
input
4
output
2
input
5
output
-3
Note
f(4) =  - 1 + 2 - 3 + 4 = 2

f(5) =  - 1 + 2 - 3 + 4 - 5 =  - 3

********BEST SOLN**********

private static void calculateFn(long n)
	{
		if(n%2==0)
			System.out.println(n/2);
		else
			System.out.println(-(n+1)/2);
	}


*/

import java.util.*;
import java.io.*;
class CalculatingFunctions
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		calculateFn(n);
	}
	
	private static void calculateFn(long n)
	{
		int sign = -1;
		int res = 0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
				res +=(sign*i);
			else if(i%2==0)
				res+=i;
		}
		System.out.println(res);
	}

			
			