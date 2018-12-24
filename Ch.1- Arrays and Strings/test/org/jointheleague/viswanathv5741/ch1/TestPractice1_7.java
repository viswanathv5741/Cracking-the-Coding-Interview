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
		
		int[][] x = {{1,2,3,4,5},{6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
		
		assertArrayEquals(new int[][] {{21,16,11,6,1},{22,17,12,7,2},{23,18,13,8,3},{24,19,14,9,4},{25,20,15,10,5}}, test.rotate(x));
	}

}