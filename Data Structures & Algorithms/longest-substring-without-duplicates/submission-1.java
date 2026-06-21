class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int ans = 0;
        int l=0; int r=0;
        Set<Character> st = new HashSet<>();
        while(l<=r && r<s.length()){
            if(st.add(s.charAt(r))){
                max++;
                ans = Math.max(ans, max);
                r++;
            }else{
                st.remove(s.charAt(l));
                max--;
                ans = Math.max(ans, max);
                l++;
            }
        }
        return ans;
    }
}
