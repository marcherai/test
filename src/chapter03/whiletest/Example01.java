package chapter03.whiletest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/*
		 * ����ڰ� "no"�� �Է��ϱ� ������ ����ؼ� �޽����� �Է¹ް�, ����ϴ� ���α׷��� ��������. (do-while���)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("�����Ϸ��� no�� �Է��ϼ���.");

		String inputString;

		do {
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("no")); // no �Է½� ���� ����

		System.out.println();
		System.out.println("���α׷� ����");

	}

}
