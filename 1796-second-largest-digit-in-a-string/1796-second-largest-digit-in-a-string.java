class Solution 
{
    public int secondHighest(String s) 
    {
        Set<Integer> set=new HashSet<>();
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                int n=Character.getNumericValue(ch);
                set.add(n);
            }
        }
        int max=0,smax=-1;
        int arr[]=new int[set.size()];
        int ind=0;
        for(int i : set)
        {
            arr[ind]=i;
            ind++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=max && arr[i]>smax)
            {
                smax=arr[i];
            }
        }
        return smax;
    }
}