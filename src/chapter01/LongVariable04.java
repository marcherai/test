package chapter01;

public class LongVariable04 {

	public static void main(String[] args) {
		// Long Type
		//int num1=12345678900; // int -> 32bit
		long num2=12345678900L; // long -> 64bit
		// long���� 64��Ʈ �ڷ����� L�� ����Ǿ� ���� ������ int�� �����Ͽ� �ڵ� �� ��ȯ�� �̷���� 
		long num3=1000; 
		
		System.out.println(num2);
		System.out.println(num3);
		
		int level; // ���� �ϰ� �ʱ�ȭ ���� ����.
		level=10; // ���ͷ� �� 
		
		System.out.println(level);
		System.out.println(num2+num3); //�� ū ������ long���� �ڵ� �ڵ�����ȯ 

	
	}

}