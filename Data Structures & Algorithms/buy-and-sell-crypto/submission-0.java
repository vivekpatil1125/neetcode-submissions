class Solution {
    public int maxProfit(int[] prices) {
        // Handle empty or single-element arrays to prevent ArrayIndexOutOfBoundsException
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int mp = 0, bb = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bb) {
                mp = Math.max(mp, prices[i] - bb); 
            }
            bb = Math.min(bb, prices[i]); 
        }
        return mp;
    }
}
