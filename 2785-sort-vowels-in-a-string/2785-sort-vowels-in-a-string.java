class Solution {
    public String sortVowels(String s) {
                                                 Set<Character> set=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        List<Character> list=new ArrayList<>();
        for(char ch : s.toCharArray())
        {
            if(set.contains(ch))
            {
                list.add(ch);
            }
        }
        Collections.sort(list);
        int ind=0;
        StringBuilder sb=new StringBuilder();
        for(char ch : s.toCharArray())    
        {
            if(set.contains(ch))
            {
                sb.append(list.get(ind++));
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}