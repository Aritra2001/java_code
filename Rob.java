class Rob
{
    public static void main(String args[])
    {
        int nums[]={2,7,9,3,1};
        int len=nums.length;
        int sum=0;
        for(int i=0;i<len;i+=2)
        {
            sum=sum+nums[i];
        }
        System.out.println("Total money robbed :"+sum);
    }
}
