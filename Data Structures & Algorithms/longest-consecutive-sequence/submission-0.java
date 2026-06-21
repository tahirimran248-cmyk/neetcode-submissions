class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int longest = 0;
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i]-1)){
                int length=0;
                while(s.contains(nums[i]+length)){
                    length+=1;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
