package chapter05;

import javax.swing.JOptionPane;

public class FuncTest02 {

	public static void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("두 수의 합: " + sum);
	} // sum 메소드

	public static void main(String[] args) {
		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));

		sum(a, b); // static 메소드 직접 호출
	}

	// 메모리 구조 (영역)
	// Data 영역
	// 전역 변수 저장, 정적 데이터
	// 프로그램 시작시 자동으로 메모리 영억에 존재해서 프로그램 종료시 소멸
	int globalVar = 10;

	// Stack 영역
	// 메서드, 지역변수
	// 호출하면 생성되고 함수 호출되어 결과를 보여주면 소멸
	public void myFunc() {
		int localVal = 5; // 지역변수

		// heap 영역
		// 객체 생성, 참조하는 메모리
		// 사용자 호출 시 생성되고 사용 후 사라짐
		FuncTest02 obj = new FuncTest02();
	}

}
