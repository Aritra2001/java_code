import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Billiards
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][]=new int[n][2];
	    int l1=0;
		int l2=0;
		int lead=0;
		int player=0;
		for(int i = 0;i<n;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            a[i][j]=sc.nextInt();
		        }
		    }
		    for(int i = 0;i<n;i++)
		    {
		         l1+=a[i][0];
		         l2+=a[i][1];
		    
		      if(l1-l2>lead)
		      {
		          lead=l1-l2;
		          player=1;
		      }
		      else if(l2-l1>lead)
		      {
		          lead=l2-l1;
		          player=2;
		      }
		    } System.out.println(player+" "+lead);
		    
		
	}
}
