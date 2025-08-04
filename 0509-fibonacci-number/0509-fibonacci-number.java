class Solution 
{
    public int fib(int n) 
    {
        if(n<=1)
        {
            return n;
        }
        int f=0,s=1,fib;
        for(int i=2;i<=n;i++)
        {
            fib=f+s;
            f=s;
            s=fib;
        }
        return s;
    }
}