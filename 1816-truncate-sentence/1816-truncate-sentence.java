import java.util.*;
class Solution {
    public String truncateSentence(String s, int k) 
    {
        StringBuilder sb=new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(k==0)
            {
                break;
            }
            if(ch==' ')
            {
                k--;
            }
            sb.append(ch);
        }
        return sb.toString().trim();
    }
}