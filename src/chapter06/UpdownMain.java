package chapter06;

import java.util.Scanner;

public class UpdownMain {

	public static void main(String[] args) {

		int select;
		String check;

		// ��ü ����
		Updown updown = new Updown();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("���ڸ� �Է��ϼ���: ");

			select = scan.nextInt();
			check = updown.check(select);

			if (check.equals("SUCCESS")) {
				break;
			}
		}

	}

}
