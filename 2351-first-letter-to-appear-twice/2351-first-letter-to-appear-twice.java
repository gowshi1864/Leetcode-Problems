class Solution {
    public char repeatedCharacter(String s) {
        List<Character> list1=new ArrayList<>();
         List<Character> list2=new ArrayList<>();
        for(char ch : s.toCharArray())
        {
            if(!list1.contains(ch))
            {
                list1.add(ch);
            }
            else
            {
                list2.add(ch);
            }
        }
        return list2.get(0);
    }
}