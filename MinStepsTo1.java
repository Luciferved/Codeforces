import java.util.*;
import java.io.*;
class MinStepsTo1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(getMinSteps(n));
	}
	
	private static int getMinSteps(int n)
	{
		int dp[] = new int[n+1];
		dp[1] = 0;  // trivial case
		for(int i = 2 ; i <= n ; i ++ )
		{
			System.out.println("i : "+i);
			dp[i] = 1 + dp[i-1];
			System.out.println("dp["+i+"] : "+dp[i]);
			if(i%2==0)
			{
				dp[i] = Math.min( dp[i] , 1+ dp[i/2] );
				System.out.println("dp["+i+"]in %2 : "+dp[i]);
				
			}
			if(i%3==0)
			{
				dp[i] = Math.min( dp[i] , 1+ dp[i/3] );
				System.out.println("dp["+i+"] on %3 : "+dp[i]);
			
			}
		}
		return dp[n];
	}
}

/*


	
	*/