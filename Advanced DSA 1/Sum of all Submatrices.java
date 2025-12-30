int n = A.length;
int m = A[0].length;

int sum = 0;

for (int i =0; i < n; i++) {
	for (int j = 0; j < m; j++) {
		sum += (i+1)*(n-i)*(j+1)*(m-j)*A[i][j];
	}
}

return sum;
