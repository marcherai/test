package chapter05;

public class FuncTest04 {

	// ��ȯ���� ���� - ���� ������ return�޾ƾ��Ѵ�.;
	public int channelUP(int volume) {
		System.out.println("�Ҹ��� ���̰ڽ��ϴ�.");
		return volume + 2;
	}

	// ��ȯ���� ����(void)
	public void channelDown(int volume) { // int volume = 5;
		System.out.println("�Ҹ��� " + volume + "��ŭ �����ϴ�.");
	}

	public static void main(String[] args) {

		// �ν��Ͻ� ���� tv
		FuncTest04 tv = new FuncTest04();

		System.out.println("�Ҹ��� " + tv.channelUP(5) + "��ŭ �ø��ϴ�.");
		System.out.println("======================");

		int volume = tv.channelUP(9);

		System.out.println("�Ҹ��� " + volume + "��ŭ �ø��ϴ�.");

		System.out.println();
		tv.channelDown(5);

	}
}
