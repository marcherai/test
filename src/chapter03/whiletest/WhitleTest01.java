package chapter03.whiletest;

public class WhitleTest01 {

	public static void main(String[] args) {

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("주사위의 눈:" + num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
