class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int maxc =0;
        int c=0;
        int l=0;
        int r =0;
        while(l<=r && r<s.length()){
            if(st.add(s.charAt(r))){c++;maxc = Math.max(c, maxc);r++;}
            else{
                st.remove(s.charAt(l));c--;
                maxc = Math.max(c,maxc);
                l++;
            }

        }
        return maxc;
    }
}
