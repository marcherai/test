package chapter03.whiletest;

import java.util.Scanner;

public class WhitleTest05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("Java ������ ������ �Է��ϼ��� : ");
			int scr = scan.nextInt();

			// if -> 60�� �̻��̸� �հ� �̸� ���հ�
			// 0���� 100�ʰ� �� 0~100������ ������ �Է°����մϴ�.
			// OR -> ||
//			if(scr <0 ||scr > 100) {
//				System.out.println("0~100������ ������ �Է°����մϴ�.");
//				break;
//			}else if(scr >=60) {
//				System.out.println("�հ��Դϴ�.");
//				break;
//			}else {
//				System.out.println("���հ��Դϴ�.");
//				break;
//			}
			if (scr >= 60 && scr <= 100) {
				System.out.println("�հ��Դϴ�.");
				break;
			} else if (scr < 60 && scr >= 0) {
				System.out.println("���հ��Դϴ�.");
				break;
			} else {
				System.out.println("0~100������ ������ �Է°����մϴ�.");
				break;
			}

		}
		System.out.println("���α׷� ����");

	}
}