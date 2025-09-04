class Solution {
    public String largestGoodInteger(String num) 
    {
        String res="";
        int n=num.length();
        for(int i=0;i<n-2;i++)
        {
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2))
            {
                String s=num.substring(i,i+3);
                if(s.compareTo(res)>0)
                {
                    res=s;
                }
            }
        }
        return res;
    }
}