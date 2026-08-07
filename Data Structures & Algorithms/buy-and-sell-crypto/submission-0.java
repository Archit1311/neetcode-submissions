class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        for(int i=0;i<prices.length;i++){
            int profit1=0;
            for(int j=i+1;j<prices.length;j++){
                profit1 = prices[j]-prices[i];
                profit = Math.max(profit,profit1);
            }
        }
    if (profit<0){
        return 0;
    
    }
    else{
        return profit;
    }
    
        
    }
}
