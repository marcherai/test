package chapter05;

import java.util.Scanner;

public class FuncTest05 {

	public static void EduStep(int a) {

		switch (a) {
		case 1:
			System.out.println("�ʱ�");
			break;
		case 2:
			System.out.println("�߱�");
			break;
		case 3:
			System.out.println("���");
			break;
		default:
			System.out.println("���� �ܰ��Դϴ�.");
			break;
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("���͵� �ܰ�(1~3)�� �Է��ϼ���");

		int number = scan.nextInt();

		EduStep(number); // number�� �� �Ű�����

	}

}
