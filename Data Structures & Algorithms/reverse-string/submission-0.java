class Solution {
    public void reverseString(char[] s) {
        char[] ans = new char[s.length];
        for(int i=s.length-1;i>=0;i--){
            ans[i] = s[s.length-i-1];
        }
        for(int i=0;i<s.length;i++){
            s[i]=ans[i];
        }
    }
}