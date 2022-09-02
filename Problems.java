import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Problems
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T ; i++)
		{
		    int N = Integer.parseInt(br.readLine());
		    String s[] = br.readLine().split(" ");
		    int arr[] = new int[N];
		    int sum = 0;
		    for(int j = 0 ;j < N ;j++)
		    {
		        arr[j] = Integer.parseInt(s[j]);
		        if(arr[j] >= 1000)
		        sum = sum + 1;
		    }
		    System.out.println(sum);
		    
		}
	}
}
