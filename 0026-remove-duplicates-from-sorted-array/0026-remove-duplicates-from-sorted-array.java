class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int n=nums.length;
        int m=0;
        int i=0;
        for(int j=i+1;j<n;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
         return i+1;
    }
}