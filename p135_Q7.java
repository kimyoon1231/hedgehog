package javaPractice;

import java.util.Scanner;

public class p135_Q7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int menu;
		int money = 0;
		while (true) {

			System.out.println("-----------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-----------------------");
			System.out.println("����>");
			menu = in.nextInt();

			switch (menu) {
			case 1:
				System.out.println("���ݾ�>");
				money += in.nextInt();
				break;
			case 2:
				System.out.println("��ݾ�>");
				money -= in.nextInt();
				break;
			case 3:
				System.out.println("�ܰ�>" + money);
				break;
			case 4:
				System.out.println("���α׷� ����");
				return;
			}
		}
	}
}
