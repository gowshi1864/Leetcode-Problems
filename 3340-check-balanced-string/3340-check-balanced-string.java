class Solution 
{
    public boolean isBalanced(String num) 
    {
        int sum1=0,sum2=0;
        for(int i=0;i<num.length();i+=2)
        {
            sum1+=Character.getNumericValue(num.charAt(i));
        }
        for(int i=1;i<num.length();i+=2)
        {
            sum2+=Character.getNumericValue(num.charAt(i));
        }
        if(sum1!=sum2)
        {
            return false;
        }
        return true;
    }
}