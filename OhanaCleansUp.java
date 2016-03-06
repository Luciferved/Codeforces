import java.util.*;
import java.io.*;
public class OhanaCleansUp
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][i] = Integer.parseInt(br.readLine());
			}
		}
		MaxClean(a,n);
	}
	
	private static void MaxClean(int a[][],int n)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]== 0)
					chngCol(i,a);
				else
					continue;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private static void chngCol(int col,int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i][col] == 0)
			{
				a[i][col] = 1;
			}
			else if(a[i][col] == 1)
			{
				a[i][col] = 0;
			}
		}
	}
}