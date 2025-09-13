class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0,val=0;;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                val=entry.getKey();
            }
        }
        return val;
    }
}