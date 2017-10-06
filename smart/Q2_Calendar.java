import java.util.Scanner;
public class Q2_Calendar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("년 :");
		int year = in.nextInt();
		System.out.println("월 :");
		int month = in.nextInt();
		in.close();
		int sum = 1, i, cnt = 0, week;
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (i = 1; i < year; i++) {
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
				sum += 1;
			}
			sum += 365;
		}
		for (i = 0; i < month - 1; i++) {
			sum += days[i];
		}
		if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0))) {
			if (month >= 3) {
				sum++;
			} else if (month == 2) {
				days[1] = 29;
			}
		}
		System.out.printf("\n\t\t\t %d년 %d월\n\n\t일\t월\t화\t수\t목\t금\t토\n", year, month);
		week = sum % 7;
		for (i = 1; i <= week; i++) {
			System.out.print("\t");
			cnt++;
		}
		for (i = 1; i <= days[month - 1]; i++) {
			System.out.printf("\t%d", i);
			cnt++;
			if (cnt % 7 == 0) {
				System.out.println();
			}
		}
	}
}// 끝