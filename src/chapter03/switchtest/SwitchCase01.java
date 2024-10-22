package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase01 {

	public static void main(String[] args) {

		int ranking;
		char medalColor;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("등수를 입력해 주세요 : ");
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

		System.out.println(ranking + "등 메달은 " + medalColor + " 입니다.");

	}

}
