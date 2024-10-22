package chapter05;

public class Example02 {

	public static void main(String[] args) {

		/* 두 정수를 입력받아서(=매개변수) 그 합을 계산하는 메소드를 구현해보세요. */

		int num1 = 10;
		int num2 = 20;
		
		// 반환값이 있는 메서드

		int sum1 = sum1(num1, num2);

		System.out.println("합계: " + sum1);

		// 반환값이 없는 메서드

		sum2(num1, num2);

	}

	public static int sum1(int i, int j) {

		return i + j;

	}

	public static void sum2(int i, int j) {

		System.out.println("합계: " + (i + j));

	}

}
