package chapter02;

public class Bit_test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0B00000101; // 5
		System.out.println(num);

		System.out.println(num << 2); // 5*4
		System.out.println(num >> 2); // 5/4

		System.out.println("---------------------");

		int a, b, c;
		a = 5;
		b = 2;
		c = a >> b;
		System.out.println(c);

		c = a << b;
		System.out.println(c);

	}

}
