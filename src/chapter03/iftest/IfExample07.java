package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample07 {

	public static void main(String[] args) {
		String ID = "soldesk";
		int PW = 240910;
		
		Scanner scan = new Scanner(System.in);

		// 고객
		System.out.println("아이디를 입력해주세요.: ");
		String uid = scan.nextLine();
		
		if (ID.equals(uid)) {
			// 비밀번호의 여부
			System.out.println("비밀번호를 입력해주세요.: ");
			int upw = scan.nextInt();
			
			if (PW == upw) {
				System.out.println(ID + "님 환영합니다.");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}

	}

}
