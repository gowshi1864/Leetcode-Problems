class Solution 
{
    public String capitalizeTitle(String title) 
    {
        String[] words=title.split(" ");
        for(int i=0;i<words.length;i++)
        {
            String ans=words[i].toLowerCase();
            if(ans.length() > 2)
        {
            ans=Character.toUpperCase(ans.charAt(0))+ans.substring(1);
        }
        words[i]=ans;
        }
        return String.join(" ",words);
    }
}