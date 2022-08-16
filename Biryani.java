
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Biryani
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the no of test cases :");
		int T = Integer.parseInt(br.readLine());
        for(int  i = 1 ;i <= T ; i++)
        {
            System.out.println("Enter the no of weeks  :");
		    int x = Integer.parseInt(br.readLine());
            System.out.println("Enter cost of classes per week  :");
		    int y = Integer.parseInt(br.readLine());
            int p = x * y;
            System.out.println("The total price that chef needs to play is :"+p);
	    }
    }
}  