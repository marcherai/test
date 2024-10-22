package chapter05;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLottoMethod {

	public static void main(String[] args) {

		int number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���"));

		int cnt = 0;

		System.out.println("====�̹��� �ζ� �����ȣ ====");

		while (number > cnt) {

			System.out.print("[" + (cnt + 1) + "]: ");

			int[] lotto = new int[6];
			int index = 0;

			while (index < 6) {
				int num = (int) (Math.random() * 45) + 1;
				// int res = contains(lotto, num); -> ���� false�� ������
				if (!contains(lotto, num)) { // �ߺ�üũ �޼��� ȣ��
					lotto[index++] = num;
				}
			}

			// �ζ� ��ȣ 6�� ���
			for (int num : lotto) {
				System.out.print(num + " ");
			}
			System.out.println();
			cnt++; // �ټ� ����
		}

	}

	public static boolean contains(int[] arr, int num) {

		for (int i : arr) {
			if (i == num) {
				return true; // �ߺ����� �ִ�.
			}
		}
		return false; // �ߺ����� ����.
	}
}
