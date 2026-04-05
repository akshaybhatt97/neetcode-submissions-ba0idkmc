class Solution {
    public int maxProfit(int[] prices) {

        int l = 0 ;
        int r = 1 ;
        int maxProfit = 0;

        while ( r <  prices.length){

            if (prices[r]  > prices[l]){

                maxProfit +=  prices[r] - prices[l];

            }
            l += 1;
            r += 1;
        }
        return maxProfit;
    }
}