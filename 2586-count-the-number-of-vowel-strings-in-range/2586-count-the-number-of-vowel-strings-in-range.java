class Solution {
    public int vowelStrings(String[] words, int left, int right) 
    {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            words[i]=words[i].replaceAll("[aeiouAEIOU]","%");
            if(words[i].startsWith("%") && words[i].endsWith("%"))
            {
                count++;
            }
        }
        return count;
    }
}