/*

Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

Help Petya cope with this easy task.

Input
The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

Output
Print the resulting string. It is guaranteed that this string is not empty.

Sample test(s)
input
tour
output
.t.r
input
Codeforces
output
.c.d.f.r.c.s
input
aBAcAba
output
.b.c.b


*/

import java.util.*;
import java.io.*;
public class StringTask
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.toLowerCase();
		String result = "";
		StringBuilder sb = new StringBuilder(result);
		HashSet<String>hs = new HashSet<String>();
			hs.add("a");
			hs.add("e");
			hs.add("i");
			hs.add("o");
			hs.add("u");
			hs.add("y");
		for(int i=0;i<str.length();i++)
		{
			String c = str.charAt(i)+"";
			if(!(hs.contains(c)))
			{
				sb.append("."+c);
			}
		}
		System.out.println(sb.toString());
	}
}


