int n = A.length;

int ans = Integer.Max_VALUE;
int sum = 0;

for (int i = 0; i < n; i++) {
	sum += A[i];
	ans = Math.min(ans, sum);
	if (sum > 0) {
		sum = 0;
	}
}

return ans;
