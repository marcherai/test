package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		/*���ð��� ������ ������ �Ƶ��� 1000�� ->7
		���ð��� ������ �ʵ��л��� 2000��->13
		���ð��� ������ ��,����л��� 3500�� ->19
		���ð��� ������ ������ 5000��*/

		int age;
		int charge;
		String grade;

		age = Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));

		if (age <= 7) {
			charge = 1000;
			grade = "������ �Ƶ�";
		} else if (age <= 13) {
			charge = 2000;
			grade = "�ʵ��л�";
		} else if (age <= 19) {
			charge = 3500;
			grade = "��,����л�";
		} else {
			charge = 5000;
			grade = "����";
		}
		System.out.println("���ð��� ������" + grade + "�̹Ƿ� " + charge + "�Դϴ�.");
	}

}
