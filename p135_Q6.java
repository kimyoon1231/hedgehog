package javaPractice;

import java.util.Scanner;

public class p135_Q6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int printNum = in.nextInt();

		for (int i = 1; i <= printNum; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
