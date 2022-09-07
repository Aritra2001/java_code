import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Wordle
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < t ; i++)
		{
		    String S = br.readLine();
		    String T = br.readLine();
		    String M = "";
		    for(int j = 0 ; j < 5 ; j++)
		    {
		        
		        if(S.charAt(j) == T.charAt(j))
		        M = M + 'G';
		        else
		        M = M + 'B';
		    }
		    System.out.println(M);
		}
		
	}
}
