package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample02 {

	public static void main(String[] args) {
		// 10�� ����� �Ǵ�
		// ���� : dat�� �մ� ���� 10���� ���� �������� 1�̸� ���

		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int dat = scan.nextInt();

		//dat = Integer.parseInt(JOptionPane.showInputDialog("���� �Է��ϼ���."));

		if (dat % 10 == 0) {
			System.out.println(dat + "��(��) 10�� ����� �Դϴ�.");
		}else {
			System.out.println(dat + "��(��) 10�� ����� �ƴմϴ�.");
		}

	}

}
