import java.util.*;
import java.io.*;
class FaceDetection
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String split[] = str.split(" ");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = br.readLine();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		
	}
}