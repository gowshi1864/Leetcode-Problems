class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++)
        {
            String s=details[i];
            String age=s.substring(11,13);
            int num=Integer.valueOf(age);
            if(num>60)
            {
                count++;
            }
        }
        return count;
    }
}