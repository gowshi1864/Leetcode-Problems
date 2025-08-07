class Solution {
    public String firstPalindrome(String[] words) 
    {
        String ans="";
        for(int i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))
            {
                ans=words[i];
                break;
            }
        }
        return ans;   
    }
    public static boolean isPalindrome(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        if(s.equals(sb.reverse().toString()))
        {
            return true;
        }
        return false;
    }
}