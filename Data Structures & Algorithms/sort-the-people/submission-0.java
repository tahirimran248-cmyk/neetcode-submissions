class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer, String> tm = new TreeMap<>((k1, k2)-> {
            return Integer.compare(k2, k1);
        });
        for(int i=0;i<names.length;i++){
            tm.put(heights[i], names[i]);
        }
        String[] ans = new String[names.length];
        int i=0;
        for(Map.Entry<Integer, String>e:tm.entrySet()){
            ans[i++]=e.getValue();
        }
        return ans;

    }
}