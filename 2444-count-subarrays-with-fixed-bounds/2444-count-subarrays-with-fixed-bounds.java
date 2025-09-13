class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) 
    {
        long count=0;
        int lb=-1,lastMin=-1,lastMax=-1;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]<minK || nums[j]>maxK)
            {
                lb=j;
            }
            if(nums[j]==minK)
            {
                lastMin=j;
            }
            if(nums[j]==maxK)
            {
                lastMax=j;
            }
            count+=Math.max(0,Math.min(lastMin,lastMax)-lb); 
        }
        return count;
    }
}