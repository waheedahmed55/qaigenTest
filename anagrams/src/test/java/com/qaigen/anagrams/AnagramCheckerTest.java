package com.qaigen.anagrams;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramCheckerTest {
	
	@Test 
	public void sameStringsMustBeAnagrams(){
		
		assertTrue(AnagramChecker.check("test", "test"));
	}
	@Test 
	public void sameStringsWithDifferentCasesAreAnagrams(){

		assertTrue(AnagramChecker.check("TesT", "test"));
	}
	@Test
	public void sameStringsWithWhiteSpacesAreAnagrams(){

		assertTrue(AnagramChecker.check("Te sT", "test"));
	}
	@Test
	public void twoEmptyStringsAreAnagrams(){
		
		assertTrue(AnagramChecker.check("", ""));
	}
	@Test
	public void whiteSpacesOnlyAreAnagrams(){
		assertTrue(AnagramChecker.check("  ", "  "));
		assertTrue(AnagramChecker.check(" ", "    "));
		assertTrue(AnagramChecker.check("    ", "  "));
	}
	@Test
	public void nullStringsAreNotAnagrams(){

		assertFalse(AnagramChecker.check(null, "abc"));
		assertFalse(AnagramChecker.check("abc", null));
		assertFalse(AnagramChecker.check(null, null));
		
	}
	@Test 
	public void anagramStrings(){
		
		assertTrue(AnagramChecker.check("Desperation","A Rope Ends It"));
		assertTrue(AnagramChecker.check("1ab2C3", "bac123"));
		assertTrue(AnagramChecker.check("abCdE", "ecADB"));
		assertTrue(AnagramChecker.check("a", "A"));
		
	}
	@Test 
	public void notAnagramStrings(){
		assertFalse(AnagramChecker.check("abc", "ab"));
		assertFalse(AnagramChecker.check("", "ab"));
		assertFalse(AnagramChecker.check("AbC", "AbD"));
		assertFalse(AnagramChecker.check("a", "b"));
		
	}

}
