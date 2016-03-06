/*

After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday. We know that the i-th group consists of si friends (1 ≤ si ≤ 4), and they want to go to Polycarpus together. They decided to get there by taxi. Each car can carry at most four passengers. What minimum number of cars will the children need if all members of each group should ride in the same taxi (but one taxi can take more than one group)?

Input
The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of schoolchildren. The second line contains a sequence of integers s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are separated by a space, si is the number of children in the i-th group.

Output
Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.

Sample test(s)
input
5
1 2 4 3 3
output
4
input
8
2 3 4 4 2 1 3 1
output
5
Note
In the first test we can sort the children into four cars like this:

the third group (consisting of four children),
the fourth group (consisting of three children),
the fifth group (consisting of three children),
the first and the second group (consisting of one and two children, correspondingly).
There are other ways to sort the groups into four cars.

*/

import java.util.*;
import java.io.*;
public class Taxi
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String split[] = str.split(" ");
		Integer a[] = new Integer[split.length];
		for(int i=0;i<split.length;i++)
			a[i] = Integer.parseInt(split[i]);
		minCars(a);
	}
	
	private static void minCars(Integer a[])
	{
		if(a.length == 1)
		{
			System.out.println(1);
		}
		else if(a.length > 1)
		{
			Arrays.sort(a, Collections.reverseOrder());
			int i = 0;
			int j = a.length-1;
			int count = 0;
			while(i<=j)
			{
				count++;
				int foONot = 4 - a[i];
				try
				{	
					while((a[j]<=foONot) && (j>=i))
					{
						foONot -= a[j];
						j--;
					}
				}
				catch(ArrayIndexOutOfBoundsException e)
				{}
				i++;
			}
			System.out.println(count);
		}
		
	}
	
}