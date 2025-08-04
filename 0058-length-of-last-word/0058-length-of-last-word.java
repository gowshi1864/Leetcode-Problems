class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        String words[]=s.split("\\s+");
        int n=words.length;
        int len=words[n-1].length();
        return len;
    }
}