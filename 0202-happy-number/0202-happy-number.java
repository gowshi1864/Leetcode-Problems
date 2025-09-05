class Solution 
{
    public static int DigitSum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            int sq=d*d;
            sum+=sq;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) 
    {
        Set<Integer> set=new HashSet<>();
        int val=n;
        while(val!=1 && !set.contains(val))
        {
            set.add(val);
            val=DigitSum(val);
        }
        if(val!=1)
        {
            return false;
        }
        return true;
    }
}