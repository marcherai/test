package chapter04;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto2 {

	public static void main(String[] args) {

		// 로또번호 6개를 담을 배열
		int number;
		int cnt = 0;
		int[] lotto = new int[6];

		System.out.println("====이번주 로또 예상번호 ====");
		number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));

		while (number > cnt) {
			System.out.println("[" + (cnt + 1) + "]: ");
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						lotto[i] = new Random().nextInt(45) + 1;
					} else {
						continue;
					}
				}
			}
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			cnt++;
			System.out.println();
		}

	}

}
