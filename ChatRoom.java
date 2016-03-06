import java.util.*;
import java.io.*;
class ChatRoom
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String og[] = new String[]{"h","e","l","l","o"};
		String temp = og[0];
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		int j = 0;
		String strTemp = "";
		for(int i=0;i<str.length();i++)
		{
			if(j<=4)
			{
				//System.out.println(j);
				//System.out.println(str.charAt(i)+" "+og[j]);
				if((str.charAt(i)+"").equals(og[j]))// && !(lhs.contains(og[j])))
				{
					lhs.add(temp);
					strTemp+=og[j];
					j++;
				}
			}
			else
			{
				break;
			}
		}
		//System.out.println(strTemp);
		if(strTemp.equals("hello"))
			System.out.println("YES");
		else
			System.out.println("NO");
			
	}
	
}
		
		