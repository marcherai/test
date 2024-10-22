package chapter04;

public class TwoDimension01 {

	public static void main(String[] args) {
		// 이차원 배열

		int arr[][] = new int[2][3];
		int n = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				n++;
				System.out.print((arr[i][j] + n) + " ");

			}
			System.out.println();
		}

		System.out.println("================");
		System.out.println("행: " + arr.length); // [행][열] 중 행을 읽음
		System.out.println("열: " + arr[0].length); // [행][열] 중 열을 읽음
		System.out.println("================");

		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr1[i].length; j++) {

				System.out.print(arr1[i][j] + " ");

			}
			System.out.println();
		}
	}

}
