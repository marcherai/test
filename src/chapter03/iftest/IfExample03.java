package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {

		char grade = 0;
		int jumsu;

		jumsu = Integer.parseInt(JOptionPane.showInputDialog("����"));

//		if (jumsu >= 90) {
//			System.out.println('A');
//		} else if (jumsu >= 80) {
//			System.out.println('B');
//		} else if (jumsu >= 70) {z
//			System.out.println('C');
//		} else if (jumsu >= 60) {
//			System.out.println('D');
//		} else {
//			System.out.println('F');
//		}
		if (jumsu > 100) {
			System.out.println("������ �ٽ� �Է����ּ���");
		} else if (jumsu >= 90) {
			grade = 'A';
			System.out.println("�ֿ�� �л��Դϴ�.");
		} else if (jumsu >= 80) {
			grade = 'B';
			System.out.println("��� �л��Դϴ�.");
		} else if (jumsu >= 70) {
			grade = 'C';
		} else if (jumsu >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("����� ������ : " + grade + "�Դϴ�.");

	}
}