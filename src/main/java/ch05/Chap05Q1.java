package ch05;

public class Chap05Q1 {
	public int insert(int M, int N, int i, int j) {
		int mask = ~(1<<(i + 1) - 1) | (1<<(j + 1) - 1);
		return M&mask | M<<j;
	}
	
	public static void main(String[] args) {
		int M = 0b10000000000, N = 0b10011;
		int i = 2, j = 6;
		Chap05Q1 sol = new Chap05Q1();
		System.out.printf("%b", sol.insert(M, N, i, j));
	}
}
