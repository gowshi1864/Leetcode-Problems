class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==letter)
            {
                count++;
            }
        }
        int p = (int)(((double)count / n) * 100);
        return p;
    }
}