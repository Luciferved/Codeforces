/*

Vasily the Programmer loves romance, so this year he decided to illuminate his room with candles.

Vasily has a candles.When Vasily lights up a new candle, it first burns for an hour and then it goes out. Vasily is smart, so he can make b went out candles into a new candle. As a result, this new candle can be used like any other new candle.

Now Vasily wonders: for how many hours can his candles light up the room if he acts optimally well? Help him find this number.

Input
The single line contains two integers, a and b (1 ≤ a ≤ 1000; 2 ≤ b ≤ 1000).

Output
Print a single integer — the number of hours Vasily can light up the room for.

Sample test(s)
input
4 2
output
7
input
6 3
output
8
Note
Consider the first sample. For the first four hours Vasily lights up new candles, then he uses four burned out candles to make two new ones and lights them up. When these candles go out (stop burning), Vasily can make another candle. Overall, Vasily can light up the room for 7 hours.


*/

import java.util.*;
import java.io.*;
public class NewYearCandles
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[1]);
		calculateHour(a,b);
	}
	
	private static void calculateHour(int a,int b)
	{
		int hr = a;
		int div = 0;
		int mod = 0;
		while(a>=b)
		{
			div = a/b;						//first divides equally
			hr+=div;						// add quotient to hr..i.e that much divided prprly using b..
			mod = a%b;						// now take remainder..i.e which is remaining candles
			a = div+mod;					//add div+mod....here add div coz generate new candles from old ones...and mod...coz its unused so have to add
		}
		System.out.println(hr);
	}	
}