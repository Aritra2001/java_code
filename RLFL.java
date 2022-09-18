import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RLGL
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader());
	    int T = Integer.parseInt(br.readLine());
	    for(int i = 0; i < N; i++)
	    {
	        int N = Integer.parseInt(br.readLine());
	        int k = Integer.parseInt(br.readLine());
	        
	        int arr[] = new int[N];
	        int sum = 0;
	        for(int j = 0; j < N; j++)
	        {
	            arr[j] = Integer.parseInt(br.readLine());
	            if(arr[j] <= k)
	            sum++;
	        }
	        System.out.println(sum);
	    }
	}
}
