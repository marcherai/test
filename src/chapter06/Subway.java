package chapter06;

public class Subway {

	String lineNumber;
	int passengerCount;
	int money;

	// ������ �����ε�
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	// �ż���
	public void take(int money) { // �°��� �� ��
		this.money += money; // ���� ����
		passengerCount++; // �°��� �� ����
	}

	public void showInfo() {
		System.out.println("����ö " + lineNumber + "�� �°��� " + passengerCount + "���̰�, ������" + money + "�� �Դϴ�.");

	}
}
