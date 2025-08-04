class Solution 
{
    public int[] buildArray(int[] nums) 
    {
       int result[]=new int[nums.length];
       int ind=0;
       for(int i=0;i<nums.length;i++)
       {
           result[ind]=nums[nums[i]];
           ind++;
       } 
       return result;
    }
}