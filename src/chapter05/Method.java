package chapter05;

import java.util.Scanner;

public class Method {

	// �޼����� �����ε� ���
	// �޼��� 1
	public void makeBread() {
		System.out.println("���� ����ϴ�.");
	}

	// �޼��� 2
	void makeBread(int cnt1) {
		for (int i = 0; i < cnt1; i++) {
			System.out.println("��" + (i + 1) + "��");
		}
		System.out.println("��" + cnt1 + "���� �ϼ��Ǿ����ϴ�.");
	}

	// �޼��� 3
	void makeBread(int cnt, String str) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(str + "��" + (i + 1) + "��");
		}
		System.out.println("��û�Ͻ� " + cnt + "���� " + str + "���� �ϼ��Ǿ����ϴ�.");

	}

	void order() {

		boolean run = true;
		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.println("------------------------------------------");
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.print("����>>");

			int input_unm = Integer.parseInt(scan.nextLine());

			switch (input_unm) {
			case 1:

				System.out.print("�� ���� �Է�: ");

				int cnt1 = Integer.parseInt(scan.nextLine());

				makeBread(cnt1);

				break;

			case 2:

				System.out.println("���� ������ �Է��ϼ���.");
				int cnt2 = Integer.parseInt(scan.nextLine());

				System.out.println("���� ������ �Է��ϼ���.");
				String str = scan.nextLine();

				makeBread(cnt2, str);
				break;

			case 3:

				System.out.println("���α׷� ����");
				run = false;
				break;

			default:
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
			}

		}

	}

}