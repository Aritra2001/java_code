class Diagonal
{
    public static void main(String args[])
    {
        int arr[][]={
                     {1,2,3},
                     {4,5,6},
                     {7,8,9}
                    };
            
            int s=0,c=0,count=2;
            for(int i=0;i<3;i++)
            {
                
                
                   s=s+arr[i][i];
                    c=c+arr[i][count];
                   count--;
                
            }
        int sum=s+c-arr[1][1];
        System.out.println("sum of the diagonals is:"+sum);
    }
}