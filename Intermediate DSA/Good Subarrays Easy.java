public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if ((j-i+1)%2 == 0 && sum < B) {
                    count++;
                } else if ((j-i+1)%2 == 1 && sum > B) {
                    count++;
                }
            }
        }
        return count;        
    }
}
