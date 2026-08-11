class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 1; i < prices.length ; i++){

            int profit = prices[i]-min;
            min = Math.min(min,prices[i]);
            maxProfit = Math.max(profit,maxProfit);
        }
        if(maxProfit <= 0){
            return 0;
        }
        return maxProfit;
    }
}