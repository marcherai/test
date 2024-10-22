package chapter03.whiletest;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {

		boolean run = true;
		int num;
		int save = 0;
		int money;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");

			num = scan.nextInt();
			if (num == 1) {

				System.out.println("예금을 선택하셨습니다.");
				System.out.println("현재 금액> " + save);
				System.out.println("예금액을 입력해주세요.");
				money = scan.nextInt();
				if (money <= 0) {
					System.out.println("금액을 잘못 입력하셨습니다.");
				} else {
					save += money;
				}

			} else if (num == 2) {

				System.out.println("출금을 선택하셨습니다.");
				System.out.println("현재 금액> " + save);
				System.out.println("출금액을 입력해주세요.");
				money = scan.nextInt();
				save -= money;
				if (save < 0) {
					System.out.println("잔액이 부족합니다.");
					save += money;
				} 
				
			} else if (num == 3) {

				System.out.println("잔고를 선택하셨습니다.");
				System.out.println("잔고> " + save);

			} else if (num == 4) {

				run = false;

			} 
			else {
				System.out.println("잘못된 서비스 번호를 선택하셨습니다.");
			}
		}

		System.out.println("프로그램 종료");
	}

}
