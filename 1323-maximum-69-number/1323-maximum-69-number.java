class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        String res=s.replaceFirst("6","9");
        int n=Integer.valueOf(res);
        return n;
    }
}