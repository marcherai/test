package chapter01;

public class BinaryTest02 {

	public static void main(String[] args) {
		// �Ǿ��� �ڵ尡 0�̸� ���, ����� ���� 
		int num1 = 0B00000000000000000000000000000101; // +5 
		// �������� ����ϸ� 4294967290������ �����̹Ƿ� 1�� ������ ��� , 1�� ���� ���� : 0�� 1�� , 1�� 0���� �ٲ�
		// 0B00000000000000000000000000000101 + 1 -> 2�Ǻ���
		int num2 = 0B11111111111111111111111111111010; // 1�� ������ ���-6
		int num3 = 0B11111111111111111111111111111011; // 2�� ���� -5
		
		System.out.println("num1 :" +num1);
		System.out.println("num1�� 1�� ���� :" +num2);
		System.out.println("num1�� 2�� ���� :" +num3);
		System.out.println("num1+num3 :" +(num1+num3));  
		
		
		

	}

}
