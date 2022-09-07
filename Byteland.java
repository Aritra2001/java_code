import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Byteland
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int n=a;
		    int s=0;
		    while(n!=0){
		        int temp=n%10;
		        s=s*10+temp;
		        n=n/10;
		    }
		    if(s==a){
		       System.out.println("wins");
		    }
		    else
		    System.out.println("loses");
		    
		}
	}
}
