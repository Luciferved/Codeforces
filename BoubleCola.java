import java.util.*;
import java.io.*;
class	DoubleCola
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> list = new ArrayList<String>();
			list.add("Sheldon");
			list.add("Leonard");
			list.add("Penny");
			list.add("Rajesh");
			list.add(" Howard");
		for(int i=0;i<list.size();i++)
		{
			if(i==n)
			{
				System.out.println(list.get(i));
			}
			else
			{
				list.add(list.size(),list.get(i));
				list.add(list.size()+1,list.get(i));
			}
		}
	}
}
				
		