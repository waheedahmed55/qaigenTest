package com.qaigen.smallestDistance;

public class SmallestDistance {
	
	
	public static int findSmallestDistance(int[] numbers){
		
		int minimumDist = Integer.MAX_VALUE;
		int resultIndex = -1;
		int i,j;
		if(numbers.length ==1)
			return -1;
		for(i = 0; i< numbers.length-1;i++){
			j = i+1;
			int distance = Math.abs(numbers[j]-numbers[i]);
			minimumDist = Math.min(minimumDist,distance);
			if(minimumDist == distance)
				resultIndex = i;
		}
		
		return resultIndex;
		
	}

}
