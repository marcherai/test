package chapter06;

public class CarMain {

	public static void main(String[] args) {

		Car mycar = new Car(); // ��ü ����

		System.out.println("����ȸ��:" + mycar.company);
		System.out.println("�𵨸�:" + mycar.model);
		System.out.println("����:" + mycar.color);
		System.out.println("�ְ�ӵ�:" + mycar.maxSpeed);
		System.out.println("����ӵ�:" + mycar.speed);

		mycar.speed = 60;
		System.out.println("������ ����ӵ�:" + mycar.speed);

		mycar.company = "����";
		System.out.println("������ ����ȸ��:" + mycar.company);
	}

}
