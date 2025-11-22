public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int index = 0;

        int[] Earr = new int[n];
        int[] Oarr = new int[n];

        Earr[0] = A[0];
        Oarr[0] = 0;

        for (int i = 1; i < n; i++) {
            if (i%2 == 0) {
                Earr[i] = Earr[i-1] + A[i];
            } else {
                Earr[i] = Earr[i-1];
            }
            if(i%2 == 1) {
                Oarr[i] = Oarr[i-1] + A[i];
            } else {
                Oarr[i] = Oarr[i-1];
            }
        }
        
        int sumEven = 0;
        int sumOdd = 0;

        for ( int i = 0; i < n; i++) {
            if (i == 0) {
                sumEven = Oarr[n-1] - Oarr[i];
                sumOdd = Earr[n-1] - Earr[i];
            } else {
                sumEven = Earr[i-1] + (Oarr[n-1] - Oarr[i]);
                sumOdd = Oarr[i-1] + (Earr[n-1] - Earr[i]);
            }
            if (sumEven == sumOdd) {
                index++;
            }
        }
        return index;
    }
}
