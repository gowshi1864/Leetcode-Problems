class Solution {
    public int reverseDegree(String s) 
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            int x=(int) 'z' + 1;
            int y=(int) s.charAt(i);
            int a=(x-y)*(i+1);
            sum+=a;
        }
        return sum;
    }
}