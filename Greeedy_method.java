import java.io.*;
class Greeedy_method
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no of questions");
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int sum = 0;
        System.out.println("Enter the no of Questions for each option :");
        for(int i = 0; i < 4; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
            sum = sum + arr[i];
        }
        if(sum != N)
        {
            System.out.println("Enter the Correct data :");
            System.exit(1);
        }
        int max = arr[0];
        for(int i = 0; i < 3; i++)
        { 
            if(arr[i+1] > arr[i])
            max = arr[i+1];
        }
        System.out.println("The maxium marks that can be obtained is :"+max);
    }
}
