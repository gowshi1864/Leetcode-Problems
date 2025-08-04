class Solution 
{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int c : candies)
        {
            if(c>max)
            {
                max=c;
            }
        }
        for(int c : candies)
        {
            ans.add(c+extraCandies>=max);
        }
        return ans;
    }
}