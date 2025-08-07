class Solution {
    public boolean checkIfExist(int[] arr) 
    {
        boolean b=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(j!=i)
                {
                    if(2*arr[i]==arr[j])
                    {
                        b=true;
                    }
                }
            }
        }
        if(b)
        {
            return true;
        }
        return false;
    }
}