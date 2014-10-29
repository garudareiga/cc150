package ch01;

import java.util.Arrays;

/**
 * 
 * @author raychen
 * 
 * Question 1.3
 * 
 * Given two strings, decide if one is a permuation of the other.
 */

public class IsPermutation {
	public boolean isPermutation(String s1, String s2) {
		// Similar to LeetCode anagram problem
		// 1. Sort s1 and s2, compare them if equal
		// 2. Use HashMap to store the occurrence of characters in s1
		//	  Time complexity: O(n)
		//    Space complexity: O(n)
		// 3. Use array to store the occurrence of characters if
		//    all characters are ASCII.
		return sort(s1).equals(sort(s2));
	}
	
	String sort(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}
