import java.io.*;
class StringtoInt
{
    
    public static void main(String[] args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the elements by separing them with comma :");
        String s[]= br.readLine().split( ",");
        int arr[] = new int[5];
        int sum = 0;
        for(int  i = 0 ;i < 5 ; i++)
        {
            arr[i] = Integer.parseInt(s[i]);
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}