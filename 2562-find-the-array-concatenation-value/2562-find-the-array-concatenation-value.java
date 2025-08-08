class Solution {
    public long findTheArrayConcVal(int[] nums) 
    {
        long sum=0;
        String s[]=new String[nums.length];
        for(int i=0;i<s.length;i++)
        {
            s[i]=String.valueOf(nums[i]);
        }
        int l=0,r=s.length-1;
        while(l<=r)
        {
            String a="";
            if(l!=r)
            {
                a=s[l]+s[r];
            }
            else
            {
                a=s[l];
            }
            int n=Integer.valueOf(a);
            sum+=n;
            l++;
            r--;
        }
        return sum;
    }
}