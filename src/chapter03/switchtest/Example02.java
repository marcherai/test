package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * ����ڷκ��� ������ �Է¹޾�(1~7) �ش� ���Ͽ� � ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���. (������:������,
		 * ȭ����:���İ�Ƽ,------,�Ͽ���:�ʹ�)-->�������� �԰������ �ƹ��ų�
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("�� �������? :");

		String day = scan.nextLine();
		String food = "";

		switch (day) {
		case "������": {
			food = "������";
			break;
		}
		case "ȭ����": {
			food = "���İ�Ƽ";
			break;
		}
		case "������": {
			food = "����";
			break;
		}
		case "�����": {
			food = "ȸ";
			break;
		}
		case "�ݿ���": {
			food = "ġŲ";
			break;
		}
		case "�����": {
			food = "��ġ�";
			break;
		}
		case "�Ͽ���": {
			food = "���";
			break;
		}
		default: {
			System.out.println("������ �ٽ� �Է����ּ���.");
		}

		}

		System.out.println("�����Ͻ� " + day + "�� " + food + "�Դϴ�.");
	}

}
