class Solution 
{
    public int numRescueBoats(int[] people, int limit) 
    {
        // Arrays.sort(people);
        // int i=0,j=people.length-1,count=0;
        // while(i<=j)
        // {
        //     if(people[i]+people[j]<=limit)
        //     {
        //         i++;
        //         j--;
        //         count++;
        //     }
        //     else
        //     {
        //         j--;
        //         count++;
        //     }
        // }
        // return count;
        int sum=0;
        for(int i : people)
        {
            sum+=i;
        }
        if(sum<=limit)
        {
            return 1;
        }
        int count=0;
        while(sum>=0)
        {
            sum=sum-limit;
            count++;
        }
        return count;
    }
}