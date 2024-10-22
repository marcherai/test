package chapter03.fortest;

public class ForTest02 {

	public static void main(String[] args) {
		
		int j;
		int hap = 0;
		
		System.out.println("1부터 100까지의 수 출력");

		for (j = 0; j < 100; j++) {
			System.out.print((j + 1) + " ");
		}

		for (j = 1; j <= 100; j++) {
			hap += j;
		}
		
		System.out.println();
		System.out.print("부터 100까지의 합: "+hap);

	}

}
