/*

Furik loves math lessons very much, so he doesn't attend them, unlike Rubik. But now Furik wants to get a good mark for math. For that Ms. Ivanova, his math teacher, gave him a new task. Furik solved the task immediately. Can you?

You are given a system of equations:


You should count, how many there are pairs of integers (a, b) (0 ≤ a, b) which satisfy the system.

Input
A single line contains two integers n, m (1 ≤ n, m ≤ 1000) — the parameters of the system. The numbers on the line are separated by a space.

Output
On a single line print the answer to the problem.

Sample test(s)
input
9 3
output
1
input
14 28
output
1
input
4 20
output
0
Note
In the first sample the suitable pair is integers (3, 0). In the second sample the suitable pair is integers (3, 5). In the third sample there is no suitable pair.


*/
import java.io.*;
public class SystemOfEquations
{
	static int n =0,m = 0;
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		n = Integer.parseInt(split[0]);
		m = Integer.parseInt(split[1]);
		checkForN();
	}
	
	private static void checkForN()
	{
		int count = 0;
		for(int a=0;a<=Math.sqrt(n);a++)
		{
			int b = n - (a*a);
			if(a+(b*b) == m)
				count++;	
		}
	System.out.println(count);
	}
}
				
					