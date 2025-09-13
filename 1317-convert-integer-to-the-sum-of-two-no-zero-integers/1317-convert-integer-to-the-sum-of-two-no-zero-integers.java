class Solution {
    public int[] getNoZeroIntegers(int n) 
    {
        int arr[]=new int[2];
        for(int i=1;i<n;i++)
        {
            int j=n-i;
            if(hasNoZero(i) && hasNoZero(j))
            {
                arr[0]=i;
                arr[1]=j;
            }
        }
        return arr;
    }
    public static boolean hasNoZero(int n)
    {
        while(n!=0)
        {
            if(n%10==0)
            {
                return false;
            }
            n/=10;
        }
        return true;
    }
}