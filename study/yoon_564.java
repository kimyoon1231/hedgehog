package Array2;
import java.util.Scanner;
public class yoon_564 {
	public static void main(String[] args) {

		int[][] list = new int[26][2];
		int start = 65;
		for (int i = 0; i < list.length; i++) {
			list[i][0] = start++;
		}
		Scanner sc = new Scanner(System.in);

		while (true) {
			int scanNum = (int) (sc.next().charAt(0));
			if (scanNum >= 65 && scanNum <= 90) {
				for (int i = 0; i < list.length; i++) {
					if (scanNum == list[i][0]) {
						list[i][1]++;
					}
				}
			} else {
				sc.close();
				for (int i = 0; i < list.length; i++) {
					if (list[i][1] != 0) {
						System.out.println((char) list[i][0] + " : " + list[i][1]);
					}
				}
			}
		}
	}
}