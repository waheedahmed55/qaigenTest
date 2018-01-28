package com.qaigen.anagrams;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramCheckerTest {
	/*
	 * This test is checking two identical string if they are anagrams
	 */
	@Test 
	public void sameStringsMustBeAnagrams(){
		
		assertTrue(AnagramChecker.check("test", "test"));
	}
	/*
	 * this test is checking same string but different cases if they are anagrams
	 */
	@Test 
	public void sameStringsWithDifferentCasesAreAnagrams(){

		assertTrue(AnagramChecker.check("TesT", "test"));
	}
	/*
	 * this test is checking strings with same letters but one of them contains whitespace
	 */
	@Test
	public void sameStringsWithWhiteSpacesAreAnagrams(){

		assertTrue(AnagramChecker.check("Te sT", "test"));
	}
	/*
	 * We test two empty strings
	 */
	@Test
	public void twoEmptyStringsAreAnagrams(){
		
		assertTrue(AnagramChecker.check("", ""));
	}
	/*
	 * we are testing only whitespaces 
	 */
	@Test
	public void whiteSpacesOnlyAreAnagrams(){
		assertTrue(AnagramChecker.check("  ", "  "));
		assertTrue(AnagramChecker.check(" ", "    "));
		assertTrue(AnagramChecker.check("    ", "  "));
	}
	/*
	 * We are checking when one or both of strings are null
	 */
	@Test
	public void nullStringsAreNotAnagrams(){

		assertFalse(AnagramChecker.check(null, "abc"));
		assertFalse(AnagramChecker.check("abc", null));
		assertFalse(AnagramChecker.check(null, null));
		
	}
	/*
	 * checking some string that are anagrams
	 */
	@Test 
	public void anagramStrings(){
		
		assertTrue(AnagramChecker.check("Desperation","A Rope Ends It"));
		assertTrue(AnagramChecker.check("1ab2C3", "bac123"));
		assertTrue(AnagramChecker.check("abCdE", "ecADB"));
		assertTrue(AnagramChecker.check("a", "A"));
		
	}
	/*
	 * checking some string that are not anagrams
	 */
	@Test 
	public void notAnagramStrings(){
		assertFalse(AnagramChecker.check("abc", "ab"));
		assertFalse(AnagramChecker.check("", "ab"));
		assertFalse(AnagramChecker.check("AbC", "AbD"));
		assertFalse(AnagramChecker.check("a", "b"));
		
	}

}
