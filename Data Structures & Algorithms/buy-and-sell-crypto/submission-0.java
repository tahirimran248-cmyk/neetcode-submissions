class Solution {
    public int maxProfit(int[] prices) {
        // max, maxsofar 
        int l =0;
        int r = 1;
        int maxP =0;
        while(r< prices.length){
            if(prices[l]<prices[r]){
                int p = prices[r]- prices[l];
                maxP = Math.max(p, maxP);
            }
            else{
                l=r;
            }
            r++;
        }
        return maxP;
    }
}
