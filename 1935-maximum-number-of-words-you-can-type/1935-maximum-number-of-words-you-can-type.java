class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String words[]=text.split("\\s+");
        for(int i=0;i<words.length;i++)
        {
            for(char ch : brokenLetters.toCharArray())
            {
                if(words[i].indexOf(ch)!=-1)
                {
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
}