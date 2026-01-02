public class Solution {
    public int solve(final int[][] A) {
        int n = A.length;
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			result[i] = A[i][i];
		}

		return result;
    }
}
