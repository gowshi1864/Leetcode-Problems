class Solution {
    public void sortColors(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i : nums)
        {
            System.out.print(i+" ");
        }
    }
    // public static boolean isSorted(int nums[])
    // {
    //     for(int i=0;i<nums.length-1;i++)
    //     {
    //         if(nums[i]>=nums[i+1])
    //         {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}