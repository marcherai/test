package chapter03.whiletest;

public class Example02 {

	public static void main(String[] args) {
		// ���丮�� �˰���
		/*
		 * 5! -> 5x4x3x2x1 => n! -> n*(n-1)*(n-2)*(n-3)*(n-4)
		 */

		int number = 5;
		int factorial = 1;

		// ���ڰ� 0���ϰ� �ƴҶ� ����
		while (number > 0) {
			
			factorial *= number;
			number--;

		}
		System.out.println("���丮�� ���:" + factorial);

	}

}
