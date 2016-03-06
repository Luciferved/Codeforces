/*

Vasya has n pairs of socks. In the morning of each day Vasya has to put on a pair of socks before he goes to school. When he comes home in the evening, Vasya takes off the used socks and throws them away. Every m-th day (at days with numbers m, 2m, 3m, ...) mom buys a pair of socks to Vasya. She does it late in the evening, so that Vasya cannot put on a new pair of socks before the next day. How many consecutive days pass until Vasya runs out of socks?

Input
The single line contains two integers n and m (1 ≤ n ≤ 100; 2 ≤ m ≤ 100), separated by a space.

Output
Print a single integer — the answer to the problem.

Sample test(s)
input
2 2
output
3
input
9 3
output
13
Note
In the first sample Vasya spends the first two days wearing the socks that he had initially. 
Then on day three he puts on the socks that were bought on day two.

In the second sample Vasya spends the first nine days wearing the socks that he had initially. 
Then he spends three days wearing the socks that were bought on the third, sixth and ninth days.
 Than he spends another day wearing the socks that were bought on the twelfth day.

*/
import java.util.*;
import java.io.*;
public class VasyaAndSocks
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		calculateDays(a,b);
	}
	
	private static void calculateDays(int a,int b)
	{
		int hr = a;
		int div = 0;
		int mod = 0;
		while(a>=b)
		{
			div = a/b;						
			hr+=div;						
			mod = a%b;						
			a = div+mod;					
		}
		System.out.println(hr);
	}
}
			
			