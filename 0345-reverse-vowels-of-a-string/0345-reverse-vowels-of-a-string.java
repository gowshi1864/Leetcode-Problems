class Solution {
    public String reverseVowels(String s) 
    {
        List<Character> vowels=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        List<Character> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(vowels.contains(ch))
            {
                list.add(ch);
            }
        }
        Collections.reverse(list);
        int i=0;
        for(char ch : s.toCharArray())
        {
            if(vowels.contains(ch))
            {
                sb.append(list.get(i++));
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}