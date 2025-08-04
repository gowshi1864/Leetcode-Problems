import java.util.HashMap;
import java.util.Map;
public class Solution 
{
    public int numRabbits(int[] answers) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int totalRabbits = 0;
        for (int answer : answers) 
        {
            if (answer == 0) 
            {
                totalRabbits += 1; 
            } else if (!map.containsKey(answer)) 
            {
                totalRabbits += answer + 1; 
                map.put(answer, 1);
            } 
            else 
            {
                map.put(answer, map.get(answer) + 1);
                if (map.get(answer) > answer) 
                {
                    map.remove(answer); 
                }
            }
        }
        return totalRabbits;
    }
}
