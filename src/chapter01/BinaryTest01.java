package chapter01;

public class BinaryTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� Ÿ�� -> ī��: ù�ڴ� ������ �ҹ��� �߰��ܾ��� ������ �빮�ڷ�
		//               �Ľ�Į: ù�ڴ� ������ �빮�� ������ �ܾ�� �ҹ��� 
		int num=10;
		int bNum=0B1000; // Binary �� 2���� (0,1)
		int oNum=010; // 8����(OCT)
		
		System.out.println("10���� :"+num);
		System.out.println("2���� :"+bNum);
		System.out.println("8���� :"+oNum);
		System.out.println("----------------------");
		
		int bNum2=0B10000;
		int hNum=0x10; //16����(Hex)
		
		System.out.println("2���� :"+bNum2);
		System.out.println("16���� :"+hNum);
		
		
	}

}