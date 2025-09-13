class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> list=new ArrayList<>();
        if(nums.length<2)
        {
            for(int i : nums)
            {
                list.add(i);
            }
        }
        else
        {
            int len=nums.length/3;
            Map<Integer,Integer> map=new HashMap<>();
            for(int i : nums)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
            for(Map.Entry<Integer,Integer> entry : map.entrySet())
            {
                if(entry.getValue()>len)
                {
                    list.add(entry.getKey());
                }
            }
        }
        return list;
    }
}