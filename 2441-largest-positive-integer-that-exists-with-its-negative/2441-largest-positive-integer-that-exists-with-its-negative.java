class Solution 
{
    public int findMaxK(int[] nums) 
    {
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==0)
                {
                    max=Math.max(nums[i],max);
                }
            }
        }
        return max;
    }
}