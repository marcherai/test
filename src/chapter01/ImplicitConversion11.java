package chapter01;

public class ImplicitConversion11 {
	public static void main(String[] args) {
		// ������ ����ȯ: ���� �޸𸮿��� ū �޸𸮷� �ڿ������� ����ȯ(Byte -> int)
		byte bNum = 10;
		int iNum = bNum;

		System.out.println(bNum);
		System.out.println(iNum);

		int iNum2 = 10;
		// byte bNum2 = iNum2; ERROR

		System.out.println(iNum2);
		
		//������ ����ȯ: �� ������ ���� ����ȯ (int -> float)
		int iNum3 = 30;
		float fNum = iNum3; 
		
		System.out.println(iNum3);
		System.out.println(fNum);
		
		float fNum2 = 30.5f;
		//int iNum4 = fNum2; ERROR
		
		System.out.println(fNum2);
	}
}
