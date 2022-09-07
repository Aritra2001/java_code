import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Compressvd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T ; i++)
		{
		    
		    int N = Integer.parseInt(br.readLine());
		    String S[] = br.readLine().split(" ");
		    int arr[] = new int[N];
		    for(int j = 0 ; j < N; j++)
		    {
		        arr[j] = Integer.parseInt(S[j]);
		    }
		    int sum = 0;
		    for(int k = 0 ; k < N - 1 ; k++)
		    {
		        if(arr[k] == arr[k+1] || ( k > 0 && arr[k] == arr[k - 1]))
		        sum = sum + 1;
		    }
		    System.out.println(N - sum);
		}
	}
}
