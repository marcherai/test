package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int money = 0;
		String select = "";

		Vending ven = new Vending();
		ven.init(); // �����غ� �Ϸ�

		System.out.print("���� �����ϼ���: ");
		money = Integer.parseInt(scan.nextLine());
		ven.showCans(money); // 1100������ ��� �� �����°� ������ ĵ�� ����
		
		System.out.println("============================");

		System.out.print("���Ḧ �����ϼ���: ");
		select = scan.next();
		ven.outCan(select);

	}

}
