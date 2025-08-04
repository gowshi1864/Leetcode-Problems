import java.util.HashMap;
import java.util.Map;
public class Solution
 {
    public static boolean wordPattern(String pattern, String s) 
    {
        String[] words = s.split(" ");
        if (words.length != pattern.length())
        {
            return false;
        }
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) 
        {
            char c = pattern.charAt(i);
            String word = words[i];
            if (charToWord.containsKey(c))
            {
                if (!charToWord.get(c).equals(word))
                {
                    return false;
                }
            }
             else 
             {
                if (wordToChar.containsKey(word))
                {
                    return false;
                }
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s)); // Output: true
        pattern = "abba";
        s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s)); // Output: false
        pattern = "aaaa";
        s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s)); // Output: true
        pattern = "abba";
        s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s)); // Output: false
    }
}
