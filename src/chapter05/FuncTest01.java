package chapter05;

import javax.swing.JOptionPane;

public class FuncTest01 {

	// 합계 메서드 구현

	public static void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("두 수의 합:" + sum);
	}// sum 메소드

	public static void main(String[] args) {
		// 합계 메서드

		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		/*
		 int sum a+b;
		 System.out.println("두 수의 합:" + sum);
		 */
		
		sum(a,b); //실 매개변수

	}

}
