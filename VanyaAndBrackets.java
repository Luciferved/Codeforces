import java.util.*;
import java.io.*;
class VanyaAndBrackets
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		maxVal(str);
	}
	
	private static void maxVal(String str)
	{
		int val  = 1;
		if(str.contains("*") && !(str.contains("+"))) 
		{
			//System.out.println("here1");
			System.out.println(evaluateStr(str,"*"));
		}
		else if(str.contains("+") && !(str.contains("*")))
		{
			//System.out.println("here2");
			System.out.println(evaluateStr(str,"+"));
		}
		else if(str.contains("+") && str.contains("*"))
		{
			String split[] = str.split("\\*");
			for(int i=0;i<split.length;i++)
			{
				if(split[i].contains("+"))
				{
					int temp=evaluateStr(split[i],"+"); 
					val*=temp;
				}
				else
				{
					val*=Integer.parseInt(split[i]);
				}
			}
			System.out.println(val);
		}
		
	}
	
	private static int evaluateStr(String str,String sign)
	{
		int val = 0;
		if(sign == "+")
		{
			str = str.replace("+","");
			for(int i=0;i<str.length();i++)
			{
				char ch = str.charAt(i);
				
				val=val+Integer.parseInt(ch+"");
			}
		}
		else if(sign == "*")
		{
			val = 1;
			str = str.replace("*","");
			System.out.println(str);
			for(int i=0;i<str.length();i++)
			{
				char ch = str.charAt(i);
				val*=Integer.parseInt(ch+"");
			}
		}
		return val;
	}	
}