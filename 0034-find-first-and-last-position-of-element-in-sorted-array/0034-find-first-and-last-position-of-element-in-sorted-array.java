import java.util.*;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i : nums)
        {
            list.add(i);
        }
        int l=-1,r=-1;
        l=list.indexOf(target);
        r=list.lastIndexOf(target);
        return new int[]{l,r};
    }
}