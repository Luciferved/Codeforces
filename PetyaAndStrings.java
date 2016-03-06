/*

Little Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

Input
Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

Output
If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.

Sample test(s)
input
aaaa
aaaA
output
0
input
abs
Abz
output
-1
input
abcdefg
AbCdEfF
output
1


*/

import java.util.*;
import java.io.*;
public class PetyaAndStrings
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = (br.readLine()).toLowerCase();
		String str1 = (br.readLine()).toLowerCase();
		char ch[] = str.toCharArray();
		char ch1[] = str1.toCharArray();
		str="";
		str1="";
		for(int i=0;i<ch.length;i++)
		{
			str+=ch[i];
			str1+=ch1[i];
		}
		
		if(str.equals(str1))
			System.out.println(0);
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == ch1[i])
			{
				continue;
			}
			else
			{
				if(ch[i] < ch1[i])
				{
					System.out.println(-1);
					return;
				}
				else if(ch[i] > ch1[i])
				{
					System.out.println(1);
					return;
				}
			}
		}
	}
}