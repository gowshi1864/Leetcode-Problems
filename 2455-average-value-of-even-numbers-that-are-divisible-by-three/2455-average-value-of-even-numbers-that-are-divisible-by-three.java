class Solution 
{
    public int averageValue(int[] nums) 
    {
        int sum=0,count=0,num=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && nums[i]%3==0)
            {
                sum+=nums[i];
                count++;
            }
        }
        if(count>=1)
        {
            num=sum/count;
        }
        return num;
    }
}