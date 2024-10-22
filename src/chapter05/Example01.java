package chapter05;

public class Example01 {

	public static void main(String[] args) {

		/*
		 * �簢���� ���̸� ����ϴ� �޼ҵ� calculateArea �� �����ε� �Ͽ� ���ο� ���α���, �׸��� �� ���� ���̸� �޾Ƽ� ����� �� �ְ�
		 * ��������. �簢�� ���� ���(���簢��) = ���� x ����(�Ű����� 2��) ���� 5, ���� 3 �簢�� ���� ���(���簢��) = �� ����
		 * ���� x �� ���� ����(�Ű����� 1��) �� ���� ���� 4
		 */

		// ��ü���� �ϱ�
		Example01 rectangle = new Example01();
		double area1 = rectangle.calculateArea(5.0, 3.0);
		double area2 = rectangle.calculateArea(4.0);
		System.out.println("�簢���� ���� (����5, ���� 3): " + area1);
		System.out.println("���簢���� ���� (�� ���� ����4): " + area2);

	}

	public double calculateArea(double i, double j) {

		return i * j;

	}

	public double calculateArea(double i) {

		return i * i;

	}

}
