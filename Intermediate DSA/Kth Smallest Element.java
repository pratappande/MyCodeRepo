public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int kthsmallest(final int[] A, int B) {
        int n = A.length;
        Arrays.sort(A);
        int smallElement = 0;

        for (int i = 0; i < n; i++) {
            if (i == B-1) {
                smallElement = A[i];
            }
        }
        return smallElement;
    }
}
