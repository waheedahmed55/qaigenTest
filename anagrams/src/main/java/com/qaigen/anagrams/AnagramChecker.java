package com.qaigen.anagrams;

import java.util.Arrays;

public class AnagramChecker {
	
	public static boolean check(String s1 , String s2){
		
		if(s1 == null || s2 == null)
			return false;
		
		String s1WithoutSpacesAndLowerCase = s1.toLowerCase().replace(" ", "");
		String s2WithoutSpacesAndLowerCase = s2.toLowerCase().replace(" ", "");
		
		if(s1WithoutSpacesAndLowerCase.length()!=s2WithoutSpacesAndLowerCase.length())
			return false;
		
		char[] s1Chars = s1WithoutSpacesAndLowerCase.toCharArray();
		char[] s2Chars = s2WithoutSpacesAndLowerCase.toCharArray();
		
		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);
		
		for(int i=0;i<s1Chars.length;i++){
			if(s1Chars[i]!=s2Chars[i])
				return false;
		}
		
		return true;
	}

}
