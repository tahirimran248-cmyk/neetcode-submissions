class Solution {
    public int scoreOfString(String s) {
        int[] a = new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=s.charAt(i)-'a';
        }
        int ans=0;
        for(int i=1;i<a.length;i++){
            ans+=Math.abs(a[i]-a[i-1]);
        }
        return ans;
    }
}