int n = A.length;

for (int i = 0; i < n; i++) {
	if (A[i] <= 0) {
		A[i] = n+2;
	}
}

for (int i = 0; i < n; i++) {
	int x = Math.abs(A[i]);
	if (x >= 1 && x <= n) {
		int index = x-1;
		if (A[index] > 0) {
			A[index] *= -1;
		}
	}
}

for (int i = 0; i < n; i++) {
	if (A[i] > 0) {
		return i+1;
	}
}

return n+1;
