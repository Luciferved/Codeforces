import java.util.*;
import java.io.*;
class AndBCompileError
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//String str = br.readLine();
		ArrayList<Integer>ts1 = new ArrayList<Integer>();
		ArrayList<Integer>ts2 = new ArrayList<Integer>();
		ArrayList<Integer>ts3 = new ArrayList<Integer>();
		ArrayList<Integer>ts4 = new ArrayList<Integer>();		
		ts1 = toArray(n,br.readLine());
		ts2 = toArray(n-1,br.readLine());
		ts3 = toArray(n-2,br.readLine());
		
		//ts1.removeAll(ts2);
		//ts2.removeAll(ts3);
		//System.out.println(ts1);
		//System.out.println(ts2);
		
		
		int count = 0;
		for(int i=0;i<ts1.size();i++)
		{
			if(count!=ts2.size())
			{
				count++;
				if(ts1.contains(ts2.get(i)))
					ts2.remove(ts1.get(i));
				else
					ts4.add(ts1.get(i));
			}
			else
			{
				ts4.add(ts1.get(i));
			}
		}
				
		System.out.println(ts4);
			
			
	}
	
	private static ArrayList<Integer> toArray(int n,String str)
	{
		String split[] = str.split(" ");
		Integer a[] = new Integer[n];
		for(int i=0;i<a.length;i++)
			a[i] = Integer.parseInt(split[i]);
			
		ArrayList<Integer> ts = new ArrayList<Integer>(Arrays.asList(a));
		//System.out.println(ts);
		return ts;
	}
}
	
	
	