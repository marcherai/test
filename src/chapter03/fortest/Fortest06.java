package chapter03.fortest;

public class Fortest06 {

	public static void main(String[] args) {
		
		int num = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				num += i;
			}

		}
		System.out.println("3의 배수의 합 :" + num);
		
		
	}

}
