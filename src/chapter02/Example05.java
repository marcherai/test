package chapter02;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		/*
		 * 변수방에 51를 대입(변수방 : number) 그 수가 양수인지 여부를 판별하는 프로그램 변수방에 저장된 수가 양수면 "양수입니다" 그렇지
		 * 않음 경우 "음수 또는 0입니다."라고 출력이 되어야함
		 */

//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자 입력: ");
//		int number = scan.nextInt();
//		
//
//		String isPositive = number > 1 ? "X" : number == 0 ? "양수" : "0";
//		System.out.println("양수 확인" + isPositive);

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int number = scan.nextInt();

		boolean isPositive = number > 0;

		String result = isPositive ? "양수입니다" : "음수 또는 0입니다.";
		System.out.println(result);

		int _num = -5;
		String numresult = (_num > 0) ? "양수입니다" : "음수 또는 0입니다.";
		System.out.println(numresult);

	}

}
