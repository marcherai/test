package chapter03.fortest;

public class ForTest04 {
	public static void main(String[] args) {
		System.out.println("===0부터 100까지의 수중 홀수의 합을 출력===");

		int num;
		int total = 0;

		for (num = 0; num <= 100; num++) {
			if (num % 2 == 1) {
				total += num;
			}

		}
		System.out.println("홀수의 합 :" + total);

	}

}
