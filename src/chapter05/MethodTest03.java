package chapter05;

public class MethodTest03 {

	public static void main(String[] args) {

		int result = add(5, 7); // 실매개 변수
		System.out.println("Result : " + result);

	}

	public static int add(int i, int j) { // int i = 5, int j = 7

		int sum = i + j;

		return sum;
		
		//return i + j;

	}

}
