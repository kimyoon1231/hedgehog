import java.util.Scanner;
public class Q4_Main_2 {
	public static void main(String[] args) {
		int menu, i = 0, j, k, membership_number;
		String name, phone_number, address;
		Scanner in = new Scanner(System.in);
		Q4_Person_2 p[] = new Q4_Person_2[10];
		while (true) {
			System.out.println("[ ȸ�� �ּҷ� ]\n1. ȸ�� ���� ���\n2. ��ü ȸ�� ����\n3. ȸ�� ���� �˻�\n0. ����\n�޴� ��ȣ ����>");
			menu = in.nextInt();
			switch (menu) {
			case 1:
				if (i == p.length) {
					System.out.println("�� �̻� �Է��� �� �����ϴ�.\n");
					break;
				}
				System.out.println("ȸ�� ��ȣ : ");
				membership_number = in.nextInt();
				System.out.println("�̸� : ");
				name = in.next();
				System.out.println("��ȭ��ȣ : ");
				phone_number = in.next();
				System.out.println("�ּ� : ");
				address = in.next();
				System.out.println();
				p[i++] = new Q4_Person_2(membership_number, name, phone_number, address);
				break;
			case 2:
				System.out.println("[ ��ü ȸ�� ��� ]");
				for (j = 0; j < p.length; j++) {
					if (p[j] != null) {
						p[j].print();
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.println("[ ȸ�� �˻� ]");
				System.out.println("�˻��� ȸ�� �̸� : ");
				name = in.next();
				int cnt = 0;
				for (k = 0; k < p.length; k++) {
					if (p[k] != null && p[k].getName().equals(name)) {
						p[k].print();
						cnt++;
					}
				}
				if (cnt == 0) {
					System.out.println("��ġ�ϴ� ȸ�� ������ �����ϴ�.");
				}
				System.out.println();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				in.close();
				return;
			default:
				System.out.println("�޴��� �ٽ� �����ϼ���.\n");
			}
		}
	}
}