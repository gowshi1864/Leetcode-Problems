class Solution {
    public int maxFreqSum(String s) 
    {
        s=s.toLowerCase();
        List<Character> vowels=Arrays.asList('a','e','i','o','u');
        StringBuilder v1=new StringBuilder();
        StringBuilder c1=new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(vowels.contains(ch))
            {
                v1.append(ch);
            }
            else
            {
                c1.append(ch);
            }
        }
        Map<Character,Integer> map1=new HashMap<>();
        for(char ch : v1.toString().toCharArray())
        {
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        Map<Character,Integer> map2=new HashMap<>();
        for(char ch : c1.toString().toCharArray())
        {
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        int max1=0,max2=0;
        for(char ch : v1.toString().toCharArray())
        {
            max1=Math.max(max1,map1.get(ch));
        }
        for(char ch : c1.toString().toCharArray())
        {
            max2=Math.max(max2,map2.get(ch));
        }
        return max1+max2;
    }
}