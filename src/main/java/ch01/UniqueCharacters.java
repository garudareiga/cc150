package ch01;

/**
 * 
 * @author raychen
 * 
 * Question 1.3
 * 
 * Determine if a string has all unique characters
 */

public class UniqueCharacters {
	public boolean unique(String str) {
		/*
		 * Assume we only have ASCII characters in str
		 * The number of ASCII characters is 256
		 */
		if (str.length() > 256) return false;
		boolean[] unique = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int cv = (int)str.charAt(i);
			if (unique[cv]) return false;
			unique[cv] = true;
		}
		return true;
	}
}
