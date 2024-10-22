package chapter05;

public class Example03 {

	public static int findMax(int[] arr) {

		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;

//		for (int num : arr) {
//			if (num > max) {
//				max = num;
//			}
//		}
//		return max;
	}

	public static void main(String[] args) {

		int[] numbers = { 7, 2, 9, 1, 5 };
		int maxnum = findMax(numbers);
		System.out.println("�ִ밪: " + maxnum);

	}

}
