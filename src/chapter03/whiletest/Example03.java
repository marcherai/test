package chapter03.whiletest;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0; // ����(+), ���(-)

		Scanner scan = new Scanner(System.in);

		while (run) {

			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------------");
			System.out.println("����>");

			// nextLine()�� ������ ���׷� �߻��Ǵ� ���� ����
			int menuNum = Integer.parseInt(scan.nextLine());
			// nextInt()�� ������ �������� ���׸� �Է��ϸ� ������ ���ڿ����� �Էµ�

			switch (menuNum) {
			case 1:
				System.out.println("���ݾ��� �Է����ּ���.");
				balance += Integer.parseInt(scan.nextLine());
				System.out.println("���ݾ�> " + balance);
				break;
			case 2:
				System.out.println("��ݾ��� �Է����ּ���.");
				balance -= Integer.parseInt(scan.nextLine());
				System.out.println("��ݾ�> " + balance);
				break;
			case 3:
				System.out.println("�ܰ�> " + balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();

		}

		System.out.println("���α׷� ����");

	}
}
