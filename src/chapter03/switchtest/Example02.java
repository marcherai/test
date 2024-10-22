package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요. (월요일:떡볶이,
		 * 화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나
		 */
		Scanner scan = new Scanner(System.in);

		System.out.print("뭐 먹을까요? :");

		String day = scan.nextLine();
		String food = "";

		switch (day) {
		case "월요일": {
			food = "떡볶이";
			break;
		}
		case "화요일": {
			food = "스파게티";
			break;
		}
		case "수요일": {
			food = "피자";
			break;
		}
		case "목요일": {
			food = "회";
			break;
		}
		case "금요일": {
			food = "치킨";
			break;
		}
		case "토요일": {
			food = "김치찌개";
			break;
		}
		case "일요일": {
			food = "라면";
			break;
		}
		default: {
			System.out.println("요일을 다시 입력해주세요.");
		}

		}

		System.out.println("선택하신 " + day + "의 " + food + "입니다.");
	}

}
