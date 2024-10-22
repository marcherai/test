package chapter06;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int money = 0;
		String select = "";

		Vending ven = new Vending();
		ven.init(); // 음료준비 완료

		System.out.print("돈을 투입하세요: ");
		money = Integer.parseInt(scan.nextLine());
		ven.showCans(money); // 1100넣으면 목록 중 나오는게 가능한 캔이 보임
		
		System.out.println("============================");

		System.out.print("음료를 선택하세요: ");
		select = scan.next();
		ven.outCan(select);

	}

}
