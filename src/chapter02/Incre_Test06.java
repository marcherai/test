package chapter02;

public class Incre_Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 10;
		b = 20;
		c = 3;

		System.out.println("++a :" + (++a)); // a=a+1 -> a+=1 =>11
		System.out.println("a++ :" + (a++)); // a=a => 11 | a=+1 -> a+=1 =>12
		System.out.println("후위연산 : " + a); // 12
		System.out.println("---------------");

		System.out.println("c++ :" + (c++)); // 3
		System.out.println("후위연산 : " + c); // 4
		System.out.println("---------------");

		System.out.println("++a + b++ : " + (++a + b++)); // 13+20=33
		System.out.println("후위연산 : " + b); // 21
		System.out.println("---------------");

		System.out.println("++a :" + (++a)); // 14
		System.out.println("b++ :" + (b++)); // 21
		System.out.println("후위연산 : " + b); // 22
		System.out.println("++a + b++ : " + (++a + b++)); // 15+22=37
		System.out.println("후위연산 : " + b); // 23

	}

}
