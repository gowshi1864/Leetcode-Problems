class Solution {
    public int countBeautifulPairs(int[] nums) 
    {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            int a=getFirstDigit(nums[i]);
            for(int j=i+1;j<n;j++)
            {
                int b=nums[j]%10;
                if(gcd(a,b)==1)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static int getFirstDigit(int n)
    {
        while(n>=10)
        {
            n/=10;
        }
        return n;
    }
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}