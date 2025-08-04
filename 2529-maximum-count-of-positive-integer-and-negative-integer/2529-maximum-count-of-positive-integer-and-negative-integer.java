class Solution {
    public int maximumCount(int[] nums) {
        int p=0,n=0;
        for(int i : nums)
        {
            if(i<0)
            {
                n++;
            }
            if(i>0)
            {
                p++;
            }
        }
        int max=Math.max(p,n);
        return max;
    }
}