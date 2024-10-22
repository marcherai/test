package chapter04;

public class ArrayCopy {

	public static void main(String[] args) {

		int array1[] = { 10, 20, 30, 40, 50 };
		int array2[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println();
		System.out.println("===================");

		array1[3] = 400;
		
		for (int arr2 : array2) {
			System.out.print(arr2 + " ");
		}

		System.out.println();
		System.out.println("===================");

		System.arraycopy(array1, 0, array2, 1, 4);
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println();
		System.out.println("===================");

		for (int arr2 : array2) {
			System.out.print(arr2 + " ");
		}

		System.out.println();
		System.out.println("===================");

	}

}
