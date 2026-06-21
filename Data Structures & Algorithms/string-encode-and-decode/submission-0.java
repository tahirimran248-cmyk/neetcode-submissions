class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        // System.out.println(sb.toString());
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        util(str, i, ans);
        return ans;
        


    }
    private void util(String str, int i, List<String> ans){
        StringBuilder sbnum = new StringBuilder();
        if(i==str.length()){return;}
        while(str.charAt(i)!='#'){
            sbnum.append(str.charAt(i));
            i++;
        }
        if(i==str.length()){return;}
        int x = Integer.parseInt(sbnum.toString());
        String next = str.substring(i+1,i+1+x);
        // System.out.println(next);
        ans.add(next);
        util(str, i+1+x, ans);
    }
}
