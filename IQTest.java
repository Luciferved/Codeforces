/*

Bob is preparing to pass IQ test. The most frequent task in this test is to find out which one of the given n numbers differs from the others. Bob observed that one number usually differs from the others in evenness. Help Bob — to check his answers, he needs a program that among the given n numbers finds one that is different in evenness.

Input
The first line contains integer n (3 ≤ n ≤ 100) — amount of numbers in the task. The second line contains n space-separated natural numbers, not exceeding 100. It is guaranteed, that exactly one of these numbers differs from the others in evenness.

Output
Output index of number that differs from the others in evenness. Numbers are numbered from 1 in the input order.

Sample test(s)
input
5
2 4 7 8 10
output
3
input
4
1 2 1 1
output
2

*/

import java.util.*;
import java.io.*;
public class IQTest
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String split[] = str.split(" ");
		Integer a[] = new Integer[split.length];
		for(int i=0;i<a.length;i++)
			a[i] = Integer.parseInt(split[i]);
		
		int count1 = 0,count = 0;
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
				al1.add(i);
			}
			else
			{
				count1++;
				al2.add(i);
			}
		}
		if(count > count1)
			System.out.println(al2.get(al2.size()-1)+1);
		else	
			System.out.println(al1.get(al1.size()-1)+1);
	}
}