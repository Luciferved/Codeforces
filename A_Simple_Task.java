import java.io.*;
import java.util.*;
class A_Simple_Task
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		int len = Integer.parseInt(split[0]);
		int t = Integer.parseInt(split[1]);
		String strS = br.readLine();
		String res = "";
		while(t-->0)
		{
			String str1 = br.readLine();
			String split1[] = str1.split(" ");
			int s = Integer.parseInt(split1[0]);
			int e = Integer.parseInt(split1[1]);
			int zeroOr1 = Integer.parseInt(split1[2]);
			if(zeroOr1 == 0)
				res = decreasing(s,e,strS);
			else
				res = increasing(s,e,strS);
			strS = res;
		}
		System.out.println(res);
		
	}
	
	private static String decreasing(int s,int e,String str)
	{
		String sort= str.substring(s-1,e);
		char ch[] = sort.toCharArray();
		Arrays.sort(ch);
		String reverse = new StringBuilder(new String(ch)).reverse().toString();
		return str.substring(0,s-1)+reverse+str.substring(e,str.length());
		
	}
	
	private static String increasing(int s,int e,String str)
	{
		String sort= str.substring(s-1,e);
		char ch[] = sort.toCharArray();
		Arrays.sort(ch);
		return str.substring(0,s-1)+new String(ch)+str.substring(e,str.length());
	}
}