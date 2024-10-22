package chapter04;

public class ArrayTest08 {

	public static void main(String[] args) {

		int score[] = { 98, 90, 87 };
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			System.out.println("score[" + i + "]: " + score[i]);

		}
		
		System.out.println("ÃÑÁ¡: " + sum);
		double avg = sum / (double) (score.length);
		System.out.println("Æò±Õ: " + avg);
		System.out.println("Æò±Õ(¹Ý¿Ã¸²): " + Math.round(avg));

	}

}
