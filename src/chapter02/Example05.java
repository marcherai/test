package chapter02;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*
		 * �����濡 51�� ����(������ : number) �� ���� ������� ���θ� �Ǻ��ϴ� ���α׷� �����濡 ����� ���� ����� "����Դϴ�" �׷���
		 * ���� ��� "���� �Ǵ� 0�Դϴ�."��� ����� �Ǿ����
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("���� �Է�: ");
//		int number = scan.nextInt();
//		
//
//		String isPositive = number > 1 ? "X" : number == 0 ? "���" : "0";
//		System.out.println("��� Ȯ��" + isPositive);

		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int number = scan.nextInt();

		boolean isPositive = number > 0;

		String result = isPositive ? "����Դϴ�" : "���� �Ǵ� 0�Դϴ�.";
		System.out.println(result);

		int _num = -5;
		String numresult = (_num > 0) ? "����Դϴ�" : "���� �Ǵ� 0�Դϴ�.";
		System.out.println(numresult);

	}

}
