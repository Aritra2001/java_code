import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Practice
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int arr[] = new int[4];
	    int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter elements in the array :");
		for(int i = 0;i < 4; i++)
		{
		    arr[i] = Integer.parseInt(br.readLine());
		    if(arr[i] >= 10)
		    sum = sum + 1 ;
		}
		System.out.println(sum);
	}
}

