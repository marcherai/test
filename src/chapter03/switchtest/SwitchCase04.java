package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("ȸ���� ����� ��� �ǳ���?");
	
		// A, a -> �ֿ����
		// B, b -> �����
		// ������ -> �Ϲݰ�

		// charAt(0) : String -> char
		char grade = scan.nextLine().charAt(0);
		
		switch (grade) {
		case 'A': case 'a': 
			System.out.println("�ֿ����");
			break;
		case 'B': case 'b': 
			System.out.println("�����");
			break;
		default:
			System.out.println("�Ϲݰ�");
			break;
		}
	}

}
