class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        /*int left=0,right=nums.length-1;
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            if(sum==target)
            {
                return new int[]{left,right};
            }
            else if(target<sum)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return new int[]{};*/
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}