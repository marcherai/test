package chapter04;

public class Example02 {

	public static void main(String[] args) {

		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ����� ��ü ������ ��� ���.
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } }; // 3�� X��

		double avg = 0;
		double totalAvg = 0;
		int total = 0;
		int allTotal = 0;
		int count = 0;

		// for���� �̿� -> �� ���� �����ͼ� ������ ���� �о sum�� �����ϰ�(count++) ��ձ��� ���Ͽ� ���

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				total += array[i][j]; // {95, 86}
				count++;
			}

			allTotal += total;
			avg = (double) total / array[i].length;

			System.out.println((i + 1) + "���� ��: " + total);
			System.out.println((i + 1) + "���� ���: " + avg);
			System.out.println("--------------");

			total = 0; // ���� ���� ����� ���ؼ� ������ ���� ����
		}
		
		totalAvg += (double) allTotal / count;
		
		System.out.println("�� ���� ��: " + allTotal);
		System.out.println("�� ���� ���: " + totalAvg);
	}

}
