package chapter03.whiletest;

import java.util.Random;
import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*
		 * ���� ���߱� ���� 1���� 100���� ������ ���ڸ� �����ϰ�, ���ڸ� ���ߴ� ���� ���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ũ��
		 * "�� ���� ���ڸ� �����ϼ���" ��� ���� �Է��� ���ڰ� ��ǻ�Ͱ� ������ ���ں��� ������ "�� ū ���ڸ� �����ϼ���" ��� ������ ���ڸ�
		 * ��Ȯ�� ���� ������ ������ �ݺ� ���⶧���� �ɸ� �õ� Ƚ���� ����Ͽ� ������ �޽����� ���
		 */

		Scanner scan = new Scanner(System.in);

		Random random = new Random();

		int targetNumber = random.nextInt(100) + 1;
		int guest = 0;
		int count = 0;
		boolean run = true;

		System.out.println("1���� 100���� ���ڸ� ���纸����!");

//		while (run) {
//			System.out.println("���ڸ� �Է����ּ���.");
//			guest = scan.nextInt();
//			count++;
//			if (targetNumber < guest) {
//				System.out.println("�� ���� ���ڸ� �����ϼ���");
//
//			} else if (targetNumber > guest) {
//				System.out.println("�� ū ���ڸ� �����ϼ���");
//
//			} else if (targetNumber == guest) {
//				System.out.println("����ϴ�.");
//				run = false;
//
//			} else {
//				System.out.println("���ڸ� �Է����ּ���.");
//			}
//		
//	}

		do {
			System.out.println("���ڸ� �Է����ּ���.");
			guest = scan.nextInt();
			count++;
			if (targetNumber < guest) {
				System.out.println("�� ���� ���ڸ� �����ϼ���");

			} else if (targetNumber > guest) {
				System.out.println("�� ū ���ڸ� �����ϼ���");
			}
		} while (guest != targetNumber);

		System.out.println("�����մϴ�. ! " + count + "�� ���� ���߾����ϴ�");
		System.out.println("PC�� ������ ���� : " + targetNumber);
		System.out.println("User�� ������ ���� : " + guest);
	}
}
