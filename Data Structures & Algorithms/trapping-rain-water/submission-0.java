class Solution {
    public int trap(int[] height) {
        // int i =0;
        // int j;
        // int leftMax =0;
        // // for h[j]>h[i] ans+=min(h[l], h[r])* (r-l)
        // for(int j=1;j<height.length-2;j++){
        //     int leftmax  = Math.max(i, leftmax);
        //     int rightmax = Math.max()
        // }
        if(height ==null || height.length==0){
            return 0;
        }
        int l =0;
        int r = height.length-1;
        int leftmax = height[l];
        int rightmax = height[r];
        int res =0;
        while(l<r){
            if(leftmax<rightmax){
                l++;
                leftmax = Math.max(leftmax, height[l]);
                // if(leftmax>height[l]){ 
                res+= leftmax-height[l];
                // }
            }
            else{
                r--;
                rightmax = Math.max(rightmax, height[r]);
                // if(rightmax>height[r]){
                res+=rightmax-height[r];
                // }
            }
        }
        return res;
    }
}
