int n = A.length;

int ans = A[0];
int sum = 0;

for (int i = 0; i < n; i++) {
	sum += A[i];
	ans = Math.max(ans, sum);
	if (sum < 0) {
		sum = 0;
	}
}

return ans;
