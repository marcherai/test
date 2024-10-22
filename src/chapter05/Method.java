package chapter05;

import java.util.Scanner;

public class Method {

	// 메서드의 오버로딩 기법
	// 메서드 1
	public void makeBread() {
		System.out.println("빵을 만듭니다.");
	}

	// 메서드 2
	void makeBread(int cnt1) {
		for (int i = 0; i < cnt1; i++) {
			System.out.println("빵" + (i + 1) + "개");
		}
		System.out.println("빵" + cnt1 + "개가 완성되었습니다.");
	}

	// 메서드 3
	void makeBread(int cnt, String str) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(str + "빵" + (i + 1) + "개");
		}
		System.out.println("요청하신 " + cnt + "개의 " + str + "빵이 완성되었습니다.");

	}

	void order() {

		boolean run = true;
		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");

			int input_unm = Integer.parseInt(scan.nextLine());

			switch (input_unm) {
			case 1:

				System.out.print("빵 개수 입력: ");

				int cnt1 = Integer.parseInt(scan.nextLine());

				makeBread(cnt1);

				break;

			case 2:

				System.out.println("빵의 갯수를 입력하세요.");
				int cnt2 = Integer.parseInt(scan.nextLine());

				System.out.println("빵의 종류를 입력하세요.");
				String str = scan.nextLine();

				makeBread(cnt2, str);
				break;

			case 3:

				System.out.println("프로그램 종료");
				run = false;
				break;

			default:
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}

		}

	}

}