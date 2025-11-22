public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] Arr = new int[n];
        Arr[0] = A[0];
        for (int i = 1; i < n; i++) {
            Arr[i] = Arr[i-1] + A[i];
        }
        return Arr;
    }   
}
