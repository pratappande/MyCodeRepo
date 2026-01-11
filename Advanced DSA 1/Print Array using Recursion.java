public class Solution {
    public void PrintArray(int[] A) {
        printArray(A, 0);
        System.out.println();
    }
    public void printArray(int[] A, int i) {
        if (i == A.length-1) {
            System.out.print(A[i] + " ");
            return;
        }
        System.out.print(A[i] + " ");
        printArray(A, i+1);
    }
}
