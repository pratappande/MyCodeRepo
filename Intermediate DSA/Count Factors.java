public class Solution {
  public int solve(int A) {
    int sum = 0;
    for (int i; i*i <= A; i++) {
      if (N%i == 0) {
         if (i == N/i) {
          sum += 1;
        } else {
        sum += 2;
        }
    }
  return sum;
  }
}
