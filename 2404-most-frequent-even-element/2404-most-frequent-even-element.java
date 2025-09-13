class Solution {
    public int mostFrequentEven(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i : nums)
        {
            if(i%2==0)
            {
                list.add(i);
            }
        }
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i : list)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int val=-1,max=0;
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