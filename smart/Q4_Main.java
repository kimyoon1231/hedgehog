import java.util.Scanner;
public class Q4_Main {
	public static void main(String[] args) {
		int menu, i = 0, membership_number;
		String name, phone_number, address;
		Scanner in = new Scanner(System.in);
		Q4_Person p[] = new Q4_Person[10];
		boolean b = true;
		while (b) {
			System.out.println("[ ȸ�� �ּҷ� ]");
			System.out.println("1. ȸ�� ���� ���");
			System.out.println("2. ��ü ȸ�� ����");
			System.out.println("3. ȸ�� ���� �˻�");
			System.out.println("0. ����");
			System.out.println("�޴� ��ȣ ����>");
			menu = in.nextInt();
			switch (menu) {
			case 1:
				System.out.println("ȸ�� ��ȣ : ");
				membership_number = in.nextInt();
				System.out.println("�̸� : ");
				name = in.next();
				System.out.println("��ȭ��ȣ : ");
				phone_number = in.next();
				System.out.println("�ּ� : ");
				address = in.next();
				System.out.println();
				p[i] = new Q4_Person(membership_number, name, phone_number, address);
				i++;
				break;
			case 2:
				System.out.println("[ ��ü ȸ�� ��� ]");
				for (i = 0; i < p.length; i++) {
					if (p[i] != null) {
						p[i].print();
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.println("[ ȸ�� �˻� ]");
				System.out.println("�˻��� ȸ�� �̸� : ");
				name = in.next();
				for (i = 0; i < p.length; i++) {
					if (p[i] != null && p[i].getName().equals(name)) {
						p[i].print();
					}
				}
				System.out.println();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
} // �� 