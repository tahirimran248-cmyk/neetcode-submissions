class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r = s.length()-1;
        while(l<r){

            while(l<r && !func(s.charAt(l))){l++;}
            while(r>l && !func(s.charAt(r))){r--;}
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            else{
                l++;
                r--;
            }

        }
        return true;
    }
    boolean func(char c){
        return ((c-'a'>=0&&c-'a'<26)||(c-'A'>=0&&c-'A'<26)||(c-'0'>=0&&c-'0'<10));
    }
}
