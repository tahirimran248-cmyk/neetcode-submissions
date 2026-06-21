class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String str: strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            List<String> val=null;
            if(hm.containsKey(key)){
                val = hm.get(key);
            }else{
                val = new ArrayList<>();
            }
            val.add(str);
            hm.put(key, val);
            
        }
        return new ArrayList<>(hm.values());
    }
}
