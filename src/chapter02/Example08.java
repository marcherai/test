package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {
		// �� ���� ���ڸ� �Է� �޾Ƽ� ù ��°(num1) ���ڰ� �� ��°(num2) ���ں���
		// ū�� ���θ� ����ϴ� ���α׷��� �ۼ��ϼ���.

//		Scanner scan = new Scanner(System.in);
//		System.out.print("���ڸ� �Է����ּ���: ");
//		int num1 = scan.nextInt();
//		
//		System.out.print("���ڸ� �Է����ּ���: ");
//		int num2 = scan.nextInt();
//
//		String result = num1 > num2 ? "num1�� ��Ů�ϴ�." : "num2�� ��Ů�ϴ�.";
//		System.out.println(result);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է����ּ���: ");
		int num1 = scan.nextInt();
		
		System.out.print("�� ��° ���ڸ� �Է����ּ���: ");
		int num2 = scan.nextInt();
		
		boolean isGreaterThan = num1 > num2;
		
		System.out.println("ù ��° ���ڰ� �� ��° ���ں��� ū��? "+isGreaterThan);

	}

}
