package org.jointheleague.viswanathv5741.ch1;

public class Practice_1_7 {
	
	public int[][] rotate (int[][] m){
		int full = m.length;
		int half = m.length/2;
		for (int i=0; i<half; i++){      //quadrant 1
			for (int j=0; j<half; j++) {
				int val = m[j][half-1-i];
				m[j][half-1-i] = m[i][j];
				m[i][j] = val;
			}
		}
		
		for (int i=half; i< full; i++) {     //quadrant 2
			for (int j=0; j<half; j++) {
				int val = m[j-half][full-1-i-half];
				m[j-half][full-1-i-half] = m[i][j];
				m[i][j] = val;
			}
		}
		
		for (int i=0; i<half; i++) {      //quadrant 4
			for (int j=half; j<full; j++) {
				int val = m[j][full-1-i];
				m[j][full-1-i] = m[i][j];
				m[i][j] = val;
			}
		}
		
		for (int i=half; i<full; i++) {    //quadrant 3
			for (int j=half; j<full; j++) {
				int val = m[j][i-1];
				m[j][i-1] = m[i][j];  //probably wrong
				m[i][j] = val;
			}
		}
		
		// (i,j) --> (j,n-1-i) --> (n-1-i,n-1-j) --> (n-1-j, i) --> (i,j) --> temp
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
		return m;
	}
}
