public class Solution {
    public int solve(int[] A, int B) {
       int n = A.length;
       int ans = 0;
       for (int i = 0; i < n; i++) {
           for (int j = i + 1 ; j < n; j++) {
               if (i != j && A[i] + A[j] == B) {
                   ans = 1;
               }
           }
       }
       return ans;
    }
}
