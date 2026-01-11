public class Solution {
    public void solve(int A) {
    print1T0A(A);
    System.out.println();
    }
    public void print1T0A(int A) {
        if (A == 1) {
            System.out.print(1 + " ");
            return;
        }
        print1T0A(A-1);
        System.out.print(A + " ");
    }
}
