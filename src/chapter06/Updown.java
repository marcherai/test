package chapter06;

import java.util.Random;

public class Updown {

	// ��� ����
	private int pcnum = new Random().nextInt(50) + 1; // 1~50 ���� ����
	private int count = 0;
	private String result = "FAIL";

	// ������

	// �޼���
	public String check(int mynumber) {
		// random(pcnum)������ ������ up, ũ�� down, ��ġ�ϸ� result="SUCCESS"

		count++;

		if (mynumber < pcnum) {
			System.out.println("up");

		} else if (mynumber > pcnum) {
			System.out.println("down");
		} else {
			System.out.println(count + "ȸ���� ���� !!");
			result = "SUCCESS";
		}
		return result;
	}
}
