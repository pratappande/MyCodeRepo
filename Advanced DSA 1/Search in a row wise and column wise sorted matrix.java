int n = A.length;
int m = A[0].length;

int ans = A{0][0];
boolean found = false;

int i = 0;
int j = m-1;

while (i < n && j >= 0) {
	if (A[][] == B) {
		found = true;
		ans = Math.max(ans, (i * 1009 + j));
		j--;
	} else if (A[][] > B) {
		j--;
	} else {
		i++;
	}
}

return found ? ans : -1;
