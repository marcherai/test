package chapter01;

public class CharacterType09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A:65 a:97 => ASCII �ڵ�
		
		int A = 65;
		int B = 66;
		int a = 97;
		int b = 98;
		System.out.println(A);
		System.out.println(A+10);
		System.out.println("��Ģ����(+): "+(A+10)); // (a+10) ��Ģ������ ǥ���ϱ����� ()
		
		System.out.println("����������������");
		//����� ����ȯ => int -> char : ASCII�� ��ȯ
		System.out.println((char)A);
		System.out.println("-----------");
		System.out.println((char)B);
		System.out.println("-----------");
		System.out.println((char)(A+1));
		System.out.println("-----------");
		System.out.println((char)66);
		System.out.println("����������������");
		System.out.println((char)a);
		System.out.println("-----------");
		System.out.println((char)b);
		System.out.println("-----------");
		System.out.println((char)(a+1));
		System.out.println("-----------");
		System.out.println((char)98);
		
	}

}
