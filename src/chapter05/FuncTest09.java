package chapter05;

class MyObject {

	// �ɹ� ����
	int value;

	// ������
	public MyObject(int value) {
		this.value = value;
	}

}

public class FuncTest09 {

	// �ɹ� ����
	int value;

	public static void changeValue(int value) {

		value = 20;

	}

	//������ �޼���
	public static void changeValue(MyObject object) {

		object.value = 20;

	}

	public static void main(String[] args) {

		// MyObject obj

		MyObject obj = new MyObject(10);

		int num = 10;
		System.out.println("Before: " + obj.value);
		changeValue(obj);
		System.out.println("After: " +obj.value);
	}

}
