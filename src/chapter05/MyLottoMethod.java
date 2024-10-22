package chapter05;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLottoMethod {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("원하는 로또 구매횟수를 입력하세요"));

		int cnt = 0;

		System.out.println("====이번주 로또 예상번호 ====");

		while (number > cnt) {

			System.out.print("[" + (cnt + 1) + "]: ");

			int[] lotto = new int[6];
			int index = 0;

			while (index < 6) {
				int num = (int) (Math.random() * 45) + 1;
				// int res = contains(lotto, num); -> 값을 false로 가져옴
				if (!contains(lotto, num)) { // 중복체크 메서드 호출
					lotto[index++] = num;
				}
			}

			// 로또 번호 6개 출력
			for (int num : lotto) {
				System.out.print(num + " ");
			}
			System.out.println();
			cnt++; // 줄수 증가
		}

	}

	public static boolean contains(int[] arr, int num) {

		for (int i : arr) {
			if (i == num) {
				return true; // 중복값이 있다.
			}
		}
		return false; // 중복값이 없다.
	}
}
