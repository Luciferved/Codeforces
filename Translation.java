import java.io.*;
public class Translation
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str1 = br.readLine();
		StringBuilder st = new StringBuilder(str);
		String dup = st.reverse().toString();
		if(str1.equals(dup))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}