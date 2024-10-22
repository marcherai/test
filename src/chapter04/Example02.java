package chapter04;

public class Example02 {

	public static void main(String[] args) {

		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 전체 총점과 평균 출력.
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } }; // 3행 X열

		double avg = 0;
		double totalAvg = 0;
		int total = 0;
		int allTotal = 0;
		int count = 0;

		// for문을 이용 -> 각 행을 가져와서 각행의 열을 읽어서 sum에 누적하고(count++) 평균까지 구하여 출력

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				total += array[i][j]; // {95, 86}
				count++;
			}

			allTotal += total;
			avg = (double) total / array[i].length;

			System.out.println((i + 1) + "행의 합: " + total);
			System.out.println((i + 1) + "행의 평균: " + avg);
			System.out.println("--------------");

			total = 0; // 다음 행의 계산을 위해서 쓰레기 값을 버림
		}
		
		totalAvg += (double) allTotal / count;
		
		System.out.println("각 행의 합: " + allTotal);
		System.out.println("각 행의 평균: " + totalAvg);
	}

}
