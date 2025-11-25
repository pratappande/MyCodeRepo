public class Solution {
    public int solve(int[] A, int B, int C) {
       int sum  = 0;
       int n = A.length;
       int ans = 0;

       for (int i = 0; i < B; i++) {
           sum += A[i];
       }
       if (sum == C) {
            ans = 1;
        }
       int i = 1;
       int j = B;
        while (j < n) {
            sum = sum - A[i-1] + A[j];
            if (sum == C) {
                ans = 1;
            }
            i++;
            j++;
        }
        return ans;
    }   
}
