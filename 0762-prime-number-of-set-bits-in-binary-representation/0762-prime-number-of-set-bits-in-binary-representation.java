class Solution 
{
    public int countPrimeSetBits(int left, int right) 
    {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            int a=Integer.bitCount(i);
            if(isPrime(a))
            {
                count++;
            }
        }
        return count;
    }
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
}