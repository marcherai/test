package chapter03.fortest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// ����� ������ �Է� ���� ������ ������ �ο����� �Է� �ް�,
		// ������ ����� ���Ͻÿ�.(��, ����� �Ǽ��� ����� ��)

		Scanner scan = new Scanner(System.in);

		int i, sum = 0, cnt = 0, score;
		double avg = 0;

		System.out.print("�� ���� ������ �˰� �����Ű���? ");
		cnt = scan.nextInt();

		for (i = 1; i <= cnt; i++) {
			System.out.print("���� ");
			score = scan.nextInt();
			sum += score;
			avg = sum / cnt;
		}
		           
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);

	}

}
