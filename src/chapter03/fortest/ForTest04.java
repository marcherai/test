package chapter03.fortest;

public class ForTest04 {
	public static void main(String[] args) {
		System.out.println("===0���� 100������ ���� Ȧ���� ���� ���===");

		int num;
		int total = 0;

		for (num = 0; num <= 100; num++) {
			if (num % 2 == 1) {
				total += num;
			}

		}
		System.out.println("Ȧ���� �� :" + total);

	}

}
