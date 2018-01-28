package com.qaigen.smallestDistance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestDistanceTest {
	
	@Test
	public void twoEqualNeighboursHaveTheSmallestDistance(){
		
		int[] numbers = {1,2,3,3,5};
		assertEquals(2,SmallestDistance.findSmallestDistance(numbers));
	}
	@Test
	public void emptyArrayShouldReturnMinusOneIndex(){
		int[] numbers = {};
		assertEquals(-1,SmallestDistance.findSmallestDistance(numbers));
	}
	@Test
	public void oneElementArrayShouldReturnMinusOneIndex(){
		
		int[] numbers = {10};
		assertEquals(-1,SmallestDistance.findSmallestDistance(numbers));
	}
	@Test
	public void checkSomeDistances(){
		int[] numbers = {5 , 6 , 8 , 3 , 5};
		assertEquals(0,SmallestDistance.findSmallestDistance(numbers));
		int[] numbers2 = {13, 62, -39, 1200, 460, 986, 3, -39};
		assertEquals(6,SmallestDistance.findSmallestDistance(numbers2));
		int[] numbers3 = {1,100000};
		assertEquals(0,SmallestDistance.findSmallestDistance(numbers3));
		
	}

}
