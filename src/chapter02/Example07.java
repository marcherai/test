package chapter02;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// 한 자릿수 숫자를 입력받아 (scan)
		// 숫자가 짝수인지 홀수인지 출력하는 프로그램(삼항 연산자 사용)

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int num = scan.nextInt();

//		String result = num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
//		System.out.println(result);
		
		int remainder = num % 2;
		boolean isOdd = remainder == 1; 
		String result = isOdd ? "홀수입니다." : "짝수입니다.";
     	System.out.println(result);
		
	}

}
