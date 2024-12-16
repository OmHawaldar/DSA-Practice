class Solution {
    public int maxProfit(int[] prices) {

        int mx=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            int cp=prices[i]-min;
            mx=Math.max(mx,cp);
            min=Math.min(min,prices[i]);
        }
        return mx;
    }
}
