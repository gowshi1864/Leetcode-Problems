class Solution 
{
    public String reverseWords(String s) 
    {
       String ans[]=s.trim().split("\\s+");
       Collections.reverse(Arrays.asList(ans));
       return String.join(" ",ans);
    }
}