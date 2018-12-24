package org.jointheleague.viswanathv5741.ch1;

public class Practice_1_7 {
	
	public int[][] rotate (int[][] m){
		
		// (i,j) --> (j,n-1-i) --> (n-1-i,n-1-j) --> (n-1-j, i) --> (i,j) --> temp
		int temp = 0;
		int n = m.length;
		if (n% 2 == 0) {
			for (int i=0; i<n/2; i++) {
				for (int j=0; j<n/2; j++) {
					temp = m[i][j];
					m[i][j] = m[n-1-j][i];
					m[n-1-j][i] = m[n-1-i][n-1-j];
					m[n-1-i][n-1-j] = m[j][n-1-i];
					m[j][n-1-i] = temp;
				}
			}
		} else {
			for (int i=0; i<n/2; i++) {
				for (int j=0; j<n/2+1; j++) {
					temp = m[i][j];
					m[i][j] = m[n-1-j][i];
					m[n-1-j][i] = m[n-1-i][n-1-j];
					m[n-1-i][n-1-j] = m[j][n-1-i];
					m[j][n-1-i] = temp;
				}
			}
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
		return m;
	}
}
