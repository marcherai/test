package chapter02;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * soldesk 과수원 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개 입니다. 과수원에서 하루에 생산되는
		 * 총 과일의 갯수를 출력하고, 시간당(24) 전체 과일의 평균 생산 갯수를 출력 하시오. (단, 평균값을 담는 데이터 타입은 float)로
		 * 정의한다.
		 */

		int pear = 5;
		int apple = 7;
		int orange = 5;
     	int fruitTotal = pear + apple + orange;
		float fruitAvg = fruitTotal / 24f;
		
		System.out.println("하루 생산량 :" + fruitTotal);
		System.out.println("시간당 생산량 : " + fruitAvg);
		
//		Scanner sPear = new Scanner(System.in);
//		System.out.print("배의 개수를 입력하세요: ");
//		int pear = sPear.nextInt();
//
//		Scanner sApple = new Scanner(System.in);
//		System.out.print("사과의 개수를 입력하세요: ");
//		int apple = sApple.nextInt();
//
//		Scanner sOrange = new Scanner(System.in);
//		System.out.print("오렌지의 개수를 입력하세요: ");
//		int orange = sOrange.nextInt();
//
//		Scanner sFruitTotal = new Scanner(System.in);
//		int fruitTotal = apple + orange + pear;
//		System.out.println("과일들의 하루 생산량입니다: "+fruitTotal+"개");
//		
//		Scanner sFruitAvg = new Scanner(System.in);
//		float fruitAvg = fruitTotal / 24f;
//		System.out.println("시간당 과일 생산량 생산량입니다: "+fruitAvg+"개");
		

	}

}
