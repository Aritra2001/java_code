class concatination
{
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        int c=0;
        int len=arr.length;
        int a[]=new int[len*2];
        for(int i=0;i<len*2;i++)
        {
            if(i<len)
                a[i]=arr[i];
            else
            {
                a[i]=arr[c];
                c++;
            }
        }
        System.out.println("The new array is:");
        for(int i=0;i<len*2;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
