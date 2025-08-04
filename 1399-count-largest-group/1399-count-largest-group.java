import java.util.HashMap;
public class Solution 
{
    public int countLargestGroup(int n) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) 
        {
            int sum = sumOfDigits(i);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int maxCount = 0;
        int largestGroupCount = 0;
        for (int count : map.values()) 
        {
            if (count > maxCount) 
            {
                maxCount = count;
                largestGroupCount = 1;  // Reset to 1 since this is a new max group
            } else if (count == maxCount) 
            {
                largestGroupCount++;
            }
        }
        return largestGroupCount;
    }
    private int sumOfDigits(int num) 
    {
        int sum = 0;
        while (num > 0) 
        {
            sum += num % 10;  
            num /= 10;         
        }
        return sum;
    }
}
