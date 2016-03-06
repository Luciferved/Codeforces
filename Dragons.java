import java.io.*;
import java.util.*;
public class Dragons
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		int s = Integer.parseInt(split[0]);
		int t = Integer.parseInt(split[1]);
		int drag = t;
		//System.out.println(t);
		int count = 0;
		while(t-->0)
		{
			System.out.println("s : "+s);
			String str1 = br.readLine();
			String split1[] = str1.split(" ");
			int dS = Integer.parseInt(split1[0]);
			int bonus = Integer.parseInt(split1[1]);
			
			if(s>dS)
			{
				s = s+bonus;
				//
				count++;
				//System.out.println("Count : "+count);
			}
			else
			{
				System.out.println("NO");
			}
		}
		if(drag == count)
			System.out.println("YES");
			
	}
}
		
				