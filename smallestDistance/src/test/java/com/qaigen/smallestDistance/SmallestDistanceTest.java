package com.qaigen.smallestDistance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestDistanceTest {
	/*
	 * if neighbors have the same value so the smallest distance is 0 and must 
	 * return the index of first one
	 */
	@Test
	public void twoEqualNeighboursHaveTheSmallestDistance(){
		
		int[] numbers = {1,2,3,3,5};
		assertEquals(2,SmallestDistance.findSmallestDistance(numbers));
	}
	/*
	 * an empty array dosn't have smallest distance between neighbor
	 * we are checking that the method is returning -1 for empty array
	 */
	@Test
	public void emptyArrayShouldReturnMinusOneIndex(){
		int[] numbers = {};
		assertEquals(-1,SmallestDistance.findSmallestDistance(numbers));
	}
	/*
	 * An array with one element that has no neighbor must return -1 
	 */
	@Test
	public void oneElementArrayShouldReturnMinusOneIndex(){
		
		int[] numbers = {10};
		assertEquals(-1,SmallestDistance.findSmallestDistance(numbers));
	}
	/*
	 * We are checking some distances in different arrays
	 */
	@Test
	public void checkSomeDistances(){
		int[] numbers = {5 , 6 , 8 , 3 , 5};
		assertEquals(0,SmallestDistance.findSmallestDistance(numbers));
		int[] numbers2 = {13, 62, -39, 1200, 460, 986, 3, -39};
		assertEquals(6,SmallestDistance.findSmallestDistance(numbers2));
		int[] numbers3 = {1,100000};
		assertEquals(0,SmallestDistance.findSmallestDistance(numbers3));
		int[] numbers4 = {1,-1};
		assertEquals(0,SmallestDistance.findSmallestDistance(numbers4));
		int[] numbers5 = {-1,-9,-3,-7,-6,-4};
		assertEquals(3,SmallestDistance.findSmallestDistance(numbers5));
		
	}

}
