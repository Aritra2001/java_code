class Sort
{
    public static void main(String args[])
    {
        int nums[]={2,0,2,1,1,0};
        int n=nums.length;
        
        int min=0,temp=0;
        for(int i=0;i<(n-1);i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
                if(nums[min]>nums[j])
                    min=j;
                temp=nums[min];
                nums[min]=nums[i];
                nums[i]=temp;
            }
        }
        System.out.println("The sorted array is:");
            for(int i=0;i<n;i++)
            {
                System.out.print(nums[i]+" ");
            }
            
    }
}