class Solution {
    public int scoreOfString(String s) 
    {
        int sum=0;
        for(int i=1;i<s.length();i++)
        {
            int a=(int) s.charAt(i);
            int b=(int) s.charAt(i-1);
            sum+=Math.abs(a-b);
        }
        return sum;
    }
}