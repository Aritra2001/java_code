import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Cabcode
{
	public static void main (String[] args)throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    int T , X , Y;
		String S1 ,S2;
		System.out.println("Enter the No of Test cases :");
		T = Integer.parseInt(br.readLine());
		for(int i = 1;i <= T;i++)
		{
		    System.out.println("Enter the first cab service charges :");
		    S1 = br.readLine();
		    System.out.println("Enter the second cab service charges :");
		    S2 = br.readLine();
		    X = Integer.parseInt(S1);
		    Y = Integer.parseInt(S2);
		    if(X > Y)
		    System.out.println("Chef chooses second cab");
            else if(X == Y)
            System.out.println("Chef can choose any cab");
            else
		    System.out.println("Chef chooses first cab");
		}
	}
}