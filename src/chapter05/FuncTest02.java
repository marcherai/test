package chapter05;

import javax.swing.JOptionPane;

public class FuncTest02 {

	public static void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("�� ���� ��: " + sum);
	} // sum �޼ҵ�

	public static void main(String[] args) {
		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("��2"));

		sum(a, b); // static �޼ҵ� ���� ȣ��
	}

	// �޸� ���� (����)
	// Data ����
	// ���� ���� ����, ���� ������
	// ���α׷� ���۽� �ڵ����� �޸� ���￡ �����ؼ� ���α׷� ����� �Ҹ�
	int globalVar = 10;

	// Stack ����
	// �޼���, ��������
	// ȣ���ϸ� �����ǰ� �Լ� ȣ��Ǿ� ����� �����ָ� �Ҹ�
	public void myFunc() {
		int localVal = 5; // ��������

		// heap ����
		// ��ü ����, �����ϴ� �޸�
		// ����� ȣ�� �� �����ǰ� ��� �� �����
		FuncTest02 obj = new FuncTest02();
	}

}
