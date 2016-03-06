import java.io.*;
public class WordCaps
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(Character.toUpperCase(str.charAt(0))+str.substring(1));
	}
}