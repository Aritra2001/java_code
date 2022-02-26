import java.io.*;
class Palindrome
{
    public static void main(String[]args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to check for palindrome:");
        int n=Integer.parseInt(br.readLine());
        int d,c=0,temp=n;
        while(n>0)
        {
            d=n%10;
            c=c*10+d;
            n=n/10;
        }
        if(temp==c)
        System.out.println("palindrome");
        else
        System.out.println(" Not palindrome");
    }
}