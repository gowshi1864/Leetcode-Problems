class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        int prod=1;
        for(int i=0;i<nums.length;i++)
        {
            prod*=nums[i];
        }
        return prod;
    }
}