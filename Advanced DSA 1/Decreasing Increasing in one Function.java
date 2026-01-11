public class Solution {
    public void DecThenInc(int A) {
        descFun(A);
        incrFun(A);
        System.out.println();
    }
    public void descFun(int A) {
        if (A == 1) {
            System.out.print(A + " ");
            return;
        }
        System.out.print(A + " ");
        descFun(A-1);
    }
    public void incrFun(int A) {
        if (A == 1) {
            System.out.print(A + " ");
            return;
        }
        incrFun(A-1);
        System.out.print(A + " ");
    }
}
