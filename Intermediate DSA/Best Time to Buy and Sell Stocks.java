public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        int n = A.length;
        if (n < 1) {
            return 0;
        }
       int minPrice = A[0];
       int maxProfit = 0;

       for (int i = 0 ; i < n; i++) {
           int profit = A[i] - minPrice;
           maxProfit = Math.max(maxProfit, profit);
           minPrice = Math.min(minPrice, A[i]);
       }
       return maxProfit;
    }
}
