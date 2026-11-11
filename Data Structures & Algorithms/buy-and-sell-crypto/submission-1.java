class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = prices.length - 1;
        int ans = prices[r] - prices[l];
        int minb = 101;
        int maxs = -1;

        while (l < r) {
            // see which dir is better
            // store max

            int l1 = prices[r] - prices[l+1];
            int r1 = prices[r-1] - prices[l];
            minb = Math.min(minb, prices[l]);
            maxs = Math.max(maxs, prices[r]);

            if (l1 >= r1) {
                l++;
                ans = Math.max(ans, l1);
            } else {
                r--;
                ans = Math.max(ans, r1);
            }
        }
        return Math.max(ans, maxs - minb);
    }
}
