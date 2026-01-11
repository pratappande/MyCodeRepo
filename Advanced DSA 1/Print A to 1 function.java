public class Solution {
    public void solve(int A) {
        printATo1(A);
        System.out.println();
    }
    public void printATo1 (int A) {
        if (A == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(A + " ");
        printATo1(A-1);
    }
}
