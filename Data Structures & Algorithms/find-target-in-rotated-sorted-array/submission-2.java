class Solution {
    public int search(int[] nums, int k) {
        /***Initial approach that comes to mind , since array was sorted is binary search
        however, here i would have to do two comparisons to know if the right subpart is 
        rotated or normal, so compare nums[mid] and nums[right]
        if(nums[mid]<nums[right]) compare nums[mid] with k and choose left and right subpart
        if(nums[mid]>nums[right]) compare nums[mid] with k and choose right and left subpart
        continue this loop until left and right arent equal, finally compare nums[left] and k
        and return if equal or -1; 
        */
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(k == nums[mid]){return mid;}
            if(nums[mid]>=nums[left]){
                // mid in left sorted portion
                if(k>nums[mid] || k<nums[left] ){left = mid+1;}
                else{
                    right =  mid-1;
                }

            }
            else{
                //mid in right sorted portion
                if(k<nums[mid] || k>nums[right]){right = mid-1;}
                else{left= mid+1;}
            }
        }
        return -1;
    }
}
