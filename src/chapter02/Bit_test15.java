package chapter02;

import java.util.Scanner;

public class Bit_test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű���� �Է°� �ޱ�
		Scanner scan = new Scanner(System.in);

		System.out.print("ù��° ���� �Է�: ");
		int num1 = scan.nextInt(); // 0101

		System.out.print("�ι�° ���� �Է�: ");
		int num2 = scan.nextInt(); // 1010

		// System.out.println(num1);
		// System.out.println(num2);

		int andResult = num1 & num2; // 0
		int orResult = num1 | num2; // 15
		int xorResult = num1 ^ num2; // 15

		System.out.println("��Ʈ AND ���: "+andResult);
		System.out.println("��Ʈ OR ���: "+orResult);
		System.out.println("��Ʈ XOR ���: "+xorResult);

	}

}
