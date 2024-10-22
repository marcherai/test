package chapter02;

public class Relatest08 {
	public static void main(String[] args) {

		char a, b;
		a = 'A';
		b = 'B';

		boolean AL = a > b;
		System.out.println(AL);

		// a가 크다고 명시
		System.out.println("a>b :" + (a > b));
		// a가 작다고 명시
		System.out.println("a<b :" + (a < b));
		// a와b가 같다고 명시
		System.out.println("a==b :" + (a == b));
		// a와 b가 같지 않을 경우 명시
		System.out.println("a!=b :" + (a != b));

	}
}
