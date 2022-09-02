import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pageno
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no of test cases :");
		int t = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < t ;i ++)
		{
		    String s[] = br.readLine().split(" ");
		    int a[] = new int[2];
		    int no = 1;
		    for(int j = 0 ;j < 2 ;j ++)
		    {
		        a[j] = Integer.parseInt(s[j]);
		        no = no * a[j];
		    }
		    System.out.println(no);
		}
		
	}
}
