public class Solution {
    public int subarraysWithOR1(int[] A) {
        int n = A.length;
        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                count++;
            } else {
                ans += count*(count+1)/2;
                count = 0;
            }
        }
        if (count > 0) {
            ans += count*(count+1)/2;
        }
        int totalCount = n*(n+1)/2;
        totalCount = totalCount - ans;
        return totalCount;
    }
}
