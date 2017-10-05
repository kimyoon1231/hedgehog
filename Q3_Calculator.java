package scit_34_b_kim_yoon;

import java.util.Scanner;

public class Q3_Calculator {
	public static void main(String[] args) {

		int i = 0;
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("�����Է� : ");
			String s = in.nextLine();
			char[] c = new char[s.length()];

			for (i = 0; i < s.length(); i++) {
				c[i] = s.charAt(i);
			}

			for (i = 0; i < s.length(); i++) {
				if (i > 0 && (c[i] > '0' && c[i] < '9') && (c[i - 1] > '0' && c[i - 1] < '9')) {
					System.out.println("���ڸ� ���� ������ �Է��ϼ���. ���α׷� ���� ");
					in.close();
					return;
				}
			}
			if (c[s.length() - 1] != '=') {
				System.out.println("=�� �����ϴ�. ���α׷� ���� ");
				in.close();
				return;
			}

			float result = (c[0] - 48);

			for (i = 1; i < s.length(); i += 2) {
				switch (c[i]) {
				case '+':
					result += (c[i + 1] - 48);
					break;
				case '-':
					result -= (c[i + 1] - 48);
					break;
				case '*':
					result *= (c[i + 1] - 48);
					break;
				case '/':
					result /= (c[i + 1] - 48);
					break;
				case '=':
					break;
				default:
					System.out.println(" + | - | * | / �̿��� ���� ��ȣ�� �ԷµǾ����ϴ�. ���α׷� ���� ");
					in.close();
					return;
				}
			}
			System.out.println("����� " + result);
			in.close();
			return;
		}
	}
}
// ��

// System.out.println((int) '*'); // 42
// System.out.println((int) '+'); // 43
// System.out.println((int) '-'); // 45
// System.out.println((int) '/'); // 47
//
// System.out.println((int) '0'); // 48
// System.out.println((int) '1');
// System.out.println((int) '8');
// System.out.println((int) '9'); // 57
