class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int res=nums[0];
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int val=nums[i];
            if(val<0)
            {
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(val,val*max);
            min=Math.min(val,val*min);
            res=Math.max(res,max);
        }
        return res;
    }
}