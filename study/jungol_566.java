package Array2;

import java.util.Scanner;

public class jungol_566 {

	public static void main(String[] args) {

		int[] array = new int[9];

		array[0] = 100;

		Scanner sc = new Scanner(System.in);
		array[1] = sc.nextInt();

		System.out.print(array[0] + " " + array[1] + " ");

		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 2] - array[i - 1];
			System.out.print(array[i] + " ");
			if (array[i] < 0) {
				sc.close();
				return;
			}
		}
	}
}