package ch01;

/**
 * 
 * @author raychen
 * 
 * Question 1.5
 * 
 * Perform basic string compression using the counts of repeated characters.
 * For example,
 * 
 * aabcccccaaa -> a2b1c5a3
 * 
 */

public class StringCompression {
	public String compress(String s) {
		if (s.isEmpty()) return s;
		StringBuilder sb = new StringBuilder();
		Character prev_c = s.charAt(0);
		int n = 1;
		for (int i = 1; i < s.length(); i++) {
			if (prev_c == s.charAt(i)) {
				n++;
			} else {
				sb.append(prev_c + String.valueOf(n)); 
				prev_c = s.charAt(i); n = 1;
			}
		}
		sb.append(prev_c + String.valueOf(n));
		return sb.toString();
	}
	
	public static void main(String[] args) {
		StringCompression obj = new StringCompression();
		System.out.println(obj.compress("aabcccccaaa"));
	}
}
