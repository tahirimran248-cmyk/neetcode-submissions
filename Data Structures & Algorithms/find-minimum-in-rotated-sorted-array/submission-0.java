class Solution {
    public int findMin(int[] nums) {
        /***
        Initial approach that comes to mind, since array is sorted was binary search
        although here, the array may be roatated, meaning, I would have to compare mid and right
        and mid and left to choose which part will have smaller number.
        if nums[mid]<nums[right] take left right = mid
        if(nums[mid]>nums[right]) take right left = mid+1
        follow this while left!=right as we may always end with array of size 1 as last step
        */
        int left = 0;
        int right = nums.length -1;
        while(left!=right){
            int mid = left+(right-left)/2;
            if(nums[mid]<nums[right]){right = mid;}
            else if(nums[mid]>nums[right]){left=mid+1;}
        }
        return nums[left];
    }
}
