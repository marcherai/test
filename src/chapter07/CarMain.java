package chapter07;

public class CarMain {

	public static void main(String[] args) {

		// (myCar) �����ϸ鼭 �ʱ�ȭ
		Car myCar = new Car("����", 3000);
		// ��������� �̿��Ͽ� ���� ����
		myCar.color = "ȭ��Ʈ";

		// ������� �̿��ؼ� ���
		System.out.println("�ڵ����� ������ " + myCar.color + "�̰� CC�� " + myCar.cc);

		// �޼��� �̿��ؼ� ���
		System.out.println("�ڵ����� ������ " + myCar.getColor() + "�̰� CC�� " + myCar.getCc());

	}

}
