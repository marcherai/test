package chapter05;

import java.util.Scanner;

public class FuncTest06 {

	public static String EduStep(int edu) {

		String step = "";
		
		switch (edu) {
		case 1:
			step = "초급";
			break;
		case 2:
			step = "중급";
			break;
		case 3:
			step = "고급";
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			step = "존재하지 않는 ";
			break;
		}
		return step;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("스터디 단계(1~3)를 입력하세요");

		int number = scan.nextInt();

		String step = EduStep(number); // number는 실 매개변수
		System.out.println("현재 수업 단계는 " + step + "단계 입니다.");

	}

}
