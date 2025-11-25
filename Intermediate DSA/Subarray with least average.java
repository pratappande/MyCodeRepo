public class Solution {
    public int solve(int[] A, int B) {

        int n = A.length;
        int sum = 0;
        int ans = 0;
        int index = 0;

        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        ans = sum;
        int i = 1;
        int j = B;
        
        while (j < n) {
            sum = sum - A[i-1] + A[j];
            if (sum < ans) {
                ans = sum;
                index = i;
            }
            i++; j++;
        }
        return index;

    }
}
