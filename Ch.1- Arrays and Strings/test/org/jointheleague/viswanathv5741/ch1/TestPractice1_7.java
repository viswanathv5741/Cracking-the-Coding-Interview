package org.jointheleague.viswanathv5741.ch1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPractice1_7 {
	@Test
	public void testPractice1_7(){
		
		Practice_1_7 test = new Practice_1_7();
		int[][] m = {{ 1, 2, 3, 4},{ 5, 6, 7, 8},{ 9, 10, 11, 12},{13, 14, 15, 16}};
		
		assertArrayEquals(new int[][] {{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}} , test.rotate(m));
	}

}