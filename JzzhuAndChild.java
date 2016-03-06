import java.io.*;
import java.util.*;
public class JzzhuAndChild
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		int child = Integer.parseInt(split[0]);
		int candies = Integer.parseInt(split[1]);
		String str1 = br.readLine();
		String split1[] = str1.split(" ");
		Integer ch[] = new Integer[child];
		for(int i=0;i<ch.length;i++)
			ch[i] = Integer.parseInt(split1[i]);
		noOfLastChild(ch,candies);
	}
	
	private static void noOfLastChild(Integer ch[],int cand)
	{
		int count = 0;
		int count1 = 0;
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(ch));
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		boolean flag = false;
		boolean flag1 = false;
		int j = 0;
		for(int i=0;i<list.size();i++)
		{
				if(flag==true)
					i = j;
				Integer temp = list.get(i);
				System.out.println("pos : "+i+" temp : "+temp);
				if(temp<cand && list.size()>=1)
				{
					count++;
					list.remove(temp);
					System.out.println(list);
					flag = true;
					//System.out.println("Count : "+count);
				}
				else if(temp>=cand && list.size()>=1)
				{
					if(hm.containsKey(temp) && hm.get(temp) <= 1)
					{
						hm.put(temp,hm.get(temp)+1);
						count++;
						list.remove(temp);
						System.out.println("hm: "+list);
					}
					list.remove(temp);
					list.add(temp);
					hm.put(temp,0);
					flag = false;
					flag1 = true;
					System.out.println("In else : "+list);
				}
				else if(list.size()==1)
				{
					break;
				}
		}
		System.out.println(count+1);
	}
}	