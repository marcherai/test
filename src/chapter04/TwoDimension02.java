package chapter04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {

//		int javaScore[][] = new int[2][3];
//
//		for (int i = 0; i < javaScore.length; i++) {
//			for (int j = 0; j < javaScore[i].length; j++) {
//				// �Է�
//				int jumsu = Integer.parseInt(JOptionPane.showInputDialog("JAVA ����"));
//				// �Է¹��� ������ ���Կ����� �̿��Ͽ� javaScore�濡 ����
//				javaScore[i][j] = jumsu;
//				System.out.println("JavaScore[" + i + "][" + j + "]:" + javaScore[i][j]);
//
//			}
//			System.out.println("");
//		}

		int javaScore[][] = new int[2][3];
		
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < javaScore.length; i++) {
			for (int j = 0; j < javaScore[i].length; j++) {
				System.out.printf("JAVA ����: ");
				int score = Integer.parseInt(scan.nextLine());
//				javaScore[i][j] = score;
//				System.out.println("JavaScore[" + i + "][" + j + "]:" + javaScore[i][j]);
				System.out.printf("javaScore[%d][%d]:%s  ", i, j, score);
				System.out.println();
			}
			System.out.println();
		}

	}
}
