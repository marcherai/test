package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfExample04 {

	public static void main(String[] args) {
		/*전시관의 입장료는 미취학 아동은 1000원 ->7
		전시관의 입장료는 초등학생은 2000원->13
		전시관의 입장료는 중,고등학생은 3500원 ->19
		전시관의 입장료는 성인은 5000원*/

		int age;
		int charge;
		String grade;

		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));

		if (age <= 7) {
			charge = 1000;
			grade = "미취학 아동";
		} else if (age <= 13) {
			charge = 2000;
			grade = "초등학생";
		} else if (age <= 19) {
			charge = 3500;
			grade = "중,고등학생";
		} else {
			charge = 5000;
			grade = "성인";
		}
		System.out.println("전시관의 입장료는" + grade + "이므로 " + charge + "입니다.");
	}

}
