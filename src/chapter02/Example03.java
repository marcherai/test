package chapter02;

import java.util.Scanner;

public class Example03 {

	// �������� ����ϴ� ������ ����
	public static void main(String[] args) {
		// #1
		// ���׿����ڸ� �̿��Ͽ� score1�� 60 ���� ũ�ų� ������ �հ�
		// �׷��� ������ ���հ����� ��ȯ �Ͻÿ�.

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int age = scan.nextInt();

		String result = age >= 60 ? "�հ�" : "���հ�";
		System.out.println(result + "�Դϴ�.");

		// #2
		// ���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰�
		// score2�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�

		Scanner scan2 = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int score2 = scan2.nextInt();

		String result2 = score2 > 90 ? "A" : ((score2 > 80) ? "B" : "C"); //char ���� '' String ��� �� ""
		System.out.println(result2 + "�Դϴ�.");

	}

}
