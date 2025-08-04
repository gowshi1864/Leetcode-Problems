class Solution 
{
    public boolean search(int[] nums, int target) 
    {
        ArrayList<Integer> list1=new ArrayList<>();
        for(int i : nums)
        {
            list1.add(i);
        }
        if(list1.contains(target))
        {
            return true;
        }
        return false;
    }
}