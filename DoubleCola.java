import java.util.*;
import java.io.*;
public class DoubleCola
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		ArrayList<String> list = new ArrayList<String>();
			list.add("Sheldon");
			list.add("Leonard");
			list.add("Penny");
			list.add("Rajesh");
			list.add(" Howard");
		for(int i=0;i<=list.size();i++)
		{
			if(i==n-1)
			{
				System.out.println(list.get(i));
				break;
			}
			else
			{
				list.add(list.get(i));
				list.add(list.get(i));
			}
		}
	}
}
				
		