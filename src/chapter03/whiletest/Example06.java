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
			System.out.println("1. �� ������ ���� | 2.�� ������ ���� ���� | 3.����");
			System.out.println("------------------------------------------");
			System.out.print("����>>");

			num = Integer.parseInt(scan.nextLine());

			switch (num) {
			case 1:
				System.out.println("���� ������ �Է����ּ���.");
				cnt = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < cnt; i++) {
					System.out.println("��" + (i+1) + "��");
				}
				System.out.println("��" + cnt + "���� �ϼ��Ǿ����ϴ�.");
				break;
			case 2:
				System.out.println("���� ������ �Է��ϼ���.");
				cnt = Integer.parseInt(scan.nextLine());
				System.out.println("���� ������ �Է��ϼ���.");
				str = scan.nextLine();
				for (int i = 0; i < cnt; i++) {
					System.out.println(str+"��" + (i+1) + "��");
				}
				System.out.println("��û�Ͻ� " + cnt + "���� " + str + "���� �ϼ��Ǿ����ϴ�.");
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
			}
		}

	}

}
