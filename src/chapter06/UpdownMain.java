package chapter06;

import java.util.Scanner;

public class UpdownMain {

	public static void main(String[] args) {

		int select;
		String check;

		// 객체 생성
		Updown updown = new Updown();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요: ");

			select = scan.nextInt();
			check = updown.check(select);

			if (check.equals("SUCCESS")) {
				break;
			}
		}

	}

}
