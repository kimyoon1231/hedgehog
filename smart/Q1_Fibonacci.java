public class Q1_Fibonacci {
	public static void main(String[] args) {
		long a = 1, b = 1, c;
		System.out.print(a + " " + b + " ");
		for (int i = 3; i < 100; i++) {
			c = a + b;
			if (c < 0) {
				System.out.println(i + "※ Long 타입 최댓값을 넘었습니다. 출력을 중단합니다.");
				return;
			}
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}// 끝