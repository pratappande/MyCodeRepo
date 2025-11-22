public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        int ans = n;

        for (int x : A) {
            if (x < minValue) {
                minValue = x;
            }
        }
        for (int x : A) {
            if (x > maxValue) {
                maxValue = x;
            }
        }

        for (int i = 0; i < n; i++) {
            if (A[i] == minValue) {
                minIndex = i;
                if (maxIndex != -1) {
                    int len = minIndex - maxIndex +1;
                    ans = Math.min(ans, len);
                }
            }
            if (A[i] == maxValue) {
                maxIndex = i;
                if (minIndex != -1) {
                    int len = maxIndex - minIndex +1;
                    ans = Math.min(ans, len);
                }
            }
        }

        return ans;
    }
}
