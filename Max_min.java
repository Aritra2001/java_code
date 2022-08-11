import java.io.*;
public class Max_min
{
    int maximum(int x, int y ,int z)
    {
        int max=x;
        if(y>max)
        max=y;
        if(z>max)
        max=z;
        return max;
    }
    int minimum(int x, int y ,int z)
    {
        int min=x;
        if(y<min)
        min=y;
        if(z<min)
        min=z;
        return min;
    }
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the first number :");
        int a=Integer.parseInt(br.readLine()); 
        System.out.println("Enter the second number :");
        int b=Integer.parseInt(br.readLine()); 
        System.out.println("Enter the third number :");
        int c=Integer.parseInt(br.readLine());
        Max_min obj=new Max_min();  
        int maximum, minimum;
        maximum=obj.maximum(a,b,c);
        minimum=obj.minimum(a,b,c);
        System.out.println("The maximum number is :"+maximum);
        System.out.println("The manimum number is :"+minimum);
    }
    
}
