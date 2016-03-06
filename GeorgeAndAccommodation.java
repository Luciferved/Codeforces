/*

George has recently entered the BSUCP (Berland State University for Cool Programmers). George has a friend Alex who has also entered the university. Now they are moving into a dormitory.

George and Alex want to live in the same room. The dormitory has n rooms in total. At the moment the i-th room has pi people living in it and the room can accommodate qi people in total (pi ≤ qi). Your task is to count how many rooms has free place for both George and Alex.

Input
The first line contains a single integer n (1 ≤ n ≤ 100) — the number of rooms.

The i-th of the next n lines contains two integers pi and qi (0 ≤ pi ≤ qi ≤ 100) — the number of people who already live in the i-th room and the room's capacity.

Output
Print a single integer — the number of rooms where George and Alex can move in.

Sample test(s)
input
3
1 1
2 2
3 3
output
0
input
3
1 10
0 10
10 10
output
2

*/

import java.util.*;
import java.io.*;
public class GeorgeAndAccommodation
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int count = 0;
		while(t-->0)
		{	
			String str = br.readLine();
			String split[] = str.split(" ");
			if(Integer.parseInt(split[0])+2 <= Integer.parseInt(split[1]))
				count++;
		}
		System.out.println(count);
	}
}