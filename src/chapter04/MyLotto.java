package chapter04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {

		// �ζǹ�ȣ 6���� ���� �迭
		int number;
		int cnt = 0;
		int[] lotto = new int[6];

		System.out.println("====�̹��� �ζ� �����ȣ ====");
		number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���"));

		while (number > cnt) {

			System.out.print("[" + (cnt + 1) + "]: ");

			for (int i = 0; i < lotto.length; i++) {

				lotto[i] = (int) (Math.random() * 45) + 1;
				// lotto[i] =new Random().nextInt(45)+1;
				// �ߺ��� �񱳹�
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						lotto[i] = (int) (Math.random() * 45) + 1;
					}
				}

				System.out.print(lotto[i] + " ");
			}

			cnt++;
			System.out.println();

		}

	}

}
