package chapter04;

public class ArgsTest02 {

	public static void main(String[] args) {
		// �迭�� �⺻ ����1
		int a[] = new int[5];

		// �迭�� �⺻ ����1
		int[] b;
		// ......
		b = new int[5];

		// main���� �ִ� �ŰԺ��� Ȱ��
		args = new String[2];
		args[0] = "10"; // [0]:÷��, �ε��� / "0"
		args[1] = "20";

		String sum = args[0] + args[1];
		System.out.println("���ڿ� ����: " + sum);

		int aVal;
		int bVal;

		String[] str;
		str = new String[10];

		if (args.length == 2) {
			aVal = Integer.parseInt(args[0]);
			bVal = Integer.parseInt(args[0]);
		} else {
			aVal = 0;
			bVal = 0;
		}

		System.out.println("------------");
		int Total = aVal + bVal;
		System.out.println("��� ����: " + Total);

	}

}
