public class Solution {
    public int[] solve(int[] A, int B, int C) {
        int n = A.length;
        int range = C-B+1;

        int[] result = new int[range];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (i >= B && i <= C) {
                result[index] = A[i];
                index++;
            }
        }
        return result;
    }
}
