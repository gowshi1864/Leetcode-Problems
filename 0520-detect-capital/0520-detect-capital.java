class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        int n=word.length();
        boolean isUpper=false;
        boolean isLower=false;
        boolean firstupper=false;
        int count1=0,count2=0;
        for(char ch : word.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                count1++;
            }
            if(Character.isLowerCase(ch))
            {
                count2++;
            }
        }
        if(Character.isUpperCase(word.charAt(0)) && count1==1)
        {
            firstupper=true;
        }
        if(count1==n)
        {
            isUpper=true;
        }
        if(count2==n)
        {
            isLower=true;
        }
        if(firstupper || isUpper || isLower)
        {
            return true;
        }
        return false;
    }
}