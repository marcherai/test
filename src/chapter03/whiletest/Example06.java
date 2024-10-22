package chapter03.whiletest;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {

		int cnt, num;
		boolean run = true;
		String str = "";
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택>>");

			num = Integer.parseInt(scan.nextLine());

			switch (num) {
			case 1:
				System.out.println("빵의 갯수를 입력해주세요.");
				cnt = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < cnt; i++) {
					System.out.println("빵" + (i+1) + "개");
				}
				System.out.println("빵" + cnt + "개가 완성되었습니다.");
				break;
			case 2:
				System.out.println("빵의 갯수를 입력하세요.");
				cnt = Integer.parseInt(scan.nextLine());
				System.out.println("빵의 종류를 입력하세요.");
				str = scan.nextLine();
				for (int i = 0; i < cnt; i++) {
					System.out.println(str+"빵" + (i+1) + "개");
				}
				System.out.println("요청하신 " + cnt + "개의 " + str + "빵이 완성되었습니다.");
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}
		}

	}

}
