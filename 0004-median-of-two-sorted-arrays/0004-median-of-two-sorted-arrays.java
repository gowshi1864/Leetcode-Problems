import java.util.*;
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int a=nums1.length;
        int b=nums2.length;
        int n=a+b;
        int m[]=new int[n];
        System.arraycopy(nums1,0,m,0,a);
        System.arraycopy(nums2,0,m,a,b);
        Arrays.sort(m);
        double median=0;
        if(n%2!=0)
        {
            median=m[n/2];
        }
        else
        {
            median=(m[(n/2)-1]+m[n/2])/2.0;
        }
        return median;
    }
}