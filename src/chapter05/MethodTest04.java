package chapter05;

public class MethodTest04 {

	public static void main(String[] args) {

		int sum = add(5, 10);
		double sumDouble = add(3.5, 7.2);

		System.out.println("�հ�(int): " + sum);
		System.out.println("�հ�(double): " + sumDouble);

	}
	
	public static int add(int i, int j) {
		return i + j;
	}

	public static double add(double i, double j) {
		return i + j;
	}

}
