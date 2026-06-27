class Solution {
    public int lengthOfLastWord(String s) {
        boolean wordStarted = false;
        int ans =0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && !wordStarted){continue;}
            if(s.charAt(i)!=' ' && !wordStarted){wordStarted=true;ans++;continue;}
            if(s.charAt(i)!=' ' && wordStarted){ans++;continue;}
            if(s.charAt(i)==' ' && wordStarted){return ans;}
        }
        return ans;
    }
}