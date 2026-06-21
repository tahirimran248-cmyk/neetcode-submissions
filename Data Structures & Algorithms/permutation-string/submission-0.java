class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int range = s1.length();
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        String sub1 = new String(c1);
        int l=0; int r= range-1;
        for(int i=0;i<s2.length()-range+1;i++){
            l=i;
            r = i+range-1;
            System.out.println(l+"-"+r);
            String sub = s2.substring(l,r+1);
            char[] c2 = sub.toCharArray();
            Arrays.sort(c2);
            String sub2 = new String(c2);
            if(sub1.equals(sub2)){return true;}
        }
        return false;
        
    }
}
