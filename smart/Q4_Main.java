import java.util.Scanner;
public class Q4_Main {
	public static void main(String[] args) {
		int menu, i = 0, membership_number;
		String name, phone_number, address;
		Scanner in = new Scanner(System.in);
		Q4_Person p[] = new Q4_Person[10];
		boolean b = true;
		while (b) {
			System.out.println("[ 회원 주소록 ]");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 보기");
			System.out.println("3. 회원 정보 검색");
			System.out.println("0. 종료");
			System.out.println("메뉴 번호 선택>");
			menu = in.nextInt();
			switch (menu) {
			case 1:
				System.out.println("회원 번호 : ");
				membership_number = in.nextInt();
				System.out.println("이름 : ");
				name = in.next();
				System.out.println("전화번호 : ");
				phone_number = in.next();
				System.out.println("주소 : ");
				address = in.next();
				System.out.println();
				p[i] = new Q4_Person(membership_number, name, phone_number, address);
				i++;
				break;
			case 2:
				System.out.println("[ 전체 회원 목록 ]");
				for (i = 0; i < p.length; i++) {
					if (p[i] != null) {
						p[i].print();
					}
				}
				System.out.println();
				break;
			case 3:
				System.out.println("[ 회원 검색 ]");
				System.out.println("검색할 회원 이름 : ");
				name = in.next();
				for (i = 0; i < p.length; i++) {
					if (p[i] != null && p[i].getName().equals(name)) {
						p[i].print();
					}
				}
				System.out.println();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
} // 끝 