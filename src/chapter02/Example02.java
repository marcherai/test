package chapter02;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * soldesk ������ ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5��, 7��, 5�� �Դϴ�. ���������� �Ϸ翡 ����Ǵ�
		 * �� ������ ������ ����ϰ�, �ð���(24) ��ü ������ ��� ���� ������ ��� �Ͻÿ�. (��, ��հ��� ��� ������ Ÿ���� float)��
		 * �����Ѵ�.
		 */

		int pear = 5;
		int apple = 7;
		int orange = 5;
     	int fruitTotal = pear + apple + orange;
		float fruitAvg = fruitTotal / 24f;
		
		System.out.println("�Ϸ� ���귮 :" + fruitTotal);
		System.out.println("�ð��� ���귮 : " + fruitAvg);
		
//		Scanner sPear = new Scanner(System.in);
//		System.out.print("���� ������ �Է��ϼ���: ");
//		int pear = sPear.nextInt();
//
//		Scanner sApple = new Scanner(System.in);
//		System.out.print("����� ������ �Է��ϼ���: ");
//		int apple = sApple.nextInt();
//
//		Scanner sOrange = new Scanner(System.in);
//		System.out.print("�������� ������ �Է��ϼ���: ");
//		int orange = sOrange.nextInt();
//
//		Scanner sFruitTotal = new Scanner(System.in);
//		int fruitTotal = apple + orange + pear;
//		System.out.println("���ϵ��� �Ϸ� ���귮�Դϴ�: "+fruitTotal+"��");
//		
//		Scanner sFruitAvg = new Scanner(System.in);
//		float fruitAvg = fruitTotal / 24f;
//		System.out.println("�ð��� ���� ���귮 ���귮�Դϴ�: "+fruitAvg+"��");
		

	}

}
