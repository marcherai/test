package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {

		int ranking;
		char medalColor;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �Է��� �ּ��� : ");
		ranking = scan.nextInt();

		switch (ranking) {

		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';
			break;
		}

		System.out.println(ranking + "�� �޴��� " + medalColor + " �Դϴ�.");

	}

}
