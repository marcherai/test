package chapter05;

import java.util.Scanner;

public class FuncTest05 {

	public static void EduStep(int a) {

		switch (a) {
		case 1:
			System.out.println("초급");
			break;
		case 2:
			System.out.println("중급");
			break;
		case 3:
			System.out.println("고급");
			break;
		default:
			System.out.println("없는 단계입니다.");
			break;
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("스터디 단계(1~3)를 입력하세요");

		int number = scan.nextInt();

		EduStep(number); // number는 실 매개변수

	}

}
