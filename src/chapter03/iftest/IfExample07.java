package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample07 {

	public static void main(String[] args) {
		String ID = "soldesk";
		int PW = 240910;
		
		Scanner scan = new Scanner(System.in);

		// ��
		System.out.println("���̵� �Է����ּ���.: ");
		String uid = scan.nextLine();
		
		if (ID.equals(uid)) {
			// ��й�ȣ�� ����
			System.out.println("��й�ȣ�� �Է����ּ���.: ");
			int upw = scan.nextInt();
			
			if (PW == upw) {
				System.out.println(ID + "�� ȯ���մϴ�.");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		}

	}

}
