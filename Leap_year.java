import java.io.*;
class Leap_year
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of test cases:");
        int t=Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++)
        {
        System.out.println("Enter a year to check if it's a leap year or not:");
        int n=Integer.parseInt(br.readLine());
        if(n%4==0)
        System.out.println(n+" IS A LEAP YEAR");
        else
        System.out.println(" IS NOT A LEAP YEAR");
        }
    }
}
