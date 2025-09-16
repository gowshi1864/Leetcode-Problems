class Solution 
{
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int max=0;
        int r=nums.length,c=nums[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j || (i+j)==c-1)
                {
                    if(nums[i][j]>max && isPrime(nums[i][j]))
                    {
                        max=nums[i][j];
                    }
                }
            }
        }
        return max;
    }
}