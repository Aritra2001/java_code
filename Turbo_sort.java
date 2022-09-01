
import java.util.*;
import java.util.Arrays;
class Turbo_sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int t=sc.nextInt();
        int a[]=new int[t];
        System.out.println("Enter the elements :");
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("The sorted array :");
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}
