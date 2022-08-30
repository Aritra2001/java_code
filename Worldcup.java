import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Worldcup
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of test cases :");
		int  T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T; i++)
		{
		    System.out.println("Enter the Skill sets and Judgement level seperated by space :");
		    String s[]= br.readLine().split(" ");
		    int arr[] = new int[3];
		    for(int j = 0 ;j< s.length; j++)
		    {
		        arr[j] = Integer.parseInt(s[j]);
		    }
		    if((arr[0] - arr[1]) <= arr[2])
		    System.out.println("yes");
		    else
		    System.out.println("No");
		    
		}
	}
}
