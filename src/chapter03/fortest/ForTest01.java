package chapter03.fortest;

public class ForTest01 {

	public static void main(String[] args) {

		int sum = 1;

		// sum = sum + 2;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;

		System.out.println(sum);

		int i;

		System.out.println("1���� 10������ �� ���");

		for (i = 0; i < 10; i++) {
			System.out.print((i + 1) + " ");
			System.out.println("");
		}
		System.out.println("--------------------------");
		int k;
		{
			for (k = 0; k < 10; ++k) {
				System.out.print((k + 1) + " ");
				System.out.println("");
			}
		}
		System.out.println("--------------------------");
		System.out.println("");
		
		
//		int j;
//		int hap = 0;
//
//		for (j = 1; j <= 10; j++) {
//			hap += j; // hap = hap + j;
//			System.out.println("Current j:"+j+", hap:"+hap);
//		}
//
//		System.out.println();
//		System.out.print("1���� 10������ ��: " + hap); // 55
		
		int j;
		int hap = 0;

		for (j = 1; j <= 10; j++) {
			hap += j; // hap = hap + j;
			System.out.println("Current j:"+j+", hap:"+hap);
		}

		System.out.println();
		System.out.print("1���� 10������ ��: " + hap);
	}

}
