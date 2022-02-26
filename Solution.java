import java.io.*;
public class Solution {
    public int guessNumber(int n,int g) {
        if(n<g)
            return(-1);
        else if(n>g)
            return(1);
        else
            return(0);
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Nth number:");
        int N=Integer.parseInt(br.readLine());
        System.out.println("Enter a Number between 1 and "+N+" :");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of guesses You want to make:");
        int guess=Integer.parseInt(br.readLine());
        int picks,sum=0,g;
        Solution obj=new Solution();
        for(int i=1;i<=guess;i++)
        {
            System.out.println("Enter guess "+i+" :");
            g=Integer.parseInt(br.readLine());
            int p=obj.guessNumber(n,g);
            if(p==-1)
            {
                System.out.println("Your guess is higher than the number I picked...");
                
            }
            else if(p==1)
            {
                System.out.println("Your guess is lower than the number I picked...");
                
            }
            else
            {
                System.out.println("Your guess is equal to the number I picked...");
                sum++;
                break;
            }
        }
        if(sum>0)
        System.out.println("Guessed Correctedly");
        else
        System.out.println("Unable to guess the number:");
        
    }
}