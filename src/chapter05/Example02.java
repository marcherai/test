package chapter05;

public class Example02 {

	public static void main(String[] args) {

		/* �� ������ �Է¹޾Ƽ�(=�Ű�����) �� ���� ����ϴ� �޼ҵ带 �����غ�����. */

		int num1 = 10;
		int num2 = 20;
		
		// ��ȯ���� �ִ� �޼���

		int sum1 = sum1(num1, num2);

		System.out.println("�հ�: " + sum1);

		// ��ȯ���� ���� �޼���

		sum2(num1, num2);

	}

	public static int sum1(int i, int j) {

		return i + j;

	}

	public static void sum2(int i, int j) {

		System.out.println("�հ�: " + (i + j));

	}

}
