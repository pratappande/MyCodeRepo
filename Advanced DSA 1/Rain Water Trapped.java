int n = A.length;
int ans = 0;

if (n <= 2) {
	return 0;
}

int[] prArr = new int[n];
int[] suArr = new int[n];

prArr[0] = A[0];
suArr[n-1] = A[n-1];

for (int i = 1; i < n; i++) {
	prArr[i] = Math.max(A[i], prArr[i-1]);
}

for (int i = n-2; i >= 0; i--) {
	suArr[i] = Math.max(A[i], suArr[i+1]);
}

for (int i = 0; i < n; i++) {
	int waterLevel = Math.min(prArr[i], suArr[i]) - A[i];
	if (waterLevel > 0) {
		ans += waterLevel;
	}
}

return ans;
