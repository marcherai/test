package chapter05;

import java.util.Scanner;

public class FuncTest06 {

	public static String EduStep(int edu) {

		String step = "";
		
		switch (edu) {
		case 1:
			step = "�ʱ�";
			break;
		case 2:
			step = "�߱�";
			break;
		case 3:
			step = "���";
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			step = "�������� �ʴ� ";
			break;
		}
		return step;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("���͵� �ܰ�(1~3)�� �Է��ϼ���");

		int number = scan.nextInt();

		String step = EduStep(number); // number�� �� �Ű�����
		System.out.println("���� ���� �ܰ�� " + step + "�ܰ� �Դϴ�.");

	}

}
