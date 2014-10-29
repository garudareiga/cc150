package ch01;

/**
 * 
 * @author raychen
 * 
 * Question 1.8
 * 
 * Given two strings, s1 and s2, check if s2 is a rotation of s1 using
 * only one call to isSubstring.
 * 
 * For example,
 * "waterbottle" is a rotation of "erbottlewat".
 * 
 */

public class StringRotation {
	public boolean isRotation(String s1, String s2) {
		String s = s1 + s1;
		return s.contains(s2);
	}
	
	public static void main(String[] args) {
		String s1 = "waterbottle", s2 = "erbottlewat";
		StringRotation sr = new StringRotation();
		System.out.println(sr.isRotation(s1, s2));
	}
}
