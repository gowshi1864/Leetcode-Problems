class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet<Integer> hm=new HashSet<>();
        for(int val:nums)
        {
            if(hm.contains(val))
            {
                return true;
            }
            hm.add(val);
        }
        return false;
    }
}