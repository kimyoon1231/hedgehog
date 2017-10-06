package javaPractice;

import java.util.Scanner;

public class p135_Q7_bank {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int menu;
		int money = 0;
		while (true) {

			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.println("선택>");
			menu = in.nextInt();

			switch (menu) {
			case 1:
				System.out.println("예금액>");
				money += in.nextInt();
				break;
			case 2:
				System.out.println("출금액>");
				money -= in.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + money);
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
