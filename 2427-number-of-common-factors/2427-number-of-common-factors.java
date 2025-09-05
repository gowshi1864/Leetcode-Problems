class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int n=0;
        if(a<b)
        {
            n=b;
        }
        else
        {
            n=a;
        }
        for(int i=1;i<=n;i++)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }
        return count;
    }
}