import java.util.Scanner;
public class Q4_Main_2 {
	public static void main(String[] args) {
		int menu, i = 0, j, k, membership_number;
		String name, phone_number, address;
		Scanner in = new Scanner(System.in);
		Q4_Person_2 p[] = new Q4_Person_2[10];
		while (true) {
			System.out.println("[ 회원 주소록 ]\n1. 회원 정보 등록\n2. 전체 회원 보기\n3. 회원 정보 검색\n0. 종료\n메뉴 번호 선택>");
			menu = in.nextInt();
			switch (menu) {
			case 1:
				if (i == p.length) {
					System.out.println("더 이상 입력할 수 없습니다.\n");
					break;
				}
				System.out.println("회원 번호 : ");
				membership_number = in.nextInt();
				System.out.println("이름 : ");
				name = in.next();
				System.out.println("전화번호 : ");
				phone_number = in.next();
				System.out.println("주소 : ");
				address = in.next();
				System.out.println();
				p[i++] = new Q4_Person_2(membership_number, name, phone_number, address);
				break;
			case 2:
				System.out.println("[ 전체 회원 목록 ]");
				for (j = 0; j < p.length; j++) {
					if (p[j] != null) {
						p[j].print();
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.println("[ 회원 검색 ]");
				System.out.println("검색할 회원 이름 : ");
				name = in.next();
				int cnt = 0;
				for (k = 0; k < p.length; k++) {
					if (p[k] != null && p[k].getName().equals(name)) {
						p[k].print();
						cnt++;
					}
				}
				if (cnt == 0) {
					System.out.println("일치하는 회원 정보가 없습니다.");
				}
				System.out.println();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				in.close();
				return;
			default:
				System.out.println("메뉴를 다시 선택하세요.\n");
			}
		}
	}
}